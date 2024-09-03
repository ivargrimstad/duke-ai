package dukes;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface JokeService {

    @UserMessage("Tell me a Joke")
    String tellJoke();
}
