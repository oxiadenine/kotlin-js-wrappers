package antd.statistic

typealias ValueType = Any /* Number | String */
typealias CountdownValueType = Any /* ValueType | String */
typealias Formatter = Any /* Boolean | String | "number" | "countdown" | (value: ValueType, config: FormatConfig?) -> Any /* String | ReactElement */ */
