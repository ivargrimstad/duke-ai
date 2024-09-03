package dukes.data;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("ai")
public class JokeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String joke() {

        return "Hello you";
    }
}