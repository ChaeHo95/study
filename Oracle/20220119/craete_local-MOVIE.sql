create table "��ȭ"(
    ��ȣ VARCHAR2(3) not null primary key,
    �̸� VARCHAR2(30) unique,
    �������� number,
    ����� number,
    ������ number,
    ���� number(5,2)
    );

create table "���"(
    ��ȣ VARCHAR2(3) not null PRIMARY KEY,
    �̸� varchar2(30),
    ��� date,
    Ű number,
    ������ number,
    ����� varchar2(30)
    );

create table "�⿬"(
    ��ȭ��ȣ varchar(3) not null,
    ����ȣ  varchar(3) not null,
    ��Ȱ VARCHAR2(1) ,
    �� varchar2(30),
    constraint pk_�⿬ primary key(��ȭ��ȣ,����ȣ),
    constraint fk_��ȭ��ȣ foreign key(��ȭ��ȣ) references ��ȭ(��ȣ),
    constraint fk_����ȣ foreign key(����ȣ) references ���(��ȣ)
    );

alter table �⿬ modify ��Ȱ varchar2(3);
alter table �⿬ modify �� varchar2(35);
comment on column �⿬.��Ȱ is '���ΰ� 1, ���� 2'; 

insert into ��ȭ values('1','��',2014,135748398910,17613682,8.49);
insert into ��ȭ values('2','����',1999,null,5820000,8.79);
insert into ��ȭ values('3','����,���� �� ����',2012,88900208769,12319542,9.23);
insert into ��ȭ values('4','���ϵ�',2012,93665568500,12983330,7.60);
insert into ��ȭ values('5','�������� �׳�',2001,null,1735692,9.29);
insert into ��ȭ values('6','��ȣ��',2013,82871759300,1710364,7.76);
insert into ��ȭ values('7','�о�',2007,null,1710364,7.76);
insert into ��ȭ values('8','�±ر� �ֳ�����',2004,null,11746135,9.15);
insert into ��ȭ values('9','�ʷϹ����',1997,null,null,8.79);
insert into ��ȭ values('10','���೪�� ħ��',1996,null,null,7.67);
insert into ��ȭ values('11','���� �� ����',2008,11211235000,1706576,7.80);
insert into ��ȭ values('12','������ ����:���� ��ȯ',2003,null,null,9.36);
insert into ��ȭ values('13','�׳�',2014,null,null,8.51);
insert into ��ȭ values('14','����',2013,null,null,7.96);

insert into ��� values('1','�ֹν�','1962-04-27',177,70,null);
insert into ��� values('2','���·�','1970-11-29','','','');
insert into ��� values('4','�Ѽ���','1964-11-03',178,64,'');
insert into ��� values('5','�۰�ȣ','1967-01-17',180,80,'');
insert into ��� values('6','�̺���','',177,72,'�̹���');
insert into ��� values('7','��ȿ��','',172,48,'');
insert into ��� values('8','������','1981-10-30',174,52,'');
insert into ��� values('10','������','1970-09-05',170,50,'');
insert into ��� values('12','������','1976-03-25',175,65,'�ּ���');
insert into ��� values('15','������','',165,'','���ñ�');
insert into ��� values('16','�嵿��','',182,68,'��ҿ�');
insert into ��� values('17','������','1967-01-16',169,51,'�ѻ�');
insert into ��� values('18','����','',168,45,'');
insert into ��� values('19','������','','','','');

insert into �⿬ values('1','1','1','�̼���');
insert into �⿬ values('1','2','1','��������');
insert into �⿬ values('2','4','1','���߿�');
insert into �⿬ values('2','1','1','�ڹ���');
insert into �⿬ values('2','5','1','�����');
insert into �⿬ values('3','6','1','����/�ϼ�');
insert into �⿬ values('3','2','1','���');
insert into �⿬ values('3','7','1','����');
insert into �⿬ values('4','10','1','�ս�');
insert into �⿬ values('4','8','1','������');
insert into �⿬ values('4','19','2','���忪');
insert into �⿬ values('5','8','1','�׳�');
insert into �⿬ values('5','12','1','�߿�');
insert into �⿬ values('6','5','1','�ۿ켮');
insert into �⿬ values('7','15','1','�ǾƳ� �п� ����,�̽ž�');
insert into �⿬ values('7','5','1','ī���� ����,������');
insert into �⿬ values('8','16','1','������');
insert into �⿬ values('9','4','1','����');
insert into �⿬ values('9','17','1','�̾�');
insert into �⿬ values('10','4','1','����');
insert into �⿬ values('10','17','1','����');
insert into �⿬ values('11','18','1','�ð� �Ƴ�,����|����,���');
insert into �⿬ values('11','19','1','��Ÿ����Ʈ,���� ��');