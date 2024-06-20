DROP TABLE IF EXISTS PARTICIPE;
DROP TABLE IF EXISTS CONTIENT;
DROP TABLE IF EXISTS EQUIPES;
DROP TABLE IF EXISTS ATHLETE;
DROP TABLE IF EXISTS PAYS;
DROP TABLE IF EXISTS EPREUVE;
DROP TABLE IF EXISTS NATATION;
DROP TABLE IF EXISTS ESCRIME;
DROP TABLE IF EXISTS VOLLEY;
DROP TABLE IF EXISTS HANDBALL;
DROP TABLE IF EXISTS ATHLETISME;
DROP TABLE IF EXISTS SPORT;
DROP TABLE IF EXISTS JEUXOLYMPIQUES;
DROP TABLE IF EXISTS USER;

--Creation des Tables

CREATE TABLE USER (
    Nom varchar(20) NOT NULL  Primary Key,
    MDP varchar(20) NOT NULL,
    Role varchar(1) NOT NULL
);

CREATE TABLE JEUXOLYMPIQUES (
    Id_Jeux int NOT NULL Primary Key,
    DateDebut date NOT NULL,
    DateFin date NOT NULL
);

CREATE TABLE PAYS (
    Nom_Pays varchar(40) NOT NULL Primary Key,
    Nb_Médailles_or int NOT NULL,
    Nb_Médailles_argent int NOT NULL,
    Nb_Médailles_bronze int NOT NULL
);

CREATE TABLE CONTIENT (
    Id_Jeux int NOT NULL, -- Clé étrangère
    Nom_Pays varchar(40) NOT NULL, -- Clé étrangère
    Primary Key(Id_Jeux, Nom_Pays)
);

CREATE TABLE ATHLETE (
    Id_Athlète int NOT NULL Primary Key,
    Nom varchar(20) NOT NULL,
    Prenom varchar(20) NOT NULL,
    Sexe varchar(20) NOT NULL,
    Puissance int NOT NULL,
    Agilité int NOT NULL,
    Endurance int NOT NULL,
    Nb_Victoires_Athlète int NOT NULL,
    Nom_Pays varchar(40) NOT NULL, -- Clé étrangère
    Id_Sport int NOT NULL, -- Clé étrangère
    Id_Equipe int NOT NULL Default 0
);

CREATE TABLE EQUIPES (
    Id_Equipe int NOT NULL Primary Key,
    Nb_Victoires int NOT NULL,
    Nom_Equipe varchar(20) NOT NULL,
    Nom_Pays varchar(20) NOT NULL,
    Id_Athlète int NOT NULL -- Clé étrangère
);

CREATE TABLE PARTICIPE (
    Id_Equipe int NOT NULL, -- Clé étrangère
    Id_Epreuve int NOT NULL, -- Clé étrangère
    Position int NOT NULL,
    Score int NOT NULL,
    Primary Key(Id_Equipe, Id_Epreuve)
);

CREATE TABLE EPREUVE (
    Id_Epreuve int NOT NULL Primary Key,
    Nom_Epreuve varchar(30) NOT NULL,
    Sexe varchar(20) NOT NULL,
    Id_Sport int NOT NULL -- Clé étrangère
);

CREATE TABLE SPORT (
    Id_Sport int NOT NULL Primary Key,
    Taille_Equipe int NOT NULL,
    Place_Spectateur int NOT NULL
);

-- Creation des tables Enfants

CREATE TABLE NATATION (
    Nom_Sport varchar(20) DEFAULT "Natation" Primary Key,
    Distance int NOT NULL,
    Profondeur_Piscine int NOT NULL,
    Id_Sport int DEFAULT 1 -- Clé étrangère
);

CREATE TABLE ESCRIME (
    Nom_Sport varchar(20) DEFAULT "Escrime" Primary Key,
    Fleuret boolean,
    Epee boolean,
    Sabre boolean,
    Id_Sport int DEFAULT 2 -- Clé étrangère
);

CREATE TABLE VOLLEY (
    Nom_Sport varchar(20) DEFAULT "Volley-Ball" Primary Key,
    Largeur_Terrain int NOT NULL,
    Longueur_Terrain int NOT NULL,
    SableTerrain boolean,
    SalleTerrain boolean,
    Id_Sport int DEFAULT 3 -- Clé étrangère
);

CREATE TABLE HANDBALL (
    Nom_Sport varchar(20) DEFAULT "Handball" Primary Key,
    Largeur_Terrain int NOT NULL,
    Longueur_Terrain int NOT NULL,    
    Id_Sport int DEFAULT 4 -- Clé étrangère
);

CREATE TABLE ATHLETISME (
    Nom_Sport varchar(20) DEFAULT "ATHLETISME" Primary Key,
    Distance int NOT NULL,
    Course_Haie boolean,
    Id_Sport int DEFAULT 5 -- Clé étrangère
);

-- Création des clés étrangères des Tables

ALTER TABLE CONTIENT ADD FOREIGN KEY (Id_Jeux) REFERENCES JEUXOLYMPIQUES (Id_Jeux);
ALTER TABLE CONTIENT ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYS (Nom_Pays);

ALTER TABLE ATHLETE ADD FOREIGN KEY (Nom_Pays) REFERENCES PAYS (Nom_Pays);
ALTER TABLE ATHLETE ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);
ALTER TABLE ATHLETE ADD FOREIGN KEY (Id_Equipe) REFERENCES EQUIPES (Id_Equipe);

ALTER TABLE EQUIPES ADD FOREIGN KEY (Id_Athlète) REFERENCES ATHLETE (Id_Athlète);

ALTER TABLE PARTICIPE ADD FOREIGN KEY (Id_Equipe) REFERENCES EQUIPES (Id_Equipe);
ALTER TABLE PARTICIPE ADD FOREIGN KEY (Id_Epreuve) REFERENCES EPREUVE (Id_Epreuve);

ALTER TABLE EPREUVE ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);

-- Création des clés étrangères des Tables Enfants

ALTER TABLE NATATION ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);

ALTER TABLE ESCRIME ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);

ALTER TABLE VOLLEY ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);

ALTER TABLE HANDBALL ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);

ALTER TABLE ATHLETISME ADD FOREIGN KEY (Id_Sport) REFERENCES SPORT (Id_Sport);










