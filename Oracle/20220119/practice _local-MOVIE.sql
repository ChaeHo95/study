select �̸�,���� from ��ȭ 
where �̸� like '%��%';

select �̸�,���� from ��ȭ 
where �̸� like '%��%'
order by ��������;

select �̸�,���� from ��ȭ
where �̸� like '%�׳�%';

select �̸� from ��ȭ
where ��ȣ in (1,2,3);

SELECT ��ȣ from ��ȭ
where �̸� = '��ȣ��';

select ��ȣ from ���
where �̸� = '�۰�ȣ';

select �̸� from ���
join �⿬
on ���.��ȣ = �⿬.����ȣ
where ��ȭ��ȣ = '1';

select ���.�̸� from ���
join �⿬
on ���.��ȣ = �⿬.����ȣ
join ��ȭ
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
where ��ȭ.�̸� = '���ϵ�';

select ��ȭ.�̸� from ��ȭ
join �⿬
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ���
on ���.��ȣ = �⿬.����ȣ
where ���.�̸� = '�۰�ȣ';

select ��ȭ.�̸� from ��ȭ
join �⿬
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ���
on ���.��ȣ = �⿬.����ȣ
where ���.�̸� = '������'
and �⿬.��Ȱ != '1';

select ��ȭ.�̸�,���.�̸� from ��ȭ
join �⿬
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ���
on ���.��ȣ = �⿬.����ȣ
where ��ȭ.�������� = 2012
and �⿬.��Ȱ = '1';

select �������� , count(��ȭ.��������) as �⿬��ǰ�� from ��ȭ
join �⿬
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ���
on ���.��ȣ = �⿬.����ȣ
where ���.�̸� = '�۰�ȣ'
group by ��������
order by ��������;

select ��ȭ.�̸�,���.�̸� from ��ȭ
join �⿬ on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ��� on ���.��ȣ = �⿬.����ȣ
where ��ȭ.�̸� in(select case when ���.�̸� = '�۰�ȣ' then ��ȭ.�̸� end from ��ȭ
join �⿬ on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ��� on ���.��ȣ = �⿬.����ȣ)
order by ��ȭ.�̸� ;

select * from (
select ���.�̸�, count(��ȭ.�̸�) as  ī��Ʈ from ���
join �⿬
on ���.��ȣ = �⿬.����ȣ
join ��ȭ
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
where �⿬.��Ȱ = '1'
group by ���.�̸� )A
where a.ī��Ʈ >= 2;

select * from (
select ��ȭ.�̸�, count(���.�̸�) as  ī��Ʈ from ���
join �⿬
on ���.��ȣ = �⿬.����ȣ
join ��ȭ
on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
where ��ȭ.�������� = 2012
group by ��ȭ.�̸�)A
order by ī��Ʈ desc;

select ���.�̸� from ���
join �⿬ on ���.��ȣ = �⿬.����ȣ
join ��ȭ on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
where ��ȭ.��ȣ in(select case when ���.�̸� = '�۰�ȣ' then ��ȭ.��ȣ end from ��ȭ
join �⿬ on ��ȭ.��ȣ = �⿬.��ȭ��ȣ
join ��� on ���.��ȣ = �⿬.����ȣ
) and ���.�̸� != '�۰�ȣ'
order by �̸�;