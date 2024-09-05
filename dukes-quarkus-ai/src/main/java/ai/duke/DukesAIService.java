package ai.duke;

import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface DukesAIService {

    String call(@UserMessage String message);
}
