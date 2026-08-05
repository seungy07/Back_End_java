DROP DATABASE IF EXISTS mydb0805;
CREATE DATABASE mydb0805;
USE mydb0805;
# DDL : 데이터베이스/테이블 생성/삭제/수정 질의어 (**Rollvack 안됨) auto commit 트랜잭션 *불가능
# 1) 테이블 생성: 1.테이블생성할 데이터베이스 활성화   
# 2) create table 테이블명( 속성명 타입, 속성명 타입 );
CREATE Table test1( 필드명1 int, 필드명2 double, 필드명3 text ); # 중복이 안댐
# 2) 테이블 목록 조회
SHOW TABLES;
# 3) 특정 테이블 속성 확인
DESCRIBE test1;  -- 상세속성 확인가능
# 4) 특정 테이블 삭제
DROP Table test1;
# 5) 테이블 수정
# 1. 필드 / 속성 추가
ALTER Table test1 ADD 필드명4 float;
# 2. 필드/속성 타입 수정
ALTER Table test1 MODIFY 필드명 longtext;
# 3. 필드/속성명, 타입 수정
ALTER Table new_test1 CHANGE 필드명1 필드명5 bigint;

# 6) 테이블 이름 변경
RENAME TABLE test1 to new_test1;

# 7) 테이블 모든 레코드(행/데이터) 삭제 *테이블은 유지, 데이터만 삭제
TRUNCATE Table new_test1;  # 현재 삭제할 데이터가 없어 확인 불가능
# -------------------------------------------------------------------#
# 테이블의 속성/필드 타입 *DBMS 회사마다 차이*
use mydb0805;
CREATE Table test2(  # byte크기 별로  
    정수필드1 tinyint, 정수필드2 smallint, 정수필드3 mediumint, 정수필드4 int,
    정수필드5 bigint /* long대신(8byte) */,  정수필드6 int unsigned,  /* sign(부호) + - */
    -- unsigned 부호 없다. tinyint(1바이트 -128~127) --> 0 ~ 225
    실수필드1 float, 실수필드2 double, 실수필드3 decimal,
    -- decimal 문자타입 이면서 소수점 오차 없음(최소화)
    날짜필드1 date , 시간필드1 time, 날짜시간필드 datetime,
    문자필드1 char(3) , 문자필드2 varchar(3), 문자필드3 text, 문자필드4 longtext,
    -- char(문자길이~255): 고정길이  vs varchar(~255) : 문자열 가변길이
    -- 예] "수박" -> char( [수][박][x] ) vs varchar( [수][박] )
    -- 사진이 포함된 게시물 내용 첨부파일 저장시 : 4GB까지 가능한 longtext 권장
    논리필드 boolean -- 마지막 필드타입뒤로 , 넣지 마 
 );
show TABLE;
# --------------------------------------------------------#
# 속성 / 필드 제약조건
CREATE Table test3(
    필드명1 tinyint not null,  -- 해당 필드/소겅 에는 null 저장할 수 없도록 설정 *값이 null이면 오류발생
    필드명2 smallint unique, -- 해당 필드/속성 에는 중복값을 저장할 수 없도록 설정 *값이 같다면 오류
    필드명3 int default 100, -- 해당 필드/속성에 레코드 생성시 기본값 100이 대입
    필드명4 datetime default now(), -- 예] 레코드 삽입시 현재날짜/시간/now() 자동 대입
    필드명5 bigint auto_increment primary key, -- 레코드(행) 삽입 시 자동으로 번호 할당(순서번호 설정 1,2,3,4,5...)
    -- primary key(pk): 기본/식별 키, 식별가능한 고유한 값을 갖는 필드(not null, unique 포함)
    -- AUTO_INCREMENT 컬럼은 하나만 존재할 수 있으며, 반드시 KEY(보통 PRIMARY KEY)로 지정되어야 합니다.
    constraint primary key(필드명5) -- constraint 특정 필드/속성을 제약 조건으로 설정 (여기서는 pk로 설정)  , 위에거나 둘중에 하나만 골라서 pk 선언
);
-- foreign key(fk) : 참조/외래 키(pk가 다른 테이블에 위치한 경우), 다른 테이블의 기본키 참조하는 키
    -- 참조 옵션: pk가 삭제/수정된 경우 FK 느?
        -- on delete/update cascade  : pk 삭제/수정 되면 fk도 같이 삭제/수정
        -- on delete/update set null : pk가 삭제/수정 되면 fk은 null으로 수정
        -- on delete/update restrict : (생략시 기본값) pk가 fk로 부터 참조 중이면 삭제/수정 불가능
CREATE Table test4( 필드명1 bigint, constraint foreign key(필드명1) references test3(필드명5) on delete cascade
 );
 -- mysql workvench 또는 vscode 에서 데이터베이스 서버 연동
 -- mysql workvench (E-R 다이어그램 자동 만들어줌)

 -- 예제1 회원제 게시판 서비스
drop DATABASE if EXISTS boardservice; # 1) 데이터베이스 생성 전 초기화 삭제
CREATE DATABASE boardservice; # 2) 데이터 베이스 생성
use boardservice; 3) 데이터 베이스 사용

CREATE TABLE member( # 회원 테이블
    mno int AUTO_INCREMENT, -- 회원 번호 자동 할당 
    constraint PRIMARY KEY(mno), -- 회원번호 pk로 설정
    mid varchar(30) not null UNIQUE, -- 회원아이디 이면서 최대 30글자, 공백x , 중복x
    mpwd varchar(20) NOT NULL, -- 회원 비밀번호이면서 최대 20글자, 공백x, 중복o
    mname varchar(10) NOT null, -- 닉네임
    mdate datetime DEFAULT now() -- 회원날짜/시간 자동 할당 으로 기본값 설정 *관례적으로 필수
    # 레코드 삽입, 수정  날짜/시간을 기록으로 유지보수
);
CREATE Table board( # 5.게시물테이블 생성
    bno int AUTO_INCREMENT,
    constraint PRIMARY KEY(bno), -- *테이블1개당 pk 1개이상 권장*
    btitle VARCHAR(255) , -- 제목
    bcontent longtext , -- 내용, 대용향을(사진)포함한 최대 4GB
    bdate DATETIME DEFAULT now(), -- 게시물 작성일
    bview int DEFAULT 0,  -- 조회수
    mno int, -- 작성자( 회원번호 id가 아닌 )
    constraint FOREIGN KEY(mno) REFERENCES member(mno) on delete CASCADE -- 회원삭제시 게시글도 같이 삭제
    -- 관례적으로 PK-FK필드명 동일
 ) ;