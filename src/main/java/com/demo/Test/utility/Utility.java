package com.demo.Test.utility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.Test.entity.CurrencyEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Utility {
	
	@Autowired
	ObjectMapper obj;

	public String processdata(List<CurrencyEntity> req) throws JsonProcessingException {
		
		String jsonVal=obj.writerWithDefaultPrettyPrinter().writeValueAsString(req);
		JSONArray array=new JSONArray(jsonVal);
	    List<CurrencyEntity> jsonObj=new ArrayList<CurrencyEntity>();
	    String response="";
	    
	    for(int i=0; i<array.length();i++) {
	    	jsonObj.add(new CurrencyEntity((String)array.getJSONObject(i).get("currency"), 
	    			(String)array.getJSONObject(i).get("amount")));
	    }
	    Map<String, Integer> respMap = new LinkedHashMap<>();
		for (CurrencyEntity c: jsonObj) 
			respMap.merge(c.currency,   Integer.parseInt(c.amount),     Integer::sum);
		response+=respMap.toString();
		return response;
	}

}
