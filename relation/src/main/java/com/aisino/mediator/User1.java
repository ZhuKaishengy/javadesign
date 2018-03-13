package com.aisino.mediator;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    void work() {
        System.out.println("user1 work ...");
    }
}
