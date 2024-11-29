show databases;
use projet_gei_009;

show tables;

desbribe <table>;
//modifier
ALTER TABLE User ADD location VARCHAR(25);


CREATE TABLE User (
    id INT PRIMARY KEY,
    name VARCHAR(35),
    surname VARCHAR(35),
    birth_date DATE,
    phone INT,
    email VARCHAR(35),
  	location VARCHAR(35)
);

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

Create table Review(
private int review_id;
	review_id int primary key,
	user_id int,
	CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES User(id),
	grade int,
	comments varchar(400)
);


