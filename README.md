# backend

[![Test](https://github.com/johnclaro/backend/actions/workflows/test.yml/badge.svg)](https://github.com/johnclaro/backend/actions/workflows/test.yml) [![Deploy](https://github.com/johnclaro/backend/actions/workflows/deploy.yml/badge.svg)](https://github.com/johnclaro/backend/actions/workflows/deploy.yml)

Backend for johnclaro.com

## Getting started

To start
```bash-session
mvn package -P build
java -jar target/backend-0.0.1-SNAPSHOT.jar
```

To run test
```bash-session
mvn clean test -P test
```

## Requirements

JDK **1.11.0**

## SSH
```bash-session
ssh-keygen -t rsa -C 'jkrclaro@gmail.com'
base64 -w0 .ssh/id_rsa
echo $(cat .ssh/id_rsa.pub) >> .ssh/authorized_keys
```