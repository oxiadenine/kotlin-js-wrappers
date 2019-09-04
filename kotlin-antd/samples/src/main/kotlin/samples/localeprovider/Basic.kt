package samples.localeprovider

import antd.localeprovider.localeProvider
import antd.localeprovider.zhCN
import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basicApp() {
    div {
        pagination {
            attrs {
                defaultCurrent = 1
                total = 50
                showSizeChanger = true
            }
        }
    }
}

fun RBuilder.basic() {
    div("locale-provider-container") {
        attrs.id = "locale-provider-basic"
        localeProvider {
            attrs.locale = zhCN
            basicApp()
        }
    }
}
