package antd.form

import react.*

external object FormErrorListComponent : Component<FormErrorListProps, RState> {
    override fun render(): ReactElement?
}

external interface FormErrorListProps : RProps {
    var errors: Array<ReactElement>?
    /** @private Internal usage. Do not use in your production */
    var help: ReactElement?
    /** @private Internal usage. Do not use in your production */
    var onDomErrorVisibleChange: ((visible: Boolean) -> Unit)?
}
