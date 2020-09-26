package samples.configprovider

import antd.button.*
import antd.configprovider.*
import react.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +ConfigProviderStyles.basic }
        configProvider {
            button { +"My Button" }
        }
    }
}
