

# EC2 인스턴스 서버 구동

# 인스턴스 생성

![인스턴스 생성](https://github.com/oals/EC2-instance2/assets/136543676/b3df3d61-130e-45dc-a7c2-c84ba3547ba5)


       우분투 서버로 열었습니다.



![인스턴스 생성 확인](https://github.com/oals/EC2-instance2/assets/136543676/f73cbc7f-7ae1-43e6-a642-038f0695187b)


      왼쪽 목록의 인스턴스 항목에서 생성된 인스턴스를 확인 할 수 있습니다. 




# 보안 그룹 설정


![보안 그룹](https://github.com/oals/EC2-instance2/assets/136543676/34b4dde1-87a2-4e3e-8697-2694e8cd28df)




      왼쪽 목록의 하단 보안그룹 항목 





![보안그룹 설정1](https://github.com/oals/EC2-instance2/assets/136543676/5b9367fd-784c-4310-8878-fb3c3a54cc66)



      사용 할 인스턴스의 보안 그룹 이름 확인 후 해당 보안그룹의 인바운드 규칙을 편집 합니다.




![보안그룹 설정2](https://github.com/oals/EC2-instance2/assets/136543676/38b9474d-0a9e-4e49-b6df-e80985d198fc)




      규칙 추가 -> 모든 트래픽 -> AnyWhere-IPv4 설정 





# RDS 생성


![rds 검색](https://github.com/oals/EC2-instance2/assets/136543676/21234639-44de-4688-aa70-f3a65dce5564)

![db 생성1](https://github.com/oals/EC2-instance2/assets/136543676/a907fdb1-a9ad-43b8-84b9-ac03a843c16e)

![퍼블릭 엑세스](https://github.com/oals/EC2-instance2/assets/136543676/984f12f3-0674-4afa-9bbe-e1737a521684)

![인코딩 설정](https://github.com/oals/EC2-instance2/assets/136543676/fc899016-0467-40dc-9f1b-794485f0d46f)


![생성된 db](https://github.com/oals/EC2-instance2/assets/136543676/32a11518-9df1-4720-98eb-980ddfba4fe6)

![db 보안그룹](https://github.com/oals/EC2-instance2/assets/136543676/df81fda5-b13b-49d0-ad56-b0bd7519e6a9)
![db 보안그룹2](https://github.com/oals/EC2-instance2/assets/136543676/67f26d4a-8e9a-4682-ab99-d1ebbecba234)
![db 보안그룹 편집](https://github.com/oals/EC2-instance2/assets/136543676/ba3b2bc0-025c-4d0a-ab48-c68b71e4dc62)


![db 완성 편집](https://github.com/oals/EC2-instance2/assets/136543676/91de3021-c26c-4d42-b48c-2f280610dc21)



# 인스턴스 연결

![인스턴스 연결](https://github.com/oals/EC2-instance2/assets/136543676/3bbeecc0-45ed-431d-99eb-59bccef1575e)

![우분투update](https://github.com/oals/EC2-instance2/assets/136543676/e977f93f-5f88-475a-9a89-d9ebf1915713)


      sudo apt update
      설치 가능한 패키지 리스트를 최신화하는 명령어 입니다.



![jdk 설치](https://github.com/oals/EC2-instance2/assets/136543676/6c92f48f-440f-4ec8-9771-ed00ec4550ee)

![jdk 버전 확인](https://github.com/oals/EC2-instance2/assets/136543676/744c03d7-8a5a-424e-a03e-32d7702404c2)


      sudo apt install openjdk-17-jre-headless
      jdk를 설치하는 명령어 입니다
      위 명령어는 jdk17을 설치하는 명령어 입니다.




![깃허브 클론](https://github.com/oals/EC2-instance2/assets/136543676/e5933067-0e1d-4d83-bab7-d328c7f3603a)
![그래들 오류](https://github.com/oals/EC2-instance2/assets/136543676/201ace7b-90a2-4a96-b0df-da673cf9a09b)

![권한 변경 후 그래들 빌드](https://github.com/oals/EC2-instance2/assets/136543676/7c34abba-5543-4af9-bdf6-0016fa3f5c25)
![그래들 빌드 완료](https://github.com/oals/EC2-instance2/assets/136543676/d61ee623-d975-42af-bb1c-e1e6112a8bb6)




# 마리아 DB 설치

![mariadb 설치](https://github.com/oals/EC2-instance2/assets/136543676/f718248e-a4aa-4d62-ba5e-af8c0ae87a0b)

![마리아 db 설치 확인](https://github.com/oals/EC2-instance2/assets/136543676/82539a25-66f2-4413-9bea-7fa0359e7b5b)
![마리아 접속완료](https://github.com/oals/EC2-instance2/assets/136543676/72eaf8b9-2ed3-4644-af4f-84bcb3e9f4b6)

![마리아 권한 변경1](https://github.com/oals/EC2-instance2/assets/136543676/a77f5b9c-002a-48f3-87cd-0e1989986766)


![설정](https://github.com/oals/EC2-instance2/assets/136543676/8c05caee-1308-4b7d-87fe-9ceb9f979d47)

# 서버 실행



![JAR파일 실행](https://github.com/oals/EC2-instance2/assets/136543676/d5f97f4a-00f3-47d5-addf-18ef5dfa4a6b)

![서버 정상 실행](https://github.com/oals/EC2-instance2/assets/136543676/f941368d-7959-402f-82d0-eb1a99033d83)
![접속아이피](https://github.com/oals/EC2-instance2/assets/136543676/16537441-2223-44a0-b4bd-1264b27ee167)

![실행](https://github.com/oals/EC2-instance2/assets/136543676/bd0a528d-8286-4e5e-9384-18f8b7dedafe)



