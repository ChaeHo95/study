select * from 학생
order by 번호;

select 이름,학년, 주소 from 학생
order by 번호;

select 이름 as 성명,주소 as "현재 주소지" from 학생
order by 번호;

select 학년 from 학생
group by 학년
order by 학년;

select * from 학생
where 번호 = 1;

select * from 학생
where 키 < 165 ;

select 이름,학년,키,몸무게 from 학생
where 학년 = 1
and 키 >= 170;

select 이름,학년,키,몸무게  from 학생
where 학년 = 1 
or 키 >= 170;

select 이름,주소,키,몸무게 from 학생
where 몸무게 between 45 and 50;

select 이름,주소,키, 몸무게 from 학생
where 몸무게 >=45
and 몸무게 <=50;

select 번호,이름,학년 from 학생
where 학년 in(2,3); 

select 번호,이름,학년 from 학생
where 학년 = 2 
or 학년 = 3;

select * from 학생
where 이름 like '박%';

select * from 학생
where 이름 like '김%'
or 이름 like '이%'
or 이름 like '박%';

select * from 학생
where 이름 like '김%'
union
select * from 학생
where 이름 like '이%'
union
select * from 학생
where 이름 like '박%';

select 이름,학년,주소 from 학생
where 주소 is null;

select 이름,학년, 몸무게 from 학생
where 몸무게 is not null;

select * from 학생
order by 이름;

select 이름,주소,키 from 학생
order by 키 desc
nulls last;

select 이름,학년,주소,몸무게 from 학생
where 학년 = 1
order by 몸무게;

select 이름,학년,키,몸무게 from 학생
where 학년 = 1
order by 키 desc,몸무게; 

select 번호,이름,주소 from 학생
order by 이름;

select 이름,키,몸무게 from 학생
where 학년 in(select 학년 from 학생
where 이름 = '문주원');

select 이름,학년,키 from 학생
where 키 <(select round(avg(키),2) from 학생
where 학과번호 = 1);

select 이름,학년,키 from 학생
where 학년 in(select 학년 from 학생 where 이름 = '김태희') 
and 키 > (select 키 from 학생 where 이름 = '김태희');

select 번호, 이름, 키 from 학생
where 키 = '165';

select count(이름) as 학생수 from 학생;

select count(번호) as "몸무게가 있는 학생수" from
(select * from 학생
where 이름 like '박%'
and 몸무게 is not null);

select avg(점수) as 평균점수 from 수강내역
where 과목번호 = 1;

select 과목번호, round(avg(점수),2) as 과목평균점수 from 수강내역
group by 과목번호
order by 과목번호;

select 학과번호,학년,count(이름) as 인원수, floor(avg(키)) as 평균키 from 학생
group by 학과번호,학년
order by 학년;

select * from(
select 과목번호, count(과목번호) as 누적학생수, round(avg(점수),2) as 과목평균점수 from 수강내역
group by 과목번호
order by 과목번호)A
where A.누적학생수 >= 4;

select * from(
select 과목번호, count(과목번호) as 누적학생수, round(avg(점수),2) as 과목평균점수 from 수강내역
group by 과목번호
order by 과목번호)A
where A.누적학생수 >= 4
order by 과목평균점수 desc;

select 학생.번호,학생.이름,학과.이름 from 학생,학과
where 학생.학과번호 = 학과.번호
order by 학생.번호;

select 교수.번호,교수.이름,학과.이름 from 교수
join 학과 on 교수.학과번호 = 학과.번호;

select 학생.번호,학생.이름,학과.이름 from 학생,학과
where 학생.학과번호 = 학과.번호
and 학생.이름 = '김이향';


select 학과.번호,학생.이름,학생.키,학과.이름 from 학생,학과
where 학생.학과번호 = 학과.번호
and 학생.키 >= 180;

select 학과.이름,교수.이름,과목.이름 from 교수,학과,과목
where 교수.학과번호 = 학과.번호 
and 과목.교수번호 = 교수.번호;

select 학과.이름,과목.이름 from 교수,학과,과목
where 교수.학과번호 = 학과.번호 
and 과목.교수번호 = 교수.번호;
