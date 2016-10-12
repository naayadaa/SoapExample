package com.zagar.config;

import com.zagar.PegasSpringClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by naayadaa on 07.10.16.
 */
@Configuration
public class PegasysConfig {


    @Value("${client.url}")
    private String clientUrl;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.zagar.wsdl");
        return marshaller;
    }

    @Bean
    public PegasSpringClient weatherClient(Jaxb2Marshaller marshaller) {
        PegasSpringClient client = new PegasSpringClient();
        client.setDefaultUri(clientUrl);

        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
