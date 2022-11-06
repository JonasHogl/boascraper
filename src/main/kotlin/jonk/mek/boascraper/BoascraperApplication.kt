package jonk.mek.boascraper

import jonk.mek.boascraper.commons.config.BoaConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableConfigurationProperties(BoaConfig::class)
@EnableScheduling
class BoascraperApplication


fun main(args: Array<String>) {
    runApplication<BoascraperApplication>(*args)
}
