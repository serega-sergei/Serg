package org.icefaces.training.applicant.view.controller;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
/**
 * Applicant Controller. 
 */
@ManagedBean(name="applicantController")
@ApplicationScoped
public class ApplicantController {


    @Override
    public String toString(){
        return "jobApplication " + super.toString();
    }

}
