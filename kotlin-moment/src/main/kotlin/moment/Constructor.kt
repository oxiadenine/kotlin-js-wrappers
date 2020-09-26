package moment

@JsModule("moment")
@JsNonModule
external fun moment(
    inp: MomentInput? = definedExternally,
    strict: Boolean? = definedExternally): Moment

@JsModule("moment")
@JsNonModule
external fun moment(
    inp: MomentInput? = definedExternally,
    format: MomentFormatSpecification? = definedExternally,
    strict: Boolean? = definedExternally): Moment

@JsModule("moment")
@JsNonModule
external fun moment(
    inp: MomentInput? = definedExternally,
    format: MomentFormatSpecification? = definedExternally,
    language: String? = definedExternally,
    strict: Boolean? = definedExternally): Moment
