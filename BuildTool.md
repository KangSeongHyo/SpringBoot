# Build Tool

## 정의
-  Build란 전처리, 컴파일, 패키징, 테스팅, 배포까지의 부분을 처리하는 것을 의미하고 Build Tool은 이를 자동화 해주는 것
- Build란 컴파일러가 소스코드를 컴파일하여 실행파일을 만드는 과정(->.class)
- 전처리는 C에서 #include #define 등 개발자가 정의한 부분들을 컴파일 이전에 미리 처리함
- 컴파일은 작성한 코드를 컴퓨터가 이해 할 수 있는 기계어로 변환 시키는 것을 의미함
- 패키징은 프로젝트를 War나 jar 파일로 묶어주는 것을 의미함

    *** Note : *** 자바에는 전처리기를 지원하지 않음

## Gradle

### 정의
- Groovy(DSL : Domain Specific Languge)를 기반으로 하는 Build 자동화 도구

### 특징
- JVM에서 동작하지만 컴파일 필요없이 소스코드 그대로를 실행(스크립트 언어의 장점)
- xml의 정적인 단점을 Groovy로 변경하여 동적인 빌드과정에 적합하게 만듬
- 코딩처럼 Groovy로 로직을 구현하여 사용할 수 있음
- 설정 변경이나 Dependency 추가,삭제등이 간결해짐

### 기본구성
- ``build.gradle`` 파일에 pluginy, dependency 등을 선언하여 설정한다.

  ```
    plugins {
      id 'org.springframework.boot' version '2.1.2.RELEASE'
      id 'java'
    }

    apply plugin: 'io.spring.dependency-management'

    group = 'com.spring'
    version = '0.0.1-SNAPSHOT'
    sourceCompatibility = '1.8'

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-web'
        compileOnly 'org.projectlombok:lombok'
        runtimeOnly 'org.springframework.boot:spring-boot-devtools'
        testImplementation 'org.springframework.boot:spring-boot-starter-test'
      }

  ```

## Maven

### 정의
- XML(Extensible Markup Language)를 기반으로 하는 Build 자동화 도구(for Java)
-

### 특징
- POM(Project Object Model) 이용해 Build하고 다른 프로젝트와 공유할 수 있음
- 프로젝트의 configuration plugin 파일, 트래킹 감지, 코드의 생명주기 등을 ``pom.xml`` 에서 관리
- Project의 정보를 제공(Dependency 목록, Unit test 리포팅 등)

### 기본 구성

- pom.xml 상단에 Maven의 각종 설정들을 정의한다. xmlns는 xml의 namespace를 의미함(여기서 어떤것을 찾겠다는 표지판)
- xsi는 XMLSchema-instance를 가리키는 단순 표시이고 xsi : 속성들을 붙여 사용한다.

  ```
   <project xmlns="http://maven.apache.org/POM/4.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                        http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
  ```
- 아래의 groupId, artifactId 등 Coordinates들은 프로젝트마다 해당 Dependency를 접근하게 하는 명명규칙으로 Unique하게 사용해야 한다.

  ```
   <dependency>
   		<groupId>junit</groupId>
  		<artifactId>junit</artifactId>
  		<version>4.7</version>
  			<scope>test</scope>
   </dependency>
  ```


#### 참고 & 출처
- [https://maven.apache.org/what-is-maven.html](https://maven.apache.org/what-is-maven.html)
- [https://maven.apache.org/pom.html#What_is_the_POM](https://maven.apache.org/pom.html#What_is_the_POM)
- [https://medium.com/@goinhacker/%EC%9A%B4%EC%](https://medium.com/@goinhacker/%EC%9A%B4%EC%98%81-%EC%9E%90%EB%8F%99%ED%99%94-1-%EB%B9%8C%EB%93%9C-%EC%9E%90%EB%8F%99%ED%99%94-by-gradle-7630c0993d09)
