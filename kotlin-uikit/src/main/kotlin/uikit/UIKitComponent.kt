package uikit

import org.w3c.dom.Element
import uikit.components.*

external interface UIKitComponent {
    val icon: Icon
    val modal: Modal
    val notification: Notification

    fun accordion(element: UIKitElement, data: AccordionOptions? = definedExternally): AccordionComponent
    fun alert(element: UIKitElement, data: AlertOptions? = definedExternally): AlertComponent
    fun countdown(element: UIKitElement, data: CountdownOptions? = definedExternally): CountdownComponent
    fun cover(element: UIKitElement, data: CoverOptions? = definedExternally): CoverComponent
    fun drop(element: UIKitElement, data: DropOptions? = definedExternally): DropComponent
    fun dropdown(element: UIKitElement, data: DropdownOptions? = definedExternally): DropdownComponent
    fun filter(element: UIKitElement, data: FilterOptions? = definedExternally): FilterComponent
    fun formCustom(element: UIKitElement, data: FormOptions? = definedExternally): FormComponent
    fun grid(element: UIKitElement, data: GridOptions? = definedExternally): GridComponent
    fun heightMatch(element: UIKitElement, data: HeightOptions? = definedExternally): HeightComponent
    fun heightViewport(element: UIKitElement, data: HeightOptions? = definedExternally): HeightOptions
    fun icon(element: UIKitElement, data: IconOptions? = definedExternally): IconComponent
    fun img(element: UIKitElement, data: ImageOptions? = definedExternally): ImageComponent
    fun leader(element: UIKitElement, data: LeaderOptions? = definedExternally): LeaderComponent
    fun lightbox(element: UIKitElement, data: LightboxOptions? = definedExternally): LightboxComponent
    fun lightboxPanel(element: UIKitElement, data: LightboxPanelOptions? = definedExternally): LightboxPanelComponent
    fun margin(element: UIKitElement, data: MarginOptions? = definedExternally): MarginComponent
    fun modal(element: UIKitElement, data: ModalOptions? = definedExternally): ModalComponent
    fun nav(element: UIKitElement, data: NavOptions? = definedExternally): NavComponent
    fun navbar(element: UIKitElement, data: NavbarOptions? = definedExternally): NavbarComponent
    fun notification(
        element: UIKitElement = definedExternally,
        data: NotificationOptions? = definedExternally
    ): NotificationComponent

    fun notification(
        message: String,
        status: String? = definedExternally,
        options: NotificationOptions? = definedExternally
    ): NotificationComponent

    fun offcanvas(element: UIKitElement, data: OffCanvasOptions? = definedExternally): OffCanvasComponent
    fun parallax(element: UIKitElement, data: ParallaxOptions? = definedExternally): ParallaxComponent
    fun scroll(element: UIKitElement, data: ScrollOptions? = definedExternally): ScrollComponent
    fun scrollspy(element: UIKitElement, data: ScrollspyOptions? = definedExternally): ScrollspyComponent
    fun scrollspyNav(element: UIKitElement, data: ScrollspyNavOptions? = definedExternally): ScrollspyNavElement
    fun slider(element: UIKitElement, data: SliderOptions? = definedExternally): SliderComponent
    fun sliderParallax(element: UIKitElement, data: SliderOptions? = definedExternally): SliderComponent
    fun slideshow(element: UIKitElement, data: SlideshowOptions? = definedExternally): SlideshowComponent
    fun slideshowParallax(element: UIKitElement, data: SlideshowOptions? = definedExternally): SlideshowComponent
    fun sortable(element: UIKitElement, data: SortableOptions? = definedExternally): SortableComponent
    fun sticky(element: UIKitElement, data: StickyOptions? = definedExternally): StickyComponent
    fun svg(element: UIKitElement, data: SvgOptions? = definedExternally): SvgComponent
    fun switcher(element: UIKitElement, data: SwitcherOptions? = definedExternally): SwitcherComponent
    fun tab(element: UIKitElement, data: TabOptions? = definedExternally): TabComponent
    fun toggle(element: UIKitElement, data: ToggleOptions? = definedExternally): ToggleComponent
    fun tooltip(element: UIKitElement, data: TooltipOptions? = definedExternally): TooltipComponent
    fun upload(element: UIKitElement, data: UploadOptions? = definedExternally): UploadComponent
    fun video(element: UIKitElement, data: VideoOptions? = definedExternally): VideoComponent
}

external interface Component {
    var `$el`: Element
}
