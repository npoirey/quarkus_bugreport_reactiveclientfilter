package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Set;


@Path("/extensions")
@RegisterRestClient
public interface MyRestClient {
    @GET
    Set<Object> getById(@QueryParam("id") String id);
}
