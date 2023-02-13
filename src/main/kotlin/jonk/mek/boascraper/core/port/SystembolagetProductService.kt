package jonk.mek.boascraper.core.port

import okhttp3.Response
import java.net.http.HttpResponse

interface SystembolagetProductService {
    abstract fun hämtaProdukter(): String

    abstract fun hämtaProdukter(sida: Int, affär: Int)
}