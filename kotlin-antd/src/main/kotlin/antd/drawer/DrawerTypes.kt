package antd.drawer

import org.w3c.dom.HTMLElement

typealias PlacementType = String /* "top" | "right" | "bottom" | "left" */

typealias EventType = Any /* MouseEvent<HTMLDivElement> | MouseEvent<HTMLButtonElement> */
typealias GetContainerFunc = () -> HTMLElement
