@file:JsModule("antd/lib/auto-complete")
@file:JsNonModule

package antd.autocomplete

import antd.RefAttributes
import antd.select.*
import react.*

@JsName("default")
external object AutoCompleteComponent : Component<AutoCompleteProps, State> {
    val Option: OptionComponent

    override fun render(): ReactElement?
}

external interface AutoCompleteProps : InternalSelectProps<String>, RefAttributes<RefSelectProps>, RProps {
    var dataSource: Array<DataSourceItemType>?
}

external interface DataSourceItemObject {
    var value: String
    var text: String
}
