package jonk.mek.boascraper.model

class Produkt private constructor(
    val productId: Int?,
    val productNumber: Int?,
    val productNameBold: String?,
    val productNameThin: String?,
    val producerName: String?,
    val supplierName: String?,
    val category: String?,
    val categoryLevel1: String?,
    val categoryLevel2: String?,
    val categoryLevel3: String?,
    val categoryLevel4: String?,
    val price: Double?,
    val volume: Double?,
    val country: String?,
    val originLevel1: String?,
    val originLevel2: String?,
    val vintage: String?,
    val grapes: List<String>,
    val recycleFee: Int?,
    val isCompletelyOutOfStock: Boolean?,
    val isTemporaryOutOfStock: Boolean?,
    val isDiscontinued: Boolean?,
    val imageUrl: String?,
    val productLaunchDate: String?
    ) {
    data class Builder(
        var productId: Int? = null,
        var productNumber: Int? = null,
        var productNameBold: String? = null,
        var productNameThin: String? = null,
        var producerName: String? = null,
        var supplierName: String? = null,
        var category: String? = null,
        var categoryLevel1: String? = null,
        var categoryLevel2: String? = null,
        var categoryLevel3: String? = null,
        var categoryLevel4: String? = null,
        var price: Double? = null,
        var volume: Double? = null,
        var country: String? = null,
        var originLevel1: String? = null,
        var originLevel2: String? = null,
        var vintage: String? = null,
        var grapes: MutableList<String> = ArrayList(),
        var recycleFee: Int? = null,
        var isCompletelyOutOfStock: Boolean? = null,
        var isTemporaryOutOfStock: Boolean? = null,
        var isDiscontinued: Boolean? = null,
        var Url: String? = null,
        var productLaunchDate: String? = null) {

        fun productId(productId: Int) = apply { this.productId = productId }
        fun productNumber(productNumber: Int) = apply { this.productNumber = productNumber }
        fun recycleFee(recycleFee: Int) = apply { this.recycleFee = recycleFee }
        fun productNameBold(productNameBold: String) = apply { this.productNameBold = productNameBold }
        fun productNameThin(productNameThin: String) = apply { this.productNameThin = productNameThin }
        fun producerName(producerName: String) = apply { this.producerName = producerName }
        fun supplierName(supplierName: String) = apply { this.supplierName = supplierName }
        fun category(category: String) = apply { this.category = category }
        fun categoryLevel1(categoryLevel1: String) = apply { this.categoryLevel1 = categoryLevel1 }
        fun categoryLevel2(categoryLevel2: String) = apply { this.categoryLevel2 = categoryLevel2 }
        fun categoryLevel3(categoryLevel3: String) = apply { this.categoryLevel3 = categoryLevel3 }
        fun categoryLevel4(categoryLevel4: String) = apply { this.categoryLevel4 = categoryLevel4 }
        fun country(country: String) = apply { this.country = country }
        fun originLevel1(originLevel1: String) = apply { this.originLevel1 = originLevel1 }
        fun originLevel2(originLevel2: String) = apply { this.originLevel2 = originLevel2 }
        fun vintage(vintage: String) = apply { this.vintage = vintage }
        fun imageUrl(imageUrl: String) = apply { this.imageUrl = imageUrl }
        fun productLaunchDate(productLaunchDate: String) = apply { this.productLaunchDate = productLaunchDate }
        fun price (price: Double) = apply { this.price = price }
        fun volume (volume: Double) = apply { this.volume = volume }
        fun grapes (grape: String) = this.grapes.add(grape)
        fun isCompletelyOutOfStock (isCompletelyOutOfStock: Boolean) = apply { this.isCompletelyOutOfStock = isCompletelyOutOfStock }
        fun isTemporaryOutOfStock (isTemporaryOutOfStock: Boolean) = apply { this.isTemporaryOutOfStock = isTemporaryOutOfStock }
        fun isDiscontinued (isDiscontinued: Boolean) = apply { this.isDiscontinued = isDiscontinued }
        fun build() = Produkt(productId, productNumber, productNameBold, productNameThin, producerName, supplierName, category, categoryLevel1, categoryLevel2, categoryLevel3, categoryLevel4, price, volume, country, originLevel1, originLevel2, vintage, grapes, recycleFee, isCompletelyOutOfStock, isTemporaryOutOfStock, isDiscontinued, imageUrl, productLaunchDate)

    }
}
