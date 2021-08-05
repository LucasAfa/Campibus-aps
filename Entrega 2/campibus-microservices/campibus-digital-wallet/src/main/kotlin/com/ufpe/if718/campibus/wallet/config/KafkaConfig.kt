package com.ufpe.if718.campibus.wallet.config

import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.StreamsConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafkaStreams
import org.springframework.kafka.config.KafkaStreamsConfiguration
import org.springframework.kafka.support.serializer.JsonDeserializer
import org.springframework.kafka.support.serializer.JsonSerde
import org.springframework.kafka.support.serializer.JsonSerializer


@Configuration
@EnableKafkaStreams
class KafkaConfig {
    @Bean
    fun defaultKafkaStreamsConfig(): KafkaStreamsConfiguration {
        val configs: MutableMap<String, Any> = HashMap()
        configs[StreamsConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9092"
        configs[StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG] = Serdes.String().javaClass
        configs[StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG] = JsonSerde::class.java
        configs[StreamsConfig.APPLICATION_ID_CONFIG] = "campibus-wallet"
        configs[JsonDeserializer.VALUE_DEFAULT_TYPE] = JsonSerializer::class.java
        configs[JsonSerializer.ADD_TYPE_INFO_HEADERS] = false
        return KafkaStreamsConfiguration(configs)
    }
}