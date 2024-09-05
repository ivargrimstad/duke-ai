package ai.duke.spring;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringAIService {

    @Autowired
    private ChatClient chatClient;

    public String tellJoke(String message) {

        return chatClient.call(message);
    }
}
