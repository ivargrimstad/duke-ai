# dukes-jakartaee-ai

Calling OpenAI from a Jakarta EE application using simiple REST calls.

## Build and run

```
# Open Liberty
mvn clean package liberty:run

# Payara
mvn clean package cargo:run
```

## Test

```
http :8080/dukes/ai message=='Tell me a Joke'
```

