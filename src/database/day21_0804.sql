
-- 한줄주석 
# 한줄주석
/* 여러줄 주석 */

-- 데이터베이스란? 여러 데이터들을 집합/공간
-- 데이터베이스 서버란? 데이터베이스들을 저장한 PC/프로그램

--[1] 데이터 베이스 목록보기
-- 1. SQL 문법 작성한다.  2. ; 세메콜론 마침   3.실행할 SQL문법에 커서 두고 CRRL+엔터 또는 RUN
show DATABASES; -- 연결된 DB 서버내 모든 데이터베이스 목록 확인

--[2] 데이터베이스 로컬 경로
SHOW VARIABLES LIKE 'datadir';

--[3] 데이터베이스 생성 *암기, 주의할점 : SQL 문법은 대소문자 구분하지 않는다., 중복된 데이터베이스명 불가능.
CREATE DATABASE mydb0804; --연결된 DB서버내 특정한 데이터베이스 생성

--[4] 데이터베이스 삭제, if exists 존재하면 삭제 ,주의할점: 없는 데이터베이스명 삭제불가능
DROP DATABASE mydb0804;
DROP DATABASE IF EXISTS mydb0804;

--[5] 데이터베이스 활성화 : 연결된 DB서버내 여러개 데이터베이스 중 조작할 DB 선택
USE mydb0804;

--[활용] : 프로젝트 데이터베이스 생성한다.
DROP DATABASE IF EXISTS test0804; -- 존재할수도 있으니 삭제후 생성
CREATE DATABASE test0804;
USE board;
-- 프로젝트 처음시작 시 데이터 베이스 초기화 할 때.----

