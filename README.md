# π§₯ λμμ¬μ΄μ€ν
### π μ΄κΈ° λΌμ΄λΈλ¬λ¦¬ μ€μ 
```
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.boot:spring-boot-starter-web'
compileOnly 'org.projectlombok:lombok'
developmentOnly 'org.springframework.boot:spring-boot-devtools'
runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
annotationProcessor 'org.projectlombok:lombok'
testImplementation 'org.springframework.boot:spring-boot-starter-test'
```

### π» λ°±μλ μ€ν
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
systemctl daemon-reload #Service λ³κ²½ μ¬ν­ λ°μ
systemctl enable sizunhun.service # service λ±λ‘
systemctl start sizunhun.service # service μ€ν
systemctl status sizunhun.service # service μν νμΈ
```
