

# 시작

AWS EC2 인스턴스 서버 배포 + RDS 연결


# 목차

- *[인스턴스 생성](#인스턴스-생성)* <br>
- *[인스턴스 보안그룹 설정](#인스턴스-보안그룹-설정)*<br>
- *[RDS 생성](#rds-생성)*<br>
- *[RDS 보안 그룹 설정](#rds-보안-그룹-설정)*<br>
- *[인스턴스 연결 및 JDK, Gradle 설치](#인스턴스-연결-및-jdk-gradle-설치)*<br>
- *[마리아 DB 설치](#마리아-db-설치)*<br>
- *[서버 배포](#서버-배포)*<br>
- *[실행](#실행)*<br>





<hr>


# 인스턴스 생성

![인스턴스 생성](https://github.com/oals/EC2-instance2/assets/136543676/b3df3d61-130e-45dc-a7c2-c84ba3547ba5)
<br>

       우분투를 사용했습니다.

<br>

![인스턴스 생성 확인](https://github.com/oals/EC2-instance2/assets/136543676/f73cbc7f-7ae1-43e6-a642-038f0695187b)

<br>

      왼쪽 목록의 인스턴스 항목에서 생성된 인스턴스를 확인 할 수 있습니다. 


<br>


# 인스턴스 보안그룹 설정


![보안 그룹](https://github.com/oals/EC2-instance2/assets/136543676/34b4dde1-87a2-4e3e-8697-2694e8cd28df)

<br>


      왼쪽 목록의 하단 보안그룹 항목 클릭


<br>


![보안그룹 설정1](https://github.com/oals/EC2-instance2/assets/136543676/5b9367fd-784c-4310-8878-fb3c3a54cc66)

<br>

      생성된 인스턴스의 보안 그룹 이름 확인 후 
      해당 보안그룹의 인바운드 규칙 편집


<br>

![보안그룹 설정2](https://github.com/oals/EC2-instance2/assets/136543676/38b9474d-0a9e-4e49-b6df-e80985d198fc)


<br>

       규칙 추가 -> 모든 트래픽 -> AnyWhere-IPv4 설정 
       테스트 서버이기에 모든 트래픽에서 연결 가능하도록 설정했습니다.

<br>


# RDS 생성


![rds 검색](https://github.com/oals/EC2-instance2/assets/136543676/21234639-44de-4688-aa70-f3a65dce5564)

<br>

       왼족 상던 검색창에 RDS 검색
<br>

![db 생성1](https://github.com/oals/EC2-instance2/assets/136543676/a907fdb1-a9ad-43b8-84b9-ac03a843c16e)

<br>

       마리아 DB 선택

<br>

![퍼블릭 엑세스](https://github.com/oals/EC2-instance2/assets/136543676/984f12f3-0674-4afa-9bbe-e1737a521684)

<br>

       외부의 연결을 허용 하기 위해 퍼블릭 엑세스 사용
<br>


![인코딩 설정](https://github.com/oals/EC2-instance2/assets/136543676/fc899016-0467-40dc-9f1b-794485f0d46f)

<br>

       DB 인코딩 설정 
       인코딩 설정 파일을 따로 만들어 설정했습니다.

<br>

![생성된 db](https://github.com/oals/EC2-instance2/assets/136543676/32a11518-9df1-4720-98eb-980ddfba4fe6)

<br>

       DB 생성 완료

<br>



# RDS 보안 그룹 설정



![db 보안그룹](https://github.com/oals/EC2-instance2/assets/136543676/df81fda5-b13b-49d0-ad56-b0bd7519e6a9)

<br>

       생성된 DB의 인바운드 규칙 편집

<br>



![db 보안그룹2](https://github.com/oals/EC2-instance2/assets/136543676/67f26d4a-8e9a-4682-ab99-d1ebbecba234)



![db 보안그룹 편집](https://github.com/oals/EC2-instance2/assets/136543676/ba3b2bc0-025c-4d0a-ab48-c68b71e4dc62)



<br>

      테스트 서버이기에 모든 트래픽에서 연결 가능하도록 설정했습니다.


<br>





![db 완성 편집](https://github.com/oals/EC2-instance2/assets/136543676/91de3021-c26c-4d42-b48c-2f280610dc21)


<br>

       엔드포인트 값을 통해 외부에서 DB에 접속 가능합니다.

<br>




# 인스턴스 연결 및 JDK Gradle 설치

![인스턴스 연결](https://github.com/oals/EC2-instance2/assets/136543676/3bbeecc0-45ed-431d-99eb-59bccef1575e)




![우분투update](https://github.com/oals/EC2-instance2/assets/136543676/e977f93f-5f88-475a-9a89-d9ebf1915713)

<br>


      sudo apt update
      설치 가능한 패키지 리스트 최신화



<br>

![jdk 설치](https://github.com/oals/EC2-instance2/assets/136543676/6c92f48f-440f-4ec8-9771-ed00ec4550ee)

![jdk 버전 확인](https://github.com/oals/EC2-instance2/assets/136543676/744c03d7-8a5a-424e-a03e-32d7702404c2)

<br>



      sudo apt install openjdk-17-jre-headless
      jdk17 설치





<br>


![깃허브 클론](https://github.com/oals/EC2-instance2/assets/136543676/e5933067-0e1d-4d83-bab7-d328c7f3603a)


<br>



       git clone 레포지토리 주소
       실행할 파일을 깃허브에서 받아옵니다.





<br>




![그래들 오류](https://github.com/oals/EC2-instance2/assets/136543676/201ace7b-90a2-4a96-b0df-da673cf9a09b)



<br>




       프로젝트 파일안의 gradle 파일 위치로 이동 후 
       ./gradlew build 

       하지만 권한을 변경해야 합니다.





<br>



![권한 변경 후 그래들 빌드](https://github.com/oals/EC2-instance2/assets/136543676/7c34abba-5543-4af9-bdf6-0016fa3f5c25)



<br>




       sudo chmod +x gradlew
       권한 변경

       ./gradlew build 
       그래들 빌드







<br>



![그래들 빌드 완료](https://github.com/oals/EC2-instance2/assets/136543676/d61ee623-d975-42af-bb1c-e1e6112a8bb6)


<br>

       빌드 완료

<br>




#  마리아 DB 설치

![mariadb 설치](https://github.com/oals/EC2-instance2/assets/136543676/f718248e-a4aa-4d62-ba5e-af8c0ae87a0b)


<br>

        sudo apt install mariadb-client
        Maria DB 설치


<br>




![마리아 db 설치 확인](https://github.com/oals/EC2-instance2/assets/136543676/82539a25-66f2-4413-9bea-7fa0359e7b5b)


<br>

       설치 확인


<br>




![마리아 접속완료](https://github.com/oals/EC2-instance2/assets/136543676/72eaf8b9-2ed3-4644-af4f-84bcb3e9f4b6)


<br>

       mysql -u 사용자명 -p -h 엔드포인트

       RDS 생성 시 설정한 사용자 명입니다

<br>




![마리아 권한 변경1](https://github.com/oals/EC2-instance2/assets/136543676/a77f5b9c-002a-48f3-87cd-0e1989986766)

<br>

       localhost에서만 접속 가능한 계정을 어디에서든 접속 가능하게 변경했습니다.
       

<br>



![설정](https://github.com/oals/EC2-instance2/assets/136543676/8c05caee-1308-4b7d-87fe-9ceb9f979d47)



<br>


       application.properties의 url, 아이디, 비밀번호 변경


<br>




# 서버 배포



![JAR파일 실행](https://github.com/oals/EC2-instance2/assets/136543676/d5f97f4a-00f3-47d5-addf-18ef5dfa4a6b)


<br>


       java -jar library-0.0.1-SNAPSHOT.jar
       ./gradlew build를 통해 생성된 jar 파일 실행
       


<br>



![서버 정상 실행](https://github.com/oals/EC2-instance2/assets/136543676/f941368d-7959-402f-82d0-eb1a99033d83)


<br>

       정상 실행


<br>



![접속아이피](https://github.com/oals/EC2-instance2/assets/136543676/16537441-2223-44a0-b4bd-1264b27ee167)

<br>



       퍼블릭 IPv4 DNS 주소를 통해 접속



<br>


# 실행


![실행](https://github.com/oals/EC2-instance2/assets/136543676/bd0a528d-8286-4e5e-9384-18f8b7dedafe)



# 프로젝트를 통해 느낀 점과 소감


인생 처음으로 서버 배포를 해봤다.<br>
서버 배포에 관해 아무런 지식이 없었기 때문에 구글링을 정말 많이 했다.<br>

몇가지 기억나는 점은 

1. 처음 RDS를 생성하고 설정할 때 퍼블릭 엑세스를 사용하지 않음으로 설정해둔 것
2. properties-application 설정을 변경하지 않은 것

<br>

서버 배포의 여러가지 방법이 있던데 다른 방법도 시간 날 때 해봐야 겠다..












