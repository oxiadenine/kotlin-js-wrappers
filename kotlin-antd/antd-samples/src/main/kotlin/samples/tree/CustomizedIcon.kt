package samples.tree

import antd.icon.*
import antd.tree.TreeNodeAttribute
import antd.tree.tree
import antd.tree.treeNode
import react.RBuilder
import react.ReactElement
import react.buildElement
import react.key
import styled.css
import styled.styledDiv

fun RBuilder.customizedIcon() {
    styledDiv {
        css { +TreeStyles.customizedIcon }
        tree {
            attrs {
                showIcon = true
                defaultExpandAll = true
                defaultSelectedKeys = arrayOf("0-0-0")
                switcherIcon = buildElement {
                    downOutlined {}
                }
            }
            treeNode {
                attrs {
                    icon = buildElement {
                        smileOutlined {}
                    }
                    title = "parent 1"
                    key = "0-0"
                }
                treeNode {
                    attrs {
                        icon = buildElement {
                            mehOutlined {}
                        }
                        title = "leaf"
                        key = "0-0-0"
                    }
                }
                treeNode {
                    attrs {
                        icon = fun(treeNode: TreeNodeAttribute): ReactElement {
                            return buildElement {
                                if (treeNode.selected) {
                                    frownFilled {}
                                } else frownOutlined {}
                            }
                        }
                        title = "leaf"
                        key = "0-0-1"
                    }
                }
            }
        }
    }
}
