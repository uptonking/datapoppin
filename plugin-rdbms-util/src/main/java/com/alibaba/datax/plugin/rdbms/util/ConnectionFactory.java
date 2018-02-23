package com.alibaba.datax.plugin.rdbms.util;

import java.sql.Connection;

/**
 * 连接工厂接口
 * Date: 15/3/16 下午2:17
 */
public interface ConnectionFactory {

    public Connection getConnecttion();

    public Connection getConnecttionWithoutRetry();

    public String getConnectionInfo();

}
