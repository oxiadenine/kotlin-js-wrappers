package antd.radio

import react.*

external val radioGroupContext: Context<RadioGroupContextProps?>
external val radioGroupContextProvider: Provider<RadioGroupContextProps?>

external interface RadioGroupContextProps {
    var onChange: (e: RadioChangeEvent) -> Unit
    var value: Any
    var disabled: Boolean?
    var name: String?
}
