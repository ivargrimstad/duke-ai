package ai.duke;

import dev.langchain4j.cdi.spi.RegisterAIService;

@RegisterAIService
public interface DukesAIService {

    String chat(String message);
}
