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