package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey="service-b-api")
public interface ServiceBClient {

    @GET
    @Path("/service-b/info/{info}")
    @Produces(MediaType.APPLICATION_JSON)
    String getInformation(@PathParam String info);

}
