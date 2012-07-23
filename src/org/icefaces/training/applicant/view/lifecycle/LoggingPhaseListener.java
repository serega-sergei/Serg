package org.icefaces.training.applicant.view.lifecycle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LoggingPhaseListener implements PhaseListener {

    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("AFTER PHASE: " + phaseEvent.getPhaseId().toString());
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("BEFORE PHASE: " + phaseEvent.getPhaseId().toString());
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
