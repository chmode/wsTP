package com.example.webservice.util;

import com.example.webservice.services.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import org.glassfish.jersey.jaxb.JaxbFeature; // Import this

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(com.example.webservice.services.CompteRestJaxRSAPI.class);
        return jerseyServlet;

    }
}

