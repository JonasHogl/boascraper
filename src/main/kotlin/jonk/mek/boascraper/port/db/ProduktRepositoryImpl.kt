package jonk.mek.boascraper.port.db

import jonk.mek.boascraper.core.port.db.ProduktRepository
import jonk.mek.boascraper.model.SystembolagetProduct
import org.slf4j.LoggerFactory
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.text.SimpleDateFormat
import javax.sql.DataSource

@Service
class ProduktRepositoryImpl(private val jdbcTemplate: JdbcTemplate) : ProduktRepository {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val logger = LoggerFactory.getLogger(this.javaClass)

    val GET_ALL_PRODUCTS: String = "SELECT * FROM product"
    val GET_PRODUCT: String = "SELECT * FROM product WHERE product_id = ?"
    val INSERT_PRODUCT: String = """
            INSERT INTO product (
                product_id, product_number, product_name_bold,
                product_name_thin, category, product_number_short,
                producer_name, supplier_name, is_kosher,
                bottle_text, restricted_parcel_quantity, is_organic,
                is_sustainable_choice, is_climate_smart_packaging,
                is_ethical, ethical_label, is_web_launch,
                product_launch_date, sell_start_time,
                is_completely_out_of_stock, is_temporary_out_of_stock,
                alcohol_percentage, volume_text, volume, price,
                country, origin_level1, origin_level2,
                category_level1, category_level2, category_level3,
                category_level4, custom_category_title, assortment_text,
                usage, taste, taste_symbols, taste_clock_group_bitter,
                taste_clock_group_smokiness, taste_clock_bitter, taste_clock_fruitacid,
                taste_clock_body, taste_clock_roughness, taste_clock_sweetness,
                taste_clock_smokiness, taste_clock_casque, assortment, recycle_fee,
                is_manufacturing_country, is_regional_restricted,
                packaging_level1, is_news, is_discontinued,
                is_supplier_temporary_not_available, sugar_content,
                sugar_content_gram_per_100ml, seal, vintage, grapes,
                other_selections, taste_clocks, color, dish_points
            ) VALUES (
                ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
                ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
                ?, ?, ?, ?, ?, ?, ?, ?
            )
        """

    override fun hämtaAllaProdukter(): List<SystembolagetProduct> {
        return jdbcTemplate.query(GET_ALL_PRODUCTS, ProduktRowMapper())
    }

    override fun hämtaProdukt(productId: String): SystembolagetProduct {
        val produkt: SystembolagetProduct? = try {
            jdbcTemplate.queryForObject(GET_PRODUCT, ProduktRowMapper(), productId)
        } catch (e: Exception) {
            logger.error("Kunde inte hämta produkt: {}", productId)
            throw e //TODO lös skitn
        }

        produkt?.let { return it }


        throw Exception("Hittade inte någon produkt med id: ${productId}")
    }

    override fun laddaInProdukt(produkt: SystembolagetProduct) {
        jdbcTemplate.update(
            INSERT_PRODUCT,
            produkt.productId,
            produkt.productNumber,
            produkt.productNameBold,
            produkt.productNameThin,
            produkt.category,
            produkt.productNumberShort,
            produkt.producerName,
            produkt.supplierName,
            produkt.isKosher,
            produkt.bottleText,
            produkt.restrictedParcelQuantity,
            produkt.isOrganic,
            produkt.isSustainableChoice,
            produkt.isClimateSmartPackaging,
            produkt.isEthical,
            produkt.ethicalLabel,
            produkt.isWebLaunch,
            produkt.productLaunchDate,
            produkt.sellStartTime,
            produkt.isCompletelyOutOfStock,
            produkt.isTemporaryOutOfStock,
            produkt.alcoholPercentage,
            produkt.volumeText,
            produkt.volume,
            produkt.price,
            produkt.country,
            produkt.originLevel1,
            produkt.originLevel2,
            produkt.categoryLevel1,
            produkt.categoryLevel2,
            produkt.categoryLevel3,
            produkt.categoryLevel4,
            produkt.customCategoryTitle,
            produkt.assortmentText,
            produkt.usage,
            produkt.taste,
            produkt.tasteSymbols.joinToString(","),
            produkt.tasteClockGroupBitter,
            produkt.tasteClockGroupSmokiness,
            produkt.tasteClockBitter,
            produkt.tasteClockFruitacid,
            produkt.tasteClockBody,
            produkt.tasteClockRoughness,
            produkt.tasteClockSweetness,
            produkt.tasteClockSmokiness,
            produkt.tasteClockCasque,
            produkt.assortment,
            produkt.recycleFee,
            produkt.isManufacturingCountry,
            produkt.isRegionalRestricted,
            produkt.packagingLevel1,
            produkt.isNews,
            produkt.isDiscontinued,
            produkt.isSupplierTemporaryNotAvailable,
            produkt.sugarContent,
            produkt.sugarContentGramPer100ml,
            produkt.seal.joinToString(""),
            produkt.vintage,
            produkt.grapes.joinToString(","),
            produkt.otherSelections,
            produkt.tasteClocks.joinToString(","),
            produkt.color,
            produkt.dishPoints
        )
    }

    override fun laddaInProdukter(produkter: List<SystembolagetProduct>) {
        TODO("Not yet implemented")
    }

    override fun hämtaAllaProduktId(): List<String> {
        TODO("Not yet implemented")
    }

    override fun updateraProdukt(produkt: SystembolagetProduct) {
        TODO("Not yet implemented")
    }

    override fun taBortProdukt(produkt: SystembolagetProduct) {
        TODO("Not yet implemented")
    }

    private fun hämtaEttObjekt(query: String, )


}