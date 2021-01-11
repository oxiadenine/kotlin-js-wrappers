package samples.tabs

import antd.button.*
import antd.checkbox.CheckboxValueType
import antd.checkbox.checkboxGroup
import antd.divider.divider
import antd.tabs.*
import kotlinext.js.jsObject
import react.*
import react.dom.br
import react.dom.div
import react.dom.h3
import samples.AppStyles
import styled.*

object Checkbox {
    const val LEFT = "left"
    const val RIGHT = "right"
    const val EMPTY = ""
}

private val operation = buildElement {
    button { +"Extra Action" }
}

val extra = functionalComponent<RProps> { _ ->
    val nothingChecked = arrayOf(
        Checkbox.EMPTY as CheckboxValueType,
        Checkbox.EMPTY as CheckboxValueType
    )
    val leftOnly = arrayOf(Checkbox.LEFT as CheckboxValueType)
    val rightOnly = arrayOf(Checkbox.RIGHT as CheckboxValueType)
    val leftAndRight = leftOnly.plus(rightOnly)
    val (position, setPosition) = useState(nothingChecked)
    val (left, right) = position
    val slot = useMemo(
        {
            return@useMemo when {
                left==Checkbox.LEFT && right==Checkbox.RIGHT ->
                    object {
                        val left = buildElement {
                            button {
                                attrs {
                                    className = "tabs-extra-demo-button"
                                }
                                +"Left Extra Action"
                            }
                        }
                        val right = buildElement {
                            button {
                                +"Right Extra Action"
                            }
                        }
                    }
                left==Checkbox.LEFT                          ->
                    buildElement {
                        button {
                            attrs {
                                className = "tabs-extra-demo-button"
                            }
                            +"Left Extra Action"
                        }
                    }
                left==Checkbox.RIGHT                         ->
                    buildElement {
                        button {
                            +"Right Extra Action"
                        }
                    }
                else                                         -> null
            }
        }, position
    )

    divider { }
    h3 { +"Extra Demo" }
    styledDiv {
        css {
            +TabsStyles.card
            +AppStyles.contentSection
        }
        tabs {
            attrs.tabBarExtraContent = operation
            tabPane {
                attrs {
                    tab = "Tab 1"
                    key = "1"
                }
                +"Content of tab 1"
            }
            tabPane {
                attrs {
                    tab = "Tab 2"
                    key = "2"
                }
                +"Content of tab 2"
            }
            tabPane {
                attrs {
                    tab = "Tab 3"
                    key = "3"
                }
                +"Content of tab 3"
            }
        }

        br {}
        br {}
        br {}
        div { +"You can also specify its direction or both side" }
        divider { }
        checkboxGroup {
            attrs {
                options = leftAndRight
                value = position
                onChange = {
                    val positions = when {
                        it.contentEquals(leftOnly)     ->
                            leftOnly.plus(Checkbox.EMPTY)
                        it.contentEquals(rightOnly)    ->
                            rightOnly.plus(Checkbox.EMPTY)
                        it.contentEquals(leftAndRight) ->
                            leftAndRight
                        else                           ->
                            nothingChecked

                    }
                    setPosition(positions)
                }

            }
        }
        br {}
        br {}
        tabs {
            attrs.tabBarExtraContent = slot
            tabPane {
                attrs {
                    tab = "Tab 1"
                    key = "1"
                }
                +"Content of tab 1"
            }
            tabPane {
                attrs {
                    tab = "Tab 2"
                    key = "2"
                }
                +"Content of tab 2"
            }
            tabPane {
                attrs {
                    tab = "Tab 3"
                    key = "3"
                }
                +"Content of tab 3"
            }
        }
    }
}

fun RBuilder.extra() = child(extra, jsObject {})
