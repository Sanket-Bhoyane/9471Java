select * from mayur_m;
insert into mayur_m values(1,"yeda","dattanager");
insert into mayur_m values(2,"yed","mulshi");
insert into mayur_m values(3,"tare","jbn");
insert into mayur_m values(4,"kisna","jbn");
select * from mayur_m;
select * from jk;
insert into jk values(5,"nana","jbn");
insert into jk values(7,"pappu","city");
insert into jk values(8,"pagya","jbn");
insert into jk values(9,"maari","kothrud");
select * from eki;
insert into eki values(10,"activa",9);
insert into eki values(11,"jupiter",8);
insert into eki values(12,"activa",7);
insert into eki values(13,"tempo",5);
insert into eki values(14,"passion",4);
select * from eki;
select jk.samarthak,jk.city_jk,eki.vehicle_name from jk,eki where eki.eki_id=jk.jk_id  ;
select * from eki;
select * from mayur_m;
alter table mayur_m add age int (11);
select * from mayur_m;
select age as "STATUS" from mayur_m;
select * from mayur_m;
update mayur_m set age="kkttr" where id=1;
select * from mayur_m;
update mayur_m set age="kkttr" where id=2;
update mayur_m set age="bhel" where id=3;
update mayur_m set age="md" where id=4;
select *from mayur_m order by karykarte;
select *from mayur_m order by karykarte desc;
select *from mayur_m limit 2 offset 1;
select * from mayur_m where karykarte like "%a";
select * from mayur_m where karykarte like "k%";




