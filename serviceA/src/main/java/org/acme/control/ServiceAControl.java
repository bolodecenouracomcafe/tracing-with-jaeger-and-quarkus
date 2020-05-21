package org.acme.control;

import org.acme.entity.ServiceA;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@Traced
@ApplicationScoped
public class ServiceAControl {

    public void executeDelay() {
        try {
            Thread.sleep(250);
        } catch (Exception e) {}
    }

    @Transactional
    public void executeSomeAction() {
        executeDelay();

        ServiceA.count();

        ServiceA.persist(new ServiceA("I'm " + Double.valueOf(1000000L * Math.random()).longValue()));

        ServiceA.count();

        ServiceA.listAll();

    }
}
