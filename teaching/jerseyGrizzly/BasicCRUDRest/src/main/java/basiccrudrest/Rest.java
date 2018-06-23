
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/res")
public class Rest {

        static int counter=100;

        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public int getIt() {
            System.out.println("GET"+counter);
            return this.counter;
        }

        @PUT
        @Produces(MediaType.TEXT_PLAIN)
        public  String putIt(){
            counter++;
            System.out.println("PUT"+counter);
            return  ("\n"+counter+"\n");
        }

        @DELETE
        @Produces(MediaType.TEXT_PLAIN)
        public  int deleteIt(){
            counter--;
            System.out.println("DELETE"+counter);
            return counter;
        }
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		public  int setIt(
			@FormParam("value") int value){
			this.counter=value;
			System.out.println(value + "POST"+counter);
			return counter;
		}

		// This method does not set the counter
		// It shos only the use of Response
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("/sp")
		public Response setSpIt(
								@FormParam("value") int value){
		
			System.out.println(value + "ESPCIAL POST "+counter);
			Response r = Response.status(200).entity("Compelted "+ value).build();
			return r;
		}

}
