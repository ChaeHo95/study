create table "영화"(
    번호 VARCHAR2(3) not null primary key,
    이름 VARCHAR2(30) unique,
    개봉연도 number,
    매출액 number,
    관객수 number,
    평점 number(5,2)
    );

create table "배우"(
    번호 VARCHAR2(3) not null PRIMARY KEY,
    이름 varchar2(30),
    출생 date,
    키 number,
    몸무게 number,
    배우자 varchar2(30)
    );

create table "출연"(
    영화번호 varchar(3) not null,
    배우번호  varchar(3) not null,
    역활 VARCHAR2(1) ,
    역 varchar2(30),
    constraint pk_출연 primary key(영화번호,배우번호),
    constraint fk_영화번호 foreign key(영화번호) references 영화(번호),
    constraint fk_배우번호 foreign key(배우번호) references 배우(번호)
    );

alter table 출연 modify 역활 varchar2(3);
alter table 출연 modify 역 varchar2(35);
comment on column 출연.역활 is '주인공 1, 조연 2'; 

insert into 영화 values('1','명량',2014,135748398910,17613682,8.49);
insert into 영화 values('2','쉬리',1999,null,5820000,8.79);
insert into 영화 values('3','광해,왕이 된 남자',2012,88900208769,12319542,9.23);
insert into 영화 values('4','도둑들',2012,93665568500,12983330,7.60);
insert into 영화 values('5','엽기적인 그녀',2001,null,1735692,9.29);
insert into 영화 values('6','변호인',2013,82871759300,1710364,7.76);
insert into 영화 values('7','밀양',2007,null,1710364,7.76);
insert into 영화 values('8','태극기 휘날리며',2004,null,11746135,9.15);
insert into 영화 values('9','초록물고기',1997,null,null,8.79);
insert into 영화 values('10','은행나무 침대',1996,null,null,7.67);
insert into 영화 values('11','님은 먼 곳에',2008,11211235000,1706576,7.80);
insert into 영화 values('12','반지의 제왕:왕의 귀환',2003,null,null,9.36);
insert into 영화 values('13','그녀',2014,null,null,8.51);
insert into 영화 values('14','관상',2013,null,null,7.96);

insert into 배우 values('1','최민식','1962-04-27',177,70,null);
insert into 배우 values('2','류승룡','1970-11-29','','','');
insert into 배우 values('4','한석규','1964-11-03',178,64,'');
insert into 배우 values('5','송강호','1967-01-17',180,80,'');
insert into 배우 values('6','이병헌','',177,72,'이민정');
insert into 배우 values('7','한효주','',172,48,'');
insert into 배우 values('8','전지현','1981-10-30',174,52,'');
insert into 배우 values('10','김혜수','1970-09-05',170,50,'');
insert into 배우 values('12','차태현','1976-03-25',175,65,'최석은');
insert into 배우 values('15','전도연','',165,'','강시규');
insert into 배우 values('16','장동건','',182,68,'고소영');
insert into 배우 values('17','심혜진','1967-01-16',169,51,'한상구');
insert into 배우 values('18','수애','',168,45,'');
insert into 배우 values('19','주진모','','','','');

insert into 출연 values('1','1','1','이순신');
insert into 출연 values('1','2','1','구루지마');
insert into 출연 values('2','4','1','유중원');
insert into 출연 values('2','1','1','박무영');
insert into 출연 values('2','5','1','이장길');
insert into 출연 values('3','6','1','광해/하선');
insert into 출연 values('3','2','1','허균');
insert into 출연 values('3','7','1','중전');
insert into 출연 values('4','10','1','팹시');
insert into 출연 values('4','8','1','예니콜');
insert into 출연 values('4','19','2','반장역');
insert into 출연 values('5','8','1','그녀');
insert into 출연 values('5','12','1','견우');
insert into 출연 values('6','5','1','송우석');
insert into 출연 values('7','15','1','피아노 학원 강사,이신애');
insert into 출연 values('7','5','1','카센터 사장,김종찬');
insert into 출연 values('8','16','1','이진태');
insert into 출연 values('9','4','1','막동');
insert into 출연 values('9','17','1','미애');
insert into 출연 values('10','4','1','수현');
insert into 출연 values('10','17','1','선영');
insert into 출연 values('11','18','1','시골 아낙,순이|가수,써니');
insert into 출연 values('11','19','1','기타리스트,성찬 역');