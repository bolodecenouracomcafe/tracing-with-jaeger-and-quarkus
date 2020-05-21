package org.acme;

import org.acme.control.ServiceBControl;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service-b")
public class ServiceBResource {

    @Inject
    ServiceBControl serviceBControl;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("info/{info}")
    public String getInformation(@PathParam String info) {
        serviceBControl.executeSomeAction();
        return " Service B: " + info;
    }

}