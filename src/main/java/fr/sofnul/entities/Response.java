package fr.sofnul.entities;

public class Response {
	private Long id;
	private String response ;
	private boolean trueResponse;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public boolean isTrueResponse() {
		return trueResponse;
	}
	public void setTrueResponse(boolean trueResponse) {
		this.trueResponse = trueResponse;
	}
	public Response(String response, boolean trueResponse) {
		super();
		this.response = response;
		this.trueResponse = trueResponse;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

}
