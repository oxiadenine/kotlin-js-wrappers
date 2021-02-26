package antd.alert

import antd.ReactNode
import react.*

external class ErrorBoundaryComponent : Component<ErrorBoundaryProps, ErrorBoundaryState> {
    override fun render(): ReactElement
}

external interface ErrorBoundaryProps : RProps {
    var message: ReactNode?
    var description: ReactNode?
}

external interface ErrorBoundaryState : RState {
    var error: Error?
    var info: ErrorBoundaryStateInfo
}

external interface ErrorBoundaryStateInfo {
    var componentStack: String?
}
