---GENRES--
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (0,0,'action');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (1,0,'drama');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (2,0,'romantic');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (3,0,'comedy');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (4,0,'sci-fi');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (5,0,'fantasy');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (6,0,'animation');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (7,0,'historical');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (8,0,'ducumentary');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (9,0,'family');
INSERT INTO GENRES (ID,VERSION,NAME) VALUES (10,0,'horror');

--USERS--
INSERT INTO USERS (ID, VERSION, USERNAME, EMAIL, PASSWORD, ROLE) VALUES (0, 0, 'admin', 'admin@gmail.com', 'admin', 'ADMINISTRATOR');
INSERT INTO USERS (ID, VERSION, USERNAME, EMAIL, PASSWORD, ROLE) VALUES (1, 0, 'vendeg', 'vendeg@gmail.com', 'vendeg', 'GUEST');
INSERT INTO USERS (ID, VERSION, USERNAME, EMAIL, PASSWORD, ROLE) VALUES (2, 0, 'moderator', 'moderator@gmail.com', 'moderator', 'MODERATOR');
INSERT INTO USERS (ID, VERSION, USERNAME, EMAIL, PASSWORD, ROLE) VALUES (3, 0, 'user', 'user@gmail.com', 'user', 'USER');

--ACTOR--

INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (0,0,'Robert De Niro');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (1,0,'Nat Wolff');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (2,0,'Anne Hathaway');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (3,0,'Matthew McConaughey');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (4,0,'John Lithgow');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (5,0,'Timothee Chalamet');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (6,0,'Jessica Chastain');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (7,0,'Adam Goldberg');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (8,0,'Jason London');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (9,0,'Ben Affleck');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (10,0,'Johnny Depp');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (11,0,'Freddie Highmore');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (12,0,'Helena Bonhem Carter');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (13,0,'David Kelly');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (14,0,'Benicio Del Toro');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (15,0,'Tobey Maguire');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (16,0,'Willem Dafoe');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (17,0,'Kirsten Durst');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (18,0,'JK. Simmons');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (19,0,'Colin Firth');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (20,0,'Hugh Grant');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (21,0,'Renee Zellweger');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (22,0,'Jason Schwartzman');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (23,0,'Matt Damon');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (24,0,'George Soros');
INSERT INTO ACTORS (ID,VERSION,NAME) VALUES (25,0,'Robin Williams');

--DIRECTORS--
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (0,0,'Richard Linklater');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (1,0,'Christopher Nolan');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (2,0,'Tim Burton');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (3,0,'Terry Gilliam');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (4,0,'Sam Raimi');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (5,0,'Sheron Maguire');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (6,0,'Sophia Coppola');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (7,0,'Charles Ferguson');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (8,0,'Nancy Meyers');
INSERT INTO DIRECTORS (ID,VERSION,NAME) VALUES (9,0,'Gus Van Sant');

--MOVIES--
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (0,0,'Interstellar','2014-11-07',1,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (1,0,'Dazed and Confused','1994-02-10',0,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (2,0,'Charlie and the Chocolate Factory','2005-07-15',2,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (3,0,'Fear and Loathing in Las Vegas','1998-05-22',3,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (4,0,'Spider-Man','2002-05-03'4,,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (5,0,'Bridget Jones Diary ','2001-04-13',5,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (6,0,'Marie Antoinette','2006-10-20',6,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (7,0,'Inside Job','2010-11-12',7,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (8,0,'Good Will Hunting','1997-01-09',9,'');
INSERT INTO MOVIES (ID,VERSION,TITLE,RELEASE_DATE,DIRECTOR_ID,DESCRIPTION) VALUES (9,0,'The Intern','2015-09-25',8,'');

--MOVIES_ACTORS--

INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (0,2);
INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (0,3);
INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (0,4);
INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (0,5);
INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (0,6);

INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (3,10);
INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (3,14);
INSERT INTO MOVIES_ACTORS (MOVIES_ID,ACTORS_ID) VALUES (3,15);


--GENRES--

INSERT INTO MOVIES_GENRES (MOVIES_ID,GENRES_ID) VALUES (0,0);
INSERT INTO MOVIES_GENRES (MOVIES_ID,GENRES_ID) VALUES (0,1);
INSERT INTO MOVIES_GENRES (MOVIES_ID,GENRES_ID) VALUES (0,4);
INSERT INTO MOVIES_GENRES (MOVIES_ID,GENRES_ID) VALUES (5,1);
INSERT INTO MOVIES_GENRES (MOVIES_ID,GENRES_ID) VALUES (5,2);
INSERT INTO MOVIES_GENRES (MOVIES_ID,GENRES_ID) VALUES (5,3);

--REVIEWS--

INSERT INTO REVIEWS (ID,VERSION,POINT,REVIEW,MOVIE_ID,USER_ID,CREATED_AT) VALUES (0,0,9,'Good',0,3,'2017-11-15 15:30:14.332');
INSERT INTO REVIEWS (ID,VERSION,POINT,REVIEW,MOVIE_ID,USER_ID,CREATED_AT) VALUES (1,0,9,'Good',0,2,'2016-11-15 15:30:14.332');