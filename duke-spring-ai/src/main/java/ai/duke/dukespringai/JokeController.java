package ai.duke.dukespringai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @Autowired
    private SpringJokeService jokeService;

    @GetMapping("ai")
    public String tellJoke(@RequestParam("message") String message) {

        return jokeService.tellJoke(message);
    }
}
