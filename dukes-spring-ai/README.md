# dukes-spring-ai

Calling OpenAI from a Spring application using Spring AI.

## Build and run

```
# Payara
mvn clean package
java -jar target/dukes-spring-ai-0.0.1-SNAPSHOT.jar
```

## Test

```
http :8080/dukes/ai message=='Tell me a Joke'
```