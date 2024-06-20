DROP TABLE IF EXISTS NATATION;
DROP TABLE IF EXISTS ESCRIME;
DROP TABLE IF EXISTS VOLLEY;
DROP TABLE IF EXISTS HANDBALL;
DROP TABLE IF EXISTS ATHLETISME;

DROP TABLE IF EXISTS APPARTENIR;
DROP TABLE IF EXISTS PARTICIPER;
DROP TABLE IF EXISTS CONTENIR;
DROP TABLE IF EXISTS EPREUVES;

DROP TABLE IF EXISTS ATHLETES;
DROP TABLE IF EXISTS EQUIPE;
DROP TABLE IF EXISTS PAYSJO;
DROP TABLE IF EXISTS SPORTS;
DROP TABLE IF EXISTS JEUX_OLYMPIQUES;
DROP TABLE IF EXISTS USER;

-- Création des tables

CREATE TABLE USER (
    Nom varchar(20) NOT NULL PRIMARY KEY,
    MDP varchar(20) NOT NULL,
    Metier varchar(1) NOT NULL
);

CREATE TABLE JEUX_OLYMPIQUES (
    Id_Jeux int NOT NULL PRIMARY KEY,
    DateDebut date NOT NULL,
    DateFin date NOT NULL
);

CREATE TABLE PAYSJO (
    Nom_Pays varchar(40) NOT NULL PRIMARY KEY,
    Nb_Médailles_or int NOT NULL,
    Nb_Médailles_argent int NOT NULL,
    Nb_Médailles_bronze int NOT NULL
);

CREATE TABLE CONTENIR (
    Id_Jeux int NOT NULL, -- Clé étrangère
    Nom_Pays varchar(40) NOT NULL, -- Clé étrangère
    PRIMARY KEY(Id_Jeux, Nom_Pays)
);

CREATE TABLE ATHLETES (
    Id_Athlète int NOT NULL PRIMARY KEY,
    Nom varchar(20) NOT NULL,
    Prenom varchar(20) NOT NULL,
    Sexe varchar(20) NOT NULL,
    Puissance int NOT NULL,
    Agilité int NOT NULL,
    Endurance int NOT NULL,
    Nb_Victoires_Athlète int NOT NULL,
    Nom_Pays varchar(40) NOT NULL, -- Clé étrangère
    Id_Sport int NOT NULL -- Clé étrangère
);

CREATE TABLE EQUIPE (
    Id_Equipe int NOT NULL PRIMARY KEY,
    Nb_Victoires int NOT NULL,
    Nom_Equipe varchar(20) NOT NULL,
    Nom_Pays varchar(40) NOT NULL -- Clé étrangère
);

CREATE TABLE APPARTENIR (
    Id_Athlète int NOT NULL, -- Clé étrangère
    Id_Equipe int NOT NULL, -- Clé étrangère
    PRIMARY KEY(Id_Athlète, Id_Equipe)
);

CREATE TABLE PARTICIPER (
    Id_Equipe int NOT NULL, -- Clé étrangère
    Id_Epreuve int NOT NULL, -- Clé étrangère
    Position int NOT NULL,
    Score int NOT NULL,
    PRIMARY KEY(Id_Equipe, Id_Epreuve)
);

CREATE TABLE EPREUVES (
    Id_Epreuve int NOT NULL PRIMARY KEY,
    Nom_Epreuve varchar(30) NOT NULL,
    Sexe varchar(20) NOT NULL,
    Id_Sport int NOT NULL -- Clé étrangère
);

CREATE TABLE SPORTS (
    Id_Sport int NOT NULL PRIMARY KEY,
    Taille_Equipe int NOT NULL,
    Place_Spectateur int NOT NULL
);

-- Création des tables enfants

CREATE TABLE NATATION (
    Nom_Sport varchar(20) DEFAULT 'Natation' PRIMARY KEY,
    Distance int NOT NULL,
    Profondeur_Piscine int NOT NULL,
    Id_Sport int DEFAULT 1 -- Clé étrangère
);

CREATE TABLE ESCRIME (
    Nom_Sport varchar(20) DEFAULT 'Escrime' PRIMARY KEY,
    Fleuret boolean,
    Epee boolean,
    Sabre boolean,
    Id_Sport int DEFAULT 2 -- Clé étrangère
);

CREATE TABLE VOLLEY (
    Nom_Sport varchar(20) DEFAULT 'Volley-Ball' PRIMARY KEY,
    Largeur_Terrain int NOT NULL,
    Longueur_Terrain int NOT NULL,
    SableTerrain boolean,
    SalleTerrain boolean,
    Id_Sport int DEFAULT 3 -- Clé étrangère
);

CREATE TABLE HANDBALL (
    Nom_Sport varchar(20) DEFAULT 'Handball' PRIMARY KEY,
    Largeur_Terrain int NOT NULL,
    Longueur_Terrain int NOT NULL,    
    Id_Sport int DEFAULT 4 -- Clé étrangère
);

CREATE TABLE ATHLETISME (
    Nom_Sport varchar(20) DEFAULT 'Athletisme' PRIMARY KEY,
    Distance int NOT NULL,
    Course_Haie boolean,
    Id_Sport int DEFAULT 5 -- Clé étrangère
);

-- Création des clés étrangères des Tables

ALTER TABLE CONTENIR ADD FOREIGN KEY (Id_Jeux) REFERENCES JEUX_OLYMPIQUES (Id_Jeux);
ALTER TABLE CONTENIR ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYSJO (Nom_Pays);

ALTER TABLE ATHLETES ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYSJO (Nom_Pays);
ALTER TABLE ATHLETES ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);

ALTER TABLE EQUIPE ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYSJO (Nom_Pays);

ALTER TABLE APPARTENIR ADD FOREIGN KEY (Id_Equipe) REFERENCES EQUIPE (Id_Equipe);
ALTER TABLE APPARTENIR ADD FOREIGN KEY (Id_Athlète) REFERENCES ATHLETES (Id_Athlète);

ALTER TABLE PARTICIPER ADD FOREIGN KEY (Id_Equipe) REFERENCES EQUIPE (Id_Equipe);
ALTER TABLE PARTICIPER ADD FOREIGN KEY (Id_Epreuve) REFERENCES EPREUVES (Id_Epreuve);

ALTER TABLE EPREUVE ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);

-- Création des clés étrangères des Tables Enfants

ALTER TABLE NATATION ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE ESCRIME ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE VOLLEY ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE HANDBALL ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE ATHLETISME ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);








