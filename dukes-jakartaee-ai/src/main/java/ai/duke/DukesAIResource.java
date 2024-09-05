package ai.duke;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("ai")
public class DukesAIResource {

    @Inject
    private OpenAIClient openAIClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String joke(@QueryParam("message") String message) {

        return openAIClient.callOpenAI();
    }
}