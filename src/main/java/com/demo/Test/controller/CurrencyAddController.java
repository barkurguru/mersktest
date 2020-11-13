package com.demo.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Test.entity.CurrencyEntity;
import com.demo.Test.service.CurrencyaddService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value="/currency")
public class CurrencyAddController {
	
	@Autowired
	CurrencyaddService currencyService;
	
	@PostMapping(value="/getCurrencySum" )
	public ResponseEntity<?> sumCurrencyVal(@RequestBody List<CurrencyEntity> request ) throws JsonProcessingException{
		String response=currencyService.sumCurrencyJSon(request);
		return  ResponseEntity.ok().body(response);
	}

}
