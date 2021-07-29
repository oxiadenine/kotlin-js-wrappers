package antd.calendar

import antd.datepicker.RcPickerPanelBaseProps
import antd.datepicker.RcPickerPanelDateProps
import antd.datepicker.RcPickerPanelTimeProps
import antd.ReactNode

typealias PickerPanelBaseProps<DateType> = InjectDefaultProps<RcPickerPanelBaseProps<DateType>>
typealias PickerPanelDateProps<DateType> = InjectDefaultProps<RcPickerPanelDateProps<DateType>>
typealias PickerPanelTimeProps<DateType> = InjectDefaultProps<RcPickerPanelTimeProps<DateType>>
typealias PickerProps<DateType> = Any /* PickerPanelBaseProps<DateType> | PickerPanelDateProps<DateType> | PickerPanelTimeProps<DateType> */

typealias CalendarMode = String /* "year" | "month" */
typealias HeaderRender<DateType> = (config: HeaderRenderConfig<DateType>) -> ReactNode
