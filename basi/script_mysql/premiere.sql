DROP DATABASE IF EXISTS premiere;

CREATE DATABASE premiere;

USE premiere;

CREATE TABLE IF NOT EXISTS Articoli(
	NroArt CHAR (4) PRIMARY KEY,
	Descrizione CHAR (20),
	Giacenza DECIMAL (4,0),
	Categoria CHAR (2),
	PrezzoUnitario DECIMAL (6,2)
);

CREATE TABLE IF NOT EXISTS Rappresentanti(
	CodRappr CHAR (2) PRIMARY KEY,
	Cognome CHAR (10),
	Nome CHAR (8),
	Via CHAR (15),
	Citta CHAR (15),
	Prov CHAR (2),
	Cap CHAR (5),
	TotProvv DECIMAL (7,2),
	PerProvv DECIMAL (3,2)
);

CREATE TABLE IF NOT EXISTS Clienti(
	CodCliente CHAR (3) PRIMARY KEY,
	Cognome CHAR (10) NOT NULL,
	Nome CHAR (8) NOT NULL,
	Via CHAR (15),
	Citta CHAR (15),
	Prov CHAR (2),
	Cap CHAR (5),
	Saldo DECIMAL (7,2),
	Fido DECIMAL (6,2),
	CodRappr CHAR (2),
	FOREIGN KEY (CodRappr) REFERENCES Rappresentanti(CodRappr)
		ON DELETE SET NULL
		ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS Ordini(
	NroOrdine CHAR (5) PRIMARY KEY,
	data date,
	CodCliente CHAR (3) NOT NULL,
	FOREIGN KEY (CodCliente) REFERENCES Clienti(CodCliente)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS DettOrdini(
	NroOrdine CHAR (5),
	NroArticolo CHAR (4),
	QtaOrdinata DECIMAL (3,0),
	PrzRichiesto DECIMAL (6,2),
	PRIMARY KEY (NroOrdine, NroArticolo),
	FOREIGN KEY (NroOrdine) REFERENCES Ordini (NroOrdine)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	FOREIGN KEY (NroArticolo) REFERENCES Articoli(NroArt)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);