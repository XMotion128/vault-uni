/*

Prova di Laboratorio di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software (3 anni)
Docente: dott.ssa Francesca A. Lisi

22 Febbraio 2013

-------------------------------------
Cognome e Nome	:
Matricola	:
-------------------------------------

*/


package application;

import java.sql.*;

public class ProvaDB20130222 {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "alter table libri add foreign key (codice_editore) references editori(codice_editore);";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "delete from Editori where nome_editore = 'Schoken Books';";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "create view LibriPubblicati_NY (Titolo_libro, Nome_editore) as select titolo_libro, nome_editore from editori natural join libri where citta_editore = 'New York';";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "select * from LibriPubblicati_NY";

		// es. 5: creazione stringa contenente comando SQL
		String stringa5 = "select distinct cognome_autore, nome_autore from autori natural join libriautori natural join LibriPubblicati_NY order by cognome_autore, nome_autore;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "select titolo_libro, count(nro_autore) as n_autori, nome_editore, citta_editore from libriautori natural join libri natural join editori group by codice_libro, titolo_libro, nome_editore, citta_editore order by titolo_libro;";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "select nome_editore, count(codice_libro) as numero_libri, avg(prezzo_libro) as media_prezzi from editori natural join libri group by codice_editore, nome_editore;";
			
		try {
			// caricamento del driver
			new com.mysql.jdbc.Driver();
			/*
			  creazione di una connessione al database HenrysBooksDB20130222
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3307/HenrysBooksDB20130222", "root", "root");

			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			int ok = istruzione1.executeUpdate(stringa1);
			
			System.out.println("Vincolo aggiunto");

			// es. 2: esecuzione comando SQL
			Statement istruzione2 = connessione.createStatement();
			int num = istruzione2.executeUpdate(stringa2);
			
			System.out.println("\n Il numero di tuple eliminate dalla tabella Editori e': " + num + " ");
			
			
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			istruzione3.execute(stringa3);

			System.out.println("Vista LibriPubblicati_NY creata");

			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n Il contenuto della vista LibriPubblicati_NY e':");
			while (risultato4.next()) {
				// Titolo_libro, Nome_editore
				System.out.println(risultato4.getString("Titolo_libro") + ", " + risultato4.getString("Nome_editore"));
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n Gli autori che hanno pubblicato almeno un libro con editori di New York sono:");
			while (risultato5.next()) {
				// cognome_autore, nome_autore
				System.out.println(risultato5.getString("cognome_autore") + " " + risultato5.getString("nome_autore"));
			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n I titoli dei libri con numero di autori, e il nome e la citta' dell'editore:");
			while (risultato6.next()) {
				// titolo_libro, n_autori, nome_editore, citta_editore
				System.out.println(risultato6.getString("titolo_libro") + ": numero autori: " + risultato6.getInt("n_autori") + ", nome editore: " + risultato6.getString("nome_editore") + ", citta' editore: " + risultato6.getString("citta_editore"));
			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n Il numero ed il prezzo medio dei libri pubblicati da ciascun editore:");
			while (risultato7.next()) {
				// nome_editore, numero_libri, media_prezzi
				System.out.println(risultato7.getString("nome_editore") + ": numero libri: " + risultato7.getInt("numero_libri") + ", prezzo medio: " + risultato7.getDouble("media_prezzi"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
