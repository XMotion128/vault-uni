/*

Prova di Laboratorio di PROGETTAZIONE DI BASI DI DATI
C.d.S. in Informatica e Tecnologie per la Produzione del Software
Docente: Prof. Francesca A. Lisi

19 Dicembre 2025

-------------------------------------
Cognome e Nome	:
Matricola	:
-------------------------------------

*/


package application;

import java.sql.*;

public class ProdottiPremiere {

	public static void main(String[] args) {
		// sezione dichiarazione variabili locali
		Connection connessione = null;

		

		// es. 1: creazione stringa contenente comando SQL
		String stringa1 = "create table if not exists DettOrdini ("
				+ "NroOrdine varchar(6),"
				+ "NroArt varchar(4),"
				+ "QtaOrd integer not null check (qtaord > 0),"
				+ "PrezzoRichiesto decimal(6,2) not null check (prezzorichiesto > 0),"
				+ "PRIMARY KEY (NroOrdine, NroArt),"
				+ "FOREIGN KEY (NroOrdine) REFERENCES Ordini(NroOrdine),"
				+ "FOREIGN KEY (NroArt) REFERENCES Articoli(NroArt));";

		// es. 2: creazione stringa contenente comando SQL
		String stringa2 = "insert into dettordini values ('12489', 'AX12', 11, 21.95);";

		// es. 3: creazione stringa contenente comando SQL
		String stringa3 = "create or replace view PiccoliClienti as select * from Clienti where Saldo < 1000;";

		// es. 4: creazione stringa contenente comando SQL
		String stringa4 = "select distinct c.CodCliente, c.Cognome, c.Nome from clienti c join Ordini o on c.codcliente = o.codcliente where data = '2002-09-05';";

		// es. 5: creazione stringa contenente comando SQL
		String stringa5 = "select distinct r.CodRappr, r.Cognome, r.Nome from Rappresentanti r join Clienti c on r.Codrappr = c.codrappr where fido = 1000;";

		// es. 6: creazione stringa contenente comando SQL
		String stringa6 = "select fido, count(*) as Nclienti from clienti where codrappr = '03' group by fido having count(*) > 1;";

		// es. 7: creazione stringa contenente comando SQL
		String stringa7 = "select codcliente, cognome, nome, fido, saldo from piccoliclienti where fido > saldo;";
			
		try {
			// creazione di una connessione al database ProdottiPremiereDB con credenziali di accesso appropriate
			// utenti nel caso del pc di lab: nomeutente: root, password: password
			connessione = DriverManager.getConnection("jdbc:mysql://localhost:3307/ProdottiPremiereDB", "root", "root");
		
			// es. 1: esecuzione comando SQL
			Statement istruzione1 = connessione.createStatement();
			boolean ok = istruzione1.execute(stringa1);
			
			int num = (ok)?1:0;
			System.out.println("Il numero di righe coinvolte dal comando di creazione della tabella DettOrdini  : " + num + " ");

			// es. 2: esecuzione comando SQL
//			Statement istruzione2 = connessione.createStatement();
//			num = istruzione2.executeUpdate(stringa2);
//			
//			System.out.println("\n Il numero di inserimenti fatti nella tabella DettOrdini  : " + num + " ");
						
			// es. 3: esecuzione comando SQL
			Statement istruzione3 = connessione.createStatement();
			istruzione3.executeUpdate(stringa3);
			ResultSet rs3 = istruzione3.executeQuery("select Cognome, Nome from piccoliclienti;");

			System.out.println("\n I clienti con saldo inferiore a 1000 sono: ");
			while (rs3.next()) {
				System.out.println(rs3.getString("Cognome") + " " + rs3.getString("Nome"));
			}
			
			// es. 4: esecuzione comando SQL
			Statement istruzione4 = connessione.createStatement();
			ResultSet risultato4 = istruzione4.executeQuery(stringa4);
			
			System.out.println("\n I clienti che hanno emesso un ordine il 5 settembre 2002 sono:");
			while (risultato4.next()) {
				System.out.println(risultato4.getString("Cognome") + " " + risultato4.getString("Nome"));
			}
			
			// es. 5: esecuzione comando SQL
			Statement istruzione5 = connessione.createStatement();
			ResultSet risultato5 = istruzione5.executeQuery(stringa5);
			
			System.out.println("\n I rappresentanti che hanno almeno un cliente con fido di 1000 euro sono:");
			while (risultato5.next()) {
				System.out.println(risultato5.getString("Cognome") + " " + risultato5.getString("Nome"));
			}
			
			// es. 6: esecuzione comando SQL
			Statement istruzione6 = connessione.createStatement();
			ResultSet risultato6 = istruzione6.executeQuery(stringa6);
			
			System.out.println("\n Il numero dei clienti del rappresentante con codice 03 aventi un certo fido  :");
			while (risultato6.next()) {
				System.out.println("Fido " + risultato6.getDouble("Fido") + ": " + risultato6.getInt("Nclienti"));
			}
			
			// es. 7: esecuzione comando SQL
			Statement istruzione7 = connessione.createStatement();
			ResultSet risultato7 = istruzione7.executeQuery(stringa7);
			
			System.out.println("\n I clienti con saldo inferiore a 1000 e fido superiore al saldo sono:");
			while (risultato7.next()) {
				System.out.println(risultato7.getString("Cognome") + " " + risultato7.getString("Nome") + " con saldo " + risultato7.getDouble("saldo") + " e fido " + risultato7.getDouble("fido"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
}
