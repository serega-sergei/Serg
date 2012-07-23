package org.icefaces.training.applicant.view.model;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * Job Applicant model
 */
@ManagedBean
@ViewScoped
public class JobApplicant implements Serializable{

	private String firstName;
	private String lastName;
	
	private Integer title;
	private String country;
	private String email;
	
	private int salary;
	
	@Override
    public String toString(){
        return "jobApplicant " + super.toString();
    }
	
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setTitle(Integer title) {
		this.title = title;
	}

	public Integer getTitle() {
		return title;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void submit(ActionEvent ae) {

		if (firstName.equals("John") && lastName.equals("Doe")) {
				String msg = "John Doe already works for us";
				FacesMessage facesMessage = new FacesMessage(msg);
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String clientId = null; // this is a global message
				facesContext.addMessage(clientId, facesMessage);
		}
	}
	
}
