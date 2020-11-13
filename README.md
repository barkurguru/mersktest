# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.12.BUILD-SNAPSHOT/maven-plugin/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

Configuration the Application:
1)Build the project , using any IDE (clean install)
2)Once sucessfully build, run the TestApplication main class as Spring boot app, will run on port 8090, if everything is fine.
3)Using Postman, prepare this json request and hit submit button (for URL: http://localhost:8090/currency/getCurrencySum) json=[{"currency":"USD","amount": "10"},{"currency":"USD","amount": "20"},{"currency":"USD","amount": "30"},{"currency":"EUR","amount": "10"},{"currency":"INR","amount": "10"},{"currency":"EUR","amount": "10"},{"currency":"INR","amount": "60"},{"currency":"EUR","amount": "20"}]
4)Response is distinct currency name with sum of its values as json.
5)Apart from the above, the packages com.demo.Test.roots, com.demo.Test.alert, com.demo.Test.movie, com.demo.Test.weather (takeTemperatureMeasurement() method will be executed every 50 milisecs) have answer for each question(Movie haas some issue).
