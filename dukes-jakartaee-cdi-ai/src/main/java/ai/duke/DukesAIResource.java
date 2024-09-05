package ai.duke;

import dev.langchain4j.model.openai.OpenAiLanguageModel;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("ai")
public class DukesAIResource {

    @Inject
    private OpenAiLanguageModel model;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String joke(@QueryParam("message") String message) {

        return model.generate(message).content();
    }
}