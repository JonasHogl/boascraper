package jonk.mek.boascraper.core.port

import okhttp3.Response

interface SystembolagetProductService {
    fun hämtaProdukter1(sida: Int): Response
    fun hämtaProdukter2(sida: Int): String
}