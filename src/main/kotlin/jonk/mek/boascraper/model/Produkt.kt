package jonk.mek.boascraper.model

abstract class Produkt {
    abstract var productId: Int
    abstract var productNumber: Int
    abstract var categoryLevel1: String
    abstract var categoryLevel2: String
    abstract var categoryLevel3: String
    abstract var categoryLevel4: String
    abstract var price: Int
    abstract var volumeText: String
    abstract var country: String
    abstract var originLevel1: String
    abstract var originLevel2: String
}
