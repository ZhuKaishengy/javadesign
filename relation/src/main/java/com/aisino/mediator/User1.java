package com.aisino.mediator;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
class User1 extends AbstractUser {

    User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user1 work ...");
    }
}




