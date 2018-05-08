package com.fdc.trr.ruleservice.rest;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.junit.Test;


import com.fdc.trr.rules.model.GetRulesRequest;
import com.fdc.trr.rules.model.GetRulesResponse;
import com.fdc.trr.rules.resource.JsonpConvertingPlugin;


/*public class JsonConverterTest {
    
    //@Test
    public void testJSONSerialization() throws WebApplicationException, IOException {
        
        JsonpConvertingPlugin<GetRulesRequest> plugin = new JsonpConvertingPlugin<>();
        
         
        GetRulesRequest dto = new GetRulesRequest();
        dto.setInboundGmf("kevin");
       
       
        
        //dto.addresses.add(dto2);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        plugin.writeTo(dto, GetRulesRequest.class, GetRulesRequest.class, null, MediaType.APPLICATION_JSON_TYPE, null, baos);
        
        GetRulesRequest roundTrip = plugin.readFrom(GetRulesRequest.class, GetRulesRequest.class,null, MediaType.APPLICATION_JSON_TYPE, 
                null, new ByteArrayInputStream(baos.toByteArray()));
        
        assertEquals(200, roundTrip.getReturnCode());
        assertEquals("Tim", roundTrip.firstName);
        assertEquals("Ward", roundTrip.lastName);
        
      
    }
    
}

*/