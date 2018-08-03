package com.aisino.mediator;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
class User2 extends AbstractUser {

    User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user2 work ...");
    }
}
