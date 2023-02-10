package jonk.mek.boascraper.port.bolagetsApi

import jonk.mek.boascraper.core.port.SystembolagetProductService
import org.springframework.stereotype.Component
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@Component
class SystembolagetProductServiceImpl : SystembolagetProductService {
    val URL = "https://www.systembolaget.se/api/gateway/productsearch/search/"
    var client: HttpClient = HttpClient.newBuilder().build()

    override fun hämtaProdukter(): HttpResponse<String> {
        return client.send(skapaRequest(), HttpResponse.BodyHandlers.ofString() )
    }

    override fun hämtaProdukter(sida: Int, affär: Int) {
        TODO("Not yet implemented")
    }

    private fun skapaRequest(): HttpRequest {
        return HttpRequest.newBuilder()
            .uri(URI(URL))
            .GET()
            .setHeader("Authorization", "Bearer cfc702aed3094c86b92d6d4ff7a54c84")
            .setHeader("baseurl", "https://api-systembolaget.azure-api.net/sb-api-ecommerce/v1")
            .build()
    }

}