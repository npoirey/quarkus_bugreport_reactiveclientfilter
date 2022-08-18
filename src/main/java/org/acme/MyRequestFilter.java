package org.acme;

import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientRequestContext;
import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientRequestFilter;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(1)
public class MyRequestFilter implements ResteasyReactiveClientRequestFilter {

    @Inject
    MyRequestScopedBean myRequestScopedBean;

    @Override
    public void filter(ResteasyReactiveClientRequestContext requestContext) {
        System.out.println("MyRequestFilter");
        System.out.println(myRequestScopedBean.getCounter());
    }
}
