package jonk.mek.boascraper.port.bolagetsApi

import jonk.mek.boascraper.core.port.SystembolagetProductService
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.util.Objects.nonNull

private const val SCHEME = "https"
private const val URL = "www.systembolaget.se"
private const val PATH = "/api/gateway/productsearch/search/"

private const val BASEURL = "https://api-systembolaget.azure-api.net/sb-api-ecommerce/v1"

@Component
class SystembolagetProductServiceImpl : SystembolagetProductService {
    var client: OkHttpClient = OkHttpClient()
    val logger = LoggerFactory.getLogger(this.javaClass)

    @Value("\${product-config.amount-of-products-fetched-per-call}")
    val amountOfProducts: Long? = null

    /**
     * Svaret som hämtas från denna metod MÅSTE stängas manuellt.
     */
    override fun hämtaProdukter1(sida: Int): Response {
        val request = Request.Builder()
            .url(requestUrl(sida))
            .addHeader("baseurl", BASEURL)
            .build()

        return client.newCall(request).execute()
    }

    /**
     * Auto-closable hantering utav http-svaret
     */
    override fun hämtaProdukter2(sida: Int): String {
        val request = Request.Builder()
            .url(requestUrl(sida))
            .addHeader("baseurl", BASEURL)
            .build()

        val response = client.newCall(request).execute()

        response.use {
            return it.body?.string() ?: "Error fetching response"
        }
    }


    private fun requestUrl(page: Int): HttpUrl {
        logger.debug("size: {}, page: {}", amountOfProducts.toString(), page)
        return HttpUrl.Builder()
            .scheme(SCHEME)
            .host(URL)
            .addPathSegment(PATH)
            .addQueryParameter("size", amountOfProducts.toString())
            .addQueryParameter("page", page.toString())
            .build()
    }
}