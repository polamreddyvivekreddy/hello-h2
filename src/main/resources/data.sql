INSERT INTO PERSON VALUES(1001,22, '18-Feb-1999','Viv');
INSERT INTO PERSON VALUES(1002,26, '30-Oct-1996','Gou');
insert into PErson values (1003, 22, '29-Aug-1999','Phan');
INSERT INTO PERSON VALUES(1004,40,'30-Jun-1993','');
insert into person values (1005,32 , '29-Jan-1995','');
INSERT INTO PERSON VALUES(1006,10,'12-Jul-1997','Ben');
insert into person values (1007,12 , '12-Jan-1998','Tom');

-- DELIVERY has FOOD as @OneToOne but D is on Non-Owning side
insert into DELIVERY values(201, 'Kavali');
insert into DELIVERY values(202, 'Nellore');

-- FOOD has Person as @OneToOne & Delivery as @OneToOne
insert into FOOD VALUES(1,'Dosa', 201, 1001);
insert into FOOD VALUES(2,'Idli', 202, 1001);
insert into FOOD VALUES(3,'Puri', 201, 1002);
insert into FOOD VALUES(4,'Uthappam', 202, 1003);








