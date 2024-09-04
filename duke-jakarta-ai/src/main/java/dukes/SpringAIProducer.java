package dukes;

import ai.duke.dukespringai.DukeWithSpringAiApplication;
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
        springCtx.register(DukeWithSpringAiApplication.class);
        springCtx.refresh();
    }

}
