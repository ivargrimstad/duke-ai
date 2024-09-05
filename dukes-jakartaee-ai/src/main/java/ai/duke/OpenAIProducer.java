package ai.duke;

import dev.langchain4j.model.openai.OpenAiLanguageModel;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;

@Dependent
public class OpenAIProducer {

    @Produces
    public OpenAiLanguageModel getOpenAiLanguageModel() {

        return OpenAiLanguageModel.withApiKey(System.getenv("OPENAI_API_KEY"));
    }
}
