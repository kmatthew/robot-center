package com.fdc.trr.rules.resource;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JSONRequired;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import com.fdc.trr.rules.model.GetRulesResponse;
import com.fdc.trr.rules.service.GetRulesService;
import com.fdc.trr.rules.model.GetRulesRequest;

@Component(service=GetRuleResource.class)
@JaxrsResource
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@JSONRequired
public class GetRuleResource {
    
    @Reference
	GetRulesService getRulesService;

    @Path("rest/advice")
	@POST
	public GetRulesResponse getRules(GetRulesRequest request) {
		System.out.println("Inside getRules");
		
		 //GetRulesResponse response = new  GetRulesResponse();
		 
		 //response.setReturnCode("200");
		 
		 //List<String> rulesList = new ArrayList<String>();
		 //rulesList.add("kevin");
		 
		 //response.setRulesList(rulesList);
		 //return response;
	   return getRulesService.getRules(request);
		
	}

	
}
