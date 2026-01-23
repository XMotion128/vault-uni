## definire vista PiccoliClienti
create view PiccoliClienti (nro_cliente, cognome, nome, via, saldo, fido) as select CodCliente, Cognome, Nome, Via, Saldo, Fido from Clienti where fido <= 1000;

## reperire numero, nome e cognome dalla vista il cui saldo > fido
select nro_cliente, nome, cognome from PiccoliClienti where saldo > fido;

## scrivere la query che esegue il dbms
select codcliente, nome, cognome from Clienti where saldo > fido and fido <= 1000;

## crea problemi modificare i dati nella vista?
no, semplicemente spariranno dalla vista. Non si creano particolari problemi visto che la vista è definita su una sola relazione

## definire vista OrdiniClienti
create view OrdiniClienti (nro_cliente, cognome, nome, saldo, nro_ordine, data_ordine) as select clienti.codcliente, cognome, nome, saldo, nroordine, data from ordini join clienti where ordini.codcliente = clienti.codcliente;

## reperire numero, nome, cognome, numero ordine e data ordine per ogni ordine di clienti con saldo > 500
select nro_cliente, nome, cognome, nro_ordine, data_ordine from ordiniclienti where saldo > 500;

## scrivere la query che esegue il dbms
select clienti.codcliente, nome, cognome, nroordine, data from ordini join clienti where saldo > 500 and ordini.codcliente = clienti.codcliente;

## crea problemi modificare i dati nella vista?
la vista, essendo composta da attributi di più relazioni, può causare comportamenti imprevisti

## definire vista TotaleOrdini
create view TotaleOrdini (nro_ordine, tot_ordine) as select nroordine, sum(qtaordinata * przrichiesto) from dettordini group by nroordine;

## reperire numero ordine e totale ordine per ogni ordine il cui totale > 500, ordinando per numero ordine
select nro_ordine, tot_ordine from totaleordini where tot_ordine > 500 order by nro_ordine;

## scrivere la query che esegue il dbms
select nroordine, sum(qtaordinata * przrichiesto) as tot_ordine from dettordini where (select sum(qtaordinata * przrichiesto)) > 500 group by nroordine order by nroordine;

## crea problemi modificare i dati nella vista?
non possiamo effettuare modifiche visto che la vista che abbiamo creato contiene attributi che sono derivati dagli attributi primitivi della relazione iniziale