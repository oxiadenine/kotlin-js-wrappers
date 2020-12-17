package samples.alert

import antd.*
import antd.alert.*
import antd.button.*
import react.*
import styled.*

private val throwError = functionalComponent<RProps> {
    val (error, setError) = useState<Error?>(null)

    val handleClick: MouseEventHandler<Any> = {
        setError(Error("An Uncaught Error"))
    }

    if (error != null) {
        throw error
    }

    button {
        attrs {
            type = "danger"
            onClick = handleClick
        }
        +"Click me to throw a error"
    }
}

fun RBuilder.throwError() = child(throwError)


fun RBuilder.errorBoundary() {
    styledDiv {
        css { +AlertStyles.errorBoundary }
        errorBoundary {
            throwError()
        }
    }
}
