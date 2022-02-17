select 이름,평점 from 영화 
where 이름 like '%왕%';

select 이름,평점 from 영화 
where 이름 like '%왕%'
order by 개봉연도;

select 이름,평점 from 영화
where 이름 like '%그녀%';

select 이름 from 영화
where 번호 in (1,2,3);

SELECT 번호 from 영화
where 이름 = '변호인';

select 번호 from 배우
where 이름 = '송강호';

select 이름 from 배우
join 출연
on 배우.번호 = 출연.배우번호
where 영화번호 = '1';

select 배우.이름 from 배우
join 출연
on 배우.번호 = 출연.배우번호
join 영화
on 영화.번호 = 출연.영화번호
where 영화.이름 = '도둑들';

select 영화.이름 from 영화
join 출연
on 영화.번호 = 출연.영화번호
join 배우
on 배우.번호 = 출연.배우번호
where 배우.이름 = '송강호';

select 영화.이름 from 영화
join 출연
on 영화.번호 = 출연.영화번호
join 배우
on 배우.번호 = 출연.배우번호
where 배우.이름 = '주진모'
and 출연.역활 != '1';

select 영화.이름,배우.이름 from 영화
join 출연
on 영화.번호 = 출연.영화번호
join 배우
on 배우.번호 = 출연.배우번호
where 영화.개봉연도 = 2012
and 출연.역활 = '1';

select 개봉연도 , count(영화.개봉연도) as 출연작품수 from 영화
join 출연
on 영화.번호 = 출연.영화번호
join 배우
on 배우.번호 = 출연.배우번호
where 배우.이름 = '송강호'
group by 개봉연도
order by 개봉연도;

select 영화.이름,배우.이름 from 영화
join 출연 on 영화.번호 = 출연.영화번호
join 배우 on 배우.번호 = 출연.배우번호
where 영화.이름 in(select case when 배우.이름 = '송강호' then 영화.이름 end from 영화
join 출연 on 영화.번호 = 출연.영화번호
join 배우 on 배우.번호 = 출연.배우번호)
order by 영화.이름 ;

select * from (
select 배우.이름, count(영화.이름) as  카운트 from 배우
join 출연
on 배우.번호 = 출연.배우번호
join 영화
on 영화.번호 = 출연.영화번호
where 출연.역활 = '1'
group by 배우.이름 )A
where a.카운트 >= 2;

select * from (
select 영화.이름, count(배우.이름) as  카운트 from 배우
join 출연
on 배우.번호 = 출연.배우번호
join 영화
on 영화.번호 = 출연.영화번호
where 영화.개봉연도 = 2012
group by 영화.이름)A
order by 카운트 desc;

select 배우.이름 from 배우
join 출연 on 배우.번호 = 출연.배우번호
join 영화 on 영화.번호 = 출연.영화번호
where 영화.번호 in(select case when 배우.이름 = '송강호' then 영화.번호 end from 영화
join 출연 on 영화.번호 = 출연.영화번호
join 배우 on 배우.번호 = 출연.배우번호
) and 배우.이름 != '송강호'
order by 이름;