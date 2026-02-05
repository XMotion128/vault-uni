/*

Prova pratica di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software (3 anni)
Docente: Prof.ssa Francesca A. Lisi

5 febbraio 2026 ore 10:00

-------------------------------------
Cognome : Ruggiero
Nome	: Aldo
Matricola: 825304
-------------------------------------

*/


package application;

import java.sql.*;

public class Ruggiero_Aldo_825304 {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "ALTER TABLE Scorte ADD FOREIGN KEY (Nro_filiale) REFERENCES Filiali(Nro_filiale);";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "INSERT INTO Filiali (Nro_filiale, Nome_filiale, Sede_filiale) VALUES ('5', 'Henrys Soho', 'Regent Street');";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "CREATE VIEW LibriSottoScorta_HD(Titolo_libro, numero_copie_disponibili) AS SELECT Titolo_libro, Nro_copie_disponibili FROM Libri NATURAL JOIN Scorte NATURAL JOIN Filiali where Nro_copie_disponibili < 2 AND Nome_filiale = 'Henrys Downtown';";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "SELECT * FROM LibriSottoScorta_HD ORDER BY Titolo_libro;";

		// es. 5: creazione stringa contenente comando SQL ????
		String stringa5 = "SELECT Nome_filiale, Titolo_libro FROM Filiali NATURAL JOIN Scorte NATURAL JOIN Libri NATURAL JOIN Editori WHERE Nome_editore = 'Pocket Books' ORDER BY Titolo_libro, Nome_filiale;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "SELECT Titolo_libro FROM LibriSottoScorta_HD NATURAL JOIN Libri WHERE prezzo_libro = (SELECT MAX(prezzo_libro) FROM Libri NATURAL JOIN LibriSottoScorta_HD);";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "SELECT Titolo_libro FROM Libri NATURAL JOIN Scorte NATURAL JOIN Filiali WHEREli WHERE Nome_filiale = 'Henrys Downtown' AND Titolo_libro NOT IN (SELECT Titolo_libro FROM LibriSottoScorta_HD) ORDER BY Titolo_libro;";

		// es. 8: creazione stringa contenente comando SQL
		String stringa8 = "SELECT Nome_filiale, Titolo_libro FROM Libri NATURAL JOIN Scorte NATURAL JOIN Filiali WHERE (Nome_filiale, Titolo_libro) IN (SELECT nome_filiale, titolo_libro FROM Editori NATURAL JOIN Libri NATURAL JOIN Scorte NATURAL JOIN Filiali WHERE nome_editore = 'Pocket Books') ORDER BY Titolo_libro, Nome_filiale;";
			
		try {
			// caricamento del driver
			new com.mysql.jdbc.Driver();

			/*
			  creazione di una connessione al database HenrysBooksDB_2026_02_05_h10
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/HenrysBooksDB_2026_02_05_h10", "root", "password");

			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			int ok = istruzione1.executeUpdate(stringa1);
			
			System.out.println("Vincolo di chiave esterna (Nro_filiale) aggiunto con successo");

			// es. 2: esecuzione comando SQL
			Statement istruzione2 = connessione.createStatement();
			int num = istruzione2.executeUpdate(stringa2);
			
			System.out.println("\n Il numero di inserimenti fatti nella tabella Filiali  : " + num + " ");
			
			
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			istruzione3.execute(stringa3);

			System.out.println("Vista LibriSottoScorta_HD creata con successo");

			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n Il contenuto della vista LibriSottoScorta_HD  :");
			while (risultato4.next()) {
				// Titolo_libro, numero_copie_disponibili
				System.out.println(risultato4.getString("Titolo_libro") + ": " + risultato4.getInt("numero_copie_disponibili") + " copie");
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n Le filiali presso cui sono in vendita i libri pubblicati da editore 'Pocket Books' sono:");
			while (risultato5.next()) {
				// Nome_filiale, Titolo_libro
				System.out.println(risultato5.getString("Nome_filiale") + ": " + risultato5.getString("Titolo_libro"));

			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n Il titolo del libro meno costoso fra quelli sotto scorta presso la filiale 'Henrys Downtown'  :");
			while (risultato6.next()) {
				// Titolo_libro
				System.out.println(risultato6.getString("Titolo_libro"));

			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n I libri in vendita presso la filiale 'Henrys Downtown' che non sono attualmente sotto scorta presso quella filiale sono:");
			while (risultato7.next()) {
				// Titolo_libro
				System.out.println(risultato7.getString("Titolo_libro"));

			}

			// es. 8: esecuzione comando SQL
			Statement istruzione8 = connessione.createStatement();
			ResultSet risultato8 = istruzione8.executeQuery(stringa5);
			
			System.out.println("\n Le filiali presso cui sono in vendita i libri pubblicati da editore 'Pocket Books' sono:");
			while (risultato8.next()) {
				System.out.println(risultato8.getString("Nome_filiale") + ": " + risultato8.getString("Titolo_libro"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
