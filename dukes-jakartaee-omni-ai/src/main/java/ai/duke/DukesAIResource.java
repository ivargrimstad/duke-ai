package ai.duke;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.omnifaces.ai.AIProvider;
import org.omnifaces.ai.AIService;
import org.omnifaces.ai.cdi.AI;

@Path("ai")
public class DukesAIResource {



    @AI(provider = AIProvider.OPENAI,
            apiKey = "${System.getenv('OPENAI_API_KEY')}",
            model = "gpt-5.2"
    )
    @Inject
    private AIService aiService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI(@QueryParam("message") String message) {

        return aiService.chat(message);
    }
}