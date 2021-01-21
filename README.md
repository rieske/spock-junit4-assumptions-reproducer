### Problem

Unsatisfied JUnit4 assumptions fail the test instead of skipping it when coming from a setup method in a super spec.

### Reproducer

Works:
```
./gradlew test --tests "SuperSpec"
```

Fails:
```
./gradlew test --tests "SubSpec"


SubSpec > super feature FAILED
    org.junit.AssumptionViolatedException at Assume.java:106

SubSpec > sub feature FAILED
    org.junit.AssumptionViolatedException at Assume.java:106
```
