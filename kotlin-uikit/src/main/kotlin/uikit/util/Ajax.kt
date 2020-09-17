package uikit.util

import org.w3c.xhr.XMLHttpRequest

external interface Environment {
    var data: dynamic
    var method: String
    var headers: dynamic
    var xhr: XMLHttpRequest
    var beforeSend: dynamic
    var responseType: String
}
