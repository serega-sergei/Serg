package org.icefaces.training.applicant.view.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Request scope test bean
 */
@ManagedBean
@RequestScoped
public class RequestTest {

    @Override
    public String toString(){
        return "requestTest " + super.toString();
    }
}
