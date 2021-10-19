package samples

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h1
import samples.affix.affixApp
import samples.alert.alertApp
import samples.anchor.anchorApp
import samples.autocomplete.autoCompleteApp
import samples.avatar.avatarApp
import samples.backtop.backTopApp
import samples.badge.badgeApp
import samples.breadcrumb.breadcrumbApp
import samples.button.buttonApp
import samples.calendar.calendarApp
import samples.card.cardApp
import samples.carousel.carouselApp
import samples.cascader.cascaderApp
import samples.checkbox.checkboxApp
import samples.collapse.collapseApp
import samples.comment.commentApp
import samples.configprovider.configProviderApp
import samples.datepicker.datePickerApp
import samples.descriptions.descriptionsApp
import samples.divider.dividerApp
import samples.drawer.drawerApp
import samples.dropdown.dropdownApp
import samples.empty.emptyApp
import samples.form.formApp
import samples.grid.gridApp
import samples.icon.iconApp
import samples.image.imageApp
import samples.input.inputApp
import samples.inputnumber.inputNumberApp
import samples.layout.layoutApp
import samples.list.listApp
import samples.localeprovider.localeProviderApp
import samples.mentions.mentionsApp
import samples.menu.menuApp
import samples.message.messageApp
import samples.modal.modalApp
import samples.notification.notificationApp
import samples.pageheader.pageHeaderApp
import samples.pagination.paginationApp
import samples.popconfirm.popconfirmApp
import samples.popover.popoverApp
import samples.progress.progressApp
import samples.radio.radioApp
import samples.rate.rateApp
import samples.result.resultApp
import samples.select.selectApp
import samples.skeleton.skeletonApp
import samples.slider.sliderApp
import samples.space.spaceApp
import samples.spin.spinApp
import samples.statistic.statisticApp
import samples.steps.stepsApp
import samples.switch.switchApp
import samples.table.tableApp
import samples.tabs.tabsApp
import samples.tag.tagApp
import samples.timeline.timelineApp
import samples.timepicker.timePickerApp
import samples.tooltip.tooltipApp
import samples.transfer.transferApp
import samples.tree.treeApp
import samples.treeselect.treeSelectApp
import samples.typography.typographyApp
import samples.upload.uploadApp
import styled.StyleSheet
import styled.css
import styled.styledDiv

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
}

class App : RComponent<Props, State>() {
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
            imageApp()
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
            spaceApp()
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
