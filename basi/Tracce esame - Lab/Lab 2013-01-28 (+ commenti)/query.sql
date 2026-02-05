alter table LibriAutori add constraint primary key (codice_libro, nro_autore);
alter table LibriAutori add constraint foreign key (codice_libro) references libri(codice_libro);
alter table LibriAutori add constraint foreign key (nro_autore) references autori(nro_autore);

insert into autori (nro_autore, cognome_autore) values ('24', 'Liala');

create view LibriPubblicati_PB (Codice_libro, Titolo_libro, Tipo_libro) as select codice_libro, titolo_libro, tipo_libro from libri natural join editori where nome_editore = 'Pocket Books';

select * from libripubblicati_PB;

select Nro_autore, cognome_autore, nome_autore from autori where nro_autore not in (select nro_autore from libriautori la join libripubblicati_pb lapb on la.codice_libro = lapb.codice_libro) order by cognome_autore, nome_autore;

select titolo_libro, tipo_libro from libripubblicati_pb natural join libri order by prezzo_libro desc limit 1;

select cognome_autore, nome_autore, codice_libro, ifnull((select sum(nro_copie_disponibili) from scorte where codice_libro = lppb.codice_libro), 0) as nCopie from libripubblicati_pb lppb natural join libriautori natural join autori where Nro_seq = 1;