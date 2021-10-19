package antd.form

import antd.ReactNode
import react.*

external interface FormErrorListComponent : ComponentType<FormErrorListProps>

external interface FormErrorListProps : Props {
    var errors: Array<ReactNode>?
    var help: ReactNode?
    var onDomErrorVisibleChange: ((visible: Boolean) -> Unit)?
}
