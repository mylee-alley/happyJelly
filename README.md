# Happy Jelly 반려견 유치원 관리 시스템

<div>
    <img src="https://img.shields.io/badge/Java-21.0.3-red.svg" alt="Java">
    <img src="https://img.shields.io/badge/JavaScript-1.5-yellow.svg" alt="JavaScript">  
    <img src="https://img.shields.io/badge/Oracle-19c-green.svg" alt="Oracle">  
    <img src="https://img.shields.io/badge/CSS-3-blue.svg" alt="CSS">
    <img src="https://img.shields.io/badge/SpringBoot-3.2.5-purple.svg" alt="SpringBoot">
    <img src="https://img.shields.io/badge/HTML5-gray.svg" alt="HTML">
</div>


## 프로젝트 소개

**Happy Jelly**는 반려견 유치원 운영을 위한 통합 관리 시스템입니다. <br>
유치원에서 발생하는 다양한 운영 업무를 전산화하여 관리자와 보호자 모두에게 편리함을 제공합니다. <br>
반려견의 건강과 보호자의 만족도를 최우선으로 고려하여 설계되었습니다.

## 주요 기능

- **회원 관리**: 사용자 등록, 로그인, 프로필 관리, 역할 기반 접근 제어 (RBAC)
- **강아지 관리**: 반려견 정보 등록, 관리 및 프로필 조회
- **입학 신청**: 온라인 입학 신청 및 처리, 신청 상태 추적
- **출석 관리**: 반려견 출석 체크 및 기록, 출석 현황 조회
- **일일 리포트**: 반려견 활동 및 상태에 대한 일일 보고서 작성 및 조회
- **백신 관리**: 백신 접종 기록 관리 및 증명서 조회
- **결제 시스템**: 카카오페이 연동 결제 처리 및 내역 조회
- **지점 관리**: 여러 지점의 정보 관리
- **직원 관리**: 직원 정보 관리 및 권한 설정

## 기술 스택

- **백엔드**: Spring Boot, Java
- **프론트엔드**: HTML, CSS, JavaScript, Thymeleaf
- **데이터베이스**: Oracle Database
- **개발 도구**: SQL Developer

## 데이터베이스 설계

- **MEMBERS**: 회원 정보 저장
  - **칼럼**: MEMBER_ID, USERNAME, PASSWORD, EMAIL, PHONE, ROLE
- **DOGS**: 반려견 정보 저장
  - **칼럼**: DOG_ID, MEMBER_ID, NAME, BREED, BIRTH_DATE, GENDER
- **ADMISSIONS**: 입학 신청 정보 저장
  - **칼럼**: ADMISSION_ID, DOG_ID, APPLICATION_DATE, STATUS
- **ATTENDANCE**: 출석 정보 저장
  - **칼럼**: ATTENDANCE_ID, DOG_ID, DATE, STATUS

## 설치 및 실행 방법

1. **소스 코드 클론**: 
   ```bash
   git clone https://github.com/mylee-alley/happyJelly.git
   ```
2. **필수 라이브러리 설치**:
   ```bash
   cd happyjelly
   ./gradlew build
   ```
3. **애플리케이션 실행**:
   ```bash
   ./gradlew bootRun
   ```
4. **웹 브라우저에서 접속**:
   - `http://localhost:8080`

## 라이선스

- **MIT License**: 이 프로젝트는 MIT 라이선스에 따라 배포됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하십시오.
