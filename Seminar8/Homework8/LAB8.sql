CREATE SEQUENCE seq_artist
    MINVALUE 1
    START WITH 1
    INCREMENT BY 1
    CACHE 10;

CREATE SEQUENCE seq_album
    MINVALUE 1
    START WITH 1
    INCREMENT BY 1
    CACHE 10;

CREATE SEQUENCE seq_genre
    MINVALUE 1
    START WITH 1
    INCREMENT BY 1
    CACHE 10;


--ALTER USER LAB8 QUOTA 100M ON SYSTEM;
--ALTER USER LAB8 QUOTA 100M ON Artist;

CREATE TABLE Artist (
    ArtistId INT PRIMARY KEY NOT NULL,
    Name VARCHAR2(120),
    Country VARCHAR2(120)
);

--ALTER USER LAB8 QUOTA 100M ON Album;

CREATE TRIGGER artist_trigger
    BEFORE INSERT ON Artist
    FOR EACH ROW
DECLARE
    v_count INT;

BEGIN
    SELECT Count(*) INTO v_count FROM Artist WHERE LOWER(NAME) = LOWER(:NEW.NAME);
    IF v_count > 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Artist already exists');
    END IF;
END;
/
CREATE TRIGGER album_trigger
    BEFORE INSERT ON Album
    FOR EACH ROW
DECLARE
    v_count INT;
BEGIN
    SELECT COUNT(*) INTO v_count FROM Album WHERE LOWER(TITLE) = LOWER(:NEW.TITLE) AND LOWER(ARTISTNAME)=LOWER(:NEW.ARTISTNAME);
    IF v_count > 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Album already exists');
    END IF;
END;
/

CREATE TRIGGER genre_trigger
    BEFORE INSERT ON Genre
    FOR EACH ROW
    DECLARE
        v_count INT;
BEGIN
    SELECT Count(*) INTO v_count FROM Genre WHERE LOWER(NAME) = LOWER(:NEW.NAME);
    IF v_count > 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Genre already exists');
    END IF;
END;
/

CREATE TABLE Album (
    AlbumId INT PRIMARY KEY NOT NULL,
    Title VARCHAR2(160) NOT NULL,
    Year INTEGER,
    ArtistName VARCHAR2(120),
    GenreName VARCHAR2(120)
);

--ALTER USER LAB8 QUOTA 100M ON Genre;

CREATE TABLE GENRE (
    GenreId INT PRIMARY KEY NOT NULL,
    Name VARCHAR2(120)
);

--ALTER TABLE Artist MODIFY ArtistId INT DEFAULT seq_artist.nextval;
--ALTER TABLE Album MODIFY AlbumId INT DEFAULT seq_album.nextval;
--ALTER TABLE Genre MODIFY GenreId INT DEFAULT seq_genre.nextval;

--AICI TESTAM SA VEDEM DACA AU MERS INSERARIILE:

INSERT INTO Artist (ArtistId, Name, Country) VALUES (seq_artist.nextval, 'AC/DC', 'Australia');
INSERT INTO Artist (ArtistId, Name, Country) VALUES (seq_artist.nextval, 'Accept', 'Germany');
INSERT INTO Artist (ArtistId, Name, Country) VALUES (seq_artist.nextval, 'Aerosmith', 'USA');
INSERT INTO Artist (ArtistId, Name, Country) VALUES (seq_artist.nextval, 'Alanis Morissette', 'Canada');

SELECT * FROM Artist;


INSERT INTO Genre (GenreId, Name) VALUES (seq_genre.nextval, 'Rock');
INSERT INTO Genre (GenreId, Name) VALUES (seq_genre.nextval, 'Metal');
INSERT INTO Genre (GenreId, Name) VALUES (seq_genre.nextval, 'Pop');
INSERT INTO Genre (GenreId, Name) VALUES (seq_genre.nextval, 'Blues');
SELECT * FROM Genre;

DELETE FROM Album WHERE AlbumId = 1 OR AlbumId = 2 OR AlbumId = 3;
DELETE FROM GENRE WHERE GenreId = 1 OR GenreId = 2 OR GenreId = 3 OR GenreId = 4;
DELETE FROM Artist WHERE ArtistId =1 OR ArtistId = 2 OR ArtistId = 3 OR ArtistId = 4;


SELECT * FROM ARTIST;
SELECT * FROM ALBUM;
SELECT * FROM GENRE;

DELETE FROM Artist WHERE ArtistId >= 55 OR ArtistId <= 56;
DELETE FROM Genre WHERE GenreId >= 113 OR GenreId <= 116;
DELETE FROM Album WHERE AlbumId =2 OR AlbumId=3;

COMMIT;