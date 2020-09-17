package uikit

import org.w3c.dom.Element
import uikit.components.*

external interface UIKitComponent {
    val icon: Icon
    val modal: Modal
    val notification: Notification

    fun accordion(element: dynamic, data: AccordionOptions? = definedExternally): AccordionComponent
    fun alert(element: dynamic, data: AlertOptions? = definedExternally): AlertComponent
    fun close(element: dynamic, data: CloseOptions? = definedExternally): CloseComponent
    fun countdown(element: dynamic, data: CountdownOptions? = definedExternally): CountdownComponent
    fun cover(element: dynamic, data: CoverOptions? = definedExternally): CoverComponent
    fun drop(element: dynamic, data: DropOptions? = definedExternally): DropComponent
    fun dropdown(element: dynamic, data: DropdownOptions? = definedExternally): DropdownComponent
    fun filter(element: dynamic, data: FilterOptions? = definedExternally): FilterComponent
    fun formCustom(element: dynamic, data: FormOptions? = definedExternally): FormComponent
    fun gif(element: dynamic, data: GifOptions? = definedExternally): GifComponent
    fun grid(element: dynamic, data: GridOptions? = definedExternally): GridComponent
    fun heightMatch(element: dynamic, data: HeightOptions? = definedExternally): HeightComponent
    fun heightViewport(element: dynamic, data: HeightOptions? = definedExternally): HeightOptions
    fun icon(element: dynamic, data: IconOptions? = definedExternally): IconComponent
    fun img(element: dynamic, data: ImageOptions? = definedExternally): ImageComponent
    fun leader(element: dynamic, data: LeaderOptions? = definedExternally): LeaderComponent
    fun lightbox(element: dynamic, data: LightboxOptions? = definedExternally): LightboxComponent
    fun lightboxPanel(element: dynamic, data: LightboxOptions? = definedExternally): LightboxComponent
    fun margin(element: dynamic, data: MarginOptions? = definedExternally): MarginComponent
    fun marker(element: dynamic, data: MarkerOptions? = definedExternally): MarkerComponent
    fun modal(element: dynamic, data: ModalOptions? = definedExternally): ModalComponent
    fun nav(element: dynamic, data: NavOptions? = definedExternally): NavComponent
    fun navbar(element: dynamic, data: NavbarOptions? = definedExternally): NavbarComponent
    fun notification(element: dynamic = definedExternally, data: NotificationOptions? = definedExternally): NotificationComponent
    fun notification(message: String, status: String? = definedExternally, options: NotificationOptions? = definedExternally): NotificationComponent
    fun offcanvas(element: dynamic, data: OffcanvasOptions? = definedExternally): OffcanvasComponent
    fun overflowAuto(element: dynamic, data: OverflowOptions? = definedExternally): OverflowComponent
    fun overlayIcon(element: dynamic, data: OverlayOptions? = definedExternally): OverlayComponent
    fun paginationNext(element: dynamic, data: PaginationOptions? = definedExternally): PaginationComponent
    fun paginationPrevious(element: dynamic, data: PaginationOptions? = definedExternally): PaginationComponent
    fun parallax(element: dynamic, data: ParallaxOptions? = definedExternally): ParallaxComponent
    fun scroll(element: dynamic, data: ScrollOptions? = definedExternally): ScrollComponent
    fun scrollspy(element: dynamic, data: ScrollspyOptions? = definedExternally): ScrollspyComponent
    fun scrollspyNav(element: dynamic, data: ScrollspyNavOptions? = definedExternally): ScrollspyNavElement
    fun searchIcon(element: dynamic, data: SearchOptions? = definedExternally): SearchComponent
    fun slidenavNext(element: dynamic, data: SlidenavOptions? = definedExternally): SlidenavComponent
    fun slidenavPrevious(element: dynamic, data: SlidenavOptions? = definedExternally): SlidenavComponent
    fun slider(element: dynamic, data: SliderOptions? = definedExternally): SliderComponent
    fun sliderParallax(element: dynamic, data: SliderOptions? = definedExternally): SliderComponent
    fun slideshow(element: dynamic, data: SlideshowOptions? = definedExternally): SlideshowComponent
    fun slideshowParallax(element: dynamic, data: SlideshowOptions? = definedExternally): SlideshowComponent
    fun sortable(element: dynamic, data: SortableOptions? = definedExternally): SortableComponent
    fun spinner(element: dynamic, data: SpinnerOptions? = definedExternally): SpinnerComponent
    fun sticky(element: dynamic, data: StickyOptions? = definedExternally): StickyComponent
    fun svg(element: dynamic, data: SvgOptions? = definedExternally): SvgComponent
    fun switcher(element: dynamic, data: SwitcherOptions? = definedExternally): SwitcherComponent
    fun tab(element: dynamic, data: TabOptions? = definedExternally): TabComponent
    fun toggle(element: dynamic, data: ToggleOptions? = definedExternally): ToggleComponent
    fun tooltip(element: dynamic, data: TooltipOptions? = definedExternally): TooltipComponent
    fun totop(element: dynamic, data: TotopOptions? = definedExternally): TotopComponent
    fun upload(element: dynamic, data: UploadOptions? = definedExternally): UploadComponent
    fun video(element: dynamic, data: VideoOptions? = definedExternally): VideoComponent
}

external interface Component {
    var `$el`: Element
}
