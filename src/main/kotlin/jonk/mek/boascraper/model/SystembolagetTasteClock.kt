package jonk.mek.boascraper.model

data class SystembolagetTasteClock(
    val key: String,
    val value: Int
) {
    data class Builder(
        var key: String = "",
        var value: Int = 0
    ) {
        fun build() = SystembolagetTasteClock(key, value)
    }
}
