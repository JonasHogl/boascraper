package jonk.mek.boascraper.core.port.db

import jonk.mek.boascraper.model.SystembolagetProduct

interface ProduktRepository {
    fun hämtaAllaProdukter(): List<SystembolagetProduct>
    fun hämtaProdukt(productId: String): SystembolagetProduct
    fun laddaInProdukt(produkt: SystembolagetProduct)
    fun laddaInProdukter(produkter: List<SystembolagetProduct>)
    fun hämtaAllaProduktId(): List<String>
    fun updateraProdukt(produkt: SystembolagetProduct)
    fun taBortProdukt(produkt: SystembolagetProduct)

}