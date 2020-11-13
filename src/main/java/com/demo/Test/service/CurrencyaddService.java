package com.demo.Test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Test.entity.CurrencyEntity;
import com.demo.Test.utility.Utility;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class CurrencyaddService {
	
	@Autowired
	Utility utility;
	
	public String sumCurrencyJSon(List<CurrencyEntity> req) throws JsonProcessingException {
//		String jsonVal="[{\"currency\":\"USD\",\"amount\": \"10\"},{\"currency\":\"USD\",\"amount\": \"20\"},{\"currency\":\"USD\",\"amount\": \"30\"},{\"currency\":\"EUR\",\"amount\": \"10\"},{\"currency\":\"INR\",\"amount\": \"10\"},{\"currency\":\"EUR\",\"amount\": \"10\"},{\"currency\":\"INR\",\"amount\": \"60\"},{\"currency\":\"EUR\",\"amount\": \"20\"}]";
		return utility.processdata(req);
	}

}
