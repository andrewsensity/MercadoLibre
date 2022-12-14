package com.andres.mercadolibre.domain.model.detail

data class DetailResponse(
    val accepts_mercadopago: Boolean = false,
    val attributes: List<Attribute> = emptyList(),
    val automatic_relist: Boolean = false,
    val available_quantity: Int = 0,
    val base_price: Int = 0,
    val buying_mode: String = "",
    val catalog_listing: Boolean = false,
    val catalog_product_id: Any = Any(),
    val category_id: String = "",
    val channels: List<String> = emptyList(),
    val condition: String = "",
    val coverage_areas: List<Any> = emptyList(),
    val currency_id: String = "",
    val date_created: String = "",
    val deal_ids: List<Any> = emptyList(),
    val descriptions: List<Any> = emptyList(),
    val differential_pricing: Any = Any(),
    val domain_id: String = "",
    val health: Double = 0.0,
    val id: String = "",
    val initial_quantity: Int = 0,
    val International_delivery_mode: String = "",
    val last_updated: String = "",
    val listing_source: String = "",
    val listing_type_id: String = "",
    val location: Location = Location(),
    val non_mercado_pago_payment_methods: List<Any> = emptyList(),
    val official_store_id: Any = Any(),
    val original_price: Any = Any(),
    val parent_item_id: Any = Any(),
    val permalink: String = "",
    val pictures: List<Picture> = emptyList(),
    val price: Int = 0,
    val sale_terms: List<SaleTerm> = emptyList(),
    val secure_thumbnail: String = "",
    val seller_address: SellerAddress = SellerAddress(),
    val seller_contact: Any = Any(),
    val seller_id: Int = 0,
    val shipping: Shipping = Shipping(),
    val site_id: String = "",
    val sold_quantity: Int = 0,
    val start_time: String = "",
    val status: String = "",
    val stop_time: String = "",
    val sub_status: List<Any> = emptyList(),
    val subtitle: Any = Any(),
    val tags: List<String> = emptyList(),
    val thumbnail: String = "",
    val thumbnail_id: String = "",
    val title: String = "",
    val variations: List<Variation> = emptyList(),
    val video_id: Any = Any(),
    val warnings: List<Any> = emptyList(),
    val warranty: String = ""
)