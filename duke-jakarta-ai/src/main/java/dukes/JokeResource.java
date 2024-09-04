package dukes;

import dev.langchain4j.model.openai.OpenAiLanguageModel;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("ai")
public class JokeResource {

    @Inject
    private OpenAiLanguageModel model;

//    @Inject
//    private SpringJokeService springModel;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String joke(@QueryParam("message") String message) {

//        OpenAiLanguageModel model = OpenAiLanguageModel.withApiKey(System.getenv("OPENAI_API_KEY"));
        return model.generate(message).content();
//          return springModel.tellJoke(message);
    }
}