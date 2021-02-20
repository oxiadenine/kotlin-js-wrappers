package samples.image

import antd.image.image
import react.RBuilder
import styled.css
import styled.styledDiv

private fun RBuilder.imageDemo() {
    image {
        attrs {
            width = 200
            src = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        }
    }
}

fun RBuilder.basic() {
    styledDiv {
        css { +ImageStyles.basic }
        imageDemo()
    }
}
