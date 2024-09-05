package ai.duke;

import ai.duke.spring.SpringAIService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("ai")
public class DukesAIResource {

    @Inject
    private SpringAIService springModel;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String joke(@QueryParam("message") String message) {

        return springModel.tellJoke(message);
    }
}