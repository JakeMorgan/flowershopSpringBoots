Create Table Users(
Id long not null IDENTITY(0,1) PRIMARY KEY,
UserName nvarchar(30),
Password nvarchar(30),
Address nvarchar(30),
Phone nvarchar(20),
Balance Decimal,
Discount int,
Role nvarchar(10));

CREATE TABLE Flower(
Id long not null IDENTITY(0,1) PRIMARY KEY,
name VARCHAR(50),
price DECIMAL,
quantity int
);

Create table ORDERS(
Id long not null IDENTITY(0,1) PRIMARY KEY,
orderCreateDate DATE,
orderCompleteDate DATE,
userId long,
total decimal,
status nvarchar(10) check (status in ('CREATED', 'SENT', 'COMPLETED')),
FOREIGN KEY (userId) REFERENCES Users(id));

CREATE TABLE OrderItem(
Id Long not null IDENTITY(0,1) PRIMARY KEY,
orderId long,
flowerId long,
amount int,
cost DECIMAL,
FOREIGN KEY (orderId) REFERENCES Orders(id),
FOREIGN KEY (flowerId) REFERENCES Flower(id));