package com.example.demo.infra.config;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

@Configuration
public class R2dbcInitializerConfig {

    @Bean
    public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);



        // 执行 schema 脚本（建表语句）
        ResourceDatabasePopulator schemaPopulator = new ResourceDatabasePopulator();
        schemaPopulator.addScript(new ClassPathResource("schema.sql")); // 位于 src/main/resources 下

        // 执行 data 脚本（插入测试数据）
        ResourceDatabasePopulator dataPopulator = new ResourceDatabasePopulator();
        dataPopulator.addScript(new ClassPathResource("data.sql"));

        CompositeDatabasePopulator compositeDatabasePopulator = new CompositeDatabasePopulator(schemaPopulator, dataPopulator);

        // 设置初始化脚本（先执行 schema，再执行 data）
        initializer.setDatabasePopulator(compositeDatabasePopulator);

        return initializer;
    }
}
