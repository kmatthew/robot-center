package com.fdc.trr.rules.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.fdc.trr.rules.model.GetRulesRequest;
import com.fdc.trr.rules.model.GetRulesResponse;
import com.fdc.trr.rules.service.GetRulesService;

@Component
public class GetRulesServiceImpl implements GetRulesService {

	@Override
	public GetRulesResponse getRules(GetRulesRequest getRulesRequest) {
		
		GetRulesResponse response = new GetRulesResponse();
		//response.setDetail("This is a test");
		//response.setReturnCode("200");
		List<String> rulesList = new ArrayList<String>(Arrays.asList("Earth", "Mars", "Venus"));
		//response.setRulesList(rulesList);
		return response;
	}

}
