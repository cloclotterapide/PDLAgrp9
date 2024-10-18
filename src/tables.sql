show databases;
use projet_gei_009;

show tables;

desbribe <table>;
//modifier
ALTER TABLE User ADD location VARCHAR(25);

CREATE table Mission(
id int primary key,

location varchar(35),
mission_date date,
title varchar(35),
description varchar(200),
state ENUM("waiting_Volunteer","Accepted","Started","Finished"),
idValidator int,
CONSTRAINT idValidator FOREIGN KEY (idValidator) REFERENCES Validator(idValidator),
idUserInNeed int,
CONSTRAINT UserInNeed FOREIGN KEY (idUserInNeed) REFERENCES UserInNeed(idUserInNeed),
idVolunteer int,
CONSTRAINT idVolunteer FOREIGN KEY (idVolunteer) REFERENCES Volunteer(idVolunteer)
);

Create table Volunteer(
idVolunteer int primary key references user(id) on delete cascade);


Create table UserInNeed(
idUserInNeed int primary key references user(id) on delete cascade);

Create table Validator(
idValidator int primary key references user(id) on delete cascade);


