package com.andres.mercadolibre.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

object Constants {

    // Base URL
    const val BASE_URL = "https://api.mercadolibre.com/"

    // EndPoints
    const val DETAILS_END_POINT = "items/{id}"
    const val DESCRIPTION_END_POINT = "items/{id}/description"
    const val SEARCH_END_POINT = "sites/MCO/search"
    const val CATEGORIES_END_POINT = "sites/MCO"

    // Keys
    const val KEY_ID = "id"
    const val PRODUCT = "q"
    const val LOGISTIC_TYPE = "cross_docking"
    const val ITEM_CONDITION = "ITEM_CONDITION"

    // Others
    const val EMPTY = ""

    // Parameters Nav Controller
    const val ID_PARAMETER = "id"
    const val RESULT = "result"

    // List
    val listCategories = listOf(
        Icons.Default.SettingsSuggest,
        Icons.Default.Grass,
        Icons.Default.LunchDining,
        Icons.Default.Pets,
        Icons.Default.CollectionsBookmark,
        Icons.Default.Palette,
        Icons.Default.Face6,
        Icons.Default.Brush,
        Icons.Default.LocalActivity,
        Icons.Default.CameraAlt,
        Icons.Default.TwoWheeler,
        Icons.Default.PhoneAndroid,
        Icons.Default.Computer,
        Icons.Default.VideogameAsset,
        Icons.Default.Engineering,
        Icons.Default.SportsSoccer,
        Icons.Default.Kitchen,
        Icons.Default.Cable,
        Icons.Default.Construction,
        Icons.Default.Bed,
        Icons.Default.Factory,
        Icons.Default.RealEstateAgent,
        Icons.Default.Radio,
        Icons.Default.SmartToy,
        Icons.Default.AutoStories,
        Icons.Default.MusicNote,
        Icons.Default.Celebration,
        Icons.Default.Watch,
        Icons.Default.Checkroom,
        Icons.Default.MonitorHeart,
        Icons.Default.DesignServices,
        Icons.Default.AltRoute
    )
}

/*
* val listCategories = listOf(
        Categories(Icons.Default.SettingsSuggest, title = "Accesorios vehiculos"),
        Categories(Icons.Default.Grass, title = "Agro"),
        Categories(Icons.Default.LunchDining, title = "Alimentos y bebidas"),
        Categories(Icons.Default.Pets, title = "Animales y mascotas"),
        Categories(Icons.Default.CollectionsBookmark, title = "Antiguedades y colecciones"),
        Categories(Icons.Default.Palette, title = "Arte papeleria y merceria"),
        Categories(Icons.Default.Face6, title = "Bebes"),
        Categories(Icons.Default.Brush, title = "Belleza y cuidado personal"),
        Categories(Icons.Default.LocalActivity, title = "Boletos para espectaculos"),
        Categories(Icons.Default.CameraAlt, title = ""),
        Categories(Icons.Default.TwoWheeler, title = ""),
        Categories(Icons.Default.PhoneAndroid, title = ""),
        Categories(Icons.Default.Computer, title = ""),
        Categories(Icons.Default.VideogameAsset, title = ""),
        Categories(Icons.Default.Engineering, title = ""),
        Categories(Icons.Default.SportsSoccer, title = ""),
        Categories(Icons.Default.Kitchen, title = ""),
        Categories(Icons.Default.Cable, title = ""),
        Categories(Icons.Default.Construction, title = ""),
        Categories(Icons.Default.Bed, title = ""),
        Categories(Icons.Default.Factory, title = ""),
        Categories(Icons.Default.RealEstateAgent, title = ""),
        Categories(Icons.Default.Radio, title = ""),
        Categories(Icons.Default.SmartToy, title = ""),
        Categories(Icons.Default.AutoStories, title = ""),
        Categories(Icons.Default.MusicNote, title = ""),
        Categories(Icons.Default.Celebration, title = ""),
        Categories(Icons.Default.Watch, title = ""),
        Categories(Icons.Default.Checkroom, title = ""),
        Categories(Icons.Default.MonitorHeart, title = ""),
        Categories(Icons.Default.DesignServices, title = ""),
        Categories(Icons.Default.AltRoute, title = "")
    )*/