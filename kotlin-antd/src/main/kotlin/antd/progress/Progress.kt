@file:JsModule("antd/lib/progress")

package antd.progress

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object ProgressComponent : Component<ProgressProps, RState> {
    override fun render(): ReactElement?
}

external interface ProgressProps : RProps {
    var prefixCls: String?
    var className: String?
    var type: ProgressType?
    var percent: Number?
    var successPercent: Number?
    var format: ((percent: Number?, successPercent: Number?) -> Any /* String | ReactElement */)?
    var status: ProgressStatus?
    var showInfo: Boolean?
    var strokeWidth: Number?
    var strokeLinecap: String?
    var strokeColor: Any? /* String | ProgressGradient */
    var trailColor: String?
    var width: Number?
    var style: dynamic
    var gapDegree: Number?
    var gapPosition: ProgressGapPosition?
    var size: ProgressSize?
}

external interface ProgressGradient : StringGradients, FromToGradients {
    var direction: String?
}

external interface FromToGradients {
    var from: String
    var to: String
}

external interface StringGradients {
    /* [percentage: String]: String */
}
