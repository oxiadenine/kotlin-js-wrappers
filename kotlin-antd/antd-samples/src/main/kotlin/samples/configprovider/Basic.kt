package samples.configprovider

import antd.button.button
import antd.configprovider.configProvider
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +ConfigProviderStyles.basic }
        configProvider {
            button { +"My Button" }
        }
    }
}
