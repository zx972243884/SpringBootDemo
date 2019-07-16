package com.zx.sys.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
//配置mybatis mapper的扫描路径
@MapperScan("com.zx.sys.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private String jdbcDrive;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUserName;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    //数据库连接池
    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDrive);//设置驱动
        dataSource.setJdbcUrl(jdbcUrl);//设置数据库连接url
        dataSource.setUser(jdbcUserName);//设置用户名
        dataSource.setPassword(jdbcPassword);//设置密码
        dataSource.setAutoCommitOnClose(false);//关闭连接后不自动commit

        return dataSource;
    }
}
