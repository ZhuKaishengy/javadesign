package com.aisino.memento;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MementoTest {

    public static void main(String[] args) {
        Original original = new Original("zks");
        System.out.println(original.getName());
        Storage storage = new Storage(original.createMemento());
        original.setName("sjx");
        System.out.println("change ...");
        System.out.println(original.getName());
        System.out.println("restore ...");
        original.restore(storage.getMemento());
        System.out.println(original.getName());
    }
}
