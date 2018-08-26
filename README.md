# Project Description
I want to compare two lines for equality based on the end points,
So that I know when two lines are the equal.

## Dev Environment Setup for OS X.
* Java v10
```
$ brew cask install java
```
At present(22/08/2018) it will directly install java 10. Please verify the version if you are using it later.

[To install java please refer](https://docs.oracle.com/javase/10/install/overview-jdk-10-and-jre-10-installation.htm)
* Gradle v4.9

[To install gradle please refer](https://gradle.org/install/)

## Test instructions
```
$ ./gradlew clean test
```

## Build instructions
```
$ ./gradlew build
```

## Code Coverage instructions
```
$ ./gradlew clean build jacocoTestReport
```

## Code complexity
```
$ ./gradlew clean build check
```

### Author
Vrushali
