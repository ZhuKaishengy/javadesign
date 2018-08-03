package com.aisino.mediator;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MyMediator implements Mediator{

    private AbstractUser user1;
    private AbstractUser user2;

    public AbstractUser getUser1() {
        return user1;
    }

    public void setUser1(AbstractUser user1) {
        this.user1 = user1;
    }

    public AbstractUser getUser2() {
        return user2;
    }

    public void setUser2(AbstractUser user2) {
        this.user2 = user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
