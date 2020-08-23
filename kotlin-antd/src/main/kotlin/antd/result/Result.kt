@file:JsModule("antd/lib/result")
@file:JsNonModule

package antd.result

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object ResultComponent : Component<ResultProps, RState> {
    override fun render(): ReactElement?
}

external interface ResultProps : PrivateSVG, RProps {
    var icon: ReactElement?
    var status: ResultStatusType
    var title: Any? /* String | ReactElement */
    var subTitle: Any? /* String | ReactElement */
    var extra: Any? /* String | ReactElement | Array<ReactElement> */
    var prefixCls: String?
    var className: String?
    var style: dynamic
}

external interface PrivateSVG {
    var PRESENTED_IMAGE_404: ReactElement
    var PRESENTED_IMAGE_403: ReactElement
    var PRESENTED_IMAGE_500: ReactElement
}
