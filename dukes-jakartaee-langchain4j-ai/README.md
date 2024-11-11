# dukes-jakartaee-langchain4j-ai

Calling OpenAI from a Jakarta EE application using LangChain4J.

## Build and run

```
# Open Liberty
mvn clean package liberty:run

# Payara
mvn clean package cargo:run

# WildFly
mvn clean packge wildfly:run
```

## Test

```
http :8080/dukes/ai message=='Tell me a Joke'
```

