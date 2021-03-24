# backend
Backend for johnclaro.com

[![Test](https://github.com/johnclaro/backend/actions/workflows/test.yml/badge.svg)](https://github.com/johnclaro/backend/actions/workflows/test.yml) [![Deploy](https://github.com/johnclaro/backend/actions/workflows/deploy.yml/badge.svg)](https://github.com/johnclaro/backend/actions/workflows/deploy.yml)



## Getting started

JDK 1.11.0
```bash-session
mvn package
java -jar target/backend-0.0.1-SNAPSHOT.jar
```


## SSH
```bash-session
ssh-keygen -t rsa -C 'jkrclaro@gmail.com'
base64 -w0 .ssh/id_rsa
echo $(cat .ssh/id_rsa.pub) >> .ssh/authorized_keys
```