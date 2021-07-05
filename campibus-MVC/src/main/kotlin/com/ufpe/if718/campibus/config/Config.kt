package com.ufpe.if718.campibus.config

import com.ufpe.if718.campibus.model.GeneralFacade
import com.ufpe.if718.campibus.model.service.StudentService
import com.ufpe.if718.campibus.model.service.impl.StudentServiceImpl
import org.springframework.context.annotation.Bean

class Config {

    @Bean
    fun getFacade(): GeneralFacade {
        return GeneralFacade()
    }

    @Bean
    fun getStudentService(): StudentService {
        return StudentServiceImpl()
    }
}