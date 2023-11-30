

# EC2 인스턴스 서버 구동

# 인스턴스 생성

![인스턴스 생성](https://github.com/oals/EC2-instance/assets/136543676/17055d1e-466d-4fbd-b53b-902291b3bf42)



       우분투 서버로 열었습니다.



![인스턴스 생성 확인](https://github.com/oals/EC2-instance/assets/136543676/f200a84d-bc50-47b2-9300-a27cde0a3eae)


      왼쪽 목록의 인스턴스 항목에서 생성된 인스턴스를 확인 할 수 있습니다. 




# 보안 그룹 설정


![보안 그룹](https://github.com/oals/EC2-instance/assets/136543676/fbe915b4-b35b-422e-bda6-9b4f8d253bd7)




      왼쪽 목록의 하단 보안그룹 항목 





![보안그룹 설정1](https://github.com/oals/EC2-instance/assets/136543676/e4e0998b-bea4-42e3-8758-6a46cb51a546)




      사용 할 인스턴스의 보안 그룹 이름 확인 후 해당 보안그룹의 인바운드 규칙을 편집 합니다.




![보안그룹 설정2](https://github.com/oals/EC2-instance/assets/136543676/c47f9d5d-d370-4a68-b03d-08afb25bb3ea)




      규칙 추가 -> 모든 트래픽 -> AnyWhere-IPv4 설정 





# RDS 생성


![rds 검색](https://github.com/oals/EC2-instance/assets/136543676/1d942c49-009a-4270-953f-95bf6f8fe2e9)

![db 생성1](https://github.com/oals/EC2-instance/assets/136543676/5941ebf7-d200-43f8-b395-1c0a6442a688)

![db 보안그룹](https://github.com/oals/EC2-instance/assets/136543676/d765cbc5-eec9-478c-b579-eb6a17aaad76)

![db 보안그룹2](https://github.com/oals/EC2-instance/assets/136543676/6a6d7c8f-a9cc-4472-95c5-2c7b084b0e32)

![db 보안그룹 편집](https://github.com/oals/EC2-instance/assets/136543676/13978ce4-c0ba-40b9-9d1b-52d327aa1b98)


![생성된 db](https://github.com/oals/EC2-instance/assets/136543676/b9192fb6-0491-42af-b7d5-1f61ebabd242)

![db 완성 편집](https://github.com/oals/EC2-instance/assets/136543676/7b19a30b-e3cd-486d-80c5-5aa47298f8a1)






# 인스턴스 연결

![인스턴스 연결](https://github.com/oals/EC2-instance/assets/136543676/666fd2dd-c9d9-4574-9ddb-1fcd31b36810)

![update](https://github.com/oals/EC2-instance/assets/136543676/fa5699b2-7ec1-41dd-8121-0cd4857aa283)


      sudo apt update
      설치 가능한 패키지 리스트를 최신화하는 명령어 입니다.


![jdk 설치](https://github.com/oals/EC2-instance/assets/136543676/6fab29c2-fec9-404d-8826-634d965c6217)







![jdk 확인](https://github.com/oals/EC2-instance/assets/136543676/4f96ef0c-8e1e-4e6b-93a5-8a03199baf97)


      sudo apt install openjdk-17-jre-headless
      jdk를 설치하는 명령어 입니다
      위 명령어는 jdk17을 설치하는 명령어 입니다.




![깃허브 클론](https://github.com/oals/EC2-instance/assets/136543676/89721a51-2f1c-48ff-909a-e1f319604bd5)

![그래들 오류](https://github.com/oals/EC2-instance/assets/136543676/f034eb75-732a-4f0e-99a1-9307927c7ea4)

![권한 변경 후 그래들 빌드](https://github.com/oals/EC2-instance/assets/136543676/105fcc32-6a16-48ae-94b7-97417780aeff)

![그래들 빌드 완료](https://github.com/oals/EC2-instance/assets/136543676/26559d5e-598c-46ff-89c3-082bc27bb8f2)




# 마리아 DB 설치

![mariadb 설치](https://github.com/oals/EC2-instance/assets/136543676/305a5a05-f483-4045-a89b-9e07293c6d74)

![마리아 db 설치 확인](https://github.com/oals/EC2-instance/assets/136543676/f6d6af57-a916-426b-bf11-21af462a798c)

![마리아 접속완료](https://github.com/oals/EC2-instance/assets/136543676/1ad3679e-f2a1-4238-ad64-5d47c3b1b0bf)

![마리아 권한 변경1](https://github.com/oals/EC2-instance/assets/136543676/306c2c33-3270-49c5-b2fa-d168eba79682)



# 서버 실행



![JAR파일 실행](https://github.com/oals/EC2-instance/assets/136543676/83d7f955-e981-4689-8d42-f7db6fc55148)

![서버 정상 실행](https://github.com/oals/EC2-instance/assets/136543676/e516fb5f-53e2-4f49-b0c7-d0b2039b1302)

![접속아이피](https://github.com/oals/EC2-instance/assets/136543676/18bc4ee9-8d02-4e1b-ac08-790923633806)








