@file:JsModule("antd/lib/config-provider")
@file:JsNonModule

package antd.configprovider

import antd.ReactNode
import antd.form.*
import antd.localeprovider.*
import org.w3c.dom.*
import react.*

@JsName("default")
external object ConfigProviderComponent : Component<ConfigProviderProps, RState> {
    override fun render(): ReactElement?
}

external interface ConfigProviderProps : RProps {
    var getTargetContainer: (() -> HTMLElement)?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var prefixCls: String?
    var children: ReactNode?
    var renderEmpty: RenderEmptyHandler?
    var csp: CSPConfig?
    var autoInsertSpaceInButton: Boolean?
    var form: ConfigProviderFormProps?
    var input: ConfigProviderInputProps?
    var locale: Locale?
    var pageHeader: ConfigProviderPageHeaderProps?
    var componentSize: SizeType?
    var direction: DirectionType?
    var space: ConfigProviderSpaceProps?
    var virtual: Boolean?
    var dropdownMatchSelectWidth: Boolean?
}

external interface ConfigProviderFormProps {
    var validateMessages: ValidateMessages?
    var requiredMark: RequiredMark?
}

external interface ConfigProviderInputProps {
    var ghost: Boolean
}

external interface ConfigProviderPageHeaderProps {
    var size: Any? /* SizeType | Number */
}

external interface ConfigProviderSpaceProps {
    var autopComplete: String?
}

external interface CSPConfig {
    var nonce: String
}
