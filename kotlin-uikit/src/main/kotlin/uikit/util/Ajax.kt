package uikit.util

import org.w3c.dom.Image
import org.w3c.xhr.*
import kotlin.js.Promise

external interface AjaxUtil {
    fun ajax(url: String? = definedExternally, options: dynamic = definedExternally): Promise<Environment>
    fun getImage(src: String, srcset: String? = definedExternally, sizes: String? = definedExternally): Promise<Image>
}

external interface Environment {
    var data: dynamic
    var method: String
    var headers: dynamic
    var xhr: XMLHttpRequest
    var beforeSend: dynamic
    var responseType: String
}
