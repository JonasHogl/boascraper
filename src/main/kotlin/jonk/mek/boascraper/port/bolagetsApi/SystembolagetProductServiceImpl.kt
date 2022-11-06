package jonk.mek.boascraper.port.bolagetsApi

import jonk.mek.boascraper.core.port.SystembolagetProductService
import org.springframework.stereotype.Component
import java.net.HttpURLConnection
import java.net.URL

@Component
class SystembolagetProductServiceImpl : SystembolagetProductService {
    val URL = "https://api-extern.systembolaget.se/sb-api-ecommerce/v1/productsearch/search?"
    lateinit var anslutning : HttpURLConnection

    init {
        var url: URL = URL(URL)
        anslutning = url.openConnection() as HttpURLConnection
        anslutning.requestMethod = "GET"
    }

    override fun hämtaSida(sida: Int) {
        TODO("Not yet implemented")
    }

    override fun hämtaSida(sida: Int, affär: Int) {
        TODO("Not yet implemented")
    }

    private fun hämtaInnehåll() {
    }

}