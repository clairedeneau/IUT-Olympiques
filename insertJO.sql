INSERT INTO USER (Nom, MDP, Metier) VALUES
('Alice', 'password123', 'A'),
('Bob', 'securepwd', 'U');

INSERT INTO JEUX_OLYMPIQUES (Id_Jeux, DateDebut, DateFin) VALUES
(1, '2024-07-26', '2024-08-11'),
(2, '2028-07-21', '2028-08-06');

INSERT INTO PAYSJO (Nom_Pays, Nb_Médailles_or, Nb_Médailles_argent, Nb_Médailles_bronze) VALUES
('France', 10, 15, 20),
('USA', 30, 25, 20),
('Japan', 20, 15, 25);

INSERT INTO SPORTS (Id_Sport, Taille_Equipe, Place_Spectateur) VALUES
(1, 1, 5000),
(2, 1, 3000),
(3, 6, 8000),
(4, 7, 6000),
(5, 1, 7000);

-- Insertion des enregistrements dans les tables enfants

INSERT INTO NATATION (Nom_Sport, Distance, Profondeur_Piscine, Id_Sport) VALUES
('Natation', 100, 2, 1);

INSERT INTO ESCRIME (Nom_Sport, Fleuret, Epee, Sabre, Id_Sport) VALUES
('Escrime', TRUE, TRUE, TRUE, 2);

INSERT INTO VOLLEY (Nom_Sport, Largeur_Terrain, Longueur_Terrain, SableTerrain, SalleTerrain, Id_Sport) VALUES
('Volley-Ball', 9, 18, TRUE, FALSE, 3);

INSERT INTO HANDBALL (Nom_Sport, Largeur_Terrain, Longueur_Terrain, Id_Sport) VALUES
('Handball', 20, 40, 4);

INSERT INTO ATHLETISME (Nom_Sport, Distance, Course_Haie, Id_Sport) VALUES
('Athletisme', 100, TRUE, 5);

-- Insertion des enregistrements dans les autres tables

INSERT INTO EQUIPE (Id_Equipe, Nb_Victoires, Nom_Equipe, Nom_Pays) VALUES
(1, 5, 'Equipe1', 'France'),
(2, 8, 'Equipe2', 'USA');

INSERT INTO ATHLETES (Id_Athlète, Nom, Prenom, Sexe, Puissance, Agilité, Endurance, Nb_Victoires_Athlète, Nom_Pays, Id_Sport) VALUES
(1, 'Dupont', 'Jean', 'M', 80, 75, 85, 10, 'France', 1),
(2, 'Smith', 'John', 'M', 90, 80, 90, 15, 'USA', 2),
(3, 'Yamada', 'Taro', 'M', 85, 85, 80, 12, 'Japan', 5);

INSERT INTO EPREUVES (Id_Epreuve, Nom_Epreuve, Sexe, Id_Sport) VALUES
(1, '100m Papillon', 'M', 1),
(2, 'Épée individuelle', 'F', 2),
(3, 'Match de Volley-Ball', 'M', 3);

INSERT INTO PARTICIPER (Id_Equipe, Id_Epreuve, Position, Score) VALUES
(1, 1, 1, 95),
(2, 2, 2, 90);

INSERT INTO APPARTENIR (Id_Athlète, Id_Equipe) VALUES
(1, 1),
(2, 2);

INSERT INTO CONTENIR (Id_Jeux, Nom_Pays) VALUES
(1, 'France'),
(1, 'USA'),
(2, 'Japan');