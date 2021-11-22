# 🧥 너의사이준훈
### 📔 초기 라이브러리 설정
```
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.boot:spring-boot-starter-web'
compileOnly 'org.projectlombok:lombok'
developmentOnly 'org.springframework.boot:spring-boot-devtools'
runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
annotationProcessor 'org.projectlombok:lombok'
testImplementation 'org.springframework.boot:spring-boot-starter-test'
```

### 💻 백엔드 실행
#### gradle build 
```
java -jar {Project Name}
```

### Server Projects Directory
```shell
home/opc/projects
```

### Server Service Create
```shell
Description=Java Application Service
After=network.target

[Service]
ExecStart=/bin/bash -c "java -jar /home/opc/projects/sizunhun.jar"

User=root
Group=root

[Install]
WantedBy=multi-user.target

```
### Service Start
```shell
systemctl daemon-reload #Service 변경 사항 반영
systemctl enable sizunhun.service # service 등록
systemctl start sizunhun.service # service 실행
systemctl status sizunhun.service # service 상태 확인
```
