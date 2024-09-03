package ai.duke.dukespringai;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JokeController {

    @Autowired
    private ChatClient chatClient;

    @GetMapping("ai")
    Map<String, String> tellJoke(@RequestParam("message") String message) {

        return Map.of("completion",
                chatClient.call(message));
    }
}
