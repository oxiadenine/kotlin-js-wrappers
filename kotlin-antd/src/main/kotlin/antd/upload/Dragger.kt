package antd.upload

import react.Component
import react.RState
import react.ReactElement

external object DraggerComponent : Component<DraggerProps, RState> {
    override fun render(): ReactElement?
}

external interface DraggerProps : UploadProps {
    var height: Number?
}
