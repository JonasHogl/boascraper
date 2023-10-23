package jonk.mek.boascraper.core.port

import okhttp3.Response
import java.io.Reader

interface SystembolagetProductService {
    fun hämtaProdukter(sida: Int): String
}