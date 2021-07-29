package samples.localeprovider

import antd.localeprovider.localeProvider
import antd.localeprovider.zhCN
import antd.pagination.pagination
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

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
