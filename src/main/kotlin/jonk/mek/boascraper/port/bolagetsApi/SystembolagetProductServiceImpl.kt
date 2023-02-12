package jonk.mek.boascraper.port.bolagetsApi

import jonk.mek.boascraper.core.port.SystembolagetProductService
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.springframework.stereotype.Component

@Component
class SystembolagetProductServiceImpl : SystembolagetProductService {
    val URL = "https://www.systembolaget.se/api/gateway/productsearch/search/"
    var client: OkHttpClient = OkHttpClient()

    override fun hämtaProdukter(): Response {
        return client.newCall(Request.Builder()
                .url(URL)
                .addHeader("Authorization", "Bearer cfc702aed3094c86b92d6d4ff7a54c84")
                .addHeader("baseurl", "https://api-systembolaget.azure-api.net/sb-api-ecommerce/v1")
                .build())
            .execute()
    }

    override fun hämtaProdukter(sida: Int, affär: Int) {
        TODO("Not yet implemented")
    }

    /*
    private fun skapaRequest(): HttpRequest {
        return HttpRequest.newBuilder()
            .uri(URI(URL))
            .GET()
            .setHeader()
            .setHeader()
            .build()
    }*/

}