package com.aisino.memento;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Original {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Original(String name) {
        this.name = name;
    }

    public Memento createMemento(){
        return new Memento(this.name);
    }

    public void restore(Memento memento){
        this.setName(memento.getValue());
    }

}
