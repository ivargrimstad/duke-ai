package dukes;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ai")
public class JokeResource {


    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {

        return "Hello you";
    }
}
