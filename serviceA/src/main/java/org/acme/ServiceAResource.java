package org.acme;

import org.acme.control.ServiceAControl;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service-a")
public class ServiceAResource {

    @Inject
    @RestClient
    ServiceBClient serviceBClient;

    @Inject
    @RestClient
    ServiceCClient serviceCClient;

    @Inject
    ServiceAControl serviceAControl;

    @GET
    @Path("/info/{info}/{info2}/{info3}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getInfo(@PathParam String info, @PathParam String info2, @PathParam String info3) {

        serviceAControl.executeSomeAction();

        return  "Service A: " + info
                + serviceBClient.getInformation(info2)
                + serviceCClient.getInformation(info3);

    }


}