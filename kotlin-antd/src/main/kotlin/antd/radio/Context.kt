package antd.radio

import react.RContext
import react.RProvider

external val radioGroupContext: RContext<RadioGroupContextProps?>
external val radioGroupContextProvider: RProvider<RadioGroupContextProps?>

external interface RadioGroupContextProps {
    var onChange: (e: RadioChangeEvent) -> Unit
    var value: Any
    var disabled: Boolean?
    var name: String?
}
