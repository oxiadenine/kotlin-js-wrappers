package reactintl

enum class IntlErrorCode {
    FORMAT_ERROR,
    UNSUPPORTED_FORMATTER,
    INVALID_CONFIG,
    MISSING_DATA,
    MISSING_TRANSLATION
}

open class IntlError(val code: IntlErrorCode, message: String?, cause: Throwable?) : Error(message, cause)
