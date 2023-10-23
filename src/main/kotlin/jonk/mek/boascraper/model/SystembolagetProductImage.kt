package jonk.mek.boascraper.model

data class SystembolagetProductImage(
    val imageUrl: String,
    val fileType: String?,
    val size: String?
) {
    data class Builder(
        var imageUrl: String = "",
        var fileType: String? = null,
        var size: String? = null
    ) {
        fun build() = SystembolagetProductImage(imageUrl, fileType, size)
    }
}
