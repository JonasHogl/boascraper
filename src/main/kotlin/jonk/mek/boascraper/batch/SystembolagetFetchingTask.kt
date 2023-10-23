package jonk.mek.boascraper.batch

import jonk.mek.boascraper.core.ProduktFetcher
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


@Component
class SystembolagetFetchingTask(produktFetcher: ProduktFetcher) {

    var produktFetcher = produktFetcher

    @Scheduled(cron = "*/5 * * * * *")
    fun hämtaSystembolagetsUtbud() {
        var logger = LoggerFactory.getLogger(this.javaClass)
        logger.debug("hej")
        produktFetcher.laddaDatabasMedAllaProdukter()
    }
}