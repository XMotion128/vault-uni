/*

Prova di Laboratorio di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software (3 anni)
Docente: dott.ssa Francesca A. Lisi

28 Gennaio 2013

-------------------------------------
Cognome e Nome	:
Matricola	:
-------------------------------------

*/


package application;

import java.sql.*;

public class ProvaDB20130128 {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "alter table LibriAutori add foreign key (codice_libro) references libri(codice_libro) on delete cascade on update cascade;";
				//+ "alter table LibriAutori add foreign key (nro_autore) references autori(nro_autore) on delete cascade on update cascade;";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "insert into autori (nro_autore, cognome_autore) values ('24', 'Liala');";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "create view LibriPubblicati_PB (Codice_libro, Titolo_libro, Tipo_libro) as select codice_libro, titolo_libro, tipo_libro from libri natural join editori where nome_editore = 'Pocket Books';";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "select * from libripubblicati_PB;";

		// es. 5: creazione stringa contenente comando SQL
		String stringa5 = "select Nro_autore, cognome_autore, nome_autore from autori where nro_autore not in (select nro_autore from libriautori la join libripubblicati_pb lapb on la.codice_libro = lapb.codice_libro) order by cognome_autore, nome_autore;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "select titolo_libro, tipo_libro from libripubblicati_pb natural join libri order by prezzo_libro desc limit 1;";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "select cognome_autore, nome_autore, codice_libro, ifnull((select sum(nro_copie_disponibili) from scorte where codice_libro = lppb.codice_libro), 0) as nCopie from libripubblicati_pb lppb natural join libriautori natural join autori where Nro_seq = 1;";
			
		try {
			// caricamento del driver
			// new com.mysql.jdbc.Driver();
			/*
			  creazione di una connessione al database ProdottiPremiereDB
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3307/HenrysBooksDB20130128", "root", "root");

			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			int ok = istruzione1.executeUpdate(stringa1);
			stringa1 = "alter table LibriAutori add foreign key (nro_autore) references autori(nro_autore) on delete cascade on update cascade;";
			
			System.out.println("Vincolo 1 aggiunto");
			
			ok = istruzione1.executeUpdate(stringa1);
			System.out.println("Vincolo 2 aggiunto");

			// es. 2: esecuzione comando SQL
			Statement istruzione2 = connessione.createStatement();
			int num = istruzione2.executeUpdate(stringa2);
			
			System.out.println("\n Il numero di inserimenti fatti nella tabella Autori �: " + num + " ");
			
			
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			boolean ok2 = istruzione3.execute(stringa3);

			System.out.println(ok2 ? "View creata" : "Errore nella creazione view");

			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n Il contenuto della vista LibriPubblicati_PB e':");
			while (risultato4.next()) {
				System.out.println("Codice " + risultato4.getString("Codice_libro") + ": " + risultato4.getString("Titolo_libro") + ", " + risultato4.getString("Tipo_libro"));
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n Gli autori che non pubblicano libri con l'editore di nome 'Pocket Books' sono:");
			while (risultato5.next()) {
				System.out.println("Autore " + risultato5.getInt("Nro_autore") + ": " + risultato5.getString("cognome_autore") + " " + risultato5.getString("nome_autore"));
			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n Il titolo e tipo del libro piu' costoso fra quelli pubblicati dall�editore di nome 'Pocket Books' e':");
			while (risultato6.next()) {
				// titolo_libro, tipo_libro
				System.out.println(risultato6.getString("titolo_libro") + ", " + risultato6.getString("tipo_libro"));
			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n Per ciascun libro pubblicato dall'editore di nome 'Pocket Books', il cognome e nome del primo autore ed il numero totale di copie disponibili presso le filiali Henrys Books e':");
			while (risultato7.next()) {
				// cognome_autore, nome_autore, codice_libro, nro_copie_disponibili
				System.out.println("Cognome: " + risultato7.getString("cognome_autore"));
				System.out.println("Nome: " + risultato7.getString("nome_autore"));
				System.out.println("Codice libro: " + risultato7.getString("codice_libro"));
				System.out.println("Copie disponibili: " + risultato7.getInt("nCopie"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
