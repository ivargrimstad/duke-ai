package ai.duke;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class OpenAIClient {


    public String callOpenAI() {

        Completion completion = new Completion();
        completion.setModel("gpt-4o");

        Completion.Message message = new Completion.Message();
        message.setRole("user");
        message.setContent("Tell me a Joke");

        List<Completion.Message> messages = new ArrayList<>();
        messages.add(message);
        completion.setMessages(messages);

        Client client = ClientBuilder.newClient();
        Response res = client
                .target("https://api.openai.com/v1/chat/completions")
                .request("application/json")
                .header("Authorization", "Bearer " + System.getenv("OPENAI_API_KEY"))
                .post(Entity.entity(completion, MediaType.APPLICATION_JSON_TYPE));

        return res.readEntity(CompletionResponse.class).getChoices().getFirst().getMessage().getContent();
    }

}
