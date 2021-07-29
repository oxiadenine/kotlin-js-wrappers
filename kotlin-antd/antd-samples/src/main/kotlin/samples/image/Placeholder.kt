package samples.image

import antd.button.button
import antd.image.image
import antd.space.space
import react.*
import styled.css
import styled.styledDiv
import kotlin.js.Date

private val imageDemo = fc<RProps> {
    val (random, setRandom) = useState(0.0)

    space {
        attrs.size = 12
        image {
            attrs {
                width = 200
                src = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png?$random"
                placeholder = buildElement {
                    image {
                        attrs {
                            preview = false
                            src = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png?x-oss-process=image/blur,r_50,s_50/quality,q_1/resize,m_mfit,h_200,w_200"
                            width = 200
                        }
                    }
                }
            }
        }
        button {
            attrs {
                type = "primary"
                onClick = {
                    setRandom(Date.now())
                }
            }
            +"Reload"
        }
    }
}

private fun RBuilder.imageDemo() = child(imageDemo)

fun RBuilder.placeholder() {
    styledDiv {
        css { +ImageStyles.placeholder }
        imageDemo()
    }
}
