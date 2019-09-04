@file:JsModule("antd/lib/icon/IconFont")

package antd.icon

import react.Component
import react.RState

external interface CustomIconOptions {
    var scriptUrl: String
    var extraCommonProps: dynamic /* {
        [key: String]: Any
    } */
}

@JsName("create")
external fun create(options: CustomIconOptions? = definedExternally): Component<IconProps, RState>
