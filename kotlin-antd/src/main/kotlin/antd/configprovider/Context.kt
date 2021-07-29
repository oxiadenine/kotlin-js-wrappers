package antd.configprovider

import antd.form.*
import antd.localeprovider.*
import org.w3c.dom.*
import react.*

external val configContext: Context<ConfigConsumerProps>
external val configConsumer: Consumer<ConfigConsumerProps>

external fun <ExportProps : BasicExportProps> withConfigConsumer(config: ConsumerConfig): (component: IReactComponent<RProps>) -> Component<ExportProps, State>

external interface ConfigConsumerProps {
    var getTargetContainer: (() -> HTMLElement)?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var rootPrefixCls: String?
    var getPrefixCls: (suffixCls: String?, customizePrefixCls: String?) -> String
    var renderEmpty: RenderEmptyHandler
    var csp: CSPConfig?
    var autoInsertSpaceInButton: Boolean?
    var input: ConfigProviderInputProps?
    var locale: Locale?
    var pageHeader: ConfigProviderPageHeaderProps?
    var direction: DirectionType?
    var space: ConfigProviderSpaceProps?
    var virtual: Boolean?
    var dropdownMatchSelectWidth: Boolean?
    var form: ConfigConsumerFormProps?
}

external interface ConfigConsumerFormProps {
    var requiredMark: RequiredMark?
}

external interface BasicExportProps : RProps {
    var prefixCls: String?
}

external interface ConsumerConfig {
    var prefixCls: String
}
