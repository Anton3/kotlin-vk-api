package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class Period(@get:JsonValue val value: String) {
    DAY("day"),
    MONTH("month"),
    OVERALL("overall")
}
