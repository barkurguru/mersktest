package com.demo.Test.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurJsonRequest  implements Serializable {

	private static final long serialVersionUID = -5569026900130938231L;
	
	@JsonProperty("array")
	public List<CurJsonRequest> currrequest;
	
	public CurJsonRequest() {
	}

	public CurJsonRequest(List<CurJsonRequest> currrequest) {
		this.currrequest = currrequest;
	}
	public List<CurJsonRequest> getCurrrequest() {
		return currrequest;
	}
	public void setCurrrequest(List<CurJsonRequest> currrequest) {
		this.currrequest = currrequest;
	}
}
