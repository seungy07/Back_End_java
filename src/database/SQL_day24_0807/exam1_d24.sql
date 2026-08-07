drop DATABASE IF EXISTS mydb0807;
create DATABASE mydb0807;
use mydb0807; 

CREATE Table test( -- create table 테이블명( 속성명 타입 제약조건, 속성명 타입 제약조건 ) 
    번호 INT AUTO_INCREMENT, constraint PRIMARY KEY(번호),  
    이름 VARCHAR(30) not NULL UNIQUE,
    개수 int DEFAULT 2 -- 초기값 2로 고정
);
-- DML : 조작어 
    /* 1) insert 레코드 삽입  2) select 레코드조회 3) update 레코드 수정 4) delete 레코드삭제 */
-- 레코드란? 테이블내 행/가로 단위
# [1] insert : insert into 테이블명(속성명1, 속성명2) values (값1, 값2)
INSERT INTO test(번호,이름,개수) VALUES(1,"유재석",10);
INSERT INTO test(이름, 개수) VALUES("강호동", 20); -- 번호 값 제외한 삽입

# [2] select : select * from 테이블명
select * from test;  -- *은 전체
INSERT into test(이름) VALUES("신동엽"); -- 번호(auto), 개수(defalut)
# INSERT into test(이름) VALUES("유재석"); -- 오류발생,, unique 중복 불가를 했기 때문
INSERT into test VALUES(4,"하하", 30); -- 모든 속성값 *정의된 순서대로 값 대입시 속성명 생략
INSERT into test(이름) VALUES("박명수"), ("수박"),("바나나"); -- 한번에 여러개 레코드 삽입

# [2] select : select * from 테이블명 where 조건
SELECT * FROM test;
select 이름 from test;
SELECT 이름, 개수 FROM test;
SELECT * FROM test WHERE 이름 = "수박"; -- 변수가 없다 =은 대입이 아니라 같다라는 뜻
SELECT * FROM test WHERE 개수 >= 5 ;  -- 비교 조건도 가능

# [3] update : update 테이블명 set 속성명 = 새로운값, 속성명= 새로운값 where 조건;
UPDATE test set 개수 = 10; -- 조건이 없으므로 테이블내 개수 값들을 모두 바꿈
UPDATE test set 개수 = 20 WHERE 이름 = "유재석"; -- 조건으로 부분 수정
UPDATE test set 개수 = 40, 이름 ="강호동2" WHERE 번호 = 2;

# [4] delete : delete from 테이블명 where 조건;
-- ***구조는 남아있고 안에 레코드만 삭제한다.
DELETE from test WHERE 번호 >= 3;
DELETE from test; -- 모두 삭제 주의
-- [DML] delete[레코드만] (vs) [DDL] truncate table[레코드만] (vs) drop table[테이블 자체]
-- DDL은 취소 불가능, DML 취소(ROLLBACK) 가능(트랜잭션은 DML 만)
# SQL 연산자
# 1. 회원테이블
create table member(    # 아이돌 그룹
 mid char(8) not null ,   # 식별키   최대 8자리
    mname varchar(10) not null , # 그룹명  최대 10자리
    mnumber int not null ,   # 인원수  정수 +-21억정도
    maddr char(2) not null ,   # 지역  최대 2자리
    mphone1 char(3) ,    # 지역번호 최대 2자리
    mphone2 char(8) ,    # 전화번호  최대 8자리
    mheight smallint ,    # 평균키   정수 +-3만정도
 mdebut date ,     # 데뷔일   yyyy-mm-dd
    constraint primary key ( mid )    # 제약조건
);
# 2. 구매테이블
create table buy(
 bnum int auto_increment ,    # 구매번호 정수  자동번호 부여
    mid char(8),      # 구매자  FK
    bpname char(6) not null ,   # 제품명  최대 6자리
    bgname char(4) ,      # 분류명   최대 4자리
    bprice int not null ,    # 가격   정수
    bamount smallint not null ,   # 구매수량 정수
    constraint primary key(bnum) ,     # 제약조건
    constraint foreign key ( mid ) references member(mid) # 제약조건
);
# 샘플데이터
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');
INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);
----------------------------------------------------------------------
# [1] as 별칭 키워드, 조회 결과의 속성명 변경, as 생략하고 띄어쓰기 사용가능
select mid from member;
select mid as 회원아이디 from member; -- as 별칭명 ) 원본은 그대로 화면에서만 변경
select mid as 회원아이디 from member as 회원테이블; -- SQL 내 속성며/테이블 별칭
select mid 회원아이디 from member 회원테이블; -- as 생략하고 띄워쓰기로 가능

# [2] distinct, 조회 결과의 속성값 중복 제거
select DISTINCT maddr from member; -- 중복을 제외한 조회

# [3] 산술연산자 : +더하기 -빼기 / 나누기 *곱하기 div몫 mod나머지
select mnumber 인원수, mnumber+3 더하기, mnumber-3 빼기, mnumber/3 나누기,
       mnumber*3 곱하기, mnumber div 3 몫, mnumber mod 3 나머지 from member;

# [4] 비교연산자 : = != > < >= <=
# [5] 논리연산자 : and or not
SELECT * FROM member WHERE mname = "블랙핑크";
SELECT * FROM member WHERE mnumber > 4;
SELECT * FROM member WHERE mname != "블랙핑크";
SELECT * FROM member WHERE NOT mname ="잇지";
SELECT * FROM member WHERE mheight <=163; -- '키' 속성값이 162 이하이면
SELECT * FROM member WHERE mheight >= 165 and mheight < 170;
SELECT * FROM member WHERE mheight BETWEEN 165 and 168;
-- between 시작값 and 끝값 , 사이/범위 값
SELECT * FROM member WHERE maddr = "경기" or maddr = "전남" or maddr="경남";
SELECT * FROM member WHERE maddr in("경기", "전남");
SELECT * FROM member WHERE mphone1 = null;
SELECT * FROM member WHERE mphone1 is null; -- null 값은 is
SELECT * FROM member WHERE mname like "에이%";
-- 에이x, 에이xx, 에이xxx 등등 길이 상관 없이 들어가면 출력
SELECT * FROM member WHERE mname like "%이%";
SELECT * FROM member WHERE mname LIKE "에___";
-- __ 로 글자 수 제한으로 찾기 가능 )) 중간에 들어가는 글자도 가능