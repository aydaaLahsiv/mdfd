package com.lahsiv.mbfd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
@Configuration
public class Appconfig {


	
	public @Bean MongoClient mongoClient() {
	       return MongoClients.create("mongodb+srv://mbfd_dev:SOPUfzLUhHOcOYw8@mbkd-ruomu.azure.mongodb.net/mbfd_dev?retryWrites=true&w=majority");
	   }

	
}
