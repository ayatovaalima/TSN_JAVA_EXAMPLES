﻿-- Пример базы данных DISKS на derby
-- Автор: Талипов С.Н., 2013г.

DROP TABLE TSN.DISK_1;
DROP TABLE TSN.FIRM_2;
DROP TABLE TSN.CITY_3;
DROP TABLE TSN.TDISK_4;


CREATE TABLE "TDISK_4" (
  "ID" INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 10, INCREMENT BY 1) PRIMARY KEY,
  "NAME_TYPE_DISK"  VARCHAR(40) NOT NULL UNIQUE
);

INSERT INTO "TDISK_4" ("ID", "NAME_TYPE_DISK") VALUES (1, 'СИСТЕМНЫЙ ДИСК');
INSERT INTO "TDISK_4" ("ID", "NAME_TYPE_DISK") VALUES (2, 'ПРИКЛАДНОЕ И СИСТЕМНОЕ ПО');
INSERT INTO "TDISK_4" ("ID", "NAME_TYPE_DISK") VALUES (3, 'МУЗЫКА');
INSERT INTO "TDISK_4" ("ID", "NAME_TYPE_DISK") VALUES (4, 'ОБУЧАЮЩИЕ ПРОГРАММЫ');
INSERT INTO "TDISK_4" ("ID", "NAME_TYPE_DISK") VALUES (5, 'ФИЛЬМЫ');


CREATE TABLE "CITY_3" (
  "ID" INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 10, INCREMENT BY 1) PRIMARY KEY, 
  "NAME_CITY"  VARCHAR(40) NOT NULL UNIQUE, 
  "CODE_TEL" VARCHAR(20) 
);

INSERT INTO "CITY_3" ("ID", "NAME_CITY", "CODE_TEL") VALUES (1, 'РОССИЯ - МОСКВА', '495');
INSERT INTO "CITY_3" ("ID", "NAME_CITY", "CODE_TEL") VALUES (2, 'УКРАИНА - КИЕВ', '38044');
INSERT INTO "CITY_3" ("ID", "NAME_CITY", "CODE_TEL") VALUES (3, 'КАЗАХСТАН - АСТАНА', '7172');
INSERT INTO "CITY_3" ("ID", "NAME_CITY", "CODE_TEL") VALUES (4, 'КАЗАХСТАН - АЛМАТЫ', '7272');
INSERT INTO "CITY_3" ("ID", "NAME_CITY", "CODE_TEL") VALUES (5, 'КАЗАХСТАН - ПАВЛОДАР', '7182');


CREATE TABLE "FIRM_2" (
  "ID" INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 10, INCREMENT BY 1) PRIMARY KEY,
  "NAME_FIRM" VARCHAR(40), 
  "ID_CITY" INTEGER NOT NULL, 
  "AGENT_TEL" VARCHAR(20), 
  "DIRECTOR_TEL" VARCHAR(20), 
  "NAME_AGENT" VARCHAR(40), 
  "NAME_DIRECTOR" VARCHAR(40),
  FOREIGN KEY ("ID_CITY") REFERENCES CITY_3("ID")
);

INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (1, 'КРАСНЫЕ ЧЕЛНЫ', 1, '932-44-30', '932-44-32', 'ПЕТУХОВ АЛЕКСАНДР НИКОЛАЕВИЧ', 'КРАСНОГРУДОВ ВАЛЕРИЙ АЛЕКСАНДРОВИЧ');
INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (2, 'ТЕХНИКС-ПРО', 2, '254-23-57', '254-23-54', 'НЕВЗГОДОВ ОЛЕГ ГРИГОРЬЕВИЧ', 'ДРОЗДОВ АЛЕКСАНДР ПЕТРОВИЧ');
INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (3, 'CD-МАРКЕТ', 3, '63-58-04', '63-58-02', 'ИЕНОВ ДМИТРИЙ ВАСИЛЬЕВИЧ', 'ИВАЛГИН ДМИТРИЙ СЕРГЕЕВИЧ');
INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (4, 'МЕГАПОЛИС', 4, '932-67-35', '932-67-34', 'КУЛИК ИВАН СТЕПАНОВИЧ', 'АРТЕМЬЕВ ИВАН АЛЕКСАНДРОВИЧ');
INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (5, 'ТЕХНОДОМ', 5, '232-67-35', '232-67-34', 'ИКОНОВ ИВАН СТЕПАНОВИЧ', 'КУДИН СЕРГЕЙ ПЕТРОВИЧ');
INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (6, 'СУЛПАК', 5, '272-67-35', '272-67-34', 'ДЕМИДОВ ИВАН СТЕПАНОВИЧ', 'ВЛАСКОВ НИКОЛАЙ СЕМЁНОВИЧ');
INSERT INTO "FIRM_2" ("ID", "NAME_FIRM", "ID_CITY", "AGENT_TEL", "DIRECTOR_TEL", "NAME_AGENT", "NAME_DIRECTOR") VALUES (7, 'UNICODE', 5, '551-23-52', '472-56-37', 'ГЕРМАН СТАНИСЛАВ ДЕМИДОВИЧ', 'ДЕКИНС ДАНИЛ МИХАЙЛОВИЧ');


CREATE TABLE "DISK_1" (
  "ID" INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 10, INCREMENT BY 1) PRIMARY KEY,
  "NAME_DISK" VARCHAR(80), 
  "PRICE_PUR" DECIMAL(8,2) DEFAULT 0, 
  "PRICE_SEL" DECIMAL(8,2) DEFAULT 0, 
  "ID_FIRM" INTEGER NOT NULL, 
  "ID_TYPE_DISK" INTEGER NOT NULL, 
  "NUM_DISKS_SET" INTEGER DEFAULT 1,
  FOREIGN KEY ("ID_FIRM") REFERENCES FIRM_2("ID"),
  FOREIGN KEY ("ID_TYPE_DISK") REFERENCES TDISK_4("ID")
);

INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (1, 'ИНТЕРНЕТ-2014', 300, 500, 1, 2, 1);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (2, 'СУПЕРСИСТЕМНЫЙ ДИСК', 300, 600, 2, 1, 2);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (3, 'ENGLISH PLATINUM 2014', 900, 1200, 3, 4, 2);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (4, 'ALL STARS DISCO 2014', 300, 450, 4, 3, 2);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (5, 'ЗОЛОТАЯ БУХГАЛТЕРИЯ', 800, 1240, 2, 2, 1);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (6, 'ЗВЁЗДНЫЕ ВОЙНЫ', 900, 1300, 5, 5, 1);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (7, 'МАДАГАСКАР', 800, 1200, 6, 5, 1);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (8, 'WINDOWS 8', 14000, 15000, 7, 1, 1);
INSERT INTO "DISK_1" ("ID", "NAME_DISK", "PRICE_PUR", "PRICE_SEL", "ID_FIRM", "ID_TYPE_DISK", "NUM_DISKS_SET") VALUES (9, 'LINUX UBUNTU', 140, 150, 7, 1, 1);

