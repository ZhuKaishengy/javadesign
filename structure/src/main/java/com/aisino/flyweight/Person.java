package com.aisino.flyweight;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Person {

    ConnectionManager connectionManager;
    Connection connection;
    {
        connection = new Connection("1","2","3","4");
        connectionManager = new ConnectionManager(5,connection);
    }

    @Test
    public void testConnectAndRelease(){
        Connection connection = connectionManager.getConnection();
        System.out.println(connection.toString());
        System.out.println(connectionManager.pool.size());
        connectionManager.releaseConnection(connection);
        System.out.println(connectionManager.pool.size());
    }
}
