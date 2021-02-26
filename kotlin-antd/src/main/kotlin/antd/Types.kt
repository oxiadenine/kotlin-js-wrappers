package antd

typealias Key = Any /* String | Number */
typealias ReactText = Any /* String | Number */
typealias ReactChild = Any /* ReactElement | ReactText */
typealias ReactFragment = Any /* Object | ReactNodeArray */
typealias ReactNode = Any /* ReactChild | ReactFragment | ReactPortal | Boolean */
typealias RefCallback<T> = (instance: T?) -> Unit
typealias Ref<T> = Any /* RefCallback<T> | RefObject<T> */
typealias LegacyRef<T> = Any /* String | Ref<T> */
typealias ReactInstance = Any /* Component<RProps, RState> | Element */

external interface ReactNodeArray

external interface RefObject<T> {
    val current: T?
}
