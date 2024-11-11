package ai.duke.spring;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringAIService {

    @Autowired
    private ChatClient.Builder builder;

    public String call(String message) {

        return builder.build().prompt(message).call().content();
    }
}
