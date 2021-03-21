package com.sprigframeworkguru.sfgDependencyInjection.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("guru") //o sa caute in props dupa numele de guru
@Configuration
public class SfgConfiguration {
    //si daca numele de aici sunt aceleasi cu numele din fisier le populeaza
    String username;
    String pass;
    String jdbcUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
