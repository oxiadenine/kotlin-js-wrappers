package antd

import react.*

external interface DOMAttributes<T> {
    var children: ReactElement?

    // Clipboard Events
    var onCopy: ClipboardEventHandler<T>?
    var onCopyCapture: ClipboardEventHandler<T>?
    var onCut: ClipboardEventHandler<T>?
    var onCutCapture: ClipboardEventHandler<T>?
    var onPaste: ClipboardEventHandler<T>?
    var onPasteCapture: ClipboardEventHandler<T>?

    // Composition Events
    var onCompositionEnd: CompositionEventHandler<T>?
    var onCvompositionEndCapture: CompositionEventHandler<T>?
    var onCvompositionStart: CompositionEventHandler<T>?
    var onCompositionStartCapture: CompositionEventHandler<T>?
    var onCompositionUpdate: CompositionEventHandler<T>?
    var onCompositionUpdateCapture: CompositionEventHandler<T>?

    // Focus Events
    var onFocus: FocusEventHandler<T>?
    var onFocusCapture: FocusEventHandler<T>?
    var onBlur: FocusEventHandler<T>?
    var onBlurCapture: FocusEventHandler<T>?

    // Form Events
    var onChange: FormEventHandler<T>?
    var onChangeCapture: FormEventHandler<T>?
    var onBeforeInput: FormEventHandler<T>?
    var onBeforeInputCapture: FormEventHandler<T>?
    var onInput: FormEventHandler<T>?
    var onInputCapture: FormEventHandler<T>?
    var onReset: FormEventHandler<T>?
    var onResetCapture: FormEventHandler<T>?
    var onSubmit: FormEventHandler<T>?
    var onSubmitCapture: FormEventHandler<T>?
    var onInvalid: FormEventHandler<T>?
    var onIvnvalidCapture: FormEventHandler<T>?

    // Image Events
    var onLoad: EventHandler<T>?
    var onLoadCapture: EventHandler<T>?
    var onError: EventHandler<T>? // also a Media Event
    var onErrorCapture: EventHandler<T>? // also a Media Event

    // Keyboard Events
    var onKeyDown: KeyboardEventHandler<T>?
    var onKeyDownCapture: KeyboardEventHandler<T>?
    var onKeyPress: KeyboardEventHandler<T>?
    var onKeyPressCapture: KeyboardEventHandler<T>?
    var onKeyUp: KeyboardEventHandler<T>?
    var onKeyUpCapture: KeyboardEventHandler<T>?

    // Media Events
    var onAbort: EventHandler<T>?
    var onAbortCapture: EventHandler<T>?
    var onCanPlay: EventHandler<T>?
    var onCanPlayCapture: EventHandler<T>?
    var onCanPlayThrough: EventHandler<T>?
    var onCanPlayThroughCapture: EventHandler<T>?
    var onDurationChange: EventHandler<T>?
    var onDurationChangeCapture: EventHandler<T>?
    var onEmptied: EventHandler<T>?
    var onEmptiedCapture: EventHandler<T>?
    var onEncrypted: EventHandler<T>?
    var onEncryptedCapture: EventHandler<T>?
    var onEnded: EventHandler<T>?
    var onEndedCapture: EventHandler<T>?
    var onLoadedData: EventHandler<T>?
    var onLoadedDataCapture: EventHandler<T>?
    var onLoadedMetadata: EventHandler<T>?
    var onLoadedMetadataCapture: EventHandler<T>?
    var onLoadStart: EventHandler<T>?
    var onLoadStartCapture: EventHandler<T>?
    var onPause: EventHandler<T>?
    var onPauseCapture: EventHandler<T>?
    var onPlay: EventHandler<T>?
    var onPlayCapture: EventHandler<T>?
    var onPlaying: EventHandler<T>?
    var onPlayingCapture: EventHandler<T>?
    var onProgress: EventHandler<T>?
    var onProgressCapture: EventHandler<T>?
    var onRateChange: EventHandler<T>?
    var onRateChangeCapture: EventHandler<T>?
    var onSeeked: EventHandler<T>?
    var onSeekedCapture: EventHandler<T>?
    var onSeeking: EventHandler<T>?
    var onSeekingCapture: EventHandler<T>?
    var onStalled: EventHandler<T>?
    var onStalledCapture: EventHandler<T>?
    var onSuspend: EventHandler<T>?
    var onSuspendCapture: EventHandler<T>?
    var onTimeUpdate: EventHandler<T>?
    var onTimeUpdateCapture: EventHandler<T>?
    var onVolumeChange: EventHandler<T>?
    var onVolumeChangeCapture: EventHandler<T>?
    var onWaiting: EventHandler<T>?
    var onWaitingCapture: EventHandler<T>?

    // MouseEvents
    var onAuxClick: MouseEventHandler<T>?
    var onAuxClickCapture: MouseEventHandler<T>?
    var onClick: MouseEventHandler<T>?
    var onClickCapture: MouseEventHandler<T>?
    var onContextMenu: MouseEventHandler<T>?
    var onContextMenuCapture: MouseEventHandler<T>?
    var onDoubleClick: MouseEventHandler<T>?
    var onDoubleClickCapture: MouseEventHandler<T>?
    var onDrag: DragEventHandler<T>?
    var onDragCapture: DragEventHandler<T>?
    var onDragEnd: DragEventHandler<T>?
    var onDragEndCapture: DragEventHandler<T>?
    var onDragEnter: DragEventHandler<T>?
    var onDragEnterCapture: DragEventHandler<T>?
    var onDragExit: DragEventHandler<T>?
    var onDragExitCapture: DragEventHandler<T>?
    var onDragLeave: DragEventHandler<T>?
    var onDragLeaveCapture: DragEventHandler<T>?
    var onDragOver: DragEventHandler<T>?
    var onDragOverCapture: DragEventHandler<T>?
    var onDragStart: DragEventHandler<T>?
    var onDragStartCapture: DragEventHandler<T>?
    var onDrop: DragEventHandler<T>?
    var onDropCapture: DragEventHandler<T>?
    var onMouseDown: MouseEventHandler<T>?
    var onMouseDownCapture: MouseEventHandler<T>?
    var onMouseEnter: MouseEventHandler<T>?
    var onMouseLeave: MouseEventHandler<T>?
    var onMouseMove: MouseEventHandler<T>?
    var onMouseMoveCapture: MouseEventHandler<T>?
    var onMouseOut: MouseEventHandler<T>?
    var onMouseOutCapture: MouseEventHandler<T>?
    var onMouseOver: MouseEventHandler<T>?
    var onMouseOverCapture: MouseEventHandler<T>?
    var onMouseUp: MouseEventHandler<T>?
    var onMouseUpCapture: MouseEventHandler<T>?

    // Selection Events
    var onSelect: EventHandler<T>?
    var onSelectCapture: EventHandler<T>?

    // Touch Events
    var onTouchCancel: TouchEventHandler<T>?
    var onTouchCancelCapture: TouchEventHandler<T>?
    var onTouchEnd: TouchEventHandler<T>?
    var onTouchEndCapture: TouchEventHandler<T>?
    var onTouchMove: TouchEventHandler<T>?
    var onTouchMoveCapture: TouchEventHandler<T>?
    var onTouchStart: TouchEventHandler<T>?
    var onTouchStartCapture: TouchEventHandler<T>?

    // Pointer Events
    var onPointerDown: PointerEventHandler<T>?
    var onPointerDownCapture: PointerEventHandler<T>?
    var onPointerMove: PointerEventHandler<T>?
    var onPointerMoveCapture: PointerEventHandler<T>?
    var onPointerUp: PointerEventHandler<T>?
    var onPointerUpCapture: PointerEventHandler<T>?
    var onPointerCancel: PointerEventHandler<T>?
    var onPointerCancelCapture: PointerEventHandler<T>?
    var onPointerEnter: PointerEventHandler<T>?
    var onPointerEnterCapture: PointerEventHandler<T>?
    var onPointerLeave: PointerEventHandler<T>?
    var onPointerLeaveCapture: PointerEventHandler<T>?
    var onPointerOver: PointerEventHandler<T>?
    var onPointerOverCapture: PointerEventHandler<T>?
    var onPointerOut: PointerEventHandler<T>?
    var onPointerOutCapture: PointerEventHandler<T>?
    var onGotPointerCapture: PointerEventHandler<T>?
    var onGotPointerCaptureCapture: PointerEventHandler<T>?
    var onLostPointerCapture: PointerEventHandler<T>?
    var onLostPointerCaptureCapture: PointerEventHandler<T>?

    // UI Events
    var onScroll: UIEventHandler<T>?
    var onScrollCapture: UIEventHandler<T>?

    // Wheel Events
    var onWheel: WheelEventHandler<T>?
    var onWheelCapture: WheelEventHandler<T>?

    // Animation Events
    var onAnimationStart: AnimationEventHandler<T>?
    var onAnimationStartCapture: AnimationEventHandler<T>?
    var onAnimationEnd: AnimationEventHandler<T>?
    var onAnimationEndCapture: AnimationEventHandler<T>?
    var onAnimationIteration: AnimationEventHandler<T>?
    var onAnimationIterationCapture: AnimationEventHandler<T>?

    // Transition Events
    var onTransitionEnd: TransitionEventHandler<T>?
    var onTransitionEndCapture: TransitionEventHandler<T>?
}

external interface AriaAttributes {
    var ariaActivedescendant: String?
    var ariaAtomic: Any? /* Boolean | "false" | "true" */
    var ariaAutocomplete: String? /* "none" | "inline" | "list" | "both" */
    var ariaBusy: Any? /* Boolean | "false" | "true" */
    var ariaChecked: Any? /* Boolean | "false" | "mixed" | "true" */
    var ariaColcount: Number?
    var ariaColindex: Number?
    var ariaColspan: Number?
    var ariaControls: String?
    var ariaCurrent: Any? /* Boolean | "false" | "true" | "page" | "step" | "location" | "date" | "time" */
    var ariaDescribedby: String?
    var ariaDetails: String?
    var ariaDisabled: Any? /* Boolean | "false" | "true" */
    var ariaDropeffect: String? /* "none" | "copy" | "execute" | "link" | "move" | "popup" */
    var ariaErrormessage: String?
    var ariaExpanded: Any? /* Boolean | "false" | "true" */
    var ariaFlowto: String?
    var ariaGrabbed: Any? /* Boolean | "false" | "true" */
    var ariaHaspopup: Any? /* Boolean | "false" | "true" | "menu" | "listbox" | "tree" | "grid" | "dialog" */
    var ariaHidden: Any? /* Boolean | "false" | "true" */
    var ariaInvalid: Any? /* Boolean | "false" | "true" | "grammar" | "spelling" */
    var ariaKeyshortcuts: String?
    var ariaLabel: String?
    var ariaLabelledby: String?
    var ariaLevel: Number?
    var ariaLive: String? /* "off" | "assertive" | "polite" */
    var ariaModal: Any? /* Boolean | "false" | "true" */
    var ariaMultiline: Any? /* Boolean | "false" | "true" */
    var ariaMultiselectable: Any? /* Boolean | "false" | "true" */
    var ariaOrientation: String? /* "horizontal" | "vertical" */
    var ariaOwns: String?
    var ariaPlaceholder: String?
    var ariaPosinset: Number?
    var ariaPressed: Any? /* Boolean | "false" | "mixed" | "true" */
    var ariaReadonly: Any? /* Boolean | "false" | "true" */
    var ariaRelevant: String? /* "additions" | "additions text" | "all" | "removals" | "text" */
    var ariaRequired: Any? /* Boolean | "false" | "true" */
    var ariaRoledescription: String?
    var ariaRowcount: Number?
    var ariaRowindex: Number?
    var ariaRowspan: Number?
    var ariaSelected: Any? /* Boolean | "false" | "true" */
    var ariaSetsize: Number?
    var ariaSort: String? /*"none" | "ascending" | "descending" | "other" */
    var ariaValuemax: Number?
    var ariaValuemin: Number?
    var ariaValuenow: Number?
    var ariaValuetext: String?
}

external interface HTMLAttributes<T> : AriaAttributes, DOMAttributes<T> {
    // React-specific Attributes
    var defaultChecked: Boolean?
    var defaultValue: Any? /* String | Array<String> */
    var suppressContentEditableWarning: Boolean?
    var suppressHydrationWarning: Boolean?

    // Standard HTML Attributes
    var accessKey: String?
    var className: String?
    var contentEditable: Boolean?
    var contextMenu: String?
    var dir: String?
    var draggable: Boolean?
    var hidden: Boolean?
    var id: String?
    var lang: String?
    var placeholder: String?
    var slot: String?
    var spellCheck: Boolean?
    var style: dynamic
    var tabIndex: Number?
    var title: String?

    // Unknown
    var inputMode: String?
    var `is`: String?
    var radioGroup: String? // <command>, <menuitem>

    // WAI-ARIA
    var role: String?

    // RDFa Attributes
    var about: String?
    var datatype: String?
    var inlist: Any?
    var prefix: String?
    var property: String?
    var resource: String?
    var `typeof`: String?
    var vocab: String?

    // Non-standard Attributes
    var autoCapitalize: String?
    var autoCorrect: String?
    var autoSave: String?
    var color: String?
    var itemProp: String?
    var itemScope: Boolean?
    var itemType: String?
    var itemID: String?
    var itemRef: String?
    var results: Number?
    var security: String?
    var unselectable: String? /* "on" | "off" */
}

external interface AnchorHTMLAttributes<T> : HTMLAttributes<T> {
    var download: Any?
    var href: String?
    var hrefLang: String?
    var media: String?
    var rel: String?
    var target: String?
    var type: String?
    var referrerPolicy: String?
}

external interface AudioHTMLAttributes<T> : MediaHTMLAttributes<T>

external interface AreaHTMLAttributes<T> : HTMLAttributes<T> {
    var alt: String?
    var coords: String?
    var download: Any?
    var href: String?
    var hrefLang: String?
    var media: String?
    var rel: String?
    var shape: String?
    var target: String?
}

external interface BaseHTMLAttributes<T> : HTMLAttributes<T> {
    var href: String?
    var target: String?
}

external interface BlockquoteHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String?
}

external interface ButtonHTMLAttributes<T> : HTMLAttributes<T> {
    var autoFocus: Boolean?
    var disabled: Boolean?
    var form: String?
    var formAction: String?
    var formEncType: String?
    var formMethod: String?
    var formNoValidate: Boolean?
    var formTarget: String?
    var name: String?
    var type: String?
    var value: Any? /* String | Array<String> | Number */
}

external interface CanvasHTMLAttributes<T> : HTMLAttributes<T> {
    var height: Any? /* Number | String */
    var width: Any? /* Number | String */
}

external interface ColHTMLAttributes<T> : HTMLAttributes<T> {
    var span: Number?
    var width: Any? /* Number | String */
}

external interface ColgroupHTMLAttributes<T> : HTMLAttributes<T> {
    var span: Number?
}

external interface DetailsHTMLAttributes<T> : HTMLAttributes<T> {
    var open: Boolean?
}

external interface DelHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String?
    var dateTime: String?
}

external interface DialogHTMLAttributes<T> : HTMLAttributes<T> {
    var open: Boolean?
}

external interface EmbedHTMLAttributes<T> : HTMLAttributes<T> {
    var height: Any? /* Number | String */
    var src: String?
    var type: String?
    var width: Any? /* Number | String */
}

external interface FieldsetHTMLAttributes<T> : HTMLAttributes<T> {
    var disabled: Boolean?
    var form: String?
    var name: String?
}

external interface FormHTMLAttributes<T> : HTMLAttributes<T> {
    var acceptCharset: String?
    var action: String?
    var autoComplete: String?
    var encType: String?
    var method: String?
    var name: String?
    var noValidate: Boolean?
    var target: String?
}

external interface HtmlHTMLAttributes<T> : HTMLAttributes<T> {
    var manifest: String?
}

external interface IframeHTMLAttributes<T> : HTMLAttributes<T> {
    var allow: String?
    var allowFullScreen: Boolean?
    var allowTransparency: Boolean?
    var frameBorder: Any? /* Number | String */
    var height: Any? /* Number | String */
    var marginHeight: Number?
    var marginWidth: Number?
    var name: String?
    var referrerPolicy: String?
    var sandbox: String?
    var scrolling: String?
    var seamless: Boolean?
    var src: String?
    var srcDoc: String?
    var width: Any? /* Number | String */
}

external interface ImgHTMLAttributes<T> : HTMLAttributes<T> {
    var alt: String?
    var crossOrigin: String? /* "anonymous" | "use-credentials" | "" */
    var decoding: String? /* "async" | "auto" | "sync" */
    var height: Any? /* Number | String */
    var sizes: String?
    var src: String?
    var srcSet: String?
    var useMap: String?
    var width: Any? /* Number | String */
}

external interface InsHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String?
    var dateTime: String?
}

external interface InputHTMLAttributes<T> : HTMLAttributes<T> {
    var accept: String?
    var alt: String?
    var autoComplete: String?
    var autoFocus: Boolean?
    var capture: Any? /* Boolean | String */
    var checked: Boolean?
    var crossOrigin: String?
    var disabled: Boolean?
    var form: String?
    var formAction: String?
    var formEncType: String?
    var formMethod: String?
    var formNoValidate: Boolean?
    var formTarget: String?
    var height: Any? /* Number | String */
    var list: String?
    var max: Any? /* Number | String */
    var maxLength: Number?
    var min: Any? /* Number | String */
    var minLength: Number?
    var multiple: Boolean?
    var name: String?
    var pattern: String?
    override var placeholder: String?
    var readOnly: Boolean?
    var required: Boolean?
    var size: String?
    var src: String?
    var step: Any? /* Number | String */
    var type: String?
    var value: Any? /* String | Array<String> | Number */
    var width: Any? /* Number | String */

    override var onChange: dynamic /* ChangeEventHandler<T>? */
}

external interface KeygenHTMLAttributes<T> : HTMLAttributes<T> {
    var autoFocus: Boolean?
    var challenge: String?
    var disabled: Boolean?
    var form: String?
    var keyType: String?
    var keyParams: String?
    var name: String?
}

external interface LabelHTMLAttributes<T> : HTMLAttributes<T> {
    var form: String?
    var htmlFor: String?
}

external interface LiHTMLAttributes<T> : HTMLAttributes<T> {
    var value: Any? /* String | Array<String> | Number */
}

external interface LinkHTMLAttributes<T> : HTMLAttributes<T> {
    var `as`: String?
    var crossOrigin: String?
    var href: String?
    var hrefLang: String?
    var integrity: String?
    var media: String?
    var rel: String?
    var sizes: String?
    var type: String?
}

external interface MapHTMLAttributes<T> : HTMLAttributes<T> {
    var name: String?
}

external interface MenuHTMLAttributes<T> : HTMLAttributes<T> {
    var type: String?
}

external interface MediaHTMLAttributes<T> : HTMLAttributes<T> {
    var autoPlay: Boolean?
    var controls: Boolean?
    var controlsList: String?
    var crossOrigin: String?
    var loop: Boolean?
    var mediaGroup: String?
    var muted: Boolean?
    var playsinline: Boolean?
    var preload: String?
    var src: String?
}

external interface MetaHTMLAttributes<T> : HTMLAttributes<T> {
    var charSet: String?
    var content: String?
    var httpEquiv: String?
    var name: String?
}

external interface MeterHTMLAttributes<T> : HTMLAttributes<T> {
    var form: String?
    var high: Number?
    var low: Number?
    var max: Any? /* Number | String */
    var min: Any? /* Number | String */
    var optimum: Number?
    var value: Any? /* String | Array<String> | Number */
}

external interface QuoteHTMLAttributes<T> : HTMLAttributes<T> {
    var cite: String?
}

external interface ObjectHTMLAttributes<T> : HTMLAttributes<T> {
    var classID: String?
    var data: String?
    var form: String?
    var height: Any? /* Number | String */
    var name: String?
    var type: String?
    var useMap: String?
    var width: Any? /* Number | String */
    var wmode: String?
}

external interface OlHTMLAttributes<T> : HTMLAttributes<T> {
    var reversed: Boolean?
    var start: Number?
    var type: String? /* "1" | "a" | "A" | "i" | "I" */
}

external interface OptgroupHTMLAttributes<T> : HTMLAttributes<T> {
    var disabled: Boolean?
    var label: String?
}

external interface OptionHTMLAttributes<T> : HTMLAttributes<T> {
    var disabled: Boolean?
    var label: String?
    var selected: Boolean?
    var value: Any? /* String | Array<String> | Number */
}

external interface OutputHTMLAttributes<T> : HTMLAttributes<T> {
    var form: String?
    var htmlFor: String?
    var name: String?
}

external interface ParamHTMLAttributes<T> : HTMLAttributes<T> {
    var name: String?
    var value: Any? /* String | Array<String> | Number */
}

external interface ProgressHTMLAttributes<T> : HTMLAttributes<T> {
    var max: Any? /* Number | String */
    var value: Any? /* String | Array<String> | Number */
}

external interface ScriptHTMLAttributes<T> : HTMLAttributes<T> {
    var async: Boolean?
    var charSet: String?
    var crossOrigin: String?
    var defer: Boolean?
    var integrity: String?
    var noModule: Boolean?
    var nonce: String?
    var src: String?
    var type: String?
}

external interface SelectHTMLAttributes<T> : HTMLAttributes<T> {
    var autoComplete: String?
    var autoFocus: Boolean?
    var disabled: Boolean?
    var form: String?
    var multiple: Boolean?
    var name: String?
    var required: Boolean?
    var size: Number?
    var value: Any? /* String | Array<String> | Number */
    override var onChange: FormEventHandler<T>?
}

external interface SourceHTMLAttributes<T> : HTMLAttributes<T> {
    var media: String?
    var sizes: String?
    var src: String?
    var srcSet: String?
    var type: String?
}

external interface StyleHTMLAttributes<T> : HTMLAttributes<T> {
    var media: String?
    var nonce: String?
    var scoped: Boolean?
    var type: String?
}

external interface TableHTMLAttributes<T> : HTMLAttributes<T> {
    var cellPadding: Any? /* Number | String */
    var cellSpacing: Any? /* Number | String */
    var summary: String?
}

external interface TextareaHTMLAttributes<T> : HTMLAttributes<T> {
    var autoComplete: String?
    var autoFocus: Boolean?
    var cols: Number?
    var dirName: String?
    var disabled: Boolean?
    var form: String?
    var maxLength: Number?
    var minLength: Number?
    var name: String?
    override var placeholder: String?
    var readOnly: Boolean?
    var required: Boolean?
    var rows: Number?
    var value: Any? /* String | Array<String> | Number */
    var wrap: String?

    override var onChange: dynamic /* ChangeEventHandler<T>? */
}

external interface TdHTMLAttributes<T> : HTMLAttributes<T> {
    var align: String? /* "left" | "center" | "right" | "justify" | "char" */
    var colSpan: Number?
    var headers: String?
    var rowSpan: Number?
    var scope: String?
}

external interface ThHTMLAttributes<T> : HTMLAttributes<T> {
    var align: String? /* "left" | "center" | "right" | "justify" | "char" */
    var colSpan: Number?
    var headers: String?
    var rowSpan: Number?
    var scope: String?
}

external interface TimeHTMLAttributes<T> : HTMLAttributes<T> {
    var dateTime: String?
}

external interface TrackHTMLAttributes<T> : HTMLAttributes<T> {
    var default: Boolean?
    var kind: String?
    var label: String?
    var src: String?
    var srcLang: String?
}

external interface VideoHTMLAttributes<T> : MediaHTMLAttributes<T> {
    var height: Any? /* Number | String */
    var playsInline: Boolean?
    var poster: String?
    var width: Any? /* Number | String */
}

external interface SVGAttributes<T> : AriaAttributes, DOMAttributes<T> {
    // Attributes which also defined in HTMLAttributes
    // See comment in SVGDOMPropertyConfig.js
    var className: String?
    var color: String?
    var height: Any? /* Number | String */
    var id: String?
    var lang: String?
    var max: Any? /* Number | String */
    var media: String?
    var method: String?
    var min: Any? /* Number | String */
    var name: String?
    var style: dynamic
    var target: String?
    var type: String?
    var width: Any? /* Number | String */

    // Other HTML properties supported by SVG elements in browsers
    var role: String?
    var tabIndex: Number?

    // SVG Specific attributes
    var accentHeight: Any? /* Number | String */
    var accumulate: String? /* "none" | "sum" */
    var additive: String? /* "replace" | "sum" */
    var alignmentBaseline: String? /* "auto" | "baseline" | "before-edge" | "text-before-edge" | "middle" | "central" | "after-edge" |"text-after-edge" | "ideographic" | "alphabetic" | "hanging" | "mathematical" | "inherit" */
    var allowReorder: String? /* "no" | "yes" */
    var alphabetic: Any? /* Number | String */
    var amplitude: Any? /* Number | String */
    var arabicForm: String? /* "initial" | "medial" | "terminal" | "isolated" */
    var ascent: Any? /* Number | String */
    var attributeName: String?
    var attributeType: String?
    var autoReverse: Any? /* Number | String */
    var azimuth: Any? /* Number | String */
    var baseFrequency: Any? /* Number | String */
    var baselineShift: Any? /* Number | String */
    var baseProfile: Any? /* Number | String */
    var bbox: Any? /* Number | String */
    var begin: Any? /* Number | String */
    var bias: Any? /* Number | String */
    var by: Any? /* Number | String */
    var calcMode: Any? /* Number | String */
    var capHeight: Any? /* Number | String */
    var clip: Any? /* Number | String */
    var clipPath: String?
    var clipPathUnits: Any? /* Number | String */
    var clipRule: Any? /* Number | String */
    var colorInterpolation: Any? /* Number | String */
    var colorInterpolationFilters: String? /* "auto" | "sRGB" | "linearRGB" | "inherit" */
    var colorProfile: Any? /* Number | String */
    var colorRendering: Any? /* Number | String */
    var contentScriptType: Any? /* Number | String */
    var contentStyleType: Any? /* Number | String */
    var cursor: Any? /* Number | String */
    var cx: Any? /* Number | String */
    var cy: Any? /* Number | String */
    var d: String?
    var decelerate: Any? /* Number | String */
    var descent: Any? /* Number | String */
    var diffuseConstant: Any? /* Number | String */
    var direction: Any? /* Number | String */
    var displa: Any? /* Number | String */
    var divisor: Any? /* Number | String */
    var dominantBaseline: Any? /* Number | String */
    var dur: Any? /* Number | String */
    var dx: Any? /* Number | String */
    var dy: Any? /* Number | String */
    var edgeMode: Any? /* Number | String */
    var elevation: Any? /* Number | String */
    var enableBackground: Any? /* Number | String */
    var end: Any? /* Number | String */
    var exponent: Any? /* Number | String */
    var externalResourcesRequired: Any? /* Number | String */
    var fill: String?
    var fillOpacity: Any? /* Number | String */
    var fillRule: String? /* "nonzero" | "evenodd" | "inherit" */
    var filter: String?
    var filterRes: Any? /* Number | String */
    var filterUnits: Any? /* Number | String */
    var floodColor: Any? /* Number | String */
    var floodOpacity: Any? /* Number | String */
    var focusable: Any? /* Number | String */
    var fontFamily: String?
    var fontSize: Any? /* Number | String */
    var fontSizeAdjust: Any? /* Number | String */
    var fontStretch: Any? /* Number | String */
    var fontStyle: Any? /* Number | String */
    var fontVariant: Any? /* Number | String */
    var fontWeight: Any? /* Number | String */
    var format: Any? /* Number | String */
    var from: Any? /* Number | String */
    var fx: Any? /* Number | String */
    var fy: Any? /* Number | String */
    var g1: Any? /* Number | String */
    var g2: Any? /* Number | String */
    var glyphName: Any? /* Number | String */
    var glyphOrientationHorizontal: Any? /* Number | String */
    var glyphOrientationVertical: Any? /* Number | String */
    var glyphRef: Any? /* Number | String */
    var gradientTransform: String?
    var gradientUnits: String?
    var hanging: Any? /* Number | String */
    var horizAdvX: Any? /* Number | String */
    var horizOriginX: Any? /* Number | String */
    var href: String?
    var ideographic: Any? /* Number | String */
    var imageRendering: Any? /* Number | String */
    var in2: Any? /* Number | String */
    var `in`: String?
    var intercept: Any? /* Number | String */
    var k1: Any? /* Number | String */
    var k2: Any? /* Number | String */
    var k3: Any? /* Number | String */
    var k4: Any? /* Number | String */
    var k: Any? /* Number | String */
    var kernelMatrix: Any? /* Number | String */
    var kernelUnitLength: Any? /* Number | String */
    var kerning: Any? /* Number | String */
    var keyPoints: Any? /* Number | String */
    var keySplines: Any? /* Number | String */
    var keyTimes: Any? /* Number | String */
    var lengthAdjust: Any? /* Number | String */
    var letterSpacing: Any? /* Number | String */
    var lightingColor: Any? /* Number | String */
    var limitingConeAngle: Any? /* Number | String */
    var local: Any? /* Number | String */
    var markerEnd: String?
    var markerHeight: Any? /* Number | String */
    var markerMid: String?
    var markerStart: String?
    var markerUnits: Any? /* Number | String */
    var markerWidth: Any? /* Number | String */
    var mask: String?
    var maskContentUnits: Any? /* Number | String */
    var maskUnits: Any? /* Number | String */
    var mathematical: Any? /* Number | String */
    var mode: Any? /* Number | String */
    var numOctaves: Any? /* Number | String */
    var offset: Any? /* Number | String */
    var opacity: Any? /* Number | String */
    var operator: Any? /* Number | String */
    var order: Any? /* Number | String */
    var orient: Any? /* Number | String */
    var orientation: Any? /* Number | String */
    var origin: Any? /* Number | String */
    var overflow: Any? /* Number | String */
    var overlinePosition: Any? /* Number | String */
    var overlineThickness: Any? /* Number | String */
    var paintOrder: Any? /* Number | String */
    var panose1: Any? /* Number | String */
    var pathLength: Any? /* Number | String */
    var patternContentUnits: String?
    var patternTransform: Any? /* Number | String */
    var patternUnits: String?
    var pointerEvents: Any? /* Number | String */
    var points: String?
    var pointsAtX: Any? /* Number | String */
    var pointsAtY: Any? /* Number | String */
    var pointsAtZ: Any? /* Number | String */
    var preserveAlpha: Any? /* Number | String */
    var preserveAspectRatio: String?
    var primitiveUnits: Any? /* Number | String */
    var r: Any? /* Number | String */
    var radius: Any? /* Number | String */
    var refX: Any? /* Number | String */
    var refY: Any? /* Number | String */
    var renderingIntent: Any? /* Number | String */
    var repeatCount: Any? /* Number | String */
    var repeatDur: Any? /* Number | String */
    var requiredExtensions: Any? /* Number | String */
    var requiredFeatures: Any? /* Number | String */
    var restart: Any? /* Number | String */
    var result: String?
    var rotate: Any? /* Number | String */
    var rx: Any? /* Number | String */
    var ry: Any? /* Number | String */
    var scale: Any? /* Number | String */
    var seed: Any? /* Number | String */
    var shapeRendering: Any? /* Number | String */
    var slope: Any? /* Number | String */
    var spacing: Any? /* Number | String */
    var specularConstant: Any? /* Number | String */
    var specularExponent: Any? /* Number | String */
    var speed: Any? /* Number | String */
    var spreadMethod: String?
    var startOffset: Any? /* Number | String */
    var stdDeviation: Any? /* Number | String */
    var stemh: Any? /* Number | String */
    var stemv: Any? /* Number | String */
    var stitchTiles: Any? /* Number | String */
    var stopColor: String?
    var stopOpacity: Any? /* Number | String */
    var strikethroughPosition: Any? /* Number | String */
    var strikethroughThickness: Any? /* Number | String */
    var string: Any? /* Number | String */
    var stroke: String?
    var strokeDasharray: Any? /* Number | String */
    var strokeDashoffset: Any? /* Number | String */
    var strokeLinecap: String? /* "butt" | "round" | "square" | "inherit" */
    var strokeLinejoin: String? /* "miter" | "round" | "bevel" | "inherit" */
    var strokeMiterlimit: Any? /* Number | String */
    var strokeOpacity: Any? /* Number | String */
    var strokeWidth: Any? /* Number | String */
    var surfaceScale: Any? /* Number | String */
    var systemLanguage: Any? /* Number | String */
    var tableValues: Any? /* Number | String */
    var targetX: Any? /* Number | String */
    var targetY: Any? /* Number | String */
    var textAnchor: String?
    var textDecoration: Any? /* Number | String */
    var textLength: Any? /* Number | String */
    var textRendering: Any? /* Number | String */
    var to: Any? /* Number | String */
    var transform: String?
    var u1: Any? /* Number | String */
    var u2: Any? /* Number | String */
    var underlinePosition: Any? /* Number | String */
    var underlineThickness: Any? /* Number | String */
    var unicode: Any? /* Number | String */
    var unicodeBidi: Any? /* Number | String */
    var unicodeRange: Any? /* Number | String */
    var unitsPerEm: Any? /* Number | String */
    var vAlphabetic: Any? /* Number | String */
    var values: String?
    var vectorEffect: Any? /* Number | String */
    var version: String?
    var vertAdvY: Any? /* Number | String */
    var vertOriginX: Any? /* Number | String */
    var vertOriginY: Any? /* Number | String */
    var vHanging: Any? /* Number | String */
    var vIdeographic: Any? /* Number | String */
    var viewBox: String?
    var viewTarget: Any? /* Number | String */
    var visibility: Any? /* Number | String */
    var vMathematical: Any? /* Number | String */
    var widths: Any? /* Number | String */
    var wordSpacing: Any? /* Number | String */
    var writingMode: Any? /* Number | String */
    var x1: Any? /* Number | String */
    var x2: Any? /* Number | String */
    var x: Any? /* Number | String */
    var xChannelSelector: String?
    var xHeight: Any? /* Number | String */
    var xlinkActuate: String?
    var xlinkArcrole: String?
    var xlinkHref: String?
    var xlinkRole: String?
    var xlinkShow: String?
    var xlinkTitle: String?
    var xlinkType: String?
    var xmlBase: String?
    var xmlLang: String?
    var xmlns: String?
    var xmlnsXlink: String?
    var xmlSpace: String?
    var y1: Any? /* Number | String */
    var y2: Any? /* Number | String */
    var y: Any? /* Number | String */
    var yChannelSelector: String?
    var z: Any? /* Number | String */
    var zoomAndPan: String?
}

external interface WebViewHTMLAttributes<T> : HTMLAttributes<T> {
    var allowFullScreen: Boolean?
    var allowpopups: Boolean?
    var autoFocus: Boolean?
    var autosize: Boolean?
    var blinkfeatures: String?
    var disableblinkfeatures: String?
    var disableguestresize: Boolean?
    var disablewebsecurity: Boolean?
    var guestinstance: String?
    var httpreferrer: String?
    var nodeintegration: Boolean?
    var partition: String?
    var plugins: Boolean?
    var preload: String?
    var src: String?
    var useragent: String?
    var webpreferences: String?
}
