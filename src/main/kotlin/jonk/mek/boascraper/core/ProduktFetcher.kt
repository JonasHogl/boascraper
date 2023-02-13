package jonk.mek.boascraper.core

import jonk.mek.boascraper.core.port.SystembolagetProductService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.net.http.HttpResponse

@Component
class ProduktFetcher(bolagetService: SystembolagetProductService) {
    var bolagetService = bolagetService

    fun laddaDatabasMedProdukter() {
        var logger = LoggerFactory.getLogger(this.javaClass)
        var res = bolagetService.hämtaProdukter();



        logger.error(res)
    }

    fun parsaJson(svar: HttpResponse<String>) {

    }
}