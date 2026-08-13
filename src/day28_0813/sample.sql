-- day28 과 exam2 연동

DROP DATABASE IF EXISTS mydb0813;
CREATE DATABASE mydb0813;
use mydb0813;
CREATE Table board(
    no int AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255),
    writer VARCHAR(30)
);

INSERT into board( content, writer) VALUES("안녕하세요","유재석"), ("하하" , "강호동"); -- 샘플데이터