package antd.localeprovider

import antd.ReactNode
import react.*

external object LocaleReceiverComponent : Component<LocaleReceiverProps, State> {
    override fun render(): ReactElement?
}

external interface LocaleReceiverProps : Props {
    var componentName: String?
    var defaultLocale: Any? /* Object | Function<Any> */
    var children: (locale: dynamic, localeCode: String?, fullLocale: dynamic) -> ReactNode
}

external interface LocaleInterface

external interface LocaleReceiverContext {
    var antLocale: LocaleInterface?
}
