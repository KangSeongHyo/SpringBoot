# Spring Boot

## 정의
- 기존 spring의 무거운 부분(XML)을 대신 자동으로 처리하여 프로젝트 개발을 간편하게 해주는 개발 플랫폼이다.
- 개발자 <-> Spring Boot <-> Spring  

## 특징
- Spring 어플리케이션을 **독립적(stand-alone)** 으로 생성한다.
- 내장 WAS (tomcat, jetty)가 있어 war 파일을 배포할 필요가 없다.(자체적으로 배포&실행)
- Spring 개발환경을 자동으로 구성해준다.
- **XML** 설정이 필요없다.
- 운영에 필요한 모니터링 등 기능을 제공한다.

## Spring Boot 프로젝트 시작하기
### 환경
- IntelliJ IDEA 2018.3.4
- Gradle 5.2.1
- Spring Boot 2.1.2

### STEP 1 - 프로젝트 만들기
- IntelliJ를 실행시키고 ``new project`` 누르면 아래 화면이 나온다. 여기서 ``Spring Initializr`` 선택한다.
- start.spring.io 에서 boot 프로젝트 생성하는 것을 도와주는 역할을 한다.

  ![이미지](/capture/K-001.png)

- 여기서는 프로젝트명, 빌드도구(Maven or Gradle), 패키징(Jar or War) 등 설정하고 ``next`` 클릭

  ![이미지](/capture/K-002.png)

- 프로젝트에 필요한 형태,라이브러리,도구 등을 미리 설정해서 프로젝트 시작과 동시에 설치 및 설정이 된다.
- 상단에는 Spring Boot 버전을 설정할 수 있다. ``next`` 클릭

   ![이미지](/capture/K-003.png)

- 여기서 JDK 설정이나 이전에 설정한 Gradle의 위치도 설정 할 수 있다. ``OK``누르면 프로젝트가 생성된다.

  ![이미지](/capture/K-004.png)

### STEP 2 - 프로젝트 실행하기
- 프로젝트가 생성되면 설정이 시작되고 아래와 같은 디렉토리 구조로 생성된다.

```
IdeaProjects\test>tree

├─.gradle
│  ├─5.2.1
│  │  ├─executionHistory
│  │  ├─fileChanges
│  │  ├─fileHashes
│  │  └─vcsMetadata-1
│  ├─buildOutputCleanup
│  └─vcs-1
├─.idea
│  ├─libraries
│  └─modules
├─gradle
│  └─wrapper
├─out
│  └─production
│      ├─classes
│      │  └─com
│      │      └─spring
│      │          └─test
│      └─resources
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─spring
    │  │          └─test
    │  └─resources
    │      ├─static
    │      └─templates
    └─test
        └─java
            └─com
                └─spring
                    └─test

```

- Boot 관련 설정들은 **application.properties** 에서 설정하고 **TestApplication** 은 서비스를 실행시킨다.

![이미지](/capture/K-005.png)

- Hello World!를 띄우기 위해서 ``RestController`` 선언하고 간단하게 매핑을 해보았다.

![이미지](/capture/K-006.png)

- 이후 **TestApplication** 에서 서비스를 실행시키면 내장 tomcat이 실행되고 Spring boot 로그가 보여진다.

![이미지](/capture/K-007.png)

- 결과화면

![이미지](/capture/K-008.png)



#### 참고
- [http://spring.io/projects/spring-boot](http://spring.io/projects/spring-boot)
- [https://youtu.be/26GuwzdB3iI](https://youtu.be/26GuwzdB3iI)
