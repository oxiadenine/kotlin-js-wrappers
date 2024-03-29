@file:JsModule("@ant-design/icons/lib")
@file:JsNonModule

package antd.icon

import react.*

@JsName("createFromIconfontCN")
external fun createFromIconfontCN(options: CustomIconOptions? = definedExternally): ComponentClass<IconFontProps>

external interface CustomIconOptions {
    var scriptUrl: Any /* String | Array<String> */
    var extraCommonProps: dynamic
}

external interface IconFontProps : IconBaseProps, Props {
    var type: String
}
