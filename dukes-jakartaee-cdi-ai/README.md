# dukes-jakartaee-cdi-ai

Calling OpenAI from a Jakarta EE application using LangChain4J in combination with CDI.

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

