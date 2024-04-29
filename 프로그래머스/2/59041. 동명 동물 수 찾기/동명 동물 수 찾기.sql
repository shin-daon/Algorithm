-- 코드를 입력하세요
SELECT name, count(name)
FROM animal_ins
group by name
having count(name) >= 2
order by name asc;