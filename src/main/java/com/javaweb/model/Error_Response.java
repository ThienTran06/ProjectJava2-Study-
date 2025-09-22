package com.javaweb.model;

import java.util.ArrayList;
import java.util.List;

public class Error_Response {
	private String Error;
	private List<String> Detail = new ArrayList<String>();
//	public Error_Response(String error, List<String> details) {
//	    this.Error = error;
//	    this.Detail = details;
//	}

	public String getError() {
		return Error;
	}

	public void setError(String error) {
		Error = error;
	}

	public List<String> getDetail() {
		return Detail;
	}

	public void setDetail(List<String> detail) {
		Detail = detail;
	}
}
