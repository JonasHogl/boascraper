package jonk.mek.boascraper.core.port

interface RestService {
    fun hämtaProdukter(sida: Int): String
}