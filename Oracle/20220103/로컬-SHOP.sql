-- ���̺� ����
create table test2(
memberID char(5) not null primary key,
memberName nchar(8) not null,
memberAge number(3) not null,
memberBirth date not null,
memberAddress nvarchar2(20)
);

-- ������ Ÿ�Ժ��� 
alter table test2 modify memberID char(6);

insert into test2 values('chaeho','��äȣ',28,'1995-09-07','��â');
insert into test2 values('chaeh1','��äȣ',28,'1995-09-07','��â');
insert into test2 values('chaeh2','��äȣ',28,'1995-09-07','��â');
insert into test2 values('chaeh3','��äȣ',28,'1995-09-07','��â');
insert into test2 values('chaed1','��äȣ',28,'1995-09-07','��â');

-- �� ����
delete from test2 where memberID = 'chaed1'; 

-- Į�� �߰�
alter table test2 add memberEmail nchar(20);
insert into test2 values('chaed0','��äȣ',28,'1995-09-07','��â','chlcogh11@naver.com');

-- ���� Į�� ����
update test2 set memberEmail = 'chlcogh11@naver.com' where memberID = 'chaeho';

select * from test2;
