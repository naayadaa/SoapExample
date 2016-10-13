package com.zagar.config;

import com.zagar.PegasPackageSearchClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by naayadaa on 07.10.16.
 */
@Configuration
public class PegasysConfig {

    @Value("${pegas.apiUserKey}")
    private String API_USER_KEY;

    @Value("${pegas.lenguageCode}")
    private String LANGUGE_CODE;

    @Bean
    public PegasPackageSearchClient pegasPackageSearchClient(){
        return new PegasPackageSearchClient(API_USER_KEY, LANGUGE_CODE);
    }




}
