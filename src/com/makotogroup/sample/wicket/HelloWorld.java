package com.makotogroup.sample.wicket;

/**
 * Created by Henry.Wu on 2015/12/4.
 */
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld extends WebPage
{
    public HelloWorld()
    {
        add(new Label("message", "Hello World using Wicket!!"));
    }
}
