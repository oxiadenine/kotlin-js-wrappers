@file:JsModule("antd/lib/locale-provider")
@file:JsNonModule

package antd.localeprovider

import antd.modal.*
import kotlinext.js.*
import react.*

@JsName("default")
external object LocaleProviderComponent : Component<LocaleProviderProps, RState> {
    override fun render(): ReactElement?
}

external interface LocaleProviderProps : RProps {
    var locale: Locale
    var children: ReactElement?
}

external interface Locale {
    var locale: String
    var Pagination: Object?
    var DatePicker: Object?
    var TimePicker: Object?
    var Calendar: Object?
    var Table: Object?
    var Modal: ModalLocale?
    var Popconfirm: Object?
    var Transfer: Object?
    var Select: Object?
    var Upload: Object?
}
