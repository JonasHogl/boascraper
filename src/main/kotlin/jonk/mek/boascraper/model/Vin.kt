package jonk.mek.boascraper.model

data class Vin(
    override var productId: Int,
    override var productNumber: Int,
    override var categoryLevel1: String,
    override var categoryLevel2: String,
    override var categoryLevel3: String,
    override var categoryLevel4: String,
    override var price: Int,
    override var volumeText: String,
    override var country: String,
    override var originLevel1: String,
    override var originLevel2: String,

    var vintage: String,
    var grapes: List<String>,



) : Produkt() {
}