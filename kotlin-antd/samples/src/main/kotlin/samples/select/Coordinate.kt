package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val provinceData = arrayOf("Zhejiang", "Jiangsu")
private val cityData = mapOf(
        Pair("Zhejiang", arrayOf("Hangzhou", "Ningbo", "Wenzhou")),
        Pair("Jiangsu", arrayOf("Nanjing", "Suzhou", "Zhenjiang"))
)

interface CoordinateAppState : RState {
    var cities: Array<String>
    var secondCity: String
}

class CoordinateApp : RComponent<RProps, CoordinateAppState>() {
    private val handleProvinceChange = fun (value: String, _: Any) {
        setState {
            cities = cityData[value] ?: error("")
            secondCity = (cityData[value] ?: error(""))[0]
        }
    }

    private val handleSecondCityChange = fun (value: String, _: Any) {
        setState {
            secondCity = value
        }
    }

    override fun CoordinateAppState.init() {
        cities = cityData[provinceData[0]] ?: error("")
        secondCity = (cityData[provinceData[0]] ?: error(""))[0]
    }

    override fun RBuilder.render() {
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = provinceData[0]
                    style = js { width = 90 }
                    onChange = handleProvinceChange
                }
                provinceData.map { province ->
                    option {
                        attrs.key = province
                        +province
                    }
                }
            }
            select<String, SelectComponent<String>> {
                attrs {
                    style = js { width = 90 }
                    value = state.secondCity
                    onChange = handleSecondCityChange
                }
                state.cities.map { city ->
                    option {
                        attrs.key = city
                        +city
                    }
                }
            }
        }
    }
}

fun RBuilder.coordinateApp() = child(CoordinateApp::class) {}

fun RBuilder.coordinate() {
    div("select-container") {
        attrs.id = "select-coordinate"
        coordinateApp()
    }
}
