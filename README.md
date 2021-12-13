# maven-multi-module-unittest-integrationtest-jacoco

Demo of 'Maven multi module' project WITH unit- and/or integration testing with FindBugs and Jacoco code coverage

# Results

   * Project copmlete Jacoco datafile : project-base / target / aggregate-exec / aggregate.exec
   * Project complete Jacoco report   ; project-base / test-reporting / target / site / jacoco-aggregate / index.html
   * FindBugs report
   
# Run

   * mvn clean install                      => unit testing + reporting
   * mvn clean install -P integration test  => integration testing + reporting
   * mvn clean install -P test-all          => unit AND integration testing + (combined) reporting !
   
# Overview: 
<img src="TestResults.png" alt="Overview of the results"/>)

# Branches: 

There are a few alternatives (in branches) available: 

  * Behavior as shown above
  * Multi module with only unit tests (with the Surefire plugin in the root pom.xml)
  * Multi module with only unit tests with the Surefire plugin in the pom.xml of each module

In all cases, the result is available 
