package jonk.mek.boascraper.core.port

interface SystembolagetProductService {
    abstract fun hämtaSida(sida: Int)

    abstract fun hämtaSida(sida: Int, affär: Int)
}