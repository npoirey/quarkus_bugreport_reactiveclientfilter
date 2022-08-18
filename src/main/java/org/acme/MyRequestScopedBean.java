package org.acme;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MyRequestScopedBean {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public MyRequestScopedBean setCounter(int counter) {
        this.counter = counter;
        return this;
    }
}
