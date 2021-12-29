package antd.upload

import react.*

external interface DraggerComponent : ComponentClass<DraggerProps>

external interface DraggerProps : UploadProps<Any> {
    var height: Number?
}
