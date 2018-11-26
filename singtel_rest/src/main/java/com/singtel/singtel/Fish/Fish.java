package com.singtel.singtel.Fish;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Fish")
public class Fish {
	
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 public String swim()
		{
		//	count_canswim++;
			return "Fish can swim";
		}
	 
	 @GET
	 @Path("Shark")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String Shark_method()
		{
		 Shark obj = new Shark();	 
		 return obj.shark_property();
		}
	 
	 

	 @GET
	 @Path("Dolphin")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String Dolphin_method()
		{
		 Dolphin obj = new Dolphin();	 
		 return obj.swim();
		}
	 
	 @GET
	 @Path("Clownfish")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String Clownfish_method()
		{
		 Clownfish obj = new Clownfish();	 
		 return obj.Clownfish_property();
		}
}
