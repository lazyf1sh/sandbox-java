drop table CHILDTABLE;
drop table PARENTTABLE;
drop table BOOK;
drop table BOOK2;
drop table PAGE2;
drop table BOOK2_SEQ;
DROP TABLE USER;
DROP TABLE DOCUMENT;

create TABLE USER
(
    USER_LOGIN VARCHAR(255),
    USER_SSN   integer(255),
    USER_CITY  VARCHAR(255)
);

alter table USER add CONSTRAINT PK_USER PRIMARY KEY (USER_LOGIN, USER_SSN);

INSERT INTO USER VALUES ('bob', 99999999, 'Moscow');
INSERT INTO USER VALUES ('bob', 88888888, 'Moscow');
INSERT INTO USER VALUES ('john', 99999999, 'Moscow');
INSERT INTO USER VALUES ('john', 88888888, 'Moscow');

create TABLE DOCUMENT
(
    DOCUMENT_KEY        integer,
    DOCUMENT_NAME       VARCHAR(255),
    DOCUMENT_USER_LOGIN VARCHAR(255),
    DOCUMENT_USER_SSN   integer(255)
);

alter table DOCUMENT add CONSTRAINT PK_DOCUMENT PRIMARY KEY (DOCUMENT_KEY);
alter table DOCUMENT add CONSTRAINT FK_DOCUMENT_USER_LOGIN_SSN FOREIGN KEY (DOCUMENT_USER_LOGIN, DOCUMENT_USER_SSN) REFERENCES USER (USER_LOGIN, USER_SSN);

INSERT INTO DOCUMENT VALUES (0, 'Policy document', 'bob', 99999999);
INSERT INTO DOCUMENT VALUES (1, 'NDA document', 'bob', 88888888);
INSERT INTO DOCUMENT VALUES (2, 'Application form', 'john', 99999999);
INSERT INTO DOCUMENT VALUES (3, 'Repair estimation', 'john', 88888888);


create TABLE TICKET
(
    TICKET_ID integer,
    TICKET_DESCRIPTION VARCHAR(255)
);

create TABLE PROPERTIES
(
    PROPERTIES_KEY integer,
    PROPERTIES_VALUE VARCHAR(255)
);


create TABLE BOOK
(
    BOOK_KEY  integer,
    BOOK_NAME VARCHAR(255)
);

alter table BOOK
    add CONSTRAINT PK_BOOK PRIMARY KEY (BOOK_KEY);

create TABLE BOOK2
(
    BOOK2_KEY  integer,
    BOOK2_NAME VARCHAR(255)
);

alter table BOOK2 add CONSTRAINT PK_BOOK2 PRIMARY KEY (BOOK2_KEY);

create TABLE BOOK2_SEQ
(
    NEXT_VAL INT NOT NULL
);
insert into BOOK2_SEQ
values (0);

create TABLE PAGE2
(
    PAGE2_KEY         integer,
    BOOK2_KEY         integer,
    PAGE2_NAME        VARCHAR(255),
    PAGE2_ANNOTATIONS VARCHAR(255)
);

alter table PAGE2
    add CONSTRAINT PAGE2_PK PRIMARY KEY (PAGE2_KEY);
alter table PAGE2
    add CONSTRAINT FK_PAGE2_BOOK2 FOREIGN KEY (BOOK2_KEY) REFERENCES BOOK2 (BOOK2_KEY);

create TABLE PAGE2_SEQ
(
    NEXT_VAL INT NOT NULL
);
insert into PAGE2_SEQ
values (0);

create TABLE PARENTTABLE
(
    PARENTTABLE_KEY  integer,
    PARENTTABLE_NAME VARCHAR(255)
);

alter table PARENTTABLE
    add CONSTRAINT PK_PARENTTABLE_KEY PRIMARY KEY (PARENTTABLE_KEY);

create TABLE CHILDTABLE
(
    CHILDTABLE_KEY        integer,
    CHILDTABLE_NAME       VARCHAR(255),
    CHILDTABLE_PARENT_KEY integer
);

alter table CHILDTABLE
    add CONSTRAINT PK_CHILDTABLE_PK PRIMARY KEY (CHILDTABLE_KEY);
alter table CHILDTABLE
    add CONSTRAINT FK_CHILDTABLE_PARENT FOREIGN KEY (CHILDTABLE_PARENT_KEY) REFERENCES PARENTTABLE (PARENTTABLE_KEY);

insert into PARENTTABLE
values (0, 'Parent String 01');
insert into PARENTTABLE
values (1, 'Parent String 02');
insert into PARENTTABLE
values (2, 'Parent String 03');
insert into PARENTTABLE
values (3, 'Parent String 04');

insert into CHILDTABLE
values (0, 'Child String 01', 0);
insert into CHILDTABLE
values (1, 'Child String 02', 1);
insert into CHILDTABLE
values (2, 'Child String 03', 2);
insert into CHILDTABLE
values (3, 'Child String 04', 3);
insert into CHILDTABLE
values (4, 'Child String 05', 0);
insert into CHILDTABLE
values (5, 'Child String 06', 0);
