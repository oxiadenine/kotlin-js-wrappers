package antd.localeprovider

import react.*

external object LocaleReceiverComponent : Component<LocaleReceiverProps, RState> {
    override fun render(): ReactElement?
}

external interface LocaleReceiverProps : RProps {
    var componentName: String?
    var defaultLocale: Any? /* Object | Function<Any> */
    var children: (locale: dynamic, localeCode: String?, fullLocale: dynamic) -> Any /* String | ReactElement */
}

external interface LocaleInterface

external interface LocaleReceiverContext {
    var antLocale: LocaleInterface?
}
