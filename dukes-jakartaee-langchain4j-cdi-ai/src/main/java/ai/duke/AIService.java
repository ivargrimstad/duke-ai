package ai.duke;

import dev.langchain4j.cdi.spi.RegisterAIService;

@RegisterAIService
public interface AIService {

    String chat(String message);
}
