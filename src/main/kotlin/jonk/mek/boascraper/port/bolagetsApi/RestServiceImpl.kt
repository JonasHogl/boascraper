package jonk.mek.boascraper.port.bolagetsApi

import jonk.mek.boascraper.core.port.RestService
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

private const val SCHEME = "https"
private const val URL = "api-extern.systembolaget.se"
private const val PATH = "sb-api-ecommerce/v1/productsearch/search"

private const val BASEURL = "https://api-systembolaget.azure-api.net/sb-api-ecommerce/v1"

@Component
class RestServiceImpl : RestService {
    var client: OkHttpClient = OkHttpClient()
    val logger = LoggerFactory.getLogger(this.javaClass)

    @Value("\${product-config.amount-of-products-fetched-per-call}")
    val amountOfProducts: Long? = null


    /**
     * Auto-closable hantering utav http-svaret
     */
    override fun hämtaProdukter(sida: Int): String {
        val request = Request.Builder()
            .url(
                HttpUrl.Builder()
                    .scheme(SCHEME)
                    .host(URL)
                    .addPathSegments(PATH)
                    .addQueryParameter("size", amountOfProducts.toString())
                    .addQueryParameter("page", sida.toString())
                    .build())
            .addHeader("ocp-apim-subscription-key", "cfc702aed3094c86b92d6d4ff7a54c84")
            .build()

        val response = client.newCall(request).execute()

        response.use {
            return it.body?.string() ?: "Kunde inte hämta svaret"
        }
    }
}