package uikit.util

external interface OptionsUtil {
    fun mergeOptions(
        parent: dynamic = definedExternally,
        child: dynamic = definedExternally,
        vm: dynamic = definedExternally
    ): dynamic

    fun parseOptions(options: dynamic = definedExternally, args: Array<dynamic> = definedExternally): dynamic
}
