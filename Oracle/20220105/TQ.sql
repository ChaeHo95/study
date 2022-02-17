----------------------------
--  �� ���̺�  --
----------------------------
create table tb_customer
(
customer_cd char(7 byte) not null,--���ڵ�
customer_nm nvarchar2(10) not null, --����
mw_flg char(1 byte) not null, --��������
birth_day char(20 byte) not null, --����
phone_number varchar2(16 byte), --��ȭ��ȣ
email varchar2(30 byte),--email
total_point number(10), --��������Ʈ
reg_dttm char(14 byte) --�����
);
create unique index pk_tb_customer on tb_customer(customer_cd);
alter table tb_customer add(constraint pk_tb_customer primary key (customer_cd));
----------------------------
--  �߰� �� ���̺�  --
----------------------------

create table tb_add_customer(
customer_cd char(7 byte) not null, --�� �ڵ�
customer_nm nvarchar2(10) not null, --����
mw_flg char(1 byte) not null, --��������
birth_day char(8 byte) not null, --����
phone_number VARCHAR2(16 byte) --��ȭ��ȣ
);
create unique index pk_tb_add_customer on tb_add_customer (customer_cd);
alter table tb_add_customer add (constraint pk_tb_add_customer primary key (customer_cd));

----------------------------
--  ����Ʈ ���̺�  --
----------------------------
create table tb_point(
customer_cd char(7 byte) not null,--���ڵ�
seq_no  number(10) not null,--�Ϸĺ�ȣ
point_memo varchar2(50),--����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14 byte) --�����
);
create unique index pk_tb_point on tb_point (customer_cd,seq_no);
alter table tb_point add(constraint pk_tb_point primary key(customer_cd,seq_no));

----------------------------
--  2017�� ����Ʈ ���̺�  --
----------------------------

create table tb_point_2017(
customer_cd char(7 byte) not null,--�� �ڵ�
seq_no number(10) not null,--�ϷĹ�ȣ
point_memo varchar2(50), --����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14 byte) --�����
);
create unique index pk_tb_point_2017 on tb_point_2017 (customer_cd,seq_no);
alter table tb_point_2017 add(constraint pk_tb_point_2017 primary key (customer_cd,
seq_no));

----------------------------
--  2018�� ����Ʈ ���̺�  --
----------------------------
create table tb_point_2018(
customer_cd char(7 byte) not null,--���ڵ�
seq_no number(10) not null, --�ϷĹ�ȣ
point_memo varchar2(50),--����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14 byte) --�����
);
create unique index pk_tb_point_2018 on tb_point_2018 (customer_cd,seq_no);
alter table tb_point_2018 add(constraint pk_tb_point_2018 primary key (customer_cd,seq_no));

----------------------------
--  2019�� ����Ʈ ���̺�  --
----------------------------

create table tb_point_2019
(
customer_cd char(7 byte) not null, --���ڵ�
seq_no number(10) not null,--����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14 byte)--�����
);
create unique index pk_tb_point_2019 on tb_point_2019(customer_cd,seq_no);
alter table tb_point_2019 add(constraint pk_tb_point_2019 primary key(customer_cd,seq_no));

----------------------------
--  ��Ÿ���� ���̺�  --
----------------------------

create table tb_etc_info
(
customer_cd char(7 byte) not null,--���ڵ�
customer_eng_nm varchar2(20 byte), --���� ����
item_list VARCHAR2(40 byte) --���� ǰ��
);
create unique index pk_tb_etc_info on tb_etc_info(customer_cd);
alter table tb_etc_info add(constraint pk_tb_etc_info primary key(customer_cd));

----------------------------
--  ǰ������ ���̺�  --
----------------------------
create table tb_item_info
(
item_cd char(7 byte) not null, --���� ǰ�� �ڵ�
item_nm VARCHAR2(20 byte) --���� ǰ���
);
create unique index pk_tb_item_info on tb_item_info(item_cd);
alter table tb_item_info add(constraint pk_tb_item_info primary key(item_cd));

----------------------------
--  ���� ���̺�  --
----------------------------

create table tb_grade
(
class_cd char(1 byte) not null, --���ڵ�
student_no number(2) not null, --�л���ȣ
student_nm nVARCHAR2(10) not null, --�л���
kor number(3), --����
eng number(3), --����
mat number(3), --����
tot number(3), --�հ�
avg number(5,1) --���
);
create unique index pk_tb_grade on tb_grade (class_cd,student_no);
alter table tb_grade add(constraint pk_tb_grade primary key(class_cd,student_no));
----------------------------
--  7������ ���̺�  --
----------------------------
create table tb_grade_07
(
test_cd char(3 byte) not null, --�����ڵ�
kor number(3), --����
eng number(3), --����
mat number(3) --����
);
create unique index pk_tb_grade_07 on tb_grade_07(test_cd);
alter table tb_grade_07 add (constraint pk_tb_grade_07 primary key(test_cd));
----------------------------
--  8������ ���̺�  --
----------------------------
create table tb_grade_08
(test_cd char(3 byte) not null, --�����ڵ�
kor number(3), --����
eng number(3), --����
mat number(3) --����
);
create unique index pk_tb_grade_08 on tb_grade_08(test_cd);
alter table tb_grade_08 add(constraint pk_tb_grade_08 primary key(test_cd));
----------------------------
--  9������ ���̺�  --
----------------------------
create table tb_grade_09
(
test_cd char(3 byte) not null, --�����ڵ�
kor number(3), --����
eng number(3), --����
mat number(3) --����
);
create unique index pk_tb_grade_09 on tb_grade_09 (test_cd);
alter table tb_grade_09 add(constraint pk_tb_grade_09 primary key (test_cd));

----------------------
-- 2020�� ���� ���̺�
----------------------

create table tb_grade_2020(
    test_month char(2) not null, --��
    test_cd char(3) not null, --�����ڵ�
    kor number(3), --����
    eng number(3), --����
    mat number(3) --����
);

create unique index pk_tb_grade_2020 on tb_grade_2020(test_month);
alter table tb_grade_2020 add(constraint pk_tb_grade_2020 primary key (test_month));

----------------------
-- �� ���� ���̺�
----------------------

create table tb_class_info(
    class_cd char(1) not null, --���ڵ�
    class_nm varchar2(20) not null --�ݸ�
);

create unique index pk_tb_class_info on tb_class_info(class_cd,class_nm);
alter table tb_class_info add(constraint pk_tb_class_info primary key (class_cd,class_nm));

----------------------
-- �Ǹ� ���̺�
----------------------

create table tb_sales(
    sales_dt char(8) not null, --�����
    seq_no number(5) not null, --�Ϸù�ȣ
    product_nm varchar2(20), --��ǰ��
    price number(10), --�ܰ�(��)
    sales_count number(3) --�ǸŰ���
);
create unique index pk_tb_sales on tb_sales(sales_dt,seq_no);
alter table tb_sales add(constraint pk_tb_sales primary key (sales_dt,seq_no));

----------------------
-- 9�� �Ǹ� ���̺�
----------------------

create table tb_sales_09(
    seq_no number(10) not null, --�Ϸù�ȣ
    product_nm varchar2(20), --��ǰ��
    customer_cd char(7), --���ڵ�
    sales_count number(3) --�ǸŰ���
);
create unique index pk_tb_sales_09 on tb_sales_09(seq_no);
alter table tb_sales_09 add(constraint pk_tb_sales_09 primary key (seq_no));

----------------------
-- �����ð�ǥ ���̺�
----------------------

create table tb_train_tm(
    train_no char(5) not null, --������ȣ
    run_ordr number(5) not null, --�������
    station_nm varchar2(20), --����
    arv_tm char(6), --�����ð�
    dpt_tm char(6) --��߽ð�
);
create unique index pk_tb_train_tm on tb_train_tm(train_no,run_ordr);
alter table tb_train_tm add(constraint pk_tb_train_tm primary key (train_no,run_ordr));

----------------------
-- �����ð�ǥ ���̺�
----------------------

create table tb_point_info(
    year char(4) not null, --����
    rank number(10) not null, --����
    customer_cd char(7) not null, --���ڵ�
    point number(10), --����Ʈ
    last_point_dt char(8) --���� ����Ʈ ������
);
create unique index pk_tb_point_info on tb_point_info(year,rank);
alter table tb_point_info add(constraint pk_tb_point_info primary key (year,rank));  

----------------------
-- ���� ���̺� ���� �Է�
----------------------

----------------------
-- �� ���̺� 
----------------------

delete from tb_customer;
insert into tb_customer values('2017042','������','M','19810603','002-8202-8790','wigang@navi.com',280300,'20170123132432');
insert into tb_customer values('2017053','�����','W','19891225','002-4509-0043','ksna#boram.co.kr',4500,'20170210180930');
insert into tb_customer values('2017108','�ڽ´�','M','19711430','','sdpark@haso.com',23450,'20170508203450');
insert into tb_customer values('2018087','������','W','19810925','003-1265-8372','usero@epnt.co.kr',18700,'20180204160903');
insert into tb_customer values('2018254','������','W','19839012','003_1287_9734','hylee@hansoft.com',570,'20180619230805');
insert into tb_customer values('2019001','������','W','20010426','002-9842-0074','jskim$dreami.org',12820,'20190101080518');
insert into tb_customer values('2019069','���ѱ�','M','1992315','','hkkldm@ssoya.com',15320,'20190217110704');
insert into tb_customer values('2019095','���üҸ�','M','19620728','003-6273-8539','',890,'20190312124558');
insert into tb_customer values('2019167','������','M','19711106','002=1202=5563','chhan@ecom.co.kr',6800,'20190508155600');
insert into tb_customer values('2019281','�̾Ƹ�','W','19940513','003-2620-0723','aulee@hoki.com',35600,'20190709201308');

--�߰� �� ���̺�
DELETE FROM TB_ADD_CUSTOMER;
INSERT INTO TB_ADD_CUSTOMER VALUES ('2017108','�ڽ´�','M','19711430','002-2580-9919');
INSERT INTO TB_ADD_CUSTOMER VALUES ('2019302','���̷� ','W','19740812','002-8864-0232');

-- ����Ʈ ���̺�
DELETE FROM TB_POINT;
INSERT INTO TB_POINT VALUES ('2017042',1,'û�ұ� ���� ����Ʈ ����',120700,'20181221160803');
INSERT INTO TB_POINT VALUES ('2017042',2,'�̺�Ʈ ����Ʈ ����',9500,'20190405121520');
INSERT INTO TB_POINT VALUES ('2017042',3,'����� ���� ����Ʈ ����',78560,'20190612220810');
INSERT INTO TB_POINT VALUES ('2017042',4,'������ ���� ����Ʈ ����',71540,'20190703140913');
INSERT INTO TB_POINT VALUES ('2017053',1,'��Ź�� ���� ����Ʈ ����',3500,'20170410201432');
INSERT INTO TB_POINT VALUES ('2017053',2,'����̱� ���� ����Ʈ ����',2000,'20181216171040');
INSERT INTO TB_POINT VALUES ('2017108',1,'û�ұ� ���� ����Ʈ ����',14065,'20180412205434');
INSERT INTO TB_POINT VALUES ('2017108',2,'�̺�Ʈ ����Ʈ ����',9385,'20180702232143');
INSERT INTO TB_POINT VALUES ('2018087',1,'�̺�Ʈ ���� ����Ʈ ����',7800,'20180421161903');
INSERT INTO TB_POINT VALUES ('2018087',2,'����� ���� ����Ʈ ����',10900,'20181112161956');
INSERT INTO TB_POINT VALUES ('2018254',1,'��� ����Ʈ ����',500,'20180619230805');
INSERT INTO TB_POINT VALUES ('2018254',2,'�̺�Ʈ ����Ʈ ����',70,'20180623170212');
INSERT INTO TB_POINT VALUES ('2019001',1,'��� ����Ʈ ����',500,'20190102120720');
INSERT INTO TB_POINT VALUES ('2019001',2,'�ͼ��� ���� ����Ʈ ����',4600,'20190405134554');
INSERT INTO TB_POINT VALUES ('2019001',3,'����̱� ���� ����Ʈ ����',7820,'20190829071234');
INSERT INTO TB_POINT VALUES ('2019069',1,'�̺�Ʈ ����Ʈ ����',8900,'20190219120712');
INSERT INTO TB_POINT VALUES ('2019069',2,'�鵵�� ���� ����Ʈ ����',3200,'20190420090820');
INSERT INTO TB_POINT VALUES ('2019069',3,'������ ���� ����Ʈ ����',3220,'20190620071230');
INSERT INTO TB_POINT VALUES ('2019095',1,'��� ���� ����Ʈ ����',500,'2019031212456');
INSERT INTO TB_POINT VALUES ('2019095',2,'�̺�Ʈ ���� ����Ʈ ����',8900,'20190510072345');
INSERT INTO TB_POINT VALUES ('2019167',1,'����̱� ���� ����Ʈ ����',3200,'20190612042450');
INSERT INTO TB_POINT VALUES ('2019167',2,'������ ���� ����Ʈ ����',3600,'20190714133422');
INSERT INTO TB_POINT VALUES ('2019281',1,'��� ����Ʈ ����',500,'20190709201308');
INSERT INTO TB_POINT VALUES ('2019281',2,'û�ұ� ���� ����Ʈ ����',8950,'20190710200921');
INSERT INTO TB_POINT VALUES ('2019281',3,'����� ���� ����Ʈ ����',12200,'20190712082334');
INSERT INTO TB_POINT VALUES ('2019281',4,'����̱� ���� ����Ʈ ����',7600,'20190721134421');
INSERT INTO TB_POINT VALUES ('2019281',5,'�ͼ��� ���� ����Ʈ ����',6250,'20190724022430');

-- ��Ÿ���� ���̺�
DELETE FROM TB_ETC_INFO;
INSERT INTO TB_ETC_INFO VALUES ('2017042','Gang won jin','S01,S05,S06,S09');
INSERT INTO TB_ETC_INFO VALUES ('2017053','Na kyoung suk','S02,S03,S07');
INSERT INTO TB_ETC_INFO VALUES ('2017108','park seung dea','S05,S06,S08');
INSERT INTO TB_ETC_INFO VALUES ('2018087','seo you ri','S03,S06');
INSERT INTO TB_ETC_INFO VALUES ('2018254','Iee hye ok', 'S08');
INSERT INTO TB_ETC_INFO VALUES ('2019001','kim jin suk','S01,S05,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019069','KIM HAN KIL','S03,S06,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019095','NAMKUNG SOMANG','S02,S07,S09');
INSERT INTO TB_ETC_INFO VALUES ('2019167','han chan hee','S01,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019281','Iee a rum','S06');

-- ��ǰ���� ���̺�
DELETE FROM TB_ITEM_INFO;
INSERT INTO TB_ITEM_INFO VALUES ('S01' ,'�Ƿ�/����');
INSERT INTO TB_ITEM_INFO VALUES ('S02' ,'��Ƽ');
INSERT INTO TB_ITEM_INFO VALUES ('S03' ,'����/�ڵ���');
INSERT INTO TB_ITEM_INFO VALUES ('S04' ,'��ǰ');
INSERT INTO TB_ITEM_INFO VALUES ('S05' ,'��Ȱ/�ǰ�');
INSERT INTO TB_ITEM_INFO VALUES ('S06' ,'����/���� ����');
INSERT INTO TB_ITEM_INFO VALUES ('S07' ,'����');
INSERT INTO TB_ITEM_INFO VALUES ('S08' ,'����/���');
INSERT INTO TB_ITEM_INFO VALUES ('S09' , '��ǻ��');
INSERT INTO TB_ITEM_INFO VALUES ('S10' , '�귣��');

-- ���� ���̺�
DELETE FROM TB_GRADE;
INSERT INTO TB_GRADE VALUES ( 'A' , 1 , '������' , 87, 94, 98, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'A' , 2 , '�����' , 68, 86, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'B' , 1 , '�ڽ´�' , 90, 92, 86, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'B' , 2 , '������' , 96, 100, 92, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'B' , 3 , '������' , 98, 86, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'C' , 1 , '������' , 95, 77, 95, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'C' , 2 , '���ѱ�' , 73, 84, 100, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'D' , 1 , '���üҸ�' , 56, 68, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'D' , 2 , '������' , 94, 90, 68, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'D' , 3 , '�̾Ƹ�' , 100, 87, 95, 0, 0);

-- 7�� ���� ���̺�
DELETE FROM TB_GRADE_07;
INSERT INTO TB_GRADE_07 VALUES ('T01', 87, 94, 98);
INSERT INTO TB_GRADE_07 VALUES ('T02', 68, 86, 78);
INSERT INTO TB_GRADE_07 VALUES ('T03', 86, 94, 92);
INSERT INTO TB_GRADE_07 VALUES ('T04', 96, 90, 86);
INSERT INTO TB_GRADE_07 VALUES ('T05', 92, 92, 96);
INSERT INTO TB_GRADE_07 VALUES ('T06', 86, 94, 86);
INSERT INTO TB_GRADE_07 VALUES ('T07', 96, 100, 92);
INSERT INTO TB_GRADE_07 VALUES ('T08', 92, 98, 86);
INSERT INTO TB_GRADE_07 VALUES ('T09', 98, 86, 78);
INSERT INTO TB_GRADE_07 VALUES ('TlO', 94, 84, 86);

-- 8�� ���� ���̺�
DELETE FROM TB_GRADE_08;
INSERT INTO TB_GRADE_08 VALUES ('T01' , 87, 94, 98);
INSERT INTO TB_GRADE_08 VALUES ('T02' , 68, 86, 78);
INSERT INTO TB_GRADE_08 VALUES ('T04' , 90, 92, 86);
INSERT INTO TB_GRADE_08 VALUES ('T07' , 96, 100, 92);
INSERT INTO TB_GRADE_08 VALUES ('T09' , 98, 86, 78);

--9�� ���� ���̺�
DELETE FROM TB_GRADE_09;
INSERT INTO TB_GRADE_09 VALUES ('T01', 95, 77, 95);
INSERT INTO TB_GRADE_09 VALUES ('T04', 73, 84, 100);
INSERT INTO TB_GRADE_09 VALUES ('T05', 56, 68, 78);
INSERT INTO TB_GRADE_09 VALUES ('T07', 94, 90, 68);
INSERT INTO TB_GRADE_09 VALUES ('T08', 100, 87, 95);

--�� ���� ���̺�
DELETE FROM TB_CLASS_INFO;
INSERT INTO TB_CLASS_INFO VALUES ('A','�����Խù�');
INSERT INTO TB_CLASS_INFO VALUES ('B','�ܰ���');
INSERT INTO TB_CLASS_INFO VALUES ('C','�������Թ�');
INSERT INTO TB_CLASS_INFO VALUES ('D','�Ϲ��ι�');

--�Ǹ� ���̺�
DELETE FROM TB_SALES;
INSERT INTO TB_SALES VALUES ('20190801',1,'��Ʈ��',1045000, 4);
INSERT INTO TB_SALES VALUES ('20190801',2,'û�ұ�',545000, 2);
INSERT INTO TB_SALES VALUES ('20190801',3,'��Ʈ��',1021000, 6);
INSERT INTO TB_SALES VALUES ('20190802',1,'��ǳ��',70000, 21);
INSERT INTO TB_SALES VALUES ('20190802',2,'�����',1870000, 7);
INSERT INTO TB_SALES VALUES ('20190803',1,'��ǳ��',92000, 32);
INSERT INTO TB_SALES VALUES ('20190803',2,'�����',2012000, 3);
INSERT INTO TB_SALES VALUES ('20190803',3,'��ǳ��',70000, 15);
INSERT INTO TB_SALES VALUES ('20190803',4,'��ǳ��',92000, 24);
INSERT INTO TB_SALES VALUES ('20190804',1,'û�ұ�',980000, 5);

--�����ð�ǥ ���̺�
DELETE FROM TB_TRAIN_TM;
INSERT INTO TB_TRAIN_TM VALUES ('101',1,'����','092000', '092000');
INSERT INTO TB_TRAIN_TM VALUES ('101',2,'����','095400', '095600');
INSERT INTO TB_TRAIN_TM VALUES ('101',3,'����','103800', '104100');
INSERT INTO TB_TRAIN_TM VALUES ('101',4,'�뱸','112500', '112730');
INSERT INTO TB_TRAIN_TM VALUES ('101',5,'�λ�','130500', '130500');
INSERT INTO TB_TRAIN_TM VALUES ('103',1,'����','130800', '130800');
INSERT INTO TB_TRAIN_TM VALUES ('103',2,'����','142100', '142300');
INSERT INTO TB_TRAIN_TM VALUES ('103',3,'�뱸','151200', '151430');
INSERT INTO TB_TRAIN_TM VALUES ('103',4,'�λ�','160400', '160400');
INSERT INTO TB_TRAIN_TM VALUES ('106',1,'�λ�','083500', '083500');
INSERT INTO TB_TRAIN_TM VALUES ('106',2,'����','100200', '100530');
INSERT INTO TB_TRAIN_TM VALUES ('106',3,'����','112800', '112800');

--�����ͺ��̽��� �ݿ�
COMMIT;
