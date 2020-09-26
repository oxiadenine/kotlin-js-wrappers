package uikit.components

import uikit.*

external interface LeaderComponent : Component

external interface LeaderOptions {
    var fill: String?
    var media: Any? /* Int | String */
}
