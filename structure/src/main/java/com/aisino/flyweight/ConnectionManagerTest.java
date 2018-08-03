package com.aisino.flyweight;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class ConnectionManagerTest {

    private ConnectionManager connectionManager;
    private Connection connection;

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
