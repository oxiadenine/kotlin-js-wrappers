package antd.upload

import react.*

external interface DraggerComponent : ComponentType<DraggerProps>

external interface DraggerProps : UploadProps<Any> {
    var height: Number?
}
