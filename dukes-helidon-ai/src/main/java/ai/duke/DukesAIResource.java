package ai.duke;

import ai.duke.spring.SpringAIService;
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

    @Inject
    private SpringAIService springModel;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI(@QueryParam("message") String message) {

//        OpenAiLanguageModel model = OpenAiLanguageModel.withApiKey(System.getenv("OPENAI_API_KEY"));
//        return model.generate(message).content();
        return springModel.call(message);
    }
}