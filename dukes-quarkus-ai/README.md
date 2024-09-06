# dukes-quarkus-ai

Calling OpenAI from a Quarkus application.

## Build and run

```
# Payara
mvn clean package quarkus:run
```

## Test

```
http :8080/dukes/ai message=='Tell me a Joke'
```