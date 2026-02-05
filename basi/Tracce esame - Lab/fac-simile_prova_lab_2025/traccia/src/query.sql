use prodottipremieredb;

create table DettOrdini (
    NroOrdine varchar(6),
    NroArt varchar(4),
    QtaOrd integer not null check (qtaord > 0),
    PrezzoRichiesto decimal(6,2) not null check (prezzorichiesto > 0),
    PRIMARY KEY (NroOrdine, NroArt),
    FOREIGN KEY (NroOrdine) REFERENCES Ordini(NroOrdine),
    FOREIGN KEY (NroArt) REFERENCES Articoli(NroArt)
);

insert into dettordini values ('12489', 'AX12', 11, 21.95);

create view PiccoliClienti as select * from Clienti where Saldo < 1000;

select distinct c.CodCliente, c.Cognome, c.Nome from clienti c join Ordini o on c.codcliente = o.codcliente where data = '2002-09-05';

select distinct r.CodRappr, r.Cognome, r.Nome from Rappresentanti r join Clienti c on r.Codrappr = c.codrappr where fido = 1000;

select fido, count(*) from clienti where codrappr = '03' group by fido having count(*) > 1;

select codcliente, cognome, nome, fido, saldo from piccoliclienti where fido > saldo;

