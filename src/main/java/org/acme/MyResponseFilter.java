package org.acme;

import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientRequestContext;
import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientResponseFilter;

import javax.inject.Inject;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.ext.Provider;

@Provider
public class MyResponseFilter implements ResteasyReactiveClientResponseFilter{
    @Inject
    MyRequestScopedBean myRequestScopedBean;

    @Override
    public void filter(ResteasyReactiveClientRequestContext requestContext, ClientResponseContext responseContext) {
        System.out.println("MyResponseFilter");
        System.out.println(myRequestScopedBean.getCounter());
    }
}
