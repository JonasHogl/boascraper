package jonk.mek.boascraper.model

import com.google.gson.annotations.SerializedName

data class SystembolagetProduct(
    @SerializedName("productId")
    val productId: String,

    @SerializedName("productNumber")
    val productNumber: String,

    @SerializedName("productNameBold")
    val productNameBold: String,

    @SerializedName("productNameThin")
    val productNameThin: String,

    @SerializedName("category")
    val category: String? = null,

    @SerializedName("productNumberShort")
    val productNumberShort: String,

    @SerializedName("producerName")
    val producerName: String,

    @SerializedName("supplierName")
    val supplierName: String,

    @SerializedName("isKosher")
    val isKosher: Boolean,

    @SerializedName("bottleText")
    val bottleText: String,

    @SerializedName("restrictedParcelQuantity")
    val restrictedParcelQuantity: Int,

    @SerializedName("isOrganic")
    val isOrganic: Boolean,

    @SerializedName("isSustainableChoice")
    val isSustainableChoice: Boolean,

    @SerializedName("isClimateSmartPackaging")
    val isClimateSmartPackaging: Boolean,

    @SerializedName("isEthical")
    val isEthical: Boolean,

    @SerializedName("ethicalLabel")
    val ethicalLabel: String? = null,

    @SerializedName("isWebLaunch")
    val isWebLaunch: Boolean,

    @SerializedName("productLaunchDate")
    val productLaunchDate: String,

    @SerializedName("sellStartTime")
    val sellStartTime: String,

    @SerializedName("isCompletelyOutOfStock")
    val isCompletelyOutOfStock: Boolean,

    @SerializedName("isTemporaryOutOfStock")
    val isTemporaryOutOfStock: Boolean,

    @SerializedName("alcoholPercentage")
    val alcoholPercentage: Double,

    @SerializedName("volumeText")
    val volumeText: String,

    @SerializedName("volume")
    val volume: Double,

    @SerializedName("price")
    val price: Double,

    @SerializedName("country")
    val country: String,

    @SerializedName("originLevel1")
    val originLevel1: String? = null,

    @SerializedName("originLevel2")
    val originLevel2: String? = null,

    @SerializedName("categoryLevel1")
    val categoryLevel1: String,

    @SerializedName("categoryLevel2")
    val categoryLevel2: String? = null,

    @SerializedName("categoryLevel3")
    val categoryLevel3: String? = null,

    @SerializedName("categoryLevel4")
    val categoryLevel4: String? = null,

    @SerializedName("customCategoryTitle")
    val customCategoryTitle: String,

    @SerializedName("assortmentText")
    val assortmentText: String,

    @SerializedName("usage")
    val usage: String,

    @SerializedName("taste")
    val taste: String,

    @SerializedName("tasteSymbols")
    val tasteSymbols: List<String>,

    @SerializedName("tasteClockGroupBitter")
    val tasteClockGroupBitter: Int? = null,

    @SerializedName("tasteClockGroupSmokiness")
    val tasteClockGroupSmokiness: Int? = null,

    @SerializedName("tasteClockBitter")
    val tasteClockBitter: Int,

    @SerializedName("tasteClockFruitacid")
    val tasteClockFruitacid: Int,

    @SerializedName("tasteClockBody")
    val tasteClockBody: Int,

    @SerializedName("tasteClockRoughness")
    val tasteClockRoughness: Int,

    @SerializedName("tasteClockSweetness")
    val tasteClockSweetness: Int,

    @SerializedName("tasteClockSmokiness")
    val tasteClockSmokiness: Int,

    @SerializedName("tasteClockCasque")
    val tasteClockCasque: Int,

    @SerializedName("assortment")
    val assortment: String,

    @SerializedName("recycleFee")
    val recycleFee: Double,

    @SerializedName("isManufacturingCountry")
    val isManufacturingCountry: Boolean,

    @SerializedName("isRegionalRestricted")
    val isRegionalRestricted: Boolean,

    @SerializedName("packagingLevel1")
    val packagingLevel1: String,

    @SerializedName("isNews")
    val isNews: Boolean,

    @SerializedName("images")
    val images: List<SystembolagetProductImage>,

    @SerializedName("isDiscontinued")
    val isDiscontinued: Boolean,

    @SerializedName("isSupplierTemporaryNotAvailable")
    val isSupplierTemporaryNotAvailable: Boolean,

    @SerializedName("sugarContent")
    val sugarContent: Int,

    @SerializedName("sugarContentGramPer100ml")
    val sugarContentGramPer100ml: Double,

    @SerializedName("seal")
    val seal: List<String>,

    @SerializedName("vintage")
    val vintage: String? = null,

    @SerializedName("grapes")
    val grapes: List<String>,

    @SerializedName("otherSelections")
    val otherSelections: List<Any?>? = null,

    @SerializedName("tasteClocks")
    val tasteClocks: List<SystembolagetTasteClock>,

    @SerializedName("color")
    val color: String,

    @SerializedName("dishPoints")
    val dishPoints: List<Any?>?
)
