package com.skyraining.configuration;

import com.mongodb.MongoClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDbConfiguration {

    @Bean
    public MongoClientOptions mongoClientOptions() {
        return MongoClientOptions.builder().socketTimeout(120000).build();
    }
}
