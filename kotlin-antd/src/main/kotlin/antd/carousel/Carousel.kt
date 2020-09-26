@file:JsModule("antd/lib/carousel")
@file:JsNonModule

package antd.carousel

import react.*

@JsName("default")
external object CarouselComponent : Component<CarouselProps, RState> {
    override fun render(): ReactElement?
}

external interface CarouselProps : Settings, RProps {
    var effect: CarouselEffect?
    var style: dynamic
    var prefixCls: String?
    var slickGoTo: Number?
    var dotPosition: DotPosition?
    var children: ReactElement?
}
