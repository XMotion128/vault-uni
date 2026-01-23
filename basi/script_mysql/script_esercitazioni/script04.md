# Esercizi SQL4
10) ```select CodCliente, cognome, nome from Clienti c where exists (select * from ordini o where data="2002-09-05" and o.codcliente=c.codcliente);```
11) ```select CodCliente, cognome, nome from Clienti c where not exists (select * from ordini o where data="2002-09-05" and o.codcliente=c.codcliente);```
12) 