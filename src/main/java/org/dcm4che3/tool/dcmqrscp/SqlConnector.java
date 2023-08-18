package org.dcm4che3.tool.dcmqrscp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlConnector {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Class CLASS_LOCK = SqlConnector.class;

    public static SqlSessionFactory initSqlSessionFactory(String configFile) {
        InputStream is = null;
        try {
            if (configFile == null) {
                is = Resources.getResourceAsStream("mybatis-config.xml");
            } else {
                is = new FileInputStream(configFile);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
