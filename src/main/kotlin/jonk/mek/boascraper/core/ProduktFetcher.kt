package jonk.mek.boascraper.core

import com.google.gson.Gson
import com.google.gson.JsonParser
import jonk.mek.boascraper.core.port.RestService
import jonk.mek.boascraper.model.SystembolagetProduct
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ProduktFetcher(bolagetService: RestService) {
    var bolagetService = bolagetService
    var logger = LoggerFactory.getLogger(this.javaClass)
    var nextPage: Int? = null
    var gson = Gson()

    fun laddaDatabasMedAllaProdukter() {
        for (i in 0..5) {
            skapaProduktlista(i)
        }
    }

    private fun skapaProduktlista(sida: Int) {
        var res = bolagetService.hämtaProdukter(sida)
        val produktLista = mutableListOf<SystembolagetProduct>()
        //logger.debug(res)

        val produktJsonArray = JsonParser.parseString(res).asJsonObject?.getAsJsonArray("products")


        if (produktJsonArray != null) {
            for (produktJson in produktJsonArray) {
                produktLista.add(gson.fromJson(produktJson, SystembolagetProduct::class.java))
            }
        }

        logger.debug("har hämtat {} produkter.", produktLista.size)

        logger.debug("produkt {} är: {}", 5, produktLista.get(5).toString())
    }





}