package name.anton3.vkapi.methods.upload

fun guessContentTypeByFilename(fileName: String): String {
    return when (fileName.substringAfterLast(".").toLowerCase()) {
        "jpg" -> "image/jpg"
        "jpeg" -> "image/jpg"
        "gif" -> "image/gif"
        "png" -> "image/png"

        "rar" -> "application/x-rar-compressed"
        "zip" -> "application/zip"

        "doc" -> "application/msword"
        "csv" -> "text/csv"
        else -> "application/octet-stream"
    }
}
