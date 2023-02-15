package com.chuwa.redbook.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommentConfig {
    //把第三方lib放入IOC容器需要 @Bean
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
