package com.ufpe.if718.campibus.wallet.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class ApplicationConfig {
    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }
}