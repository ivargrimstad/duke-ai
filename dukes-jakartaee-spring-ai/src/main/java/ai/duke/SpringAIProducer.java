package ai.duke;

import ai.duke.spring.SpringAIApplication;
import ai.duke.spring.SpringAIService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ApplicationScoped
public class SpringAIProducer {

    private AnnotationConfigApplicationContext springCtx;

    @Produces
    public SpringAIService getSpringAIService() {
        return springCtx.getBean(SpringAIService.class);
    }

    @PostConstruct
    public void init() {
        springCtx = new AnnotationConfigApplicationContext();
        springCtx.register(SpringAIApplication.class);
        springCtx.refresh();
    }

}
