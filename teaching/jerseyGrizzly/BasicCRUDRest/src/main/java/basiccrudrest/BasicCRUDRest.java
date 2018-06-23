
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;


public class BasicCRUDRest{

    public static void main(String[] args) throws IOException {
		int PORT=9998;
        System.out.println("Start");
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(PORT).build();

		// Rest.class corresponds to the Rest resource implementation located in Rest.java
        ResourceConfig resConfig = new ResourceConfig(Rest.class);

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, resConfig);

        System.out.println(" Press ENTER to stop ");
        System.in.read();
        System.out.println(" Bye");

        System.exit(1);
    }
}
