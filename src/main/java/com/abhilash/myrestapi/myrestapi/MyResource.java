package com.abhilash.myrestapi.myrestapi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.core.game.GameEngine;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	int testid=20;
    	GameEngine game=new GameEngine();
    	return game.getFieldInfo(testid);
    }
    
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getFieldPosInfo() {
//    	int testid=20;
//    	GameEngine game=new GameEngine();
//    	return game.getFieldInfo(testid);
//    	
//    }
}
