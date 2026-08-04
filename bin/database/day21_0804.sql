
-- 한줄주석 
# 한줄주석
/* 여러줄 주석 */

--[1] 데이터 베이스 목록보기
-- 1. SQL 문법 작성한다.  2. ; 세메콜론 마침   3.실행할 SQL문법에 커서 두고 CRRL+엔터 또는 RUN
show DATABASES; -- 연결된 DB 서버내 모든 데이터베이스 목록 확인

--[2] 데이터베이스 로컬 경로
SHOW VARIABLES LIKE 'datadir';