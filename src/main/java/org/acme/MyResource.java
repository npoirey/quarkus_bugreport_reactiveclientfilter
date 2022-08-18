package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyResource {
    @RestClient
    MyRestClient client;

    @Inject
    MyRequestScopedBean myRequestScopedBean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        myRequestScopedBean.setCounter(1);
        return client.getById("1").toString();
    }
}
