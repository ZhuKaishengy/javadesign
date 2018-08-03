package com.aisino.flyweight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
class ConnectionManager {

    List<Connection> pool = null;
    private Connection connection;

    ConnectionManager(int poolSize, Connection connection) {
        this.connection = connection;

        pool = new ArrayList<Connection>(poolSize);
        for(int i = 0 ; i < poolSize; i++ ){
            try {
                Connection clone = this.deepClone();
                pool.add(clone);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


    private Connection deepClone() throws IOException, ClassNotFoundException {
//        写入当前对象二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this.connection);
//        读出二进制流产生新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Connection) ois.readObject();

    }

    synchronized Connection getConnection(){
        Connection conn = this.pool.get(0);
        this.pool.remove(conn);
        return conn;
    }

    synchronized void releaseConnection(Connection conn){
        this.pool.add(conn);
    }
}
