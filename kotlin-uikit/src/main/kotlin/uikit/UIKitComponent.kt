package uikit

import org.w3c.dom.*
import uikit.components.*
import uikit.components.ScrollOptions

external interface UIKitComponent {
    val icon: Icon
    val modal: Modal
    val notification: Notification

    fun accordion(element: UIkitElement, data: AccordionOptions? = definedExternally): AccordionComponent
    fun alert(element: UIkitElement, data: AlertOptions? = definedExternally): AlertComponent
    fun countdown(element: UIkitElement, data: CountdownOptions? = definedExternally): CountdownComponent
    fun cover(element: UIkitElement, data: CoverOptions? = definedExternally): CoverComponent
    fun drop(element: UIkitElement, data: DropOptions? = definedExternally): DropComponent
    fun dropdown(element: UIkitElement, data: DropdownOptions? = definedExternally): DropdownComponent
    fun filter(element: UIkitElement, data: FilterOptions? = definedExternally): FilterComponent
    fun formCustom(element: UIkitElement, data: FormOptions? = definedExternally): FormComponent
    fun grid(element: UIkitElement, data: GridOptions? = definedExternally): GridComponent
    fun heightMatch(element: UIkitElement, data: HeightOptions? = definedExternally): HeightComponent
    fun heightViewport(element: UIkitElement, data: HeightOptions? = definedExternally): HeightOptions
    fun icon(element: UIkitElement, data: IconOptions? = definedExternally): IconComponent
    fun img(element: UIkitElement, data: ImageOptions? = definedExternally): ImageComponent
    fun leader(element: UIkitElement, data: LeaderOptions? = definedExternally): LeaderComponent
    fun lightbox(element: UIkitElement, data: LightboxOptions? = definedExternally): LightboxComponent
    fun lightboxPanel(element: UIkitElement, data: LightboxPanelOptions? = definedExternally): LightboxPanelComponent
    fun margin(element: UIkitElement, data: MarginOptions? = definedExternally): MarginComponent
    fun modal(element: UIkitElement, data: ModalOptions? = definedExternally): ModalComponent
    fun nav(element: UIkitElement, data: NavOptions? = definedExternally): NavComponent
    fun navbar(element: UIkitElement, data: NavbarOptions? = definedExternally): NavbarComponent
    fun notification(
        element: UIkitElement = definedExternally,
        data: NotificationOptions? = definedExternally
    ): NotificationComponent

    fun notification(
        message: String,
        status: String? = definedExternally,
        options: NotificationOptions? = definedExternally
    ): NotificationComponent

    fun offcanvas(element: UIkitElement, data: OffcanvasOptions? = definedExternally): OffcanvasComponent
    fun parallax(element: UIkitElement, data: ParallaxOptions? = definedExternally): ParallaxComponent
    fun scroll(element: UIkitElement, data: ScrollOptions? = definedExternally): ScrollComponent
    fun scrollspy(element: UIkitElement, data: ScrollspyOptions? = definedExternally): ScrollspyComponent
    fun scrollspyNav(element: UIkitElement, data: ScrollspyNavOptions? = definedExternally): ScrollspyNavElement
    fun slider(element: UIkitElement, data: SliderOptions? = definedExternally): SliderComponent
    fun sliderParallax(element: UIkitElement, data: SliderOptions? = definedExternally): SliderComponent
    fun slideshow(element: UIkitElement, data: SlideshowOptions? = definedExternally): SlideshowComponent
    fun slideshowParallax(element: UIkitElement, data: SlideshowOptions? = definedExternally): SlideshowComponent
    fun sortable(element: UIkitElement, data: SortableOptions? = definedExternally): SortableComponent
    fun sticky(element: UIkitElement, data: StickyOptions? = definedExternally): StickyComponent
    fun svg(element: UIkitElement, data: SvgOptions? = definedExternally): SvgComponent
    fun switcher(element: UIkitElement, data: SwitcherOptions? = definedExternally): SwitcherComponent
    fun tab(element: UIkitElement, data: TabOptions? = definedExternally): TabComponent
    fun toggle(element: UIkitElement, data: ToggleOptions? = definedExternally): ToggleComponent
    fun tooltip(element: UIkitElement, data: TooltipOptions? = definedExternally): TooltipComponent
    fun upload(element: UIkitElement, data: UploadOptions? = definedExternally): UploadComponent
    fun video(element: UIkitElement, data: VideoOptions? = definedExternally): VideoComponent
}

external interface Component {
    var `$el`: Element
}
