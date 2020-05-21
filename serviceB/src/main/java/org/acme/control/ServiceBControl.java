package org.acme.control;

import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@Traced
@ApplicationScoped
public class ServiceBControl {

    public void executeDelay() {
        try {
            Thread.sleep(250);
        } catch (Exception e) {}
    }

    @Transactional
    public void executeSomeAction() {
        executeDelay();
    }
}
