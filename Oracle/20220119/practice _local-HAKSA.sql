select * from �л�
order by ��ȣ;

select �̸�,�г�, �ּ� from �л�
order by ��ȣ;

select �̸� as ����,�ּ� as "���� �ּ���" from �л�
order by ��ȣ;

select �г� from �л�
group by �г�
order by �г�;

select * from �л�
where ��ȣ = 1;

select * from �л�
where Ű < 165 ;

select �̸�,�г�,Ű,������ from �л�
where �г� = 1
and Ű >= 170;

select �̸�,�г�,Ű,������  from �л�
where �г� = 1 
or Ű >= 170;

select �̸�,�ּ�,Ű,������ from �л�
where ������ between 45 and 50;

select �̸�,�ּ�,Ű, ������ from �л�
where ������ >=45
and ������ <=50;

select ��ȣ,�̸�,�г� from �л�
where �г� in(2,3); 

select ��ȣ,�̸�,�г� from �л�
where �г� = 2 
or �г� = 3;

select * from �л�
where �̸� like '��%';

select * from �л�
where �̸� like '��%'
or �̸� like '��%'
or �̸� like '��%';

select * from �л�
where �̸� like '��%'
union
select * from �л�
where �̸� like '��%'
union
select * from �л�
where �̸� like '��%';

select �̸�,�г�,�ּ� from �л�
where �ּ� is null;

select �̸�,�г�, ������ from �л�
where ������ is not null;

select * from �л�
order by �̸�;

select �̸�,�ּ�,Ű from �л�
order by Ű desc
nulls last;

select �̸�,�г�,�ּ�,������ from �л�
where �г� = 1
order by ������;

select �̸�,�г�,Ű,������ from �л�
where �г� = 1
order by Ű desc,������; 

select ��ȣ,�̸�,�ּ� from �л�
order by �̸�;

select �̸�,Ű,������ from �л�
where �г� in(select �г� from �л�
where �̸� = '���ֿ�');

select �̸�,�г�,Ű from �л�
where Ű <(select round(avg(Ű),2) from �л�
where �а���ȣ = 1);

select �̸�,�г�,Ű from �л�
where �г� in(select �г� from �л� where �̸� = '������') 
and Ű > (select Ű from �л� where �̸� = '������');

select ��ȣ, �̸�, Ű from �л�
where Ű = '165';

select count(�̸�) as �л��� from �л�;

select count(��ȣ) as "�����԰� �ִ� �л���" from
(select * from �л�
where �̸� like '��%'
and ������ is not null);

select avg(����) as ������� from ��������
where �����ȣ = 1;

select �����ȣ, round(avg(����),2) as ����������� from ��������
group by �����ȣ
order by �����ȣ;

select �а���ȣ,�г�,count(�̸�) as �ο���, floor(avg(Ű)) as ���Ű from �л�
group by �а���ȣ,�г�
order by �г�;

select * from(
select �����ȣ, count(�����ȣ) as �����л���, round(avg(����),2) as ����������� from ��������
group by �����ȣ
order by �����ȣ)A
where A.�����л��� >= 4;

select * from(
select �����ȣ, count(�����ȣ) as �����л���, round(avg(����),2) as ����������� from ��������
group by �����ȣ
order by �����ȣ)A
where A.�����л��� >= 4
order by ����������� desc;

select �л�.��ȣ,�л�.�̸�,�а�.�̸� from �л�,�а�
where �л�.�а���ȣ = �а�.��ȣ
order by �л�.��ȣ;

select ����.��ȣ,����.�̸�,�а�.�̸� from ����
join �а� on ����.�а���ȣ = �а�.��ȣ;

select �л�.��ȣ,�л�.�̸�,�а�.�̸� from �л�,�а�
where �л�.�а���ȣ = �а�.��ȣ
and �л�.�̸� = '������';


select �а�.��ȣ,�л�.�̸�,�л�.Ű,�а�.�̸� from �л�,�а�
where �л�.�а���ȣ = �а�.��ȣ
and �л�.Ű >= 180;

select �а�.�̸�,����.�̸�,����.�̸� from ����,�а�,����
where ����.�а���ȣ = �а�.��ȣ 
and ����.������ȣ = ����.��ȣ;

select �а�.�̸�,����.�̸� from ����,�а�,����
where ����.�а���ȣ = �а�.��ȣ 
and ����.������ȣ = ����.��ȣ;
