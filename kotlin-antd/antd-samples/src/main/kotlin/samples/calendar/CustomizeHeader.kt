package samples.calendar

import antd.calendar.*
import antd.grid.*
import antd.grid.col
import antd.radio.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import moment.*
import react.RBuilder
import react.ReactElement
import react.dom.div
import react.dom.jsStyle
import styled.*

private fun handlePanelChange(value: Moment?, mode: CalendarMode?) {
    console.log(value, mode)
}

fun RBuilder.customizeHeader() {
    styledDiv {
        css { +CalendarStyles.customizeHeader }
        div {
            attrs.jsStyle = js {
                width = 300
                border = "1px solid #d9d9d9"
                borderRadius = 4
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
                            monthOptions.add(option {
                                attrs {
                                    className = "month-item"
                                    key = "$index"
                                }
                                +months[index]
                            })
                        }

                        val month = headerRender.value.month()
                        val year = headerRender.value.year()

                        val options = mutableListOf<ReactElement>()

                        for (i in (year.toInt() - 10)..(year.toInt() + 10)) {
                            options.add(option {
                                attrs {
                                    key = "$i"
                                    value = i
                                    className = "year-item"
                                }
                                +"$i"
                            })
                        }

                        div {
                            attrs.jsStyle = js { padding = 10 }
                            div {
                                attrs.jsStyle = js { marginBottom = "10px" }
                                +"Custom header "
                            }
                            row {
                                attrs {
                                    type = "flex"
                                    justify = "space-between"
                                }
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

                                                headerRender.onChange?.invoke(now)
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

                                                headerRender.onChange?.invoke(newValue)
                                            }
                                        }
                                        childList.add(monthOptions.toTypedArray())
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
