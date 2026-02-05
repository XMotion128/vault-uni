alter table scorte add foreign key (nro_filiale) references Filiali(nro_filiale);

insert into Filiali (nro_filiale, nome_filiale, sede_filiale) values ('5', 'Henrys Manhattan', 'Broadway');

create view LibriInVendita_HB (Titolo_libro) as select Titolo_libro from Libri natural join Scorte natural join filiali where Nome_filiale = 'Henrys Brentwood';

select * from LibriInVendita_HB;

select nome_filiale, titolo_libro, nro_copie_disponibili from filiali natural join scorte natural join libri order by nome_filiale, titolo_libro;

select titolo_libro from libri natural join libriinvendita_hb where prezzo_libro = (select min(prezzo_libro) from libri natural join libriinvendita_hb);

select titolo_libro, nome_editore, prezzo_libro from libri natural join editori where titolo_libro not in (select titolo_libro from libriinvendita_hb) order by titolo_libro;