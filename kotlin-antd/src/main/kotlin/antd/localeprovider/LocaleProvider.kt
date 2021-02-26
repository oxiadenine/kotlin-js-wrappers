@file:JsModule("antd/lib/locale-provider")
@file:JsNonModule

package antd.localeprovider

import antd.ReactNode
import antd.datepicker.PickerLocale
import antd.form.ValidateMessages
import antd.empty.TransferLocale as TransferLocaleForEmpty
import antd.modal.*
import antd.pagination.PaginationLocale
import antd.popconfirm.PopconfirmLocale
import antd.table.TableLocale
import antd.transfer.TransferLocale
import antd.upload.UploadLocale
import kotlinext.js.*
import react.*

@JsName("default")
external object LocaleProviderComponent : Component<LocaleProviderProps, RState> {
    override fun render(): ReactElement?
}

external interface LocaleProviderProps : RProps {
    var locale: Locale
    var children: ReactNode?
}

external interface Locale {
    var locale: String
    var Pagination: PaginationLocale?
    var DatePicker: PickerLocale?
    var TimePicker: Object?
    var Calendar: Object?
    var Table: TableLocale?
    var Modal: ModalLocale?
    var Popconfirm: PopconfirmLocale?
    var Transfer: TransferLocale?
    var Select: Object?
    var Upload: UploadLocale?
    var Empty: TransferLocaleForEmpty?
    var global: Object?
    var PageHeader: Object?
    var Icon: Object?
    var Text: Object?
    var Form: LocaleForm?
}

external interface LocaleForm {
    var optional: String?
    var defaultValidateMessages: ValidateMessages
}
