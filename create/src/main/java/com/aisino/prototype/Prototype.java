package com.aisino.prototype;

import java.io.*;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Prototype implements Cloneable,Serializable {

    private String prop;
    private Person person;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Prototype() {
    }

    public Prototype(String prop, Person person) {
        this.prop = prop;
        this.person = person;
    }

//    浅复制：直接调用super.clone();
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
//    深复制：要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。 要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。
    public Prototype deepClone() throws IOException, ClassNotFoundException {

//        写入当前对象二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
//        读出二进制流产生新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Prototype) ois.readObject();

    }

}
