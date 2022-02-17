create table userTBL -- 회원 테이블
(userID char(8) not null primary key, -- 사용자아이디(PK)
userName nvarchar2(10) not null, -- 이름
birthYear number(4) not null, -- 출생년도
addr nchar(2) not null, -- 지역(2글자)
mobile char(3), -- 휴대폰의 국번
mobile2 char(8), -- 휴대폰의 나머지 전화번호
height number(3), -- 키
mDate date -- 회원 가입일
);

create table buyTBL -- 회원 구매 테이블
(idNum number(8) not null primary key, -- 순번(PK)
userID char(8) not null, -- 아이디(FK)
prodName Nchar(6) not null, -- 물품명
groupName nchar(4), -- 분류
price number(8) not null, -- 단가
amount number(3) not null , -- 수량
foreign key (userID) references userTBL(userID)
);
grant connect, resource, dba to sqldb2;

insert into userTBL values('LSG','이승기',1987,'서울','011','11111111',182,'2008-8-8');
insert into userTBL values('KBS','김범수',1979,'경남','011','22222222',173,'2012-4-4');
insert into userTBL values('KKH','김경호',1971,'전남','019','33333333',177,'2007-7-7');
insert into userTBL values('JYP','조용필',1950,'경기','011','44444444',166,'2009-4-4');
insert into userTBL values('SSK','성시경',1979,'서울',NULL,NULL,186,'2013-12-12');
insert into userTBL values('LJB','임재범',1963,'서울','016','66666666',182,'2009-9-9');
insert into userTBL values('YJS','윤종신',1969,'경남',NULL,NULL,170,'2005-5-5');
insert into userTBL values('EJW','은지원',1972,'경북','011','88888888',174,'201-3-3');
insert into userTBL values('JKW','조관우',1965,'경기','018','99999999',172,'2010-10-10');
insert into userTBL values('BBK','바비킴',1973,'서울','010','00000000',176,'2013-5-5');

create sequence idSEQ; -- 순차번호 입력을 위해서 시퀀스 생성

insert into buyTBL values(idSEQ.NEXTVAL,'KBS','운동화',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','노트북','전자',1000,1);
insert into buyTBL values(idSEQ.NEXTVAL,'JYP','모니터','전자',200,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','모니터','전자',200,5);
insert into buyTBL values(idSEQ.NEXTVAL,'SSK','책','서적',15,5);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','책','서적',15,2);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','청바지','의류',50,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','운동화',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','책','서적',15,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','운동화',NULL,30,2);

commit;