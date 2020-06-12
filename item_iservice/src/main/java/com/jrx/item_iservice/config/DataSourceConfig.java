package com.jrx.item_iservice.config;

/**
 * @Author 41765
 * @Creater 2020/6/4 9:56
 * Description
 */

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * HikariCP连接池配置
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.hikari.read-only}")
    private Boolean readOnly;

    @Value("${spring.datasource.hikari.connection-timeout}")
    private Integer connectionTimeout;

    @Value("${spring.datasource.hikari.idle-timeout}")
    private Integer idleTimeout;

    @Value("${spring.datasource.hikari.max-lifetime}")
    private Integer maxLifetime;

    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private Integer maximumPoolSize;

    @Value("${spring.datasource.hikari.minimum-idle}")
    private Integer minimumIdle;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        //数据源
        config.setJdbcUrl(dataSourceUrl);
        //用户名
        config.setUsername(user);
        //密码
        config.setPassword(password);
        //连接只读数据库时配置为true， 保证安全
        config.setReadOnly(readOnly);
        //等待连接池分配连接的最大时长（毫秒），超过这个时长还没可用的连接则发生SQLException， 缺省:30秒
        config.setConnectionTimeout(connectionTimeout);
        //一个连接idle状态的最大时长（毫秒），超时则被释放（retired），缺省:10分钟
        config.setIdleTimeout(idleTimeout);
        //一个连接的生命时长（毫秒），超时而且没被使用则被释放（retired），缺省:30分钟
        config.setMaxLifetime(maxLifetime);
        //连接池中允许的最大连接数。缺省值：10
        config.setMaximumPoolSize(maximumPoolSize);
        //连接池空闲连接的最小数量
        config.setMinimumIdle(minimumIdle);

        HikariDataSource ds = new HikariDataSource(config);

        return ds;
    }
}