package samples

import kotlinx.css.*
import react.*
import react.dom.*
import samples.affix.*
import samples.alert.*
import samples.anchor.*
import samples.autocomplete.*
import samples.avatar.avatarApp
import samples.backtop.*
import samples.badge.*
import samples.breadcrumb.*
import samples.button.*
import samples.calendar.*
import samples.card.*
import samples.carousel.*
import samples.cascader.*
import samples.checkbox.*
import samples.collapse.*
import samples.comment.*
import samples.configprovider.*
import samples.datepicker.*
import samples.descriptions.*
import samples.divider.*
import samples.drawer.*
import samples.dropdown.*
import samples.empty.*
import samples.form.*
import samples.grid.*
import samples.icon.*
import samples.input.*
import samples.inputnumber.*
import samples.layout.*
import samples.list.listApp
import samples.localeprovider.*
import samples.mentions.*
import samples.menu.*
import samples.message.*
import samples.modal.*
import samples.notification.*
import samples.pageheader.*
import samples.pagination.*
import samples.popconfirm.*
import samples.popover.*
import samples.progress.*
import samples.radio.*
import samples.rate.*
import samples.result.*
import samples.skeleton.skeletonApp
import samples.slider.*
import samples.spin.*
import samples.statistic.*
import samples.steps.*
import samples.switch.*
import samples.table.*
import samples.tabs.*
import samples.tag.*
import samples.timeline.*
import samples.timepicker.*
import samples.tooltip.*
import samples.transfer.*
import samples.tree.*
import samples.treeselect.*
import samples.typography.*
import samples.upload.uploadApp
import styled.*

object AppStyles : StyleSheet("app", isStatic = true) {
    val header by css {
        padding(all = 10.px)
        textAlign = TextAlign.center
    }

    val content by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        justifyContent = JustifyContent.center
        alignItems = Align.center
        padding(all = 10.px)
        children("*") {
            margin(all = 24.px)
            children("div") {
                width = 1200.px
                margin(12.px)
            }
        }
    }
    val contentSection by css {
        border = "1px solid lightgrey"
        borderRadius = 1.px
        padding = "10px"
    }
}

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css { +AppStyles.header }
            h1 { +"Examples" }
        }
        styledDiv {
            css { +AppStyles.content }
            affixApp()
            alertApp()
            anchorApp()
            autoCompleteApp()
            avatarApp()
            backTopApp()
            badgeApp()
            breadcrumbApp()
            buttonApp()
            calendarApp()
            cardApp()
            carouselApp()
            cascaderApp()
            checkboxApp()
            collapseApp()
            commentApp()
            configProviderApp()
            datePickerApp()
            descriptionsApp()
            dividerApp()
            drawerApp()
            dropdownApp()
            emptyApp()
            formApp()
            gridApp()
            iconApp()
            inputApp()
            inputNumberApp()
            layoutApp()
            listApp()
            localeProviderApp()
            mentionsApp()
            menuApp()
            messageApp()
            modalApp()
            notificationApp()
            pageHeaderApp()
            paginationApp()
            popconfirmApp()
            popoverApp()
            progressApp()
            radioApp()
            rateApp()
            resultApp()
            selectApp()
            skeletonApp()
            sliderApp()
            spinApp()
            statisticApp()
            stepsApp()
            switchApp()
            tableApp()
            tabsApp()
            tagApp()
            timelineApp()
            timePickerApp()
            tooltipApp()
            transferApp()
            treeApp()
            treeSelectApp()
            typographyApp()
            uploadApp()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
