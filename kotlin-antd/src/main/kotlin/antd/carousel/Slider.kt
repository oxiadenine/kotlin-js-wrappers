package antd.carousel

import react.*

external object SliderComponent : Component<SlideProps, RState> {
    fun slickNext()
    fun slickPause()
    fun slickPlay()
    fun slickPrev()
    fun slickGoTo(slideNumber: Number, dontAnimate: Boolean? = definedExternally)

    override fun render(): ReactElement?
}

external interface SlideProps : Settings, RProps

external interface Settings {
    var accessibility: Boolean?
    var adaptiveHeight: Boolean?
    var afterChange: ((currentSlide: Number) -> Unit)?
    var appendDots: ((dots: ReactElement) -> Any)?
    var arrows: Boolean?
    var asNavFor: SliderComponent?
    var autoplaySpeed: Number?
    var autoplay: Boolean?
    var beforeChange: ((currentSlide: Number, nextSlide: Number) -> Unit)?
    var centerMode: Boolean?
    var centerPadding: String?
    var className: String?
    var cssEase: String?
    var customPaging: ((index: Number) -> Any)?
    var dotsClass: String?
    var dots: Boolean?
    var draggable: Boolean?
    var easing: String?
    var edgeFriction: Number?
    var fade: Boolean?
    var focusOnSelect: Boolean?
    var infinite: Boolean?
    var initialSlide: Number?
    var lazyLoad: LazyLoadTypes?
    var nextArrow: Any?
    var onEdge: ((swipeDirection: SwipeDirection) -> Unit)?
    var onInit: (() -> Unit)?
    var onLazyLoad: ((slidesToLoad: Array<Number>) -> Unit)?
    var onReInit: (() -> Unit)?
    var onSwipe: ((swipeDirection: SwipeDirection) -> Unit)?
    var pauseOnDotsHover: Boolean?
    var pauseOnFocus: Boolean?
    var pauseOnHover: Boolean?
    var prevArrow: Any?
    var responsive: Array<ResponsiveObject>?
    var rows: Number?
    var rtl: Boolean?
    var slide: String?
    var slidesPerRow: Number?
    var slidesToScroll: Number?
    var slidesToShow: Number?
    var speed: Number?
    var swipeToSlide: Boolean?
    var swipe: Boolean?
    var swipeEvent: ((swipeDirection: SwipeDirection) -> Unit)?
    var touchMove: Boolean?
    var touchThreshold: Number?
    var useCSS: Boolean?
    var useTransform: Boolean?
    var variableWidth: Boolean?
    var vertical: Boolean?
    var verticalSwiping: Boolean?
    var waitForAnimate: Boolean?
}

external interface ResponsiveObject {
    var breakpoint: Number
    var settings: Any /* "unslick" | Settings */
}
