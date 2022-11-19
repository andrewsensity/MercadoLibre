package com.andres.mercadolibre.ui.views.detail

sealed class BottomSheetContent{
    object SelectQuantity: BottomSheetContent()
    object EnterQuantity: BottomSheetContent()
}
