/*

Prova di Laboratorio di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software (3 anni)
Docente: dott.ssa Francesca A. Lisi

4 Febbraio 2015

-------------------------------------
Cognome e Nome	:
Matricola	:
-------------------------------------

*/


package application;

import java.sql.*;

public class ProvaDB20150204 {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "alter table scorte add foreign key (nro_filiale) references filiali(nro_filiale);";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "insert into filiali (nro_filiale, nome_filiale, sede_filiale) values ('5', 'Henrys Manhattan', 'Broadway');";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "create view LibriDisponibili_HD (Titolo_libro) as select titolo_libro from libri natural join scorte natural join filiali where nome_filiale = 'Henrys Downtown';";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "select * from LibriDisponibili_HD;";

		// es. 5: creazione stringa contenente comando SQL
		String stringa5 = "select nome_filiale, titolo_libro, nro_copie_disponibili from libri natural join scorte natural join filiali order by nome_filiale, titolo_libro;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "select titolo_libro from LibriDisponibili_HD natural join libri where prezzo_libro = (select min(prezzo_libro) from libri natural join LibriDisponibili_HD);";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "select titolo_libro, nome_editore, prezzo_libro from libri natural join editori where titolo_libro not in (select titolo_libro from LibriDisponibili_HD);";
			
		try {
			// caricamento del driver
			new com.mysql.jdbc.Driver();
			/*
			  creazione di una connessione al database HenrysBooksDB20140204
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3307/HenrysBooksDB20150204", "root", "root");

			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			int ok = istruzione1.executeUpdate(stringa1);
			
			System.out.println("Vincolo di chiave esterna creato");

			// es. 2: esecuzione comando SQL
			Statement istruzione2 = connessione.createStatement();
			int num = istruzione2.executeUpdate(stringa2);
			
			System.out.println("\n Il numero di inserimenti fatti nella tabella Filiali e': " + num + " ");
			
			
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			istruzione3.execute(stringa3);

			System.out.println("Vista LibriDisponibili_HD creata");

			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n Il contenuto della vista LibriDisponibili_HD:");
			while (risultato4.next()) {
				System.out.println(risultato4.getString("titolo_libro"));
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n I titoli ed il numero di copie disponibili dei libri in vendita presso ciascuna filiale sono:");
			while (risultato5.next()) {
				// nome_filiale, titolo_libro, nro_copie_disponibili
				System.out.println(risultato5.getString("nome_filiale") + ": " + risultato5.getString("titolo_libro") + ", copie: " + risultato5.getInt("nro_copie_disponibili"));
			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n Il titolo del libro meno costoso fra quelli disponibili presso la filiale 'Henrys Downtown' e':");
			while (risultato6.next()) {
				System.out.println(risultato6.getString("titolo_libro"));
			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n I libri che non sono disponibili presso la filiale 'Henrys Downtown' sono:");
			while (risultato7.next()) {
				// titolo_libro, nome_editore, prezzo_libro
				System.out.println(risultato7.getString("titolo_libro") + ": " + risultato7.getString("nome_editore") + ", prezzo: " + risultato7.getDouble("prezzo_libro"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
