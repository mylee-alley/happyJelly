# Happy Jelly 반려견 유치원 관리 시스템

**Happy Jelly**는 반려견 유치원 운영을 효율적으로 관리할 수 있도록 돕는 통합 관리 시스템입니다. 이 시스템은 유치원에서 발생하는 다양한 운영 업무를 전산화하여 관리자와 반려견 보호자 모두에게 편리함을 제공합니다. 반려견의 건강 관리와 보호자의 만족도를 최우선으로 고려하여 설계되었으며, 입학부터 일일 출석 및 활동 보고서, 결제 관리에 이르기까지 다양한 기능을 포함하고 있습니다.

## 목차

1. [기술 스택](#기술-스택)
2. [주요 기능](#주요-기능)
3. [외부 API](#외부-api)
4. [프로젝트에서의 역할](#프로젝트에서의-역할)
5. [트러블슈팅](#트러블슈팅)

## 기술 스택

<div>
    <img src="https://img.shields.io/badge/Java-21.0.3-red.svg" alt="Java">
    <img src="https://img.shields.io/badge/JavaScript-1.5-yellow.svg" alt="JavaScript">  
    <img src="https://img.shields.io/badge/Oracle-19c-green.svg" alt="Oracle">  
    <img src="https://img.shields.io/badge/CSS-3-blue.svg" alt="CSS">
    <img src="https://img.shields.io/badge/SpringBoot-3.2.5-purple.svg" alt="SpringBoot">
    <img src="https://img.shields.io/badge/HTML5-gray.svg" alt="HTML">
</div>

- **백엔드**: Spring Boot, Java
- **프론트엔드**: HTML, CSS, JavaScript 1.5, Thymeleaf
- **데이터베이스**: Oracle Database
- **개발 도구**: SQL Developer

## 주요 기능

- **회원 관리**: 사용자 등록, 로그인, 프로필 관리, 역할 기반 접근 제어 (RBAC)를 통해 관리자와 보호자의 계정을 관리합니다.
  - **외부 API 사용**: 네이버 로그인, 카카오 로그인 API를 사용하여 소셜 로그인 기능을 구현하였습니다.
- **강아지 관리**: 반려견의 정보를 등록하고, 관리하며, 프로필을 조회할 수 있습니다.
- **입학 신청**: 보호자는 온라인으로 반려견의 입학을 신청하고, 신청 상태를 추적할 수 있습니다.
- **출석 관리**: 반려견의 출석을 체크하고 기록하며, 출석 현황을 조회할 수 있습니다.
- **일일 리포트**: 반려견의 일일 활동 및 건강 상태에 대한 보고서를 작성하고 보호자가 조회할 수 있습니다.
- **백신 관리**: 반려견의 백신 접종 기록을 관리하고, 보호자는 접종 증명서를 조회할 수 있습니다.
- **결제 시스템**: 카카오페이 연동을 통해 결제 처리를 간편하게 하고, 결제 내역을 조회할 수 있습니다.
  - **외부 API 사용**: 카카오페이 API를 통해 결제 및 결제 내역 관리를 구현하였습니다.
- **지점 관리**: 유치원의 여러 지점 정보를 통합 관리할 수 있습니다.
- **직원 관리**: 유치원 직원의 정보를 관리하고, 권한을 설정하여 운영의 효율성을 높입니다.

## 외부 API

- **카카오페이 API**: 결제 처리 및 결제 내역 조회 기능을 구현하는 데 사용되었습니다.
- **네이버 로그인 API**: 네이버 계정을 통한 소셜 로그인 기능을 구현하는 데 사용되었습니다.
- **카카오 로그인 API**: 카카오 계정을 통한 소셜 로그인 기능을 구현하는 데 사용되었습니다.

## 프로젝트에서의 역할

저는 **Happy Jelly** 프로젝트에서 다음과 같은 역할을 담당하였습니다:

1. **로그인 및 회원 관리**:
   - 다양한 사용자 권한에 따른 로그인 시스템 구현.
   - 회원가입 및 간편 로그인 (카카오, 네이버) 기능 통합.
   - 비밀번호 찾기, 아이디 찾기 및 비밀번호 변경 기능 구현.

2. **메인 페이지 및 내비게이션**:
   - 사용자 역할에 따라 맞춤형 메인 페이지 및 내비게이션 바 구성.

3. **입학 및 반 관리**:
   - 입학 신청 시스템 개발, 신청 상태 관리 기능 구현.
   - 반 등록 및 수정 기능 추가.

4. **결제 및 구독 관리**:
   - 카카오페이 연동 결제 시스템 구현 및 결제 내역 관리.
   - 구독권 상태 관리 및 갱신 기능 개발.

5. **마이페이지 관리**:
   - 사용자 정보 및 강아지 프로필 관리 기능 개발.
   - 결제 내역 및 보유 이용권 조회 기능 구현.

6. **유효성 검사**:
   - 로그인 및 회원가입, 비밀번호 변경 시 유효성 검사 기능 추가.

## 트러블슈팅

프로젝트 진행 중 다양한 기술적 문제에 직면하였으며, 이를 해결하는 과정에서 많은 학습과 성장이 있었습니다. 주요 트러블슈팅 사례는 다음과 같습니다:

<details>
<summary>1. DB 관련</summary>

- **문제**: missing table, missing column
  - **해결**: `@JoinColumn` 명시 여부 확인

- **문제**: 무한 순환 루프
  - **해결**: `@JsonBackReference`, `@JsonManagedReference`, `@ToString(exclude={참조필드명})` 어노테이션 사용

</details>

<details>
<summary>2. Repository 관련</summary>

- **문제**: DB에서 스네이크 표기법, Spring에서 카멜 표기법을 주로 써서 Repository `findBy` 생성 시 오류
  - **해결**: entity에 카멜 표기법으로 필드명 수정한 후 `@Column(name=스네이크 표기법)`으로 수정하여 DB와 엔티티 맞춤

</details>

<details>
<summary>3. API 관련</summary>

- **문제**: 매개변수로 쓴 `kakaoPayDTO`와 토큰 받아야 하는 `kakaoPayDTO`에서 같은 DTO를 사용하며 값이 덮어씌워짐
  - **해결**: 메서드 밖에 `kakaoPayDTO`를 따로 선언해주고, `this.kakaoPayDTO`로 매개변수와 구분

- **문제**: 프로젝트에 맞게 추가 파라미터 받으려고 했으나 계속 null이 출력되는 현상
  - **해결**: controller의 `redirectUrl`과 service의 `approval_url` 경로 모두 수정하니 작동됨

</details>

<details>
<summary>4. 결제 및 구독 관리 관련</summary>

- **문제**: 자동결제 관련 체크박스 체크 여부에 따라 체크하지 않았을 때 `@RequestParam`에서 오류 발생
  - **해결**: 자동결제 옵션을 체크하지 않았을 경우를 처리하기 위해 `@RequestParam(value="autoPay", required=false)`로 설정하여, 체크박스가 체크되지 않은 경우 `null`로 처리하도록 하여 오류를 방지함.

</details>

<details>
<summary>5. 회원 관리 관련</summary>

- **문제**: 비밀번호 변경 시 필요한 컬럼 (newpassword)를 생성하고, `@NotEmpty` 선언했더니 일반 회원가입 시 NotEmpty 충족하지 못하여 오류 발생
  - **해결**: DTO에 회원가입 시 필요한 인터페이스 (`public interface Signup{}`)와 비밀번호 변경 시 필요한 인터페이스 (`public interface PasswordChange{}`)를 선언하고, 각각의 필드에 맞게 넣어줌

- **문제**: 네이버 로그인 시 토큰 값이 주기적으로 변경되어 DB에 이것을 username으로 입력 시 계정이 계속 생기는 것을 확인
  - **해결**: 이메일을 username으로 입력하는 것으로 변경

</details>

## 프로젝트 기간
**2024/07/03 - 2024/08/23 (약 8주)**
