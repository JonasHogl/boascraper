package jonk.mek.boascraper.core

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import jonk.mek.boascraper.commons.exceptions.HttpResponseParsingException
import jonk.mek.boascraper.core.port.SystembolagetProductService
import jonk.mek.boascraper.model.Produkt
import okhttp3.Response
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProduktFetcher(bolagetService: SystembolagetProductService) {
    var bolagetService = bolagetService
    var logger = LoggerFactory.getLogger(this.javaClass)
    var nextPage: Int? = null
    val factory = JsonFactory()

    fun laddaDatabasMedProdukter() {
        try {
            val produktlista = parsaSvar(bolagetService.hämtaProdukter1(1), 1)
        } catch (_: HttpResponseParsingException) {
            logger.error("Fel inträffade vid parsning av produkter")
        }

    }

    private fun parsaSvar(res: Response, currentPage: Int): List<Produkt> {
        val responseString = res.body?.string() ?: throw HttpResponseParsingException("Http svar kunde inte hämtas")
        val parser = factory.createParser(responseString)


        val produktLista: List<Produkt>
        while (!parser.isClosed) {
            val token = parser.nextToken()
            if (token == JsonToken.FIELD_NAME ) {
                val name = parser.currentName
                parser.nextToken()
                when (name) {
                    "nextPage" -> {
                        if (parser.intValue == currentPage) {
                            return Collections.emptyList()
                        }
                    }
                    "products" -> {
                        // TODO: parsa produkter och spara dem i en lista utav proukter
                    }
                }
            }
        }
    }

    private fun parsaProdukter(parser: JsonParser): List<Produkt> {
        val produktLista = ArrayList<Produkt>()
        while (!parser.isClosed) {

        }
    }



}