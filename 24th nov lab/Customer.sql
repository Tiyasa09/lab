use c2268;
create table CUSTOMER(Cust_id varchar(5),Fname varchar(15),Lname varchar(15),
Area char(2),Phone numeric(10),DOB date,Payment numeric(6.2));
insert into customer values
('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50),
('A02','Vandana','Ray','MU',5560379,'1987-12-20',1000.75),
('A03','Pramada','Jauguste','DA',4560389,'1967-07-25',500.00),
('A04','Basu','Navingi','BA',6125401,'1956-02-28',860.00),
('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.50),
('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.50);
select * from customer;
update customer set Phone=1234567 where Cust_id='A03';
update customer set Phone=4567890 where Cust_id='A04';
update customer set DOB='1990-08-12' where Cust_id='A03';
update customer set DOB='1990-01-30' where Cust_id='A05';
select * from customer;
delete from customer where Cust_id='A01';
delete from customer where Cust_id='A05';
truncate table customer;
insert into customer values
('A01','Riya','Roy','MA',123456,'1990-01-15',860.50),
('A02','Puja','Sanfui','CA',789012,'1991-12-20',700.75),
('A03','Anu','Mondal','DV',345678,'1992-07-25',570.00),
('A04','Bani','Saha','BB',null,'1993-02-28',890.00),
('A05','Bisu','Ghosh','CC',543216,'1994-02-15',1200.50);
update customer set Fname='tiyasa' where Lname='Roy';
delete from customer where Lname='Roy';
