/*

Prova di Laboratorio di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software (3 anni)
Docente: dott.ssa Francesca A. Lisi

27 Luglio 2015

-------------------------------------
Cognome e Nome	:
Matricola	:
-------------------------------------

*/


package application;

import java.sql.*;

public class ProvaDB20150727 {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "alter table Scorte add foreign key (Nro_filiale) references Filiali(nro_filiale);";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "insert into filiali (nro_filiale, nome_filiale, sede_filiale) values ('5', 'Henrys Manhattan', 'Broadway');";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "create view librisottoscorta(codice_libro, nro_filiale, nro_copie_disponibili) as select codice_libro, nro_filiale, nro_copie_disponibili from libri natural join scorte natural join filiali where nro_copie_disponibili < 3;";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "select * from librisottoscorta order by codice_libro;";

		// es. 5: creazione stringa contenente comando SQL
		String stringa5 = "select nome_filiale, titolo_libro, nro_copie_disponibili from filiali natural join scorte natural join libri order by nome_filiale, titolo_libro;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "select codice_libro, sum(nro_copie_disponibili) as nro_copie_totali from libri natural join scorte natural join filiali where codice_libro in (select codice_libro from LibriSottoScorta) group by codice_libro;";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "select nome_filiale, codice_libro, titolo_libro, nome_editore, prezzo_libro from editori natural join libri natural join scorte natural join filiali where (codice_libro, nro_filiale) not in (select codice_libro, nro_filiale from librisottoscorta) order by titolo_libro;";
			
		try {
			// caricamento del driver
			new com.mysql.jdbc.Driver();
			/*
			  creazione di una connessione al database HenrysBooksDB20150727
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3307/HenrysBooksDB20150727", "root", "root");

			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			int ok = istruzione1.executeUpdate(stringa1);
			
			System.out.println("Vincolo di chiave esterna aggiunto con successo");

			// es. 2: esecuzione comando SQL
			Statement istruzione2 = connessione.createStatement();
			int num = istruzione2.executeUpdate(stringa2);
			
			System.out.println("\n Il numero di inserimenti fatti nella tabella .. �: " + num + " ");
			
			
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			istruzione3.execute(stringa3);

			System.out.println("Vista librisottoscorta creata con successo");

			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n I libri sotto scorta sono:");
			while (risultato4.next()) {
				// codice_libro, nro_filiale, nro_copie_disponibili
				System.out.println(risultato4.getString("codice_libro") + ", filiale: " + risultato4.getString("nro_filiale") + ", copie: " + risultato4.getInt("nro_copie_disponibili"));
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n I titoli ed il numero di copie disponibili dei libri in vendita presso ciascuna filiale sono:");
			while (risultato5.next()) {
				// nome_filiale, titolo_libro, nro_copie_disponibili
				System.out.println(risultato5.getString("nome_filiale") + ", titolo: " + risultato5.getString("titolo_libro") + ", copie: " + risultato5.getInt("nro_copie_disponibili"));
			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n Il numero totale di copie disponibili per i libri sotto scorta �:");
			while (risultato6.next()) {
				// codice_libro, nro_copie_totali
				System.out.println(risultato6.getString("codice_libro") + ": " + risultato6.getInt("nro_copie_totali") + " copie");
			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n I libri che non sono sotto scorta presso ciascuna filiale sono:");
			while (risultato7.next()) {
				// nome_filiale, codice_libro, titolo_libro, nome_editore, prezzo_libro
				System.out.println(risultato7.getString("nome_filiale") + ", " + risultato7.getString("codice_libro") + ": " + risultato7.getString("titolo_libro") + ", editore: " + risultato7.getString("nome_editore") + ", prezzo: " + risultato7.getInt("prezzo_libro"));

			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
