use c2268;
create table Custom(Cust_id varchar(6) primary key,Fname varchar(15) not null,
Lname varchar(15),Area char(2)not null,Phone numeric(10));
insert into custom values
('A01','Ivan','Ross','SA',6125467),
('A02','Vandana','Ray','MU',5560379),
('A03','Pramada','Jauguste','DA',4560389),
('A04','Basu','Navingi','BA',6125401),
('A05','Ravi','Shridhar','NA',null),
('A06','Rukmini','Aiyer','GH',5125274);
 create table Movie(Mv_no int primary key,Cust_id varchar(6),Title varchar(15) not null,
  Star varchar(5) not null,Price bigint(3));
insert into movie values
(1,'A02','Bloody','JC',181),
(2,'A04','The Firm','TC',200),
(3,'A01','Pretty Women','RG',151),
(4,'A06','Home Alone','MC',150),
(5,'A05','The Fugitive','MF',200),
(6,'A03','Coma','MD',100),
(7,'A02','Dracula','GO',150),
(8,'A06','Quick Change','BM',100),
(9,'A03','GonewiththeWind','CB',200),
(10,'A05','Carry on Doctor','LP',100);
select Title from movie where Price>100 and Price <200;
select * from custom where Area like '%A';
select Title from movie where Price<180 and length(Title)=6;
select Title,Price,Price*1.10 as Increment from movie;
select Fname from custom where Phone=null;
delete from custom where Cust_id='A01';
delete from movie where Mv_no=1;