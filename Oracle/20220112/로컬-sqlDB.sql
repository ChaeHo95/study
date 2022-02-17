create table userTBL -- ȸ�� ���̺�
(userID char(8) not null primary key, -- ����ھ��̵�(PK)
userName nvarchar2(10) not null, -- �̸�
birthYear number(4) not null, -- ����⵵
addr nchar(2) not null, -- ����(2����)
mobile char(3), -- �޴����� ����
mobile2 char(8), -- �޴����� ������ ��ȭ��ȣ
height number(3), -- Ű
mDate date -- ȸ�� ������
);

create table buyTBL -- ȸ�� ���� ���̺�
(idNum number(8) not null primary key, -- ����(PK)
userID char(8) not null, -- ���̵�(FK)
prodName Nchar(6) not null, -- ��ǰ��
groupName nchar(4), -- �з�
price number(8) not null, -- �ܰ�
amount number(3) not null , -- ����
foreign key (userID) references userTBL(userID)
);
grant connect, resource, dba to sqldb2;

insert into userTBL values('LSG','�̽±�',1987,'����','011','11111111',182,'2008-8-8');
insert into userTBL values('KBS','�����',1979,'�泲','011','22222222',173,'2012-4-4');
insert into userTBL values('KKH','���ȣ',1971,'����','019','33333333',177,'2007-7-7');
insert into userTBL values('JYP','������',1950,'���','011','44444444',166,'2009-4-4');
insert into userTBL values('SSK','���ð�',1979,'����',NULL,NULL,186,'2013-12-12');
insert into userTBL values('LJB','�����',1963,'����','016','66666666',182,'2009-9-9');
insert into userTBL values('YJS','������',1969,'�泲',NULL,NULL,170,'2005-5-5');
insert into userTBL values('EJW','������',1972,'���','011','88888888',174,'201-3-3');
insert into userTBL values('JKW','������',1965,'���','018','99999999',172,'2010-10-10');
insert into userTBL values('BBK','�ٺ�Ŵ',1973,'����','010','00000000',176,'2013-5-5');

create sequence idSEQ; -- ������ȣ �Է��� ���ؼ� ������ ����

insert into buyTBL values(idSEQ.NEXTVAL,'KBS','�ȭ',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','��Ʈ��','����',1000,1);
insert into buyTBL values(idSEQ.NEXTVAL,'JYP','�����','����',200,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','�����','����',200,5);
insert into buyTBL values(idSEQ.NEXTVAL,'SSK','å','����',15,5);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','å','����',15,2);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','û����','�Ƿ�',50,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','�ȭ',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','å','����',15,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','�ȭ',NULL,30,2);

commit;