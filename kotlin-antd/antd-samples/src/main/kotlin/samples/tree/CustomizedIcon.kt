package samples.tree

import antd.icon.icon
import antd.tree.*
import kotlinx.html.id
import react.*
import react.dom.div

fun RBuilder.customizedIcon() {
    div("tree-container") {
        attrs.id = "tree-customized-icon"
        tree {
            attrs {
                showIcon = true
                defaultExpandAll = true
                defaultSelectedKeys = arrayOf("0-0-0")
                switcherIcon = buildElement {
                    icon {
                        attrs.type = "down"
                    }
                }
            }
            treeNode {
                attrs {
                    icon = buildElement {
                       icon {
                           attrs.type = "smile-o"
                       }
                    }!!
                    title = "parent 1"
                    key = "0-0"
                }
                treeNode {
                    attrs {
                        icon = buildElement {
                            icon {
                                attrs.type = "meh-o"
                            }
                        }!!
                        title = "leaf"
                        key = "0-0-0"
                    }
                }
                treeNode {
                    attrs {
                        icon = fun (treeNode: TreeNodeAttribute): ReactElement {
                            return buildElement {
                                icon {
                                    attrs.type = if (treeNode.selected) "frown" else "frown-o"
                                }
                            }!!
                        }
                        title = "leaf"
                        key = "0-0-1"
                    }
                }
            }
        }
    }
}
