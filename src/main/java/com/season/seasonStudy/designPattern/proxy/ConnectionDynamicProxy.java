package com.season.seasonStudy.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * connection的动态代理
 */
public class ConnectionDynamicProxy implements InvocationHandler {

    private Connection connection;

    public ConnectionDynamicProxy(Connection connection){
        super();
        this.connection = connection;
    }

    public Connection getConnectionDynamicProxy(){
        return (Connection)Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Connection.class}, this);
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
        if (Connection.class.isAssignableFrom(proxy.getClass()) && method.getName().equals("close")){
            DataSource.getInstance().recoveryConnection(connection);
            return null;
        } else {
            return method.invoke(connection, args);
        }

    }
}