package org.icefaces.training.applicant.view.lifecycle;

import java.io.IOException;

import javax.el.ELResolver;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.icefaces.training.applicant.view.model.ViewProperties;

public class PagePhaseListener implements PhaseListener {

    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("AFTER PHASE: " + phaseEvent.getPhaseId().toString());
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("BEFORE PHASE: " + phaseEvent.getPhaseId().toString());
        FacesContext fc = FacesContext.getCurrentInstance();
        ELResolver elResolver = fc.getApplication().getELResolver();
        ViewProperties viewProperties = (ViewProperties) elResolver.getValue(fc.getELContext(), null, "viewProperties");
        if(!viewProperties.getJobApplicantPermission()){
            String newUrl = fc.getExternalContext().encodeActionURL(fc.getApplication().getViewHandler().getActionURL(fc,"/start.xhtml"));
            try{
                fc.getExternalContext().redirect(newUrl);
            }catch(IOException ioe){
                throw new FacesException(ioe);
            }
        }
    }

    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }

}
