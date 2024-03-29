package jonk.mek.boascraper.commons.config

import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties("konfig")
@JvmRecord
data class BoaConfig(val user: String, val password: String, val key: String)  {


    @PostConstruct
    fun efterInitierat() {
        var logger = LoggerFactory.getLogger(this.javaClass)
        logger.debug(this.toString())
    }
}
