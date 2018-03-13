package com.aisino.mediator;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    void work() {
        System.out.println("user2 work ...");
    }
}
