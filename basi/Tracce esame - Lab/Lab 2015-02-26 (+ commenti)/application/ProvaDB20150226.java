/*

Prova di Laboratorio di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software (3 anni)
Docente: dott.ssa Francesca A. Lisi

26 Febbraio 2015

-------------------------------------
Cognome e Nome	:
Matricola	:
-------------------------------------

*/


package application;

import java.sql.*;

public class ProvaDB20150226 {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "alter table libri add foreign key (codice_editore) references editori(codice_editore)";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "delete from Editori where nome_editore = 'Arcade Publishing';";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "create view LibriPubblicati_MA(Titolo_libro,Nome_editore) as select titolo_libro, nome_editore from libri natural join editori where stato_editore = 'MA';";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "select * from LibriPubblicati_MA;";

		// es. 5: creazione stringa contenente comando SQL
		String stringa5 = "select distinct cognome_autore, nome_autore from autori natural join libripubblicati_ma order by cognome_autore, nome_autore;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "select cognome_autore, nome_autore, titolo_libro, nome_editore from autori natural left join libriautori natural left join libri natural left join editori order by cognome_autore;";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "select nome_editore, count(codice_libro) as n_libri, avg(prezzo_libro) as prezzo_medio from editori natural join libri group by codice_editore, nome_editore;";
			
		try {
			// caricamento del driver
			new com.mysql.jdbc.Driver();
			/*
			  creazione di una connessione al database HenrysBooksDB20150226
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3307/HenrysBooksDB20150226", "root", "root");

			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			int ok = istruzione1.executeUpdate(stringa1);
			
			System.out.println("Vincolo di chiave esterna aggiunto");

			// es. 2: esecuzione comando SQL
			Statement istruzione2 = connessione.createStatement();
			int num = istruzione2.executeUpdate(stringa2);
			
			System.out.println("\n Il numero di tuple eliminate dalla tabella Editori e': " + num + " ");
			
			
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			istruzione3.execute(stringa3);

			System.out.println("Vista LibriPubblicati_MA creata");

			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n Il contenuto della vista LibriPubblicati_MA e':");
			while (risultato4.next()) {
				// titolo_libro, nome_editore
				System.out.println(risultato4.getString("titolo_libro") + " " + risultato4.getString("nome_editore"));
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n Gli autori di libri pubblicati da editori dello stato del Massachusetts sono:");
			while (risultato5.next()) {
				// cognome_autore, nome_autore
				System.out.println(risultato5.getString("cognome_autore") + " " + risultato5.getString("nome_autore"));
			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n I Gli autori in ordine alfabetico per cognome sono:");
			while (risultato6.next()) {
				// cognome_autore, nome_autore, titolo_libro, nome_editore
				System.out.println(risultato6.getString("cognome_autore") + " " + risultato6.getString("nome_autore") + ": titolo libro: " + risultato6.getString("titolo_libro") + ", editore: " + risultato6.getString("nome_editore"));
			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n Il numero ed il prezzo medio dei libri pubblicati da ciascun editore:");
			while (risultato7.next()) {
				// nome_editore, n_libri, prezzo_medio
				System.out.println(risultato7.getString("nome_editore") + ": " + risultato7.getInt("n_libri") + " libri, prezzo medio libri: " + risultato7.getDouble("prezzo_medio"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
