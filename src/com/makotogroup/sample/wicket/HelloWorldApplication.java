package com.makotogroup.sample.wicket;

/**
 * Created by Henry.Wu on 2015/12/4.
 */
import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {

    protected void init() {
    }

    public Class getHomePage() {
        return HelloWorld.class;
    }
}
