package uikit

import uikit.components.*

external interface UIKitComponent {
    val icon: Icon
    val modal: Modal
    val notification: Notification

    fun accordion(element: dynamic, data: AccordionOptions? = definedExternally): AccordionElement
    fun alert(element: dynamic, data: AlertOptions? = definedExternally): AlertElement
    fun close(element: dynamic, data: CloseOptions? = definedExternally): CloseElement
    fun countdown(element: dynamic, data: CountdownOptions? = definedExternally): CountdownElement
    fun cover(element: dynamic, data: CoverOptions? = definedExternally): CoverElement
    fun drop(element: dynamic, data: DropOptions? = definedExternally): DropElement
    fun dropdown(element: dynamic, data: DropdownOptions? = definedExternally): DropdownElement
    fun filter(element: dynamic, data: FilterOptions? = definedExternally): FilterElement
    fun formCustom(element: dynamic, data: FormOptions? = definedExternally): FormElement
    fun gif(element: dynamic, data: GifOptions? = definedExternally): GifElement
    fun grid(element: dynamic, data: GridOptions? = definedExternally): GridElement
    fun heightMatch(element: dynamic, data: HeightOptions? = definedExternally): HeightElement
    fun heightViewport(element: dynamic, data: HeightOptions? = definedExternally): HeightOptions
    fun icon(element: dynamic, data: IconOptions? = definedExternally): IconElement
    fun img(element: dynamic, data: ImageOptions? = definedExternally): ImageElement
    fun leader(element: dynamic, data: LeaderOptions? = definedExternally): LeaderElement
    fun lightbox(element: dynamic, data: LightboxOptions? = definedExternally): LightboxElement
    fun lightboxPanel(element: dynamic, data: LightboxOptions? = definedExternally): LightboxElement
    fun margin(element: dynamic, data: MarginOptions? = definedExternally): MarginElement
    fun marker(element: dynamic, data: MarkerOptions? = definedExternally): MarkerElement
    fun modal(element: dynamic, data: ModalOptions? = definedExternally): ModalElement
    fun nav(element: dynamic, data: NavOptions? = definedExternally): NavElement
    fun navbar(element: dynamic, data: NavbarOptions? = definedExternally): NavbarElement
    fun notification(element: dynamic = definedExternally, data: NotificationOptions? = definedExternally): NotificationElement
    fun notification(message: String, status: String? = definedExternally, options: NotificationOptions? = definedExternally): NotificationElement
    fun offcanvas(element: dynamic, data: OffcanvasOptions? = definedExternally): OffcanvasElement
    fun overflowAuto(element: dynamic, data: OverflowOptions? = definedExternally): OverflowElement
    fun overlayIcon(element: dynamic, data: OverlayOptions? = definedExternally): OverlayElement
    fun paginationNext(element: dynamic, data: PaginationOptions? = definedExternally): PaginationElement
    fun paginationPrevious(element: dynamic, data: PaginationOptions? = definedExternally): PaginationElement
    fun parallax(element: dynamic, data: ParallaxOptions? = definedExternally): ParallaxElement
    fun scroll(element: dynamic, data: ScrollOptions? = definedExternally): ScrollElement
    fun scrollspy(element: dynamic, data: ScrollspyOptions? = definedExternally): ScrollspyElement
    fun scrollspyNav(element: dynamic, data: ScrollspyNavOptions? = definedExternally): ScrollspyNavElement
    fun searchIcon(element: dynamic, data: SearchOptions? = definedExternally): SearchElement
    fun slidenavNext(element: dynamic, data: SlidenavOptions? = definedExternally): SlidenavElement
    fun slidenavPrevious(element: dynamic, data: SlidenavOptions? = definedExternally): SlidenavElement
    fun slider(element: dynamic, data: SliderOptions? = definedExternally): SliderElement
    fun sliderParallax(element: dynamic, data: SliderOptions? = definedExternally): SliderElement
    fun slideshow(element: dynamic, data: SlideshowOptions? = definedExternally): SlideshowElement
    fun slideshowParallax(element: dynamic, data: SlideshowOptions? = definedExternally): SlideshowElement
    fun sortable(element: dynamic, data: SortableOptions? = definedExternally): SortableElement
    fun spinner(element: dynamic, data: SpinnerOptions? = definedExternally): SpinnerElement
    fun sticky(element: dynamic, data: StickyOptions? = definedExternally): StickyElement
    fun svg(element: dynamic, data: SvgOptions? = definedExternally): SvgElement
    fun switcher(element: dynamic, data: SwitcherOptions? = definedExternally): SwitcherElement
    fun tab(element: dynamic, data: TabOptions? = definedExternally): TabElement
    fun toggle(element: dynamic, data: ToggleOptions? = definedExternally): ToggleElement
    fun tooltip(element: dynamic, data: TooltipOptions? = definedExternally): TooltipElement
    fun totop(element: dynamic, data: TotopOptions? = definedExternally): TotopElement
    fun upload(element: dynamic, data: UploadOptions? = definedExternally): UploadElement
    fun video(element: dynamic, data: VideoOptions? = definedExternally): VideoElement
}
