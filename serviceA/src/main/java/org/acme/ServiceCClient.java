package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey="service-c-api")
public interface ServiceCClient {

    @GET
    @Path("/service-c/info/{info}")
    @Produces(MediaType.APPLICATION_JSON)
    String getInformation(@PathParam String info);

}
