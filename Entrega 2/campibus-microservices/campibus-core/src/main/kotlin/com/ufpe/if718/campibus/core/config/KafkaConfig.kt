package com.ufpe.if718.campibus.core.config

import org.apache.kafka.clients.admin.NewTopic
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory
import org.springframework.kafka.support.serializer.JsonSerializer

@Configuration
@EnableKafka
class KafkaConfig {
    @Bean
    fun studentWallet(): NewTopic {
        return TopicBuilder.name("student.wallet").partitions(6).replicas(1).build()
    }

    @Bean
    fun studentWalletProducerFactory(): ProducerFactory<String, String> {
        val configProps: MutableMap<String, Any> = HashMap()
        configProps[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9092" // Destination of kafka brokers
        configProps[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java // Serializer for key
        configProps[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java // Serializer for value
        configProps[JsonSerializer.ADD_TYPE_INFO_HEADERS] =
            false // Package name of value won't be added to header with this config
        return DefaultKafkaProducerFactory(configProps)
    }

    @Bean
    fun studentWalletKafkaTemplate(): KafkaTemplate<String, String> {
        return KafkaTemplate(studentWalletProducerFactory())
    }
}