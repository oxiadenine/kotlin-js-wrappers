package antd.alert

import kotlinext.js.*
import react.*

fun RBuilder.alert(handler: RHandler<AlertProps>) = child(AlertComponent::class, handler)
fun RBuilder.errorBoundary(handler: RHandler<ErrorBoundaryProps>) = child(AlertComponent.ErrorBoundary, jsObject {}, handler)
