package ai.duke;

import io.helidon.integrations.langchain4j.Ai;

@Ai.Service
public interface ChatAiService {

   String chat(String message);
}
