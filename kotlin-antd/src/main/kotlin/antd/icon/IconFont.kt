@file:JsModule("@ant-design/icons/lib")
@file:JsNonModule

package antd.icon

import react.*

@JsName("createFromIconfontCN")
external fun createFromIconfontCN(options: CustomIconOptions? = definedExternally): ComponentType<IconFontProps>

external interface CustomIconOptions {
    var scriptUrl: Any /* String | Array<String> */
    var extraCommonProps: dynamic
}

external interface IconFontProps : IconBaseProps, RProps {
    var type: String
}
