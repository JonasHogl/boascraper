package jonk.mek.boascraper.port.db

import jonk.mek.boascraper.model.SystembolagetProduct
import jonk.mek.boascraper.model.SystembolagetProductImage
import jonk.mek.boascraper.model.SystembolagetTasteClock
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet

class ProduktRowMapper: RowMapper<SystembolagetProduct> {
    override fun mapRow(rs: ResultSet, rowNum: Int): SystembolagetProduct? {
        val tasteSymbolsArray = rs.getArray("taste_symbols")
        val tasteSymbols = tasteSymbolsArray?.array as Array<String>

        val imagesArray = rs.getArray("images")
        val images = imagesArray?.array as Array<SystembolagetProductImage>

        val sealArray = rs.getArray("seal")
        val seal = sealArray?.array as Array<String>

        val grapesArray = rs.getArray("grapes")
        val grapes = grapesArray?.array as Array<String>

        val otherSelectionsArray = rs.getArray("other_selections")
        val otherSelections = otherSelectionsArray?.array as List<Any?>

        val tasteClocksArray = rs.getArray("taste_clocks")
        val tasteClocks = tasteClocksArray?.array as Array<SystembolagetTasteClock>

        val dishPointsArray = rs.getArray("dish_points")
        val dishPoints = dishPointsArray?.array as List<Any?>

        return SystembolagetProduct(
            productId = rs.getString("product_id"),
            productNumber = rs.getString("product_number"),
            productNameBold = rs.getString("product_name_bold"),
            productNameThin = rs.getString("product_name_thin"),
            category = rs.getString("category"),
            productNumberShort = rs.getString("product_number_short"),
            producerName = rs.getString("producer_name"),
            supplierName = rs.getString("supplier_name"),
            isKosher = rs.getBoolean("is_kosher"),
            bottleText = rs.getString("bottle_text"),
            restrictedParcelQuantity = rs.getInt("restricted_parcel_quantity"),
            isOrganic = rs.getBoolean("is_organic"),
            isSustainableChoice = rs.getBoolean("is_sustainable_choice"),
            isClimateSmartPackaging = rs.getBoolean("is_climate_smart_packaging"),
            isEthical = rs.getBoolean("is_ethical"),
            ethicalLabel = rs.getString("ethical_label"),
            isWebLaunch = rs.getBoolean("is_web_launch"),
            productLaunchDate = rs.getString("product_launch_date"),
            sellStartTime = rs.getString("sell_start_time"),
            isCompletelyOutOfStock = rs.getBoolean("is_completely_out_of_stock"),
            isTemporaryOutOfStock = rs.getBoolean("is_temporary_out_of_stock"),
            alcoholPercentage = rs.getDouble("alcohol_percentage"),
            volumeText = rs.getString("volume_text"),
            volume = rs.getDouble("volume"),
            price = rs.getDouble("price"),
            country = rs.getString("country"),
            originLevel1 = rs.getString("origin_level1"),
            originLevel2 = rs.getString("origin_level2"),
            categoryLevel1 = rs.getString("category_level1"),
            categoryLevel2 = rs.getString("category_level2"),
            categoryLevel3 = rs.getString("category_level3"),
            categoryLevel4 = rs.getString("category_level4"),
            customCategoryTitle = rs.getString("custom_category_title"),
            assortmentText = rs.getString("assortment_text"),
            usage = rs.getString("usage"),
            taste = rs.getString("taste"),
            tasteSymbols = tasteSymbols.toList(),
            tasteClockGroupBitter = rs.getInt("taste_clock_group_bitter"),
            tasteClockGroupSmokiness = rs.getInt("taste_clock_group_smokiness"),
            tasteClockBitter = rs.getInt("taste_clock_bitter"),
            tasteClockFruitacid = rs.getInt("taste_clock_fruitacid"),
            tasteClockBody = rs.getInt("taste_clock_body"),
            tasteClockRoughness = rs.getInt("taste_clock_roughness"),
            tasteClockSweetness = rs.getInt("taste_clock_sweetness"),
            tasteClockSmokiness = rs.getInt("taste_clock_smokiness"),
            tasteClockCasque = rs.getInt("taste_clock_casque"),
            assortment = rs.getString("assortment"),
            recycleFee = rs.getDouble("recycle_fee"),
            isManufacturingCountry = rs.getBoolean("is_manufacturing_country"),
            isRegionalRestricted = rs.getBoolean("is_regional_restricted"),
            packagingLevel1 = rs.getString("packaging_level1"),
            isNews = rs.getBoolean("is_news"),
            images = images.toList(),
            isDiscontinued = rs.getBoolean("is_discontinued"),
            isSupplierTemporaryNotAvailable = rs.getBoolean("is_supplier_temporary_not_available"),
            sugarContent = rs.getInt("sugar_content"),
            sugarContentGramPer100ml = rs.getDouble("sugar_content_gram_per_100ml"),
            seal = seal.toList(),
            vintage = rs.getString("vintage"),
            grapes = grapes.toList(),
            otherSelections = otherSelections.toList(),
            tasteClocks = tasteClocks.toList(),
            color = rs.getString("color"),
            dishPoints = dishPoints.toList()
        )
    }
}