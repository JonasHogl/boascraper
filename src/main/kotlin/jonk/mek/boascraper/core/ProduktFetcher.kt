package jonk.mek.boascraper.core

import jonk.mek.boascraper.core.port.SystembolagetProductService
import org.springframework.stereotype.Component

@Component
class ProduktFetcher(bolagetService: SystembolagetProductService) {
    var bolagetService = bolagetService

    fun laddaDatabasMedProdukter() {

    }
}