package com.aisino.mediator;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MediatorTest {

    @Test
    public void test(){
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
