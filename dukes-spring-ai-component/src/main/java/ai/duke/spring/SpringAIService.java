package ai.duke.spring;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringAIService {

    @Autowired
    private ChatClient chatClient;

    public String call(String message) {

        return chatClient.call(message);
    }
}
