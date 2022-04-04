package uikit.components

import uikit.Component

external interface LeaderComponent : Component

external interface LeaderOptions {
    var fill: String?
    var media: Any? /* Number | String */
}
