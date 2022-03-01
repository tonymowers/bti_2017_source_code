# Lesson 02

I created the initial template of this course by following the [Spring Quickstart](https://spring.io/quickstart).

## Start It

MacOS
```bash
./mvnw spring-boot:run
```

Windows
```bash
mvnw spring-boot:run
```

Browse Web Page
```
http://localhost:8080/hello
```

## Run Unit Tests

```bash
./mvnw test
```

## Run Feature Tests

```bash
./mvww -Pfeatures test
```

## Exercise 

Using the feature test, that has been written using our simplified ScreenPlay pattern, 
convert it so that the same test could be used to exercise the feature using both a Rest API based actor
and Service Based Actor. (hint: refactor test to use an interface and consider making an abstract test)

While doing your coding try to practice Uncle Bob's nano-cycle and micro-cycle coding style.
See his blog entry [Coding Cycles](https://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html).

