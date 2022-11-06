package jonk.mek.boascraper.port.bolagetsApi

import jonk.mek.boascraper.core.port.DatabasService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat

@Component
class DatabasServiceImpl : DatabasService{
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val logger = LoggerFactory.getLogger(this.javaClass)

    override fun loggaTask() {

    }
}