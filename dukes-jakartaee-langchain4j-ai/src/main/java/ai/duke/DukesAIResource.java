package ai.duke;

import dev.langchain4j.model.openai.OpenAiLanguageModel;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("ai")
public class DukesAIResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI(@QueryParam("message") String message) {

        OpenAiLanguageModel model = OpenAiLanguageModel.builder().apiKey(System.getenv("OPENAI_API_KEY")).build();
        return model.generate(message).content();
    }
}