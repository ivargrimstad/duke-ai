package dukes.data;

import dev.langchain4j.model.openai.OpenAiLanguageModel;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("ai")
public class JokeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String joke() {

        OpenAiLanguageModel model = OpenAiLanguageModel.withApiKey(System.getenv("OPENAI_API_KEY"));

        return model.generate("Tell me a Joke").content();
    }
}