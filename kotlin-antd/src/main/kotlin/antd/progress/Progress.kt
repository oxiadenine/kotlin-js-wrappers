@file:JsModule("antd/lib/progress")
@file:JsNonModule

package antd.progress

import antd.ReactNode
import react.*

@JsName("default")
external object ProgressComponent : Component<ProgressProps, State> {
    override fun render(): ReactElement?
}

external interface ProgressProps : Props {
    var prefixCls: String?
    var className: String?
    var type: ProgressType?
    var percent: Number?
    var format: ((percent: Number?, successPercent: Number?) -> ReactNode)?
    var status: ProgressStatus?
    var showInfo: Boolean?
    var strokeWidth: Number?
    var strokeLinecap: String? /* "butt" | "square" | "round" */
    var strokeColor: Any? /* String | ProgressGradient */
    var trailColor: String?
    var width: Number?
    var success: SuccessProps?
    var style: dynamic
    var gapDegree: Number?
    var gapPosition: String? /* '"op" | "bottom" | "left" | "right" */
    var size: ProgressSize?
    var steps: Number?
    var successPercent: Number?
}

external interface SuccessProps {
    var percent: Number?
    var progress: Number?
    var strokeColor: String?
}

external interface ProgressGradient : StringGradients, FromToGradients {
    var direction: String?
}

external interface FromToGradients {
    var from: String
    var to: String
}

external interface StringGradients
