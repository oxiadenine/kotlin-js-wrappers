package antd.drawer

import org.w3c.dom.*

typealias PlacementType = String /* "top" | "right" | "bottom" | "left" */

typealias EventType = Any /* KeyboardEvent<HTMLDivElement> | MouseEvent<HTMLDivElement> | MouseEvent<HTMLButtonElement> */
typealias GetContainerFunc = () -> HTMLElement
