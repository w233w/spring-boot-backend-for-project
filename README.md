# Description

## Author
[Yang Ye](https://github.com/w233w)

A part of MET_CS_601 Summer season term project.

This project is about a spring-boot backend app deployed on Azure. The app is connected to Azure MySQL server.

## Server url
https://spring-mybatis-1659598207454.azurewebsites.net/

## MySQL url:
jdbc:mysql://my-db-term-project.mysql.database.azure.com:3306/project?serverTimezone=UTC&useSSL=false
Both username and password are non-secret (not match any of my real password). Feel free to try.
username: yang@my-db-term-project
password: YY_123456

## Detail
This application offer two http request api. '/add' and '/list'. Both api required POST method.

'/add' is used to data in to MySQL which take JSON of form input as input.

'/list' is used to search database by input Json with only one key: 'username'. It will return JSON with all review made by that person.

## Front-end vue project:
https://github.com/w233w/cs601-term-project

## To run locally
> Default using port 8080, make sure you are not running other serve on 8080
```shell
mvn spring-boot:run
```

## To run MySQL locally
goto 'src/main/resources/application.yml'

change url to 'jdbc:mysql://localhost:3306/project?' 

*'project' is the name of schema, please replace with your schema. Also, the schema required table `user_feedback`. Please create a table as following: 
```mysql
CREATE TABLE `user_feedback` (
  `username` varchar(500),
  `rate` varchar(500) NOT NULL,
  `msg` varchar(500),
  `email` varchar(500),
  `tms` varchar(500) NOT NULL
) ;
```

## To update & redeploy
> Since the Azure server is belongs to mine, you may not able to run this command below. Except you can log in to my microsoft account.
```shell
mvn package azure-webapp:deploy
```
