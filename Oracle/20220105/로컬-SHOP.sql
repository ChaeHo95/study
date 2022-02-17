-- 테이블 생성
create table test3(
testId char(8) not null enable primary key,
testName nchar(5) not null enable,
testAge number(3) not null enable,
testBrith date,
testAddress nvarchar2(20),
testHandy date,
testEmail nchar(20)
);
alter table test3 modify testHandy number(11);

insert into test3 values('chaeho','최채호',28,'1995-09-07','거창군',01044706665,'chlcogh11@naver.com');

select * from test3;

--테이블 삭제
drop table test3;

--다른 테이블에서 값 참조

create table shop.indexTBL as 
select first_name, last_name, hire_date from HR.employees;

select * from indextbl;

select * from indextbl where first_name = 'Amit' or first_name = 'Jack'; 

create index idx_idexTBL_firstname on indextbl(first_name);

create view memberView as select membername,memberaddress from membertbl;

select * from memberView;

select count(*) from membertbl;

select count(*) from test;

create procedure myProc 
as 
    var1 Int;
    var2 INT;

    begin
        select count(*) into var1 from membertbl;
        select count(*) into var2 from test;
        dbms_output.put_line(var1+var2);
    end;
    
-- 실행 시키는 구문    
exec myProc;

set serverout on;

insert into membertbl values ('Figure','연아','경기도 군포시 당정동');

SELECT  * FROM membertbl;

DELETE FROM membertbl WHERE memberid = 'Figure';

create table delereMemberTBL(
    member_id char(8),
    member_name nchar(8),
    member_addr nvarchar2(20),
    deletedDate date
    );
    
create trigger trg_delereMember
    after delete
    on membertbl
    for each row
begin 
    insert into deleremembertbl values(:old.memberid,:old.membername,:old.memberaddress, sysdate());
end;

select * from membertbl;
SELECT * FROM deleremembertbl;

DELETE from membertbl where memberid = 'chaeho';
    