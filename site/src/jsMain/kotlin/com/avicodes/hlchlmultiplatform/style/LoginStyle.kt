package com.avicodes.hlchlmultiplatform.style

import com.avicodes.hlchlmultiplatform.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.focus
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val LoginInputStyle by ComponentStyle {
    base {
        Modifier.border (
            width = 2.px,
            style = LineStyle.Solid,
            color = Color.transparent
        )
                //also use TransitionProperty.All instead of "border" to specify transition in all fields of upper modifier
            .transition(CSSTransition(property = "border", duration = 300.ms))
    }

    focus {
        Modifier.border (
            width = 2.px,
            style = LineStyle.Solid,
            color = Theme.Primary.rgb
        )
    }
}