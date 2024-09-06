# dukes-helidon-ai

Calling OpenAI from a Jakarta EE application using Spring AI injected by CDI.

## Build and run

```
# Payara
mvn clean package cargo:run
```

## Test

```
http :8080/dukes/ai message=='Tell me a Joke'
```

