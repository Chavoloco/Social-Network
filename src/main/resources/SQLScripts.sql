CREATE DATABASE social_network;
USE social_network;

CREATE TABLE posts(
	id INT NOT NULL auto_increment primary key,
    post_detail varchar(45) not null,
    user_id int, foreign key(user_id) references  user(id) on delete set null on update no action);
    
create table pictures(
	id int not null auto_increment primary key,
    picture_title varchar(45),
    picture_filename varchar(75)not null) ;
    
    create table profile(
	id int not null auto_increment primary key,
    profile_detail varchar(450));
    
    create table friends(
	id int not null auto_increment primary key,
    name varchar(45) not null,
    last_name varchar(45) not null);

CREATE TABLE user(
	id INT NOT NULL auto_increment primary key,
    user_name varchar(45) not null,
    password varchar(45) not null,
    profile_id int , foreign key(profile_id) references profile(id) on delete SET NULL on update NO ACTION,
    pictures_id int , foreign key(pictures_id) references pictures(id) on delete SET NULL on update NO ACTION,
    friends_id int , foreign key(friends_id) references friends(id) on delete SET NULL on update NO ACTION);

INSERT INTO pictures( picture_title, picture_filename)
VALUES("food", "C:/user/desktop/food.jpg"),("me", "C:/user/desktop/me.jpg"), ("me and a friend of mine", "C:/user/desktop/asd5a4d4s4.jpg");

INSERT INTO profile( profile_detail)
VALUES("I like to play videogames"),("I'm looking for an QA automation job"),("I just try to survive");

INSERT INTO friends( name, last_name)
VALUES("Herik", "Jonhston"),("Jane", "Doe"),("Jeremias", "Bertoldi");

INSERT INTO user( user_name, password, profile_id, pictures_id, friends_id)
VALUES("HerikJonhston", "myBirthday", 4, 4, 4),("JaneDoe666", "BirthdayOfMyCat", 5, 5, 5),("JeremiasBertoldiXD", "123456", 6, 6, 6);

update user 
set user_name="another_user"
where id=1 and user_name="HerikJonhston";

update user 
set pictures_id=2
where pictures_id=1 or user_name="HerikJonhston";

SET SQL_SAFE_UPDATES = 0;

update user 
set user_name="user1"
where id=2 and user_name="JaneDoe666" or password="BirthdayOfMyCat";

update user 
set user_name="user0"
where id=1 and user_name="another_user" and password="BirthdayOfMyCat";

update pictures 
set picture_title="myMom"
where picture_filename="C:/user/desktop/me.jpg" or id=2;

update pictures 
set picture_filename="D:/images/private/donotenter/theisnothingtosee/myg"
where id=3 and picture_title="me and a friend of mine";

update pictures 
set picture_title="drinks"
where id=1 or picture_filename="C:/user/desktop/food.jpg";

update friends 
set name="mark" , last_name="zukemberg"
where id=2;

update friends 
set last_name="satie"
where id=1 and name="Herik"; 

update profile 
set profile_detail="I'm sick of playing videogames"
where id=1 or profile_detail="I like to play videogames"; 

update profile 
set profile_detail="I work as a QA automation engineer"
where id=2 ; 

select * from user;
select* from pictures;
select * from friends;
select * from profile;

delete from user 
where id < 5;

delete from user 
where pictures_id=2 ;

delete from user 
where user_name="JeremiasBertoldiXD" and profile_id=1;

delete from user 
where password="123456" and friends_id=3;

delete from pictures 
where picture_title="drinks";

delete from friends 
where id=1 or name="mark";

delete from friends 
where name="Jeremias" and last_name="Bertoldi";

delete from profile 
where id=1 and profile_detail="I'm sick of playing videogames" or id=2;

delete from profile 
where profile_detail="I just try to survive";

select u.user_name, p.profile_detail from profile p 
right join user u on p.id=u.profile_id;

select u.user_name, p.profile_detail from profile p 
left join user u on u.profile_id=p.id;

select u.user_name, p.profile_detail from profile p 
inner join user u on p.id=u.profile_id;