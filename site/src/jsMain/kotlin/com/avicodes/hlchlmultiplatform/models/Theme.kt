package com.avicodes.hlchlmultiplatform.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(
    val hex: String ,
    val rgb: CSSColorValue
) {
    Primary(
        hex = "#9F0C0C",
        rgb = rgb(r = 159, 12, 12)
    ),
    LightGray(
        hex = "#FAFAFA",
        rgb = rgb(r = 250, 250, 250)
    )
}