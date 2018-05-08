package com.fdc.trr.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JSONRequired;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

@Component(service=Upper.class)
@JaxrsResource
@Produces(MediaType.APPLICATION_JSON)
@JSONRequired
@HttpWhiteboardResource(pattern="/quickstart/*", prefix="static")
public class Upper {
    
    @Path("rest/upper/{param}")
    @GET
    public String toUpper(@PathParam("param") String param) {
    	System.out.println("param is "+param);
        return param.toUpperCase();
    }
}