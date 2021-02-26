package antd.form

import antd.ReactNode
import react.*

external object FormErrorListComponent : Component<FormErrorListProps, RState> {
    override fun render(): ReactElement?
}

external interface FormErrorListProps : RProps {
    var errors: Array<ReactNode>?
    var help: ReactNode?
    var onDomErrorVisibleChange: ((visible: Boolean) -> Unit)?
}
