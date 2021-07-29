package samples.configprovider

import antd.MouseEvent
import antd.MouseEventHandler
import antd.badge.badge
import antd.button.button
import antd.button.buttonGroup
import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
import antd.configprovider.configProvider
import antd.divider.divider
import antd.grid.col
import antd.grid.row
import antd.icon.*
import antd.input.input
import antd.input.inputGroup
import antd.input.search
import antd.inputnumber.inputNumber
import antd.modal.modal
import antd.pagination.pagination
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.rate.rate
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import antd.steps.step
import antd.steps.steps
import antd.switch.switch
import antd.tree.tree
import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeNode
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.css.*
import kotlinx.html.classes
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*
import styled.css
import styled.styledB
import styled.styledDiv
import styled.styledSpan

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jsObject {
        value = "tehran"
        label = "تهران"
        children = arrayOf(jsObject {
            value = "tehran-c"
            label = "تهران"
            children = arrayOf(jsObject {
                value = "saadat-abad"
                label = "سعادت آیاد"
            })
        })
    },
    jsObject {
        value = "ardabil"
        label = "اردبیل"
        children = arrayOf(jsObject {
            value = "ardabil-c"
            label = "اردبیل"
            children = arrayOf(jsObject {
                value = "primadar"
                label = "پیرمادر"
            })
        })
    },
    jsObject {
        value = "gilan"
        label = "گیلان"
        children = arrayOf(jsObject {
            value = "rasht"
            label = "رشت"
            children = arrayOf(jsObject {
                value = "district-3"
                label = "منطقه ۳"
            })
        })
    })

external interface DirectionPageProps : RProps {
    var className: String
    var popupPlacement: String
}

external interface DirectionPageState : State {
    var currentStep: Number
    var modalVisible: Boolean
    var badgeCount: Number
    var showBadge: Boolean
}

class DirectionPage : RComponent<DirectionPageProps, DirectionPageState>() {
    private val selectBefore = buildElement {
        select<String, SelectComponent<String>> {
            attrs {
                defaultValue = "Http://"
                style = js { width = 90 }
            }
            option {
                attrs.value = "Http://"
                +"Http://"
            }
            option {
                attrs.value = "Https://"
                +"Https://"
            }
        }
    }

    private val selectAfter = buildElement {
        select<String, SelectComponent<String>> {
            attrs {
                defaultValue = ".com"
                style = js { width = 80 }
            }
            option {
                attrs.value = ".com"
                +".com"
            }
            option {
                attrs.value = ".jp"
                +".jp"
            }
            option {
                attrs.value = ".cn"
                +".cn"
            }
            option {
                attrs.value = ".org"
                +".org"
            }
        }
    }

    private val cascaderFilter = { inputValue: String, path: Array<CascaderOptionType> ->
        path.any { option ->
            option.label.unsafeCast<String>().lowercase().indexOf(inputValue.lowercase()) > -1
        }
    }

    private val onCascaderChange = { value: CascaderValueType, _: Array<CascaderOptionType>? ->
        console.log(value)
    }

    private val showModal: MouseEventHandler<Any> = {
        setState {
            modalVisible = true
        }
    }

    private val handleOk = { e: MouseEvent<HTMLElement> ->
        console.log(e)

        setState {
            modalVisible = false
        }
    }

    private val handleCancel = { e: MouseEvent<HTMLElement> ->
        console.log(e)

        setState {
            modalVisible = false
        }
    }

    private val onStepsChange = { step: Number ->
        console.log("onChange:", step)

        setState { currentStep = step }
    }

    private val increaseBadge: MouseEventHandler<Any> = {
        val count = state.badgeCount.toInt() + 1

        setState { badgeCount = count }
    }

    private val declineBadge: MouseEventHandler<Any> = {
        var count = this.state.badgeCount.toInt() - 1

        if (count < 0) {
            count = 0
        }

        setState { badgeCount = count }
    }

    private val onChangeBadge = { show: Boolean, _: org.w3c.dom.events.MouseEvent ->
        setState { showBadge = show }
    }

    override fun DirectionPageState.init() {
        currentStep = 0
        modalVisible = false
        badgeCount = 5
        showBadge = true
    }

    override fun RBuilder.render() {
        div(classes = "direction-components") {
            row {
                col {
                    attrs.span = 24
                    divider {
                        attrs.orientation = "left"
                        +"Cascader example"
                    }
                    cascader {
                        attrs {
                            suffixIcon = searchOutlined {}
                            options = cascaderOptions
                            onChange = onCascaderChange
                            placeholder = "یک مورد انتخاب کنید"
                            popupPlacement = props.popupPlacement
                        }
                    }
                    br {}
                    br {}
                    br {}
                    br {}
                    +"With search:"
                    cascader {
                        attrs {
                            suffixIcon = smileOutlined {}
                            options = cascaderOptions
                            onChange = onCascaderChange
                            placeholder = "Select an item"
                            popupPlacement = props.popupPlacement
                            showSearch = cascaderFilter
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Switch example"
                    }
                    br {}
                    br {}
                    switch {
                        attrs.defaultChecked = true
                    }
                    br {}
                    br {}
                    switch {
                        attrs {
                            loading = true
                            defaultChecked = true
                        }
                    }
                    br {}
                    br {}
                    switch {
                        attrs {
                            size = "small"
                            loading = true
                        }
                    }
                }
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Radio Group example"
                    }
                    radioGroup {
                        attrs {
                            defaultValue = "c"
                            buttonStyle = "solid"
                        }
                        radioButton {
                            attrs.value = "a"
                            +"تهران"
                        }
                        radioButton {
                            attrs {
                                value = "b"
                                disabled = true
                            }
                            +"اصفهان"
                        }
                        radioButton {
                            attrs.value = "c"
                            +"فارس"
                        }
                        radioButton {
                            attrs.value = "d"
                            +"خوزستان"
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Button example"
                    }
                    div(classes = "button-demo") {
                        button {
                            attrs {
                                type = "primary"
                                icon = buildElement {
                                    downloadOutlined {}
                                }
                            }
                        }
                        button {
                            attrs {
                                type = "primary"
                                shape = "circle"
                                icon = buildElement {
                                    downloadOutlined {}
                                }
                            }
                        }
                        button {
                            attrs {
                                type = "primary"
                                shape = "round"
                                icon = buildElement {
                                    downloadOutlined {}
                                }
                            }
                        }
                        button {
                            attrs {
                                type = "primary"
                                shape = "round"
                                icon = buildElement {
                                    downloadOutlined {}
                                }
                            }
                            +"Download"
                        }
                        button {
                            attrs {
                                type = "primary"
                                icon = buildElement {
                                    downloadOutlined {}
                                }
                            }
                            +"Download"
                        }
                        br {}
                        buttonGroup {
                            button {
                                attrs.type = "primary"
                                leftOutlined {}
                                +"Backward"
                            }
                            button {
                                attrs.type = "primary"
                                +"Forward"
                                rightOutlined {}
                            }
                        }
                        button {
                            attrs {
                                type = "primary"
                                loading = true
                            }
                            +"Loading"
                        }
                        button {
                            attrs {
                                type = "primary"
                                size = "small"
                                loading = true
                            }
                            +"Loading"
                        }
                    }
                }
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Tree example"
                    }
                    tree {
                        attrs {
                            showLine = true
                            checkable = true
                            defaultExpandedKeys = arrayOf("0-0-0", "0-0-1")
                            defaultSelectedKeys = arrayOf("0-0-0", "0-0-1")
                            defaultCheckedKeys = arrayOf("0-0-0", "0-0-1")
                        }
                        treeNode {
                            attrs {
                                title = "parent 1"
                                key = "0-0"
                            }
                            treeNode {
                                attrs {
                                    title = "parent 1-0"
                                    key = "0-0-0"
                                    disabled = true
                                }
                                treeNode {
                                    attrs {
                                        title = "leaf"
                                        key = "0-0-0-0"
                                        disableCheckbox = true
                                    }
                                }
                                treeNode {
                                    attrs {
                                        title = "leaf"
                                        key = "0-0-0-1"
                                    }
                                }
                            }
                            treeNode {
                                attrs {
                                    title = "parent 1-1"
                                    key = "0-0-1"
                                }
                                treeNode {
                                    attrs {
                                        title = buildElement {
                                            styledSpan {
                                                css { color = Color("#1890ff") }
                                                +"sss"
                                            }
                                        }
                                        key = "0-0-1-0"
                                    }
                                }
                            }
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 24
                    divider {
                        attrs.orientation = "left"
                        +"Input (Input Group) example"
                    }
                    inputGroup {
                        attrs.size = "large"
                        row {
                            attrs.gutter = 8
                            col {
                                attrs.span = 5
                                input {
                                    attrs.defaultValue = "0571"
                                }
                            }
                            col {
                                attrs.span = 8
                                input {
                                    attrs.defaultValue = "26888888"
                                }
                            }
                        }
                    }
                    br {}
                    inputGroup {
                        attrs.compact = true
                        input {
                            attrs {
                                style = js { width = "20%" }
                                defaultValue = "0571"
                            }
                        }
                        input {
                            attrs {
                                style = js { width = "30%" }
                                defaultValue = "26888888"
                            }
                        }
                    }
                    br {}
                    inputGroup {
                        attrs.compact = true
                        select<String, SelectComponent<String>> {
                            attrs.defaultValue = "Option1"
                            option {
                                attrs.value = "Option1"
                                +"Option1"
                            }
                            option {
                                attrs.value = "Option2"
                                +"Option2"
                            }
                        }
                        input {
                            attrs {
                                style = js { width = "50%" }
                                defaultValue = "input content"
                            }
                        }
                        inputNumber {}
                    }
                    br {}
                    search {
                        attrs {
                            placeholder = "input search text"
                            enterButton = "Search"
                            size = "large"
                        }
                    }
                    br {}
                    br {}
                    styledDiv {
                        css { marginBottom = 16.px }
                        input {
                            attrs {
                                addonBefore = selectBefore
                                addonAfter = selectAfter
                                defaultValue = "mysite"
                            }
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Select example"
                    }
                    select<String, SelectComponent<String>> {
                        attrs {
                            mode = "multiple"
                            defaultValue = "مورچه"
                            style = js { width = 120 }
                        }
                        option {
                            attrs.value = "jack"
                            +"Jack"
                        }
                        option {
                            attrs.value = "مورچه"
                            +"مورچه"
                        }
                        option {
                            attrs {
                                value = "disabled"
                                disabled = true
                            }
                            +"Disabled"
                        }
                        option {
                            attrs.value = "Yiminghe"
                            +"yiminghe"
                        }
                    }
                    select<String, SelectComponent<String>> {
                        attrs {
                            defaultValue = "مورچه"
                            style = js { width = 120 }
                            disabled = true
                        }
                        option {
                            attrs.value = "مورچه"
                            +"مورچه"
                        }
                    }
                    select<String, SelectComponent<String>> {
                        attrs {
                            defaultValue = "مورچه"
                            style = js { width = 120 }
                            loading = true
                        }
                        option {
                            attrs.value = "مورچه"
                            +"مورچه"
                        }
                    }
                    select<String, SelectComponent<String>> {
                        attrs {
                            showSearch = true
                            style = js { width = 200 }
                            placeholder = "Select a person"
                            optionFilterProp = "children"
                            filterOption = { input: String, option: dynamic ->
                                option.props.children.toLowerCase().indexOf(input.lowercase()) >= 0
                            }
                        }
                        option {
                            attrs.value = "jack"
                            +"Jack"
                        }
                        option {
                            attrs.value = "مورچه"
                            +"مورچه"
                        }
                        option {
                            attrs.value = "tom"
                            +"Tom"
                        }
                    }
                }
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"TreeSelect example"
                    }
                    div {
                        treeSelect<String, TreeSelectComponent<String>> {
                            attrs {
                                showSearch = true
                                style = js { width = "100%" }
                                dropdownStyle = js {
                                    maxHeight = 400
                                    overflow = "auto"
                                }
                                placeholder = "Please select"
                                allowClear = true
                                treeDefaultExpandAll = true
                            }
                        }
                        treeNode {
                            attrs {
                                value = "parent 1"
                                title = "parent 1"
                                key = "0-1"
                            }
                            treeNode {
                                attrs {
                                    value = "parent 1-0"
                                    title = "parent 1-0"
                                    key = "0-1-1"
                                }
                                treeNode {
                                    attrs {
                                        value = "leaf1"
                                        title = "my leaf"
                                        key = "random"
                                    }
                                }
                                treeNode {
                                    attrs {
                                        value = "leaf2"
                                        title = "your leaf"
                                        key = "random1"
                                    }
                                }
                            }
                            treeNode {
                                attrs {
                                    value = "parent 1-1"
                                    title = "parent 1-1"
                                    key = "random2"
                                }
                                treeNode {
                                    attrs {
                                        value = "sss"
                                        title = buildElement {
                                            styledB {
                                                css { color = Color("#08c") }
                                                +"sss"
                                            }
                                        }
                                        key = "random3"
                                    }
                                }
                            }
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 24
                    divider {
                        attrs.orientation = "left"
                        +"Modal example"
                    }
                    div {
                        button {
                            attrs {
                                type = "primary"
                                onClick = showModal
                            }
                            +"Open Modal"
                        }
                        modal {
                            attrs {
                                title = "پنچره ساده"
                                visible = state.modalVisible
                                onOk = handleOk
                                onCancel = handleCancel
                            }
                            p { +"نگاشته\u200Cهای خود را اینجا قراردهید" }
                            p { +"نگاشته\u200Cهای خود را اینجا قراردهید" }
                            p { +"نگاشته\u200Cهای خود را اینجا قراردهید" }
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 24
                    divider {
                        attrs.orientation = "left"
                        +"Steps example"
                    }
                    div {
                        steps {
                            attrs {
                                progressDot = true
                                current = state.currentStep
                            }
                            step {
                                attrs {
                                    title = "Finished"
                                    description = "This is a description."
                                }
                            }
                            step {
                                attrs {
                                    title = "In Progress"
                                    description = "This is a description."
                                }
                            }
                            step {
                                attrs {
                                    title = "Waiting"
                                    description = "This is a description."
                                }
                            }
                        }
                        br {}
                        steps {
                            attrs {
                                current = state.currentStep
                                onChange = onStepsChange
                            }
                            step {
                                attrs {
                                    title = "Step 1"
                                    description = "This is a description."
                                }
                            }
                            step {
                                attrs {
                                    title = "Step 2"
                                    description = "This is a description."
                                }
                            }
                            step {
                                attrs {
                                    title = "Step 3"
                                    description = "This is a description."
                                }
                            }
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Rate example"
                    }
                    div {
                        rate {
                            attrs.defaultValue = 2.5
                        }
                        br {}
                        strong { +"* Note: " }
                        +"""
                            Half star not implemented in RTL direction, it will be
                            supported after 
                        """.trimIndent()
                        a {
                            attrs.href = "https://github.com/react-component/rate"
                            +"rate "
                        }
                        +"implement rtl support."
                    }
                }
                col {
                    attrs.span = 12
                    divider {
                        attrs.orientation = "left"
                        +"Badge example"
                    }
                    div {
                        div {
                            badge {
                               attrs.count = state.badgeCount
                               a {
                                   attrs {
                                       href = "#"
                                       classes = setOf("head-example")
                                   }
                               }
                            }
                            buttonGroup {
                                button {
                                    attrs.onClick = declineBadge
                                    minusOutlined {}
                                }
                                button {
                                    attrs.onClick = increaseBadge
                                    plusOutlined {}
                                }
                            }
                        }
                        styledDiv {
                            css { marginTop = 10.px }
                            badge {
                                attrs.dot = state.showBadge
                                a {
                                    attrs {
                                        href = "#"
                                        classes = setOf("head-example")
                                    }
                                }
                            }
                            switch {
                                attrs {
                                    onChange = onChangeBadge
                                    checked = state.showBadge
                                }
                            }
                        }
                    }
                }
            }
            br {}
            br {}
            row {
                col {
                    attrs.span = 24
                    divider {
                        attrs.orientation = "left"
                        +"Pagination example"
                    }
                    pagination {
                        attrs {
                            showSizeChanger = true
                            defaultCurrent = 3
                            total = 500
                        }
                    }
                }
            }
            br {}
            row {
                col {
                    attrs.span = 24
                    divider {
                        attrs.orientation = "left"
                        +"Grid System example"
                    }
                    div(classes = "grid-demo") {
                        div(classes = "code-box-demo") {
                            p {
                                strong { +"* Note: " }
                                +"""
                                    Every calculation in RTL grid system is from right side
                                    (offset, push, etc.)
                                """.trimIndent()
                            }
                            row {
                                col {
                                    attrs.span = 8
                                    +"col 8"
                                }
                                col {
                                    attrs {
                                        span = 8
                                        offset = 8
                                    }
                                    +"col 8"
                                }
                            }
                            row {
                                col {
                                    attrs {
                                        span = 6
                                        offset = 6
                                    }
                                    +"col-6 col-offset-6"
                                }
                                col {
                                    attrs {
                                        span = 6
                                        offset = 6
                                    }
                                    +"col-6 col-offset-6"
                                }
                            }
                            row {
                                col {
                                    attrs {
                                        span = 12
                                        offset = 6
                                    }
                                    +"col-12 col-offset-6"
                                }
                            }
                            row {
                                col {
                                    attrs {
                                        span = 18
                                        push = 6
                                    }
                                    +"col-18 col-push-6"
                                }
                                col {
                                    attrs {
                                        span = 6
                                        push = 18
                                    }
                                    +"col-6 col-pull-18"
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.directionPage(handler: RHandler<DirectionPageProps>) = child(DirectionPage::class, handler)

external interface DirectionAppState : State {
    var direction: String
    var popupPlacement: String
}

class DirectionApp : RComponent<RProps, DirectionAppState>() {
    val changeDirection = { e: RadioChangeEvent ->
        val directionValue = e.target.value as String

        setState { direction = directionValue }

        if (directionValue === "rtl") {
            setState { popupPlacement = "bottomRight" }
        } else {
            setState { popupPlacement = "bottomLeft" }
        }
    }

    override fun DirectionAppState.init() {
        direction = "ltr"
        popupPlacement = "bottomLeft"
    }

    override fun RBuilder.render() {
        styledDiv {
            css { marginBottom = 16.px }
            styledSpan {
                css { marginRight = 16.px }
                +"Change direction of components: "
            }
            radioGroup {
                attrs {
                    defaultValue = "ltr"
                    onChange = changeDirection
                }
                radioButton {
                    attrs {
                        key = "ltr"
                        value = "ltr"
                    }
                    +"LTR"
                }
                radioButton {
                    attrs {
                        key = "rtl"
                        value = "rtl"
                    }
                    +"RTL"
                }
            }
            configProvider {
                attrs.direction = state.direction
                directionPage {
                    attrs {
                        className = state.direction
                        popupPlacement = state.popupPlacement
                    }
                }
            }
        }
    }
}

fun RBuilder.directionApp() = child(DirectionApp::class) {}

fun RBuilder.direction() {
    styledDiv {
        css { +ConfigProviderStyles.direction }
        directionApp()
    }
}
