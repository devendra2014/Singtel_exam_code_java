package com.singtel.singtel.Insects;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Insects")
public class Insects {
	
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 public String Insects()
		{
		 return "Inside insects Class";
		}	
	
	 @GET
	 @Path("Caterpillar")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String Caterpillar_method()
		{
		 Caterpillar obj = new Caterpillar();
		 return obj.Caterpillar_property();
		}
	 
	 @GET
	 @Path("Butterfly")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String Butterfly_method()
		{
		 Butterfly obj = new Butterfly();	 
		 return obj.Butterfly_property();
		}
}
