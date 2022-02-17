----------------------------
--  고객 테이블  --
----------------------------
create table tb_customer
(
customer_cd char(7 byte) not null,--고객코드
customer_nm nvarchar2(10) not null, --고객명
mw_flg char(1 byte) not null, --성별구분
birth_day char(20 byte) not null, --생일
phone_number varchar2(16 byte), --전화번호
email varchar2(30 byte),--email
total_point number(10), --누적포인트
reg_dttm char(14 byte) --등록일
);
create unique index pk_tb_customer on tb_customer(customer_cd);
alter table tb_customer add(constraint pk_tb_customer primary key (customer_cd));
----------------------------
--  추가 고객 테이블  --
----------------------------

create table tb_add_customer(
customer_cd char(7 byte) not null, --고객 코드
customer_nm nvarchar2(10) not null, --고객명
mw_flg char(1 byte) not null, --성별구분
birth_day char(8 byte) not null, --생일
phone_number VARCHAR2(16 byte) --전화번호
);
create unique index pk_tb_add_customer on tb_add_customer (customer_cd);
alter table tb_add_customer add (constraint pk_tb_add_customer primary key (customer_cd));

----------------------------
--  포인트 테이블  --
----------------------------
create table tb_point(
customer_cd char(7 byte) not null,--고객코드
seq_no  number(10) not null,--일렬변호
point_memo varchar2(50),--포인트 내용
point number(10), --포인트
reg_dttm char(14 byte) --등록일
);
create unique index pk_tb_point on tb_point (customer_cd,seq_no);
alter table tb_point add(constraint pk_tb_point primary key(customer_cd,seq_no));

----------------------------
--  2017년 포인트 테이블  --
----------------------------

create table tb_point_2017(
customer_cd char(7 byte) not null,--고객 코드
seq_no number(10) not null,--일렬번호
point_memo varchar2(50), --포인트 내용
point number(10), --포인트
reg_dttm char(14 byte) --등록일
);
create unique index pk_tb_point_2017 on tb_point_2017 (customer_cd,seq_no);
alter table tb_point_2017 add(constraint pk_tb_point_2017 primary key (customer_cd,
seq_no));

----------------------------
--  2018년 포인트 테이블  --
----------------------------
create table tb_point_2018(
customer_cd char(7 byte) not null,--고객코드
seq_no number(10) not null, --일렬번호
point_memo varchar2(50),--포인트 내용
point number(10), --포인트
reg_dttm char(14 byte) --등록일
);
create unique index pk_tb_point_2018 on tb_point_2018 (customer_cd,seq_no);
alter table tb_point_2018 add(constraint pk_tb_point_2018 primary key (customer_cd,seq_no));

----------------------------
--  2019년 포인트 테이블  --
----------------------------

create table tb_point_2019
(
customer_cd char(7 byte) not null, --고객코드
seq_no number(10) not null,--포인트 내용
point number(10), --포인트
reg_dttm char(14 byte)--등록일
);
create unique index pk_tb_point_2019 on tb_point_2019(customer_cd,seq_no);
alter table tb_point_2019 add(constraint pk_tb_point_2019 primary key(customer_cd,seq_no));

----------------------------
--  기타정보 테이블  --
----------------------------

create table tb_etc_info
(
customer_cd char(7 byte) not null,--고객코드
customer_eng_nm varchar2(20 byte), --영문 고객명
item_list VARCHAR2(40 byte) --관심 품목
);
create unique index pk_tb_etc_info on tb_etc_info(customer_cd);
alter table tb_etc_info add(constraint pk_tb_etc_info primary key(customer_cd));

----------------------------
--  품목정보 테이블  --
----------------------------
create table tb_item_info
(
item_cd char(7 byte) not null, --관심 품목 코드
item_nm VARCHAR2(20 byte) --관심 품목명
);
create unique index pk_tb_item_info on tb_item_info(item_cd);
alter table tb_item_info add(constraint pk_tb_item_info primary key(item_cd));

----------------------------
--  성적 테이블  --
----------------------------

create table tb_grade
(
class_cd char(1 byte) not null, --반코드
student_no number(2) not null, --학생번호
student_nm nVARCHAR2(10) not null, --학생명
kor number(3), --국어
eng number(3), --영어
mat number(3), --수학
tot number(3), --합계
avg number(5,1) --평균
);
create unique index pk_tb_grade on tb_grade (class_cd,student_no);
alter table tb_grade add(constraint pk_tb_grade primary key(class_cd,student_no));
----------------------------
--  7월성적 테이블  --
----------------------------
create table tb_grade_07
(
test_cd char(3 byte) not null, --시험코드
kor number(3), --국어
eng number(3), --영어
mat number(3) --수학
);
create unique index pk_tb_grade_07 on tb_grade_07(test_cd);
alter table tb_grade_07 add (constraint pk_tb_grade_07 primary key(test_cd));
----------------------------
--  8월성적 테이블  --
----------------------------
create table tb_grade_08
(test_cd char(3 byte) not null, --시험코드
kor number(3), --국어
eng number(3), --영어
mat number(3) --수학
);
create unique index pk_tb_grade_08 on tb_grade_08(test_cd);
alter table tb_grade_08 add(constraint pk_tb_grade_08 primary key(test_cd));
----------------------------
--  9월성적 테이블  --
----------------------------
create table tb_grade_09
(
test_cd char(3 byte) not null, --시험코드
kor number(3), --국어
eng number(3), --영어
mat number(3) --수학
);
create unique index pk_tb_grade_09 on tb_grade_09 (test_cd);
alter table tb_grade_09 add(constraint pk_tb_grade_09 primary key (test_cd));

----------------------
-- 2020년 성적 테이블
----------------------

create table tb_grade_2020(
    test_month char(2) not null, --월
    test_cd char(3) not null, --시험코드
    kor number(3), --국어
    eng number(3), --영어
    mat number(3) --수학
);

create unique index pk_tb_grade_2020 on tb_grade_2020(test_month);
alter table tb_grade_2020 add(constraint pk_tb_grade_2020 primary key (test_month));

----------------------
-- 반 정보 테이블
----------------------

create table tb_class_info(
    class_cd char(1) not null, --반코드
    class_nm varchar2(20) not null --반명
);

create unique index pk_tb_class_info on tb_class_info(class_cd,class_nm);
alter table tb_class_info add(constraint pk_tb_class_info primary key (class_cd,class_nm));

----------------------
-- 판매 테이블
----------------------

create table tb_sales(
    sales_dt char(8) not null, --등록일
    seq_no number(5) not null, --일련번호
    product_nm varchar2(20), --상품명
    price number(10), --단가(원)
    sales_count number(3) --판매개수
);
create unique index pk_tb_sales on tb_sales(sales_dt,seq_no);
alter table tb_sales add(constraint pk_tb_sales primary key (sales_dt,seq_no));

----------------------
-- 9월 판매 테이블
----------------------

create table tb_sales_09(
    seq_no number(10) not null, --일련번호
    product_nm varchar2(20), --상품명
    customer_cd char(7), --고객코드
    sales_count number(3) --판매개수
);
create unique index pk_tb_sales_09 on tb_sales_09(seq_no);
alter table tb_sales_09 add(constraint pk_tb_sales_09 primary key (seq_no));

----------------------
-- 열차시각표 테이블
----------------------

create table tb_train_tm(
    train_no char(5) not null, --열차번호
    run_ordr number(5) not null, --운행순서
    station_nm varchar2(20), --역명
    arv_tm char(6), --도착시간
    dpt_tm char(6) --출발시간
);
create unique index pk_tb_train_tm on tb_train_tm(train_no,run_ordr);
alter table tb_train_tm add(constraint pk_tb_train_tm primary key (train_no,run_ordr));

----------------------
-- 열차시각표 테이블
----------------------

create table tb_point_info(
    year char(4) not null, --연도
    rank number(10) not null, --순위
    customer_cd char(7) not null, --고객코드
    point number(10), --포인트
    last_point_dt char(8) --최종 포인트 적립일
);
create unique index pk_tb_point_info on tb_point_info(year,rank);
alter table tb_point_info add(constraint pk_tb_point_info primary key (year,rank));  

----------------------
-- 연습 테이블에 정보 입력
----------------------

----------------------
-- 고객 테이블 
----------------------

delete from tb_customer;
insert into tb_customer values('2017042','강원진','M','19810603','002-8202-8790','wigang@navi.com',280300,'20170123132432');
insert into tb_customer values('2017053','나경숙','W','19891225','002-4509-0043','ksna#boram.co.kr',4500,'20170210180930');
insert into tb_customer values('2017108','박승대','M','19711430','','sdpark@haso.com',23450,'20170508203450');
insert into tb_customer values('2018087','서유리','W','19810925','003-1265-8372','usero@epnt.co.kr',18700,'20180204160903');
insert into tb_customer values('2018254','이혜옥','W','19839012','003_1287_9734','hylee@hansoft.com',570,'20180619230805');
insert into tb_customer values('2019001','김진숙','W','20010426','002-9842-0074','jskim$dreami.org',12820,'20190101080518');
insert into tb_customer values('2019069','김한길','M','1992315','','hkkldm@ssoya.com',15320,'20190217110704');
insert into tb_customer values('2019095','남궁소망','M','19620728','003-6273-8539','',890,'20190312124558');
insert into tb_customer values('2019167','한찬희','M','19711106','002=1202=5563','chhan@ecom.co.kr',6800,'20190508155600');
insert into tb_customer values('2019281','이아름','W','19940513','003-2620-0723','aulee@hoki.com',35600,'20190709201308');

--추가 고객 테이블
DELETE FROM TB_ADD_CUSTOMER;
INSERT INTO TB_ADD_CUSTOMER VALUES ('2017108','박승대','M','19711430','002-2580-9919');
INSERT INTO TB_ADD_CUSTOMER VALUES ('2019302','전미래 ','W','19740812','002-8864-0232');

-- 포인트 테이블
DELETE FROM TB_POINT;
INSERT INTO TB_POINT VALUES ('2017042',1,'청소기 구매 포인트 적립',120700,'20181221160803');
INSERT INTO TB_POINT VALUES ('2017042',2,'이벤트 포인트 적립',9500,'20190405121520');
INSERT INTO TB_POINT VALUES ('2017042',3,'냉장고 구매 포인트 적립',78560,'20190612220810');
INSERT INTO TB_POINT VALUES ('2017042',4,'에어컨 구매 포인트 적립',71540,'20190703140913');
INSERT INTO TB_POINT VALUES ('2017053',1,'세탁기 구매 포인트 적립',3500,'20170410201432');
INSERT INTO TB_POINT VALUES ('2017053',2,'드라이기 구매 포인트 적립',2000,'20181216171040');
INSERT INTO TB_POINT VALUES ('2017108',1,'청소기 구매 포인트 적립',14065,'20180412205434');
INSERT INTO TB_POINT VALUES ('2017108',2,'이벤트 포인트 적립',9385,'20180702232143');
INSERT INTO TB_POINT VALUES ('2018087',1,'이벤트 구매 포인트 적립',7800,'20180421161903');
INSERT INTO TB_POINT VALUES ('2018087',2,'냉장고 구매 포인트 적립',10900,'20181112161956');
INSERT INTO TB_POINT VALUES ('2018254',1,'등록 포인트 적립',500,'20180619230805');
INSERT INTO TB_POINT VALUES ('2018254',2,'이벤트 포인트 적립',70,'20180623170212');
INSERT INTO TB_POINT VALUES ('2019001',1,'등록 포인트 적립',500,'20190102120720');
INSERT INTO TB_POINT VALUES ('2019001',2,'믹서기 구매 포인트 적립',4600,'20190405134554');
INSERT INTO TB_POINT VALUES ('2019001',3,'드라이기 구매 포인트 적립',7820,'20190829071234');
INSERT INTO TB_POINT VALUES ('2019069',1,'이벤트 포인트 적립',8900,'20190219120712');
INSERT INTO TB_POINT VALUES ('2019069',2,'면도기 구매 포인트 적립',3200,'20190420090820');
INSERT INTO TB_POINT VALUES ('2019069',3,'전기밥솥 구매 포인트 적립',3220,'20190620071230');
INSERT INTO TB_POINT VALUES ('2019095',1,'등록 구매 포인트 적립',500,'2019031212456');
INSERT INTO TB_POINT VALUES ('2019095',2,'이벤트 구매 포인트 적립',8900,'20190510072345');
INSERT INTO TB_POINT VALUES ('2019167',1,'드라이기 구매 포인트 적립',3200,'20190612042450');
INSERT INTO TB_POINT VALUES ('2019167',2,'전기밥솥 구매 포인트 적립',3600,'20190714133422');
INSERT INTO TB_POINT VALUES ('2019281',1,'등록 포인트 적립',500,'20190709201308');
INSERT INTO TB_POINT VALUES ('2019281',2,'청소기 구매 포인트 적립',8950,'20190710200921');
INSERT INTO TB_POINT VALUES ('2019281',3,'냉장고 구매 포인트 적립',12200,'20190712082334');
INSERT INTO TB_POINT VALUES ('2019281',4,'드라이기 구매 포인트 적립',7600,'20190721134421');
INSERT INTO TB_POINT VALUES ('2019281',5,'믹서기 구매 포인트 적립',6250,'20190724022430');

-- 기타정보 테이블
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

-- 물품정보 테이블
DELETE FROM TB_ITEM_INFO;
INSERT INTO TB_ITEM_INFO VALUES ('S01' ,'의류/잡학');
INSERT INTO TB_ITEM_INFO VALUES ('S02' ,'뷰티');
INSERT INTO TB_ITEM_INFO VALUES ('S03' ,'례저/자동차');
INSERT INTO TB_ITEM_INFO VALUES ('S04' ,'식품');
INSERT INTO TB_ITEM_INFO VALUES ('S05' ,'생활/건강');
INSERT INTO TB_ITEM_INFO VALUES ('S06' ,'가구/인테 리어');
INSERT INTO TB_ITEM_INFO VALUES ('S07' ,'가전');
INSERT INTO TB_ITEM_INFO VALUES ('S08' ,'도서/취미');
INSERT INTO TB_ITEM_INFO VALUES ('S09' , '컴퓨터');
INSERT INTO TB_ITEM_INFO VALUES ('S10' , '브랜드');

-- 성적 테이블
DELETE FROM TB_GRADE;
INSERT INTO TB_GRADE VALUES ( 'A' , 1 , '강원진' , 87, 94, 98, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'A' , 2 , '나경숙' , 68, 86, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'B' , 1 , '박승대' , 90, 92, 86, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'B' , 2 , '서유리' , 96, 100, 92, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'B' , 3 , '이혜옥' , 98, 86, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'C' , 1 , '김진숙' , 95, 77, 95, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'C' , 2 , '김한길' , 73, 84, 100, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'D' , 1 , '남궁소망' , 56, 68, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'D' , 2 , '한잔희' , 94, 90, 68, 0, 0);
INSERT INTO TB_GRADE VALUES ( 'D' , 3 , '이아름' , 100, 87, 95, 0, 0);

-- 7월 성적 테이블
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

-- 8월 성적 테이블
DELETE FROM TB_GRADE_08;
INSERT INTO TB_GRADE_08 VALUES ('T01' , 87, 94, 98);
INSERT INTO TB_GRADE_08 VALUES ('T02' , 68, 86, 78);
INSERT INTO TB_GRADE_08 VALUES ('T04' , 90, 92, 86);
INSERT INTO TB_GRADE_08 VALUES ('T07' , 96, 100, 92);
INSERT INTO TB_GRADE_08 VALUES ('T09' , 98, 86, 78);

--9월 성적 테이블
DELETE FROM TB_GRADE_09;
INSERT INTO TB_GRADE_09 VALUES ('T01', 95, 77, 95);
INSERT INTO TB_GRADE_09 VALUES ('T04', 73, 84, 100);
INSERT INTO TB_GRADE_09 VALUES ('T05', 56, 68, 78);
INSERT INTO TB_GRADE_09 VALUES ('T07', 94, 90, 68);
INSERT INTO TB_GRADE_09 VALUES ('T08', 100, 87, 95);

--반 정보 테이블
DELETE FROM TB_CLASS_INFO;
INSERT INTO TB_CLASS_INFO VALUES ('A','종합입시반');
INSERT INTO TB_CLASS_INFO VALUES ('B','단과반');
INSERT INTO TB_CLASS_INFO VALUES ('C','대학편입반');
INSERT INTO TB_CLASS_INFO VALUES ('D','일반인반');

--판매 테이블
DELETE FROM TB_SALES;
INSERT INTO TB_SALES VALUES ('20190801',1,'노트북',1045000, 4);
INSERT INTO TB_SALES VALUES ('20190801',2,'청소기',545000, 2);
INSERT INTO TB_SALES VALUES ('20190801',3,'노트북',1021000, 6);
INSERT INTO TB_SALES VALUES ('20190802',1,'선풍기',70000, 21);
INSERT INTO TB_SALES VALUES ('20190802',2,'냉장고',1870000, 7);
INSERT INTO TB_SALES VALUES ('20190803',1,'선풍기',92000, 32);
INSERT INTO TB_SALES VALUES ('20190803',2,'냉장고',2012000, 3);
INSERT INTO TB_SALES VALUES ('20190803',3,'선풍기',70000, 15);
INSERT INTO TB_SALES VALUES ('20190803',4,'선풍기',92000, 24);
INSERT INTO TB_SALES VALUES ('20190804',1,'청소기',980000, 5);

--열차시각표 테이블
DELETE FROM TB_TRAIN_TM;
INSERT INTO TB_TRAIN_TM VALUES ('101',1,'서울','092000', '092000');
INSERT INTO TB_TRAIN_TM VALUES ('101',2,'수원','095400', '095600');
INSERT INTO TB_TRAIN_TM VALUES ('101',3,'대전','103800', '104100');
INSERT INTO TB_TRAIN_TM VALUES ('101',4,'대구','112500', '112730');
INSERT INTO TB_TRAIN_TM VALUES ('101',5,'부산','130500', '130500');
INSERT INTO TB_TRAIN_TM VALUES ('103',1,'서울','130800', '130800');
INSERT INTO TB_TRAIN_TM VALUES ('103',2,'대전','142100', '142300');
INSERT INTO TB_TRAIN_TM VALUES ('103',3,'대구','151200', '151430');
INSERT INTO TB_TRAIN_TM VALUES ('103',4,'부산','160400', '160400');
INSERT INTO TB_TRAIN_TM VALUES ('106',1,'부산','083500', '083500');
INSERT INTO TB_TRAIN_TM VALUES ('106',2,'대전','100200', '100530');
INSERT INTO TB_TRAIN_TM VALUES ('106',3,'서울','112800', '112800');

--데이터베이스에 반영
COMMIT;
