package fr.sofnul.entities;

import java.util.List;

public class Question {
	private Long id ;
	private String question;
	private List<Response> responses;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Response> getResponses() {
		return responses;
	}
	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	public Question(String question, List<Response> responses) {
		super();
		this.question = question;
		this.responses = responses;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
