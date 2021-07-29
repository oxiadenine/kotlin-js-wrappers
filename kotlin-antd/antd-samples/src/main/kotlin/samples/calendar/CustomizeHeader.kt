package samples.calendar

import antd.calendar.CalendarMode
import antd.calendar.calendar
import antd.grid.col
import antd.grid.row
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinx.css.*
import kotlinx.css.properties.border
import moment.Moment
import react.RBuilder
import react.ReactElement
import react.buildElement
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv

private fun handlePanelChange(value: Moment?, mode: CalendarMode?) {
    console.log(value, mode)
}

fun RBuilder.customizeHeader() {
    styledDiv {
        css { +CalendarStyles.customizeHeader }
        styledDiv {
            css {
                width = 300.px
                border(1.px, BorderStyle.solid, Color("#d9d9d9"))
                borderRadius = 4.px
            }
            calendar {
                attrs {
                    fullscreen = false
                    headerRender = { headerRender ->
                        val start = 0
                        val end = 12
                        val monthOptions = mutableListOf<ReactElement>()

                        val current = headerRender.value.clone()
                        val localeData = headerRender.value.localeData()
                        val months = mutableListOf<String>()

                        for (i in 0..12) {
                            current.month(i)
                            months.add(localeData.monthsShort(current))
                        }

                        for (index in start..end) {
                            monthOptions.add(buildElement {
                                option {
                                    attrs {
                                        className = "month-item"
                                        key = "$index"
                                    }
                                    +months[index]
                                }
                            })
                        }

                        val month = headerRender.value.month()
                        val year = headerRender.value.year()

                        val options = mutableListOf<ReactElement>()

                        for (i in (year.toInt() - 10)..(year.toInt() + 10)) {
                            options.add(buildElement {
                                option {
                                    attrs {
                                        key = "$i"
                                        value = i
                                        className = "year-item"
                                    }
                                    +"$i"
                                }
                            })
                        }

                        buildElement {
                            styledDiv {
                                css { padding(10.px) }
                                styledDiv {
                                    css { marginBottom = 10.px }
                                    +"Custom header "
                                }
                                row {
                                    attrs.justify = "space-between"
                                    col {
                                        radioGroup {
                                            attrs {
                                                size = "small"
                                                onChange = { e ->
                                                    headerRender.onTypeChange(e.target.value.unsafeCast<String>())
                                                }
                                                value = headerRender.type
                                            }
                                            radioButton {
                                                attrs.value = "month"
                                                +"Month"
                                            }
                                            radioButton {
                                                attrs.value = "year"
                                                +"Year"
                                            }
                                        }
                                    }
                                    col {
                                        select<Number, SelectComponent<Number>> {
                                            attrs {
                                                size = "small"
                                                dropdownMatchSelectWidth = false
                                                className = "my-year-select"
                                                onChange = { newYear, _ ->
                                                    val now = headerRender.value.clone().year(newYear)

                                                    headerRender.onChange.invoke(now)
                                                }
                                                value = year
                                            }
                                            childList.add(options.toTypedArray())
                                        }
                                    }
                                    col {
                                        select<String, SelectComponent<String>> {
                                            attrs {
                                                size = "small"
                                                dropdownMatchSelectWidth = false
                                                value = month.toString()
                                                onChange = { selectedMonth, _ ->
                                                    val newValue = headerRender.value.clone()
                                                    newValue.month(selectedMonth.toInt(10))

                                                    headerRender.onChange.invoke(newValue)
                                                }
                                            }
                                            childList.add(monthOptions.toTypedArray())
                                        }
                                    }
                                }
                            }
                        }
                    }
                    onPanelChange = ::handlePanelChange
                }
            }
        }
    }
}
