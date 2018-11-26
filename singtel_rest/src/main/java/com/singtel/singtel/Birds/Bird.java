package com.singtel.singtel.Birds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("Bird")
public class Bird 
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String BirdMethod() 
	{	
		return "I am flying. I am walking. I am singing";
	}
	
	@GET
	@Path("Chicken")
	@Produces(MediaType.TEXT_PLAIN)
	public String Chicken_propertyMethod() 
	{	
		Chicken obj= new Chicken();		
		return obj.Chicken_property();
	}
	
	@GET
	@Path("Duck")
	@Produces(MediaType.TEXT_PLAIN)
	public String Duck_propertyMethod() 
	{	
		Duck obj= new Duck();		
		return obj.Duck_property();
	}
	
	@GET
	@Path("Rooster")
	@Produces(MediaType.TEXT_PLAIN)
	public String Rooster_propertyMethod() 
	{	
		Rooster obj= new Rooster();		
		return obj.Rooster_property();
	}
	
	@GET
	@Path("parrotWithDogs")
	@Produces(MediaType.TEXT_PLAIN)
	public String parrotWithDogs_propertyMethod() 
	{	
		Parrot obj= new ParrotType();		
		return obj.parrotWithDogs();
	}

	@GET
	@Path("parrotWithCats")
	@Produces(MediaType.TEXT_PLAIN)
	public String parrotWithCats_propertyMethod() 
	{	
		Parrot obj= new ParrotType();		
		return obj.parrotWithCats();
	}
	
	@GET
	@Path("parrotWithRooster")
	@Produces(MediaType.TEXT_PLAIN)
	public String parrotWithRooster_propertyMethod() 
	{	
		Parrot obj= new ParrotType();		
		return obj.parrotWithRooster();
	}
}
