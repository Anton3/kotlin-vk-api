package name.alatushkin.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import java.io.IOException

object UnitDeserializer : StdDeserializer<Unit>(Unit::class.java) {
    @Suppress("RedundantUnitReturnType")
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Unit {
        val value = p.readValueAs(Int::class.java)
        if (value != 1) throw IOException("Incorrect value $value, should be 1")
    }
}
