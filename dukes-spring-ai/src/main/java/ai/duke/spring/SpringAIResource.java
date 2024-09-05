package ai.duke.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAIResource {

    @Autowired
    private SpringAIService springAIService;

    @GetMapping("ai")
    public String tellJoke(@RequestParam("message") String message) {

        return springAIService.tellJoke(message);
    }
}
