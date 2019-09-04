@file:JsModule("antd/lib/config-provider")

package antd.configprovider

import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object ConfigProviderComponent : Component<ConfigProviderProps, RState> {
    override fun render(): ReactElement?
}

external interface ConfigProviderProps : RProps {
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var prefixCls: String?
    var children: ReactElement?
    var renderEmpty: RenderEmptyHandler?
    var csp: CSPConfig?
    var autoInsertSpaceInButton: Boolean?
}

external interface CSPConfig {
    var nonce: String
}

external interface BasicExportProps : RProps {
    var prefixCls: String?
}

external interface ConfigConsumerProps {
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var rootPrefixCls: String?
    var getPrefixCls: (suffixCls: String, customizePrefixCls: String?) -> String
    var renderEmpty: RenderEmptyHandler
    var csp: CSPConfig?
    var autoInsertSpaceInButton: Boolean?
}

external interface ConsumerConfig {
    var prefixCls: String
}

external fun <ExportProps : BasicExportProps> withConfigConsumer(config: ConsumerConfig): (component: IReactComponent<RProps>) -> Component<ExportProps, RState>
