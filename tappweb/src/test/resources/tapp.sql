

CREATE TABLE cahier_journal (
    id_cahier_journal integer NOT NULL,
    nom_memo character varying,
    date_memo date
);



CREATE TABLE documents (
    id_documents integer NOT NULL,
    nom_documents character varying
);




CREATE TABLE eleves (
    id_eleves integer NOT NULL,
    prenom character varying,
    nom character varying,
    classe character varying
);



