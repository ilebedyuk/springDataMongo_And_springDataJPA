//package com.manishchhabra.blog;
//
///**
// * @author ilebedyuk
// */
//
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//
///**
// * Spring MongoDB configuration file
// *
// */
//@Configuration
//public class SpringMongoConfig {
//
//    @Bean
//     public MongoDbFactory mongoDbFactory() throws Exception {
//        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://root:root@ds019658.mlab.com:19658/library_local");
//        return new SimpleMongoDbFactory(new MongoClient(mongoClientURI), "library_local");
//    }
//
//     @Bean
//     public MongoTemplate mongoTemplate() throws Exception {
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
//        return mongoTemplate;
//
//    }
//
//}
