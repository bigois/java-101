INSERT INTO political_parties (id, name)
SELECT 1, 'PT' WHERE NOT EXISTS (
	SELECT 1 FROM political_parties WHERE id = 1
);

INSERT INTO political_parties (id, name)
SELECT 2, 'PL' WHERE NOT EXISTS (
	SELECT 1 FROM political_parties WHERE id = 2
);

INSERT INTO political_parties (id, name)
SELECT 3, 'MDB' WHERE NOT EXISTS (
	SELECT 1 FROM political_parties WHERE id = 3
);
