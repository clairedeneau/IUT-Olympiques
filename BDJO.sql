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

-- Creation des tables

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
    Nb_Medailles_or int NOT NULL,
    Nb_Medailles_argent int NOT NULL,
    Nb_Medailles_bronze int NOT NULL
);

CREATE TABLE CONTENIR (
    Id_Jeux int NOT NULL, -- Cle etrangere
    Nom_Pays varchar(40) NOT NULL, -- Cle etrangere
    PRIMARY KEY(Id_Jeux, Nom_Pays)
);

CREATE TABLE ATHLETES (
    Id_Athlete int NOT NULL PRIMARY KEY,
    Nom varchar(20) NOT NULL,
    Prenom varchar(20) NOT NULL,
    Sexe varchar(20) NOT NULL,
    Puissance int NOT NULL,
    Agilite int NOT NULL,
    Endurance int NOT NULL,
    Nb_Victoires_Athlete int NOT NULL,
    Nom_Pays varchar(40) NOT NULL, -- Cle etrangere
    Id_Sport int NOT NULL -- Cle etrangere
);

CREATE TABLE EQUIPE (
    Id_Equipe int NOT NULL PRIMARY KEY,
    Nb_Victoires int NOT NULL,
    Nom_Equipe varchar(20) NOT NULL,
    Nom_Pays varchar(40) NOT NULL -- Cle etrangere
);

CREATE TABLE APPARTENIR (
    Id_Athlete int NOT NULL, -- Cle etrangere
    Id_Equipe int NOT NULL, -- Cle etrangere
    PRIMARY KEY(Id_Athlete, Id_Equipe)
);

CREATE TABLE PARTICIPER (
    Id_Equipe int NOT NULL, -- Cle etrangere
    Id_Epreuve int NOT NULL, -- Cle etrangere
    Position int NOT NULL,
    Score int NOT NULL,
    PRIMARY KEY(Id_Equipe, Id_Epreuve)
);

CREATE TABLE EPREUVES (
    Id_Epreuve int NOT NULL PRIMARY KEY,
    Nom_Epreuve varchar(30) NOT NULL,
    Sexe varchar(20) NOT NULL,
    Id_Sport int NOT NULL -- Cle etrangere
);

CREATE TABLE SPORTS (
    Id_Sport int NOT NULL PRIMARY KEY,
    Taille_Equipe int NOT NULL,
    Place_Spectateur int NOT NULL
);

-- Creation des tables enfants

CREATE TABLE NATATION (
    Nom_Sport varchar(20) DEFAULT 'Natation' PRIMARY KEY,
    Distance int NOT NULL,
    Profondeur_Piscine int NOT NULL,
    Id_Sport int DEFAULT 1 -- Cle etrangere
);

CREATE TABLE ESCRIME (
    Nom_Sport varchar(20) DEFAULT 'Escrime' PRIMARY KEY,
    Fleuret boolean,
    Epee boolean,
    Sabre boolean,
    Id_Sport int DEFAULT 2 -- Cle etrangere
);

CREATE TABLE VOLLEY (
    Nom_Sport varchar(20) DEFAULT 'Volley-Ball' PRIMARY KEY,
    Largeur_Terrain int NOT NULL,
    Longueur_Terrain int NOT NULL,
    SableTerrain boolean,
    SalleTerrain boolean,
    Id_Sport int DEFAULT 3 -- Cle etrangere
);

CREATE TABLE HANDBALL (
    Nom_Sport varchar(20) DEFAULT 'Handball' PRIMARY KEY,
    Largeur_Terrain int NOT NULL,
    Longueur_Terrain int NOT NULL,    
    Id_Sport int DEFAULT 4 -- Cle etrangere
);

CREATE TABLE ATHLETISME (
    Nom_Sport varchar(20) DEFAULT 'Athletisme' PRIMARY KEY,
    Distance int NOT NULL,
    Course_Haie boolean,
    Id_Sport int DEFAULT 5 -- Cle etrangere
);

-- Creation des cles etrangeres des Tables

ALTER TABLE CONTENIR ADD FOREIGN KEY (Id_Jeux) REFERENCES JEUX_OLYMPIQUES (Id_Jeux);
ALTER TABLE CONTENIR ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYSJO (Nom_Pays);

ALTER TABLE ATHLETES ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYSJO (Nom_Pays);
ALTER TABLE ATHLETES ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);

ALTER TABLE EQUIPE ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYSJO (Nom_Pays);

ALTER TABLE APPARTENIR ADD FOREIGN KEY (Id_Equipe) REFERENCES EQUIPE (Id_Equipe);
ALTER TABLE APPARTENIR ADD FOREIGN KEY (Id_Athlete) REFERENCES ATHLETES (Id_Athlete);

ALTER TABLE PARTICIPER ADD FOREIGN KEY (Id_Equipe) REFERENCES EQUIPE (Id_Equipe);
ALTER TABLE PARTICIPER ADD FOREIGN KEY (Id_Epreuve) REFERENCES EPREUVES (Id_Epreuve);

ALTER TABLE EPREUVE ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);

-- Creation des cles etrangeres des Tables Enfants

ALTER TABLE NATATION ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE ESCRIME ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE VOLLEY ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE HANDBALL ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);
ALTER TABLE ATHLETISME ADD FOREIGN KEY (Id_Sport) REFERENCES SPORTS (Id_Sport);








