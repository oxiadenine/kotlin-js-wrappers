package samples.localeprovider

import antd.localeprovider.*
import antd.pagination.*
import react.*
import react.dom.*
import styled.*

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
    styledDiv {
        css { LocaleProviderStyles.basic }
        localeProvider {
            attrs.locale = zhCN
            basicApp()
        }
    }
}
