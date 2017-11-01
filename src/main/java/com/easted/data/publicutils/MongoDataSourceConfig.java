package com.easted.data.publicutils;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;


/**
 * Created by admin on 2017/10/10.
 */
@Configuration
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan
@EnableMongoRepositories(basePackages = "com.easted.data.repository")
public class MongoDataSourceConfig extends AbstractMongoConfiguration{

    @Value("${spring.mongo.datasource.database}")
    private String dbname;

    @Value("${spring.mongo.datasource.host}")
    private String dbhost;

    @Value("${spring.mongo.datasource.port}")
    private String dbport;

    @Value("${spring.mongo.datasource.username}")
    private String username;

    @Value("${spring.mongo.datasource.password}")
    private String password;

    @Override
    protected String getDatabaseName() {
        return this.dbname;
    }

    public MongoDataSourceConfig(){
        if(null == dbport || "".equalsIgnoreCase(dbport.trim())){
            dbport = "27017";
        }
    }

    @Override
    public Mongo mongo() throws Exception {
        ServerAddress serverAdress = new  ServerAddress(dbhost, Integer.valueOf(dbport));
        MongoCredential credential =
                MongoCredential.createCredential(username, dbname , password.toCharArray());
        Mongo mongo =  new MongoClient(serverAdress, Arrays.asList(credential));
        return mongo;
    }


}
