-- 테이블 생성
create table test2(
memberID char(5) not null primary key,
memberName nchar(8) not null,
memberAge number(3) not null,
memberBirth date not null,
memberAddress nvarchar2(20)
);

-- 데이터 타입변경 
alter table test2 modify memberID char(6);

insert into test2 values('chaeho','최채호',28,'1995-09-07','거창');
insert into test2 values('chaeh1','최채호',28,'1995-09-07','거창');
insert into test2 values('chaeh2','최채호',28,'1995-09-07','거창');
insert into test2 values('chaeh3','최채호',28,'1995-09-07','거창');
insert into test2 values('chaed1','최채호',28,'1995-09-07','거창');

-- 행 삭제
delete from test2 where memberID = 'chaed1'; 

-- 칼럼 추가
alter table test2 add memberEmail nchar(20);
insert into test2 values('chaed0','최채호',28,'1995-09-07','거창','chlcogh11@naver.com');

-- 기존 칼륨 수정
update test2 set memberEmail = 'chlcogh11@naver.com' where memberID = 'chaeho';

select * from test2;
