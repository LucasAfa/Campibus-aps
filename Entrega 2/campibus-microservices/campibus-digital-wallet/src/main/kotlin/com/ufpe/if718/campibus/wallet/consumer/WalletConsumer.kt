package com.ufpe.if718.campibus.wallet.consumer

import com.ufpe.if718.campibus.wallet.model.GeneralFacade
import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.StreamsBuilder
import org.apache.kafka.streams.kstream.Consumed
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class WalletConsumer(private val generalFacade: GeneralFacade) {

    @Autowired
    fun process(builder: StreamsBuilder) {
        val keySerde = Serdes.String()
        val valueSerde = Serdes.String()
        builder.stream("student.wallet", Consumed.with(keySerde, valueSerde))
            .foreach { key: String?, value: String ->
                createOrUpdateWallet(value)
            }
    }

    private fun createOrUpdateWallet(content: String) {
        generalFacade.generateWallet(content)
    }
}