package com.aisino.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.*;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Prototype implements Cloneable,Serializable {

    private String prop;
    private Person person;

    /**
     * 浅复制：直接调用super.clone();
     * @return super.clone();
     * @throws CloneNotSupportedException won't happen
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    /**
     * 深复制：要实现深复制，需采用流的形式读入当前对象二进输再写出数据应。
     * @return object
     * @throws IOException won't happen
     * @throws ClassNotFoundException won't happen
     */
    Prototype deepClone() throws IOException, ClassNotFoundException {

        // 写入当前对象二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 读出二进制流产生新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Prototype) ois.readObject();
    }

}
