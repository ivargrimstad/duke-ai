package ai.duke.dukespringai;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringJokeService {

    @Autowired
    private ChatClient chatClient;

    public String tellJoke(String message) {

        return chatClient.call(message);
    }
}
