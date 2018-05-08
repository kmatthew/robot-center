package com.fdc.trr.rules.resource;



import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;
//import org.osgi.service.jaxrs.whiteboard.JaxRSWhiteboardConstants;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JSONRequired;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component(service=ExampleAddonResource.class)
@JaxrsResource
@Path("person")
@Produces(MediaType.APPLICATION_JSON)
@JSONRequired
//@HttpWhiteboardResource(pattern="/microservice/*", prefix="static")
public class ExampleAddonResource {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello " + name;
    }

}
