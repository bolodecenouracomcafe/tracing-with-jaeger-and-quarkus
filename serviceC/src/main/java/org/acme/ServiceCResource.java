package org.acme;

import org.acme.control.ServiceCControl;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service-c")
public class ServiceCResource {

    @Inject
    ServiceCControl serviceCControl;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/info/{info}")
    public String getInformation(@PathParam String info) {
        serviceCControl.executeSomeAction();
        return " Service C: " + info;
    }
}