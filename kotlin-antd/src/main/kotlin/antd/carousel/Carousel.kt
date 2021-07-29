@file:JsModule("antd/lib/carousel")
@file:JsNonModule

package antd.carousel

import antd.ReactNode
import antd.RefAttributes
import react.*

@JsName("default")
external object CarouselComponent : Component<CarouselProps, State> {
    override fun render(): ReactElement?
}

external interface CarouselProps : Settings, RefAttributes<CarouselRef>, RProps {
    var effect: CarouselEffect?
    var style: dynamic
    var prefixCls: String?
    var slickGoTo: Number?
    var dotPosition: DotPosition?
    var children: ReactNode?
    override var dots: Any? /* Boolean | SettingsDots */
}

external interface CarouselRef {
    var goTo: (slide: Number, dontAnimate: Boolean) -> Unit
    var next: () -> Unit
    var prev: () -> Unit
    var autoPlay: Boolean
    var innerSlider: Any
}
