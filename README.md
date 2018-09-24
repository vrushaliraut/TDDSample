# Project Description
I want to compare two lines for equality based on the end points,
So that I know when two lines are the equal.

## Motive of project
This is very simple exercise example. 
The main goal behind this example was to follow the TDD patteren with baby steps.
1. git history will help here to understand how this project evolved towards the solution.
2. This project follows the clean architecture of best practices.
3. This exercise we have done in Bootcamp course
It helps us to think on small thing's which we always miss while solving big problems:)  
*Non-negotiable Etiquette List (fail == rm -rf)*
```
* Indentation and spacing between code constructs (classes/methods/specs) must be consistent
* Use only spaces (no tabs) for indentation
* Newlines at end of file
* Follow accepted naming conventions for your language/framework
* Follow accepted naming file and Directory structure for your language/framework
* Use namespaces
* No comments/Unused Code must ever be checked in
* Runtime environment should be consistent with IDE environment - i.e there should be no difference in running a build or a spec from your IDE and from the command line
* Use .gitignore
* Ensure there is a Readme.md that includes
  * Problem Description
  * Dev environment setup
  * Build instructions
  * Run instructions
• BDD (this should show in clear pattern in the commit log - one spec, one code change per commit)
• Only English
• No cross conversations
```

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
