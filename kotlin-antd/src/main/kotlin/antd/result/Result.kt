@file:JsModule("antd/lib/result")
@file:JsNonModule

package antd.result

import antd.ReactNode
import react.*

@JsName("default")
external object ResultComponent : Component<ResultProps, RState> {
    val PRESENTED_IMAGE_404: Any /* String | ReactElement */
    val PRESENTED_IMAGE_403: Any /* String | ReactElement */
    val PRESENTED_IMAGE_500: Any /* String | ReactElement */

    override fun render(): ReactElement?
}

external interface ResultProps : RProps {
    var icon: ReactNode
    var status: ResultStatusType?
    var title: ReactNode?
    var subTitle: ReactNode?
    var extra: Any? /* ReactNode | Array<ReactNode> */
    var prefixCls: String?
    var className: String?
    var style: dynamic
}
