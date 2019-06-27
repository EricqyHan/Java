drop table car;
create schema car_lot;
use car_lot;

create table car (
	id		INT NOT NULL,
    make	VARCHAR(50),
    model	VARCHAR(50),
    model_year	VARCHAR(4),
    color	VARCHAR(50),
	PRIMARY KEY (id)
);

Select * from car; 

/* Add folloring to car incentory */ 

/* 2012 Red Honda Accord */
insert into car (id, make, model, model_year, color)
VALUES(1 , 'Honda',  'Accord', '2012', 'Red');

/* 2017 Black Chevy Impala */
insert into car (id, make, model, model_year, color)
VALUES(2 , 'Chevy',  'Impala', '2017', 'Black');

/* 2019 Silver Ford F-150 */
insert into car (id, make, model, model_year, color)
VALUES(3 , 'Ford',  'F-150', '2019', 'Silver');

/* 2020 White Subaru Outback */
insert into car (id, make, model, model_year, color)
VALUES(4 , 'Subaru',  'Outback', '2020', 'White');

/* 2015 Silver Ford Mustang */
insert into car (id, make, model, model_year, color)
VALUES(5, 'Ford',  'Mustang', '2015', 'Silver');

/* 2018 Blue Honda Ridgeline */
insert into car (id, make, model, model_year, color)
VALUES(6, 'Honda',  'Ridgeline', '2018', 'Blue');

/* 2017 Gray Chevy Silverrado */
insert into car (id, make, model, model_year, color)
VALUES(7, 'Chevy',  'Silverrado', '2017', 'Gray');

/* 2. Make the following updates to the database */
/* Change all hondas to black */

update car 
SET color = 'Black' 
WHERE make = 'Honda'; 

update car
Set make = 'Chevrolet'
Where make = 'Chevy'; 

update car
SET  model_year = 2019
where model_year = 2020;

/* 3. Delete the following */

/* delete all the following */ 
Delete from car where color = 'Blue';

/* Delete all fords */
Delete from car where make = 'Ford'; 


/* Delete all cars from 2012 to 2017*/
Delete from car where model_year  = 2012 ||  model_year = 2017;

