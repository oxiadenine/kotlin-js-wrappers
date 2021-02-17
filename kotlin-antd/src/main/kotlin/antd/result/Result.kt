@file:JsModule("antd/lib/result")
@file:JsNonModule

package antd.result

import react.*

@JsName("default")
external object ResultComponent : Component<ResultProps, RState> {
    val PRESENTED_IMAGE_404: Any /* String | ReactElement */
    val PRESENTED_IMAGE_403: Any /* String | ReactElement */
    val PRESENTED_IMAGE_500: Any /* String | ReactElement */

    override fun render(): ReactElement?
}

external interface ResultProps : RProps {
    var icon: Any /* String | ReactElement */
    var status: ResultStatusType?
    var title: Any? /* String | ReactElement */
    var subTitle: Any? /* String | ReactElement */
    var extra: Any? /* String | ReactElement | Array<ReactElement> */
    var prefixCls: String?
    var className: String?
    var style: dynamic
}
