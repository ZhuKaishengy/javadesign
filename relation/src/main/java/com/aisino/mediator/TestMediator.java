package com.aisino.mediator;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestMediator {

    @Test
    public void test(){
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
