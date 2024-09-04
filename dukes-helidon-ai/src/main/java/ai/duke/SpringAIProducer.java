package ai.duke;

import ai.duke.dukespringai.SpringApplicatonConfig;
import ai.duke.dukespringai.SpringJokeService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ApplicationScoped
public class SpringAIProducer {

    private AnnotationConfigApplicationContext springCtx;

    @Produces
    public SpringJokeService getJokeController() {
        return springCtx.getBean(SpringJokeService.class);
    }

    @PostConstruct
    public void init() {
        springCtx = new AnnotationConfigApplicationContext();
        springCtx.register(SpringApplicatonConfig.class);
        springCtx.refresh();
    }

}
