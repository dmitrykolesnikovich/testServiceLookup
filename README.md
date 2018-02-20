### testServiceLookup

Demonstration of Java ServiceLoader concept https://docs.oracle.com/javase/8/docs/api/java/util/ServiceLoader.html

To see that is not type safety uncomment first line in file `src/main/resources/META-INF/services/test.testServiceLookup.MyService`

### How to run 

- Windows

`compile & run`

- Crossplatform

```
mvn compile -DskipTests -DuseIncrementalCompilation=false
mvn exec:java -Dexec.mainClass="test.testServiceLookup.Main"
```
