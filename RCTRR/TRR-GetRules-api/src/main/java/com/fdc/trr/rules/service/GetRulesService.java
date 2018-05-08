package com.fdc.trr.rules.service;

import org.osgi.annotation.versioning.ProviderType;

import com.fdc.trr.rules.model.GetRulesRequest;
import com.fdc.trr.rules.model.GetRulesResponse;


@ProviderType
public interface GetRulesService {
	
	public GetRulesResponse getRules(GetRulesRequest getRulesRequest);

}
