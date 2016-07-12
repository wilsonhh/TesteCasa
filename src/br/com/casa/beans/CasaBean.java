package br.com.casa.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name="casaBean", eager=true)
public class CasaBean {
	
	@PostConstruct
	public void init(){
		System.out.println(" Bean executado! ");
	}
	
	private String message;

	public String getMessage() {
		return  message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getWelcomeMessage() {
		return message;
	}

}
