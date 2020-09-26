package samples.transfer

import antd.SyntheticEvent
import antd.switch.switch
import antd.transfer.TransferDirection
import antd.transfer.TransferItem
import antd.transfer.transfer
import kotlinext.js.jsObject
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val mockData = (0..19).map { i ->
    jsObject<TransferItem> {
        key = i.toString()
        title = "content${i + 1}"
        description = "description of content${i + 1}"
        disabled = i % 3 < 1
    }
}.toTypedArray()

private val oriTargetKeys = mockData
        .filter { item -> item.key.toInt() % 3 > 1 }
        .map { item -> item.key }
        .toTypedArray()

interface BasicAppState : RState {
    var targetKeys: Array<String>
    var disabled: Boolean
    var selectedKeys: Array<String>
}

class BasicApp : RComponent<RProps, BasicAppState>() {
    private val handleChange = fun (nextTargetKeys: Array<String>, direction: String, moveKeys: Any) {
        setState {
            targetKeys = nextTargetKeys
        }

        console.log("targetKeys: ", nextTargetKeys)
        console.log("direction: ", direction)
        console.log("moveKeys: ", moveKeys)
    }

    private val handleSelectChange = fun (sourceSelectedKeys: Array<String>, targetSelectedKeys: Array<String>) {
        setState {
            selectedKeys = sourceSelectedKeys + targetSelectedKeys
        }

        console.log("sourceSelectedKeys: ", sourceSelectedKeys)
        console.log("targetSelectedKeys: ", targetSelectedKeys)
    }

    private val handleScroll = fun (direction: TransferDirection, event: SyntheticEvent<HTMLDivElement, Event>) {
        console.log("direction:", direction)
        console.log("target:", event.target)
    }

    private val handleDisable = fun (checked: Boolean, _: MouseEvent) {
        setState {
            disabled = checked
        }
    }

    override fun BasicAppState.init() {
        targetKeys = oriTargetKeys
        selectedKeys = emptyArray()
        disabled = false
    }

    override fun RBuilder.render() {
        div {
            transfer {
                attrs {
                    dataSource = mockData
                    titles = arrayOf("Source", "Target")
                    targetKeys = state.targetKeys
                    selectedKeys = state.selectedKeys
                    onChange = handleChange
                    onSelectChange = handleSelectChange
                    onScroll = handleScroll
                    render = { item -> item.title }
                    disabled = state.disabled
                }
            }
            switch {
                attrs {
                    unCheckedChildren = "disabled"
                    checkedChildren = "disabled"
                    checked = state.disabled
                    onChange = handleDisable
                }
            }
        }
    }
}

fun RBuilder.basicApp() = child(BasicApp::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +TransferStyles.basic }
        basicApp()
    }
}
