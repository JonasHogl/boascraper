package jonk.mek.boascraper.core.port

import java.net.http.HttpResponse

interface SystembolagetProductService {
    abstract fun hämtaProdukter(): HttpResponse<String>

    abstract fun hämtaProdukter(sida: Int, affär: Int)
}