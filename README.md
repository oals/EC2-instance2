

# EC2 인스턴스 서버 배포


목차<br>

<hr>

[1.인스턴스 생성](#인스턴스-생성)<br>
[2.인스턴스 보안그룹 설정](#인스턴스-보안그룹-설정)<br>
[3.RDS 생성](#RDS-생성)<br>
[4.RDS 보안 그룹 설정](#RDS-보안-그룹-설정)<br>
[5.인스턴스 연결 및 JDK, Gradle](#인스턴스-연결-및-JDK,-Gradle)<br>
[6.마리아 DB 설치](#마리아-DB-설치)<br>
[7.서버 배포](#서버-배포)<br>
[8.실행화면](#실행화면)<br>




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


      왼쪽 목록의 하단 보안그룹 항목 


<br>


![보안그룹 설정1](https://github.com/oals/EC2-instance2/assets/136543676/5b9367fd-784c-4310-8878-fb3c3a54cc66)

<br>

      사용 할 인스턴스의 보안 그룹 이름 확인 후 해당 보안그룹의 인바운드 규칙을 편집 합니다.


<br>

![보안그룹 설정2](https://github.com/oals/EC2-instance2/assets/136543676/38b9474d-0a9e-4e49-b6df-e80985d198fc)


<br>

      규칙 추가 -> 모든 트래픽 -> AnyWhere-IPv4 설정 


<br>


# RDS 생성


![rds 검색](https://github.com/oals/EC2-instance2/assets/136543676/21234639-44de-4688-aa70-f3a65dce5564)

<br>

       왼족 상던 검색창에 RDS 검색
<br>

![db 생성1](https://github.com/oals/EC2-instance2/assets/136543676/a907fdb1-a9ad-43b8-84b9-ac03a843c16e)

<br>

       마리아 DB를 사용했습니다.

<br>

![퍼블릭 엑세스](https://github.com/oals/EC2-instance2/assets/136543676/984f12f3-0674-4afa-9bbe-e1737a521684)

<br>

       외부에서 연결하기 위해 퍼블릭 엑세스를 사용하도록 합니다.
<br>


![인코딩 설정](https://github.com/oals/EC2-instance2/assets/136543676/fc899016-0467-40dc-9f1b-794485f0d46f)

<br>

       DB의 인코딩 설정이 필요한데 저는 설정 파일을 따로 만들어 연결시켰습니다.

<br>

![생성된 db](https://github.com/oals/EC2-instance2/assets/136543676/32a11518-9df1-4720-98eb-980ddfba4fe6)

<br>

       DB 생성 완료

<br>



# RDS 보안 그룹 설정



![db 보안그룹](https://github.com/oals/EC2-instance2/assets/136543676/df81fda5-b13b-49d0-ad56-b0bd7519e6a9)

<br>

       해당 DB의 인바운드 규칙을 편집합니다.

<br>



![db 보안그룹2](https://github.com/oals/EC2-instance2/assets/136543676/67f26d4a-8e9a-4682-ab99-d1ebbecba234)



![db 보안그룹 편집](https://github.com/oals/EC2-instance2/assets/136543676/ba3b2bc0-025c-4d0a-ab48-c68b71e4dc62)



<br>

       테스트용 서버이기에 보안 신경쓰지 않고 최대한 연결 오류 없도록 규칙을 생성했습니다.


<br>





![db 완성 편집](https://github.com/oals/EC2-instance2/assets/136543676/91de3021-c26c-4d42-b48c-2f280610dc21)


<br>

       위 엔드포인트 값을 통해 외부에서 DB에 접속 가능합니다.

<br>




#  인스턴스 연결 및 JDK, Gradle

![인스턴스 연결](https://github.com/oals/EC2-instance2/assets/136543676/3bbeecc0-45ed-431d-99eb-59bccef1575e)




![우분투update](https://github.com/oals/EC2-instance2/assets/136543676/e977f93f-5f88-475a-9a89-d9ebf1915713)

<br>


      sudo apt update
      설치 가능한 패키지 리스트를 최신화하는 명령어 입니다.



<br>

![jdk 설치](https://github.com/oals/EC2-instance2/assets/136543676/6c92f48f-440f-4ec8-9771-ed00ec4550ee)

![jdk 버전 확인](https://github.com/oals/EC2-instance2/assets/136543676/744c03d7-8a5a-424e-a03e-32d7702404c2)

<br>



      sudo apt install openjdk-17-jre-headless
      jdk를 설치하는 명령어 입니다
      위 명령어는 jdk17을 설치하는 명령어 입니다.





<br>


![깃허브 클론](https://github.com/oals/EC2-instance2/assets/136543676/e5933067-0e1d-4d83-bab7-d328c7f3603a)


<br>



       git clone 레포지토리 주소
       실행할 파일을 깃허브에서 받아옵니다.





<br>




![그래들 오류](https://github.com/oals/EC2-instance2/assets/136543676/201ace7b-90a2-4a96-b0df-da673cf9a09b)



<br>




       프로젝트 파일안의 gradle 파일을 찾아준 후 
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
        마리아db 설치


<br>




![마리아 db 설치 확인](https://github.com/oals/EC2-instance2/assets/136543676/82539a25-66f2-4413-9bea-7fa0359e7b5b)


<br>

       설치 확인


<br>




![마리아 접속완료](https://github.com/oals/EC2-instance2/assets/136543676/72eaf8b9-2ed3-4644-af4f-84bcb3e9f4b6)


<br>

       mysql -u 사용자명 -p -h 엔드포인트

       RDS 생성 시 사용자 명입니다

<br>




![마리아 권한 변경1](https://github.com/oals/EC2-instance2/assets/136543676/a77f5b9c-002a-48f3-87cd-0e1989986766)

<br>

       localhost에서만 접속 가능한 상태를 어디에서든 접속 가능하게 변경해줍니다.
       

<br>



![설정](https://github.com/oals/EC2-instance2/assets/136543676/8c05caee-1308-4b7d-87fe-9ceb9f979d47)



<br>


       application.properties 파일의 DB 주소와 아이디,비밀번호를 변경했습니다.


<br>




# 서버 배포



![JAR파일 실행](https://github.com/oals/EC2-instance2/assets/136543676/d5f97f4a-00f3-47d5-addf-18ef5dfa4a6b)


<br>


       java -jar library-0.0.1-SNAPSHOT.jar
       그래들 빌드를 통해 생성된 jar 파일을 실행
       


<br>



![서버 정상 실행](https://github.com/oals/EC2-instance2/assets/136543676/f941368d-7959-402f-82d0-eb1a99033d83)


<br>

       DB 연결 오류 없이 정상 실행


<br>



![접속아이피](https://github.com/oals/EC2-instance2/assets/136543676/16537441-2223-44a0-b4bd-1264b27ee167)

<br>



       퍼블릭 IPv4 DNS 주소를 통해 접속 할 수 있습니다.



<br>


# 실행 화면


![실행](https://github.com/oals/EC2-instance2/assets/136543676/bd0a528d-8286-4e5e-9384-18f8b7dedafe)



# 프로젝트를 통해 느낀 점과 소감


인생 처음으로 서버 배포를 해봤다.<br>
서버 배포에 관해 아무런 지식이 없었기 때문에 총 6시간 정도 걸렸다.<br>

1. 처음 RDS를 생성하고 설정할 때 퍼블릭 엑세스를 사용하지 않음으로 설정해둔 것
2. properties-application 설정을 변경하지 않은 것

<br>
위 두 상황에서 시간을 많이 보냈지만 서버를 배포해보니 신기하다는 생각이 많이 든다













