create view LibriPubblicati_NY (Titolo_libro,Nome_editore) as select titolo_libro, nome_editore from libri natural join editori where stato_editore = 'NY';

select * from libripubblicati_ny order by nome_editore;