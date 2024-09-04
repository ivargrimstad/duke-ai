package ai.duke;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface JokeService {

    String tellJoke(@UserMessage String message);
}
