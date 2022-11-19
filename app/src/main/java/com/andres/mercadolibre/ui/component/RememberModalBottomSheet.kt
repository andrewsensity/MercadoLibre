package com.andres.mercadolibre.ui.component

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
@ExperimentalMaterialApi
fun rememberModalBottomSheet(
    initialValue: ModalBottomSheetValue = ModalBottomSheetValue.Hidden,
    animationSpec: AnimationSpec<Float> = TweenSpec(
        durationMillis = 0,
        delay = 0,
        easing = LinearOutSlowInEasing
    ),
    skipHalfExpanded: Boolean = true,
    confirmStateChange: (ModalBottomSheetValue) -> Boolean = { false }
): ModalBottomSheetState {
    return rememberSaveable(
        initialValue, animationSpec, skipHalfExpanded, confirmStateChange,
        saver = ModalBottomSheetState.Saver(
            animationSpec = animationSpec,
            skipHalfExpanded = skipHalfExpanded,
            confirmStateChange = confirmStateChange
        )
    ) {
        ModalBottomSheetState(
            initialValue = initialValue,
            animationSpec = animationSpec,
            isSkipHalfExpanded = skipHalfExpanded,
            confirmStateChange = confirmStateChange
        )
    }
}