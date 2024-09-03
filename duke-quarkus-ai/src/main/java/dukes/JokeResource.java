package dukes;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ai")
public class JokeResource {

    @Inject
    JokeService jokeService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return jokeService.tellJoke();
    }
}
