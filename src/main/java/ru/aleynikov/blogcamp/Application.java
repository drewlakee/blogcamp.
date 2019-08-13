package ru.aleynikov.blogcamp;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }

    @Bean
    public HikariDataSource HikariDataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName(Config.JDBC_DRIVER);
        hikariDataSource.setJdbcUrl(Config.JDBC_URL);
        hikariDataSource.setUsername(Config.USERNAME_PSQL);
        hikariDataSource.setPassword(Config.PASSWORD_PSQL);

        hikariDataSource.setMaximumPoolSize(Config.MAX_HIKARI_POOL_SIZE);

        return hikariDataSource;
    }

    @Bean
    public JdbcTemplate JdbcTemplate() {
        return new JdbcTemplate(HikariDataSource());
    }

}
