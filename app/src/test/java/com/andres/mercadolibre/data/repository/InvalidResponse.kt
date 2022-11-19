package com.andres.mercadolibre.data.repository

val malformedGetBySearch = """
    {
      "site_id": "MCO",
      "country_default_time_zone": "GMT-05:00",
      "query": "carro",
      "paging": {
        "total": 39714,
        "primary_results": 1000,
        "offset": 0,
        "limit": 50
      },
      "results": [
        {
          "id": "MCO1077096367",
          "site_id": "MCO",
          "title": "Chevrolet Sail ",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 32300000,
          "prices": {
            "id": "MCO1077096367",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 32300000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T21:40:35Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1077096367-chevrolet-sail-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_806948-MCO52488475213_112022-I.jpg",
          "thumbnail_id": "806948-MCO52488475213_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Gonzalo Toro",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlNVQjQyOTEx",
              "name": "Suba Centro"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7442074,
            "longitude": -74.08336
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "attribute_group_id": "",
              "source": 1,
              "value_name": "Usado"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "name": "Aire acondicionado",
              "source": 1443,
              "value_type": "boolean"
            },
            {
              "name": "Marca",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "values": [
                {
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1443,
                  "id": "58955"
                }
              ],
              "attribute_group_id": "FIND",
              "id": "BRAND",
              "value_id": "58955",
              "value_name": "Chevrolet",
              "value_struct": null
            },
            {
              "value_id": null,
              "value_name": "5",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "values": [
                {
                  "id": "423552",
                  "name": "1.4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_struct": null,
              "source": 1443,
              "value_id": "423552",
              "value_name": "1.4",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina"
                }
              ],
              "value_id": "64364",
              "value_name": "Gasolina",
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible"
            },
            {
              "value_name": "63400 km",
              "value_struct": {
                "number": 63400,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "63400 km",
                  "struct": {
                    "number": 63400,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ]
            },
            {
              "value_id": "2109385",
              "values": [
                {
                  "id": "2109385",
                  "name": "Sail",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_name": "Sail",
              "value_struct": null
            },
            {
              "id": "TRANSMISSION",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "list"
            },
            {
              "value_type": "string",
              "id": "TRIM",
              "value_id": "9734919",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "VersiÃ³n",
              "value_name": "1.4 Ltz Sport",
              "values": [
                {
                  "id": "9734919",
                  "name": "1.4 Ltz Sport",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "name": "AÃ±o",
              "value_id": null,
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "values": [
                {
                  "id": null,
                  "name": "2015",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_name": "2015"
            },
            {
              "value_name": "1.4 L",
              "value_type": "number_unit",
              "value_id": "2326614",
              "name": "Cilindrada",
              "value_struct": {
                "number": 1.4,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326614",
                  "name": "1.4 L",
                  "struct": {
                    "number": 1.4,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "id": "ENGINE_DISPLACEMENT"
            },
            {
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "value_id": null,
              "value_name": "5",
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "name": "Capacidad de personas"
            },
            {
              "value_struct": {
                "number": 102,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "459129",
                  "name": "102 hp",
                  "struct": {
                    "number": 102,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "459129",
              "value_name": "102 hp",
              "attribute_group_id": "OTHERS",
              "source": 1443
            },
            {
              "id": "TRACTION_CONTROL",
              "value_id": "493979",
              "value_name": "Delantera",
              "attribute_group_name": "Seguridad",
              "name": "Control de tracciÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 1,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1077095018",
          "site_id": "MCO",
          "title": "Renault Logan",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 23500000,
          "prices": {
            "id": "MCO1077095018",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 23500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T20:29:05Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1077095018-renault-logan-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_814951-MCO52487840047_112022-I.jpg",
          "thumbnail_id": "814951-MCO52487840047_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Nidia",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlJJTjU5MTU3",
              "name": "RincÃ³n de Suba"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7249827,
            "longitude": -74.09025
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_struct": null,
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": ""
            },
            {
              "value_id": "242084",
              "value_name": "No",
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "242084",
                  "name": "No"
                }
              ],
              "value_type": "boolean"
            },
            {
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_struct": null,
              "source": 1443
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Renault",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "value_id": "9909",
              "value_struct": null,
              "values": [
                {
                  "name": "Renault",
                  "struct": null,
                  "source": 1443,
                  "id": "9909"
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "id": "DOORS",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "number",
              "name": "Puertas",
              "value_id": null,
              "value_name": "4",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_name": "1.4",
              "value_struct": null,
              "value_id": "423552",
              "values": [
                {
                  "id": "423552",
                  "name": "1.4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "id": "ENGINE",
              "name": "Motor"
            },
            {
              "name": "Tipo de combustible",
              "value_id": "64364",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "value_struct": null,
              "source": 1443,
              "value_type": "list",
              "value_name": "Gasolina"
            },
            {
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "values": [
                {
                  "name": "132000 km",
                  "struct": {
                    "unit": "km",
                    "number": 132000
                  },
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": null,
              "value_name": "132000 km",
              "value_struct": {
                "number": 132000,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "value_type": "number_unit"
            },
            {
              "value_id": "62198",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "MODEL",
              "name": "Modelo",
              "value_name": "Logan",
              "values": [
                {
                  "name": "Logan",
                  "struct": null,
                  "source": 1443,
                  "id": "62198"
                }
              ],
              "value_type": "string"
            },
            {
              "name": "TransmisiÃ³n",
              "attribute_group_id": "FIND",
              "value_type": "list",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRANSMISSION",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null
            },
            {
              "name": "VersiÃ³n",
              "value_name": "1.4 Entry Familier",
              "value_struct": null,
              "values": [
                {
                  "id": "9734077",
                  "name": "1.4 Entry Familier",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "value_id": "9734077",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string"
            },
            {
              "value_type": "number",
              "value_id": null,
              "value_name": "2010",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "values": [
                {
                  "id": null,
                  "name": "2010",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "Cilindrada",
              "value_id": "969598",
              "value_name": "1390 cc",
              "source": 1443,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "values": [
                {
                  "struct": {
                    "unit": "cc",
                    "number": 1390
                  },
                  "source": 1443,
                  "id": "969598",
                  "name": "1390 cc"
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_struct": {
                "number": 1390,
                "unit": "cc"
              }
            },
            {
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443
            },
            {
              "value_name": "75 hp",
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "458723",
              "value_struct": {
                "number": 75,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458723",
                  "name": "75 hp",
                  "struct": {
                    "number": 75,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443
            },
            {
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "493979",
                  "name": "Delantera"
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "id": "TRACTION_CONTROL",
              "value_id": "493979",
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [],
          "order_backend": 2,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1077093787",
          "site_id": "MCO",
          "title": "Renault Sandero",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 45000000,
          "prices": {
            "id": "MCO1077093787",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 45000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T19:13:25Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1077093787-renault-sandero-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_675092-MCO52486988251_112022-I.jpg",
          "thumbnail_id": "675092-MCO52486988251_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Renault Sandero",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkJFUjk5NTc1",
              "name": "BerlÃ­n"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.742894,
            "longitude": -74.11776
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "name": "CondiciÃ³n del Ã­tem"
            },
            {
              "source": 1443,
              "name": "Ãšnico dueÃ±o",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "242085",
                  "name": "SÃ­"
                }
              ],
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "value_id": "242085"
            },
            {
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "attribute_group_id": "CONFORT",
              "value_id": "242085",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null
                }
              ],
              "source": 1443
            },
            {
              "name": "Marca",
              "value_name": "Renault",
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "BRAND",
              "value_id": "9909",
              "value_struct": null,
              "values": [
                {
                  "id": "9909",
                  "name": "Renault",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "name": "Puertas",
              "value_name": "5",
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "DOORS",
              "value_id": null,
              "value_struct": null,
              "source": 1443
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "1600",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_name": "1600",
              "source": 1443
            },
            {
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_name": "Gasolina",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Tipo de combustible",
              "value_struct": null,
              "source": 1443
            },
            {
              "values": [
                {
                  "struct": {
                    "unit": "km",
                    "number": 40000
                  },
                  "source": 1443,
                  "id": null,
                  "name": "40000 km"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "value_struct": {
                "number": 40000,
                "unit": "km"
              },
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "40000 km",
              "attribute_group_id": "FIND",
              "id": "KILOMETERS"
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "60694",
              "value_name": "Sandero",
              "value_struct": null,
              "values": [
                {
                  "id": "60694",
                  "name": "Sandero",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_id": "370877"
            },
            {
              "attribute_group_id": "FIND",
              "source": 1443,
              "name": "VersiÃ³n",
              "value_id": null,
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "value_name": "1.6 MecÃ¡nico",
              "values": [
                {
                  "id": null,
                  "name": "1.6 MecÃ¡nico",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_id": null,
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2018",
              "values": [
                {
                  "id": null,
                  "name": "2018",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 3,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1076790343",
          "site_id": "MCO",
          "title": "Chevrolet Grand Vitara",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 33900000,
          "prices": {
            "id": "MCO1076790343",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 33900000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T16:53:14Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1076790343-chevrolet-grand-vitara-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_994294-MCO52484791360_112022-I.jpg",
          "thumbnail_id": "994294-MCO52484791360_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0JPUzQwMzcw",
            "city_name": "Bosa",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Silvestre M.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkJPUzQ4MDk3",
              "name": "Bosa"
            },
            "city": {
              "id": "TUNPQ0JPUzQwMzcw",
              "name": "Bosa"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6086645,
            "longitude": -74.181335
          },
          "attributes": [
            {
              "value_id": "2230581",
              "attribute_group_id": "",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null
                }
              ],
              "source": 1,
              "value_type": "list"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1443
            },
            {
              "value_name": "Chevrolet",
              "values": [
                {
                  "id": "58955",
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "58955",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "source": 1443,
              "value_id": null,
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "DOORS",
              "name": "Puertas",
              "value_type": "number"
            },
            {
              "source": 1443,
              "value_type": "string",
              "id": "ENGINE",
              "value_name": "2.0",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "423563",
                  "name": "2.0"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Motor",
              "value_id": "423563"
            },
            {
              "value_name": "Gasolina",
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "value_id": "64364",
              "name": "Tipo de combustible",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "FUEL_TYPE"
            },
            {
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "189350 km",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_struct": {
                "unit": "km",
                "number": 189350
              },
              "values": [
                {
                  "id": null,
                  "name": "189350 km",
                  "struct": {
                    "number": 189350,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_type": "string",
              "value_name": "Grand Vitara",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "attribute_group_id": "FIND",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "62828",
              "values": [
                {
                  "id": "62828",
                  "name": "Grand Vitara",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443,
                  "id": "370877"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "attribute_group_id": "FIND"
            },
            {
              "id": "TRIM",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "VersiÃ³n",
              "value_id": "2157744",
              "value_name": "2.0 L",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "2157744",
                  "name": "2.0 L",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "id": "VEHICLE_YEAR",
              "values": [
                {
                  "id": null,
                  "name": "2002",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "number",
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2002",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "name": "Cilindrada",
              "values": [
                {
                  "name": "1995 cc",
                  "struct": {
                    "number": 1995,
                    "unit": "cc"
                  },
                  "source": 1443,
                  "id": "969843"
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "969843",
              "value_name": "1995 cc",
              "value_struct": {
                "unit": "cc",
                "number": 1995
              },
              "attribute_group_name": "Otros"
            },
            {
              "value_id": null,
              "value_name": "5",
              "attribute_group_name": "Otros",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "5"
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_struct": null
            },
            {
              "id": "POWER",
              "value_id": "458640",
              "value_name": "128 hp",
              "value_struct": {
                "number": 128,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458640",
                  "name": "128 hp",
                  "struct": {
                    "number": 128,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "name": "Potencia",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "370880",
                  "name": "4x4",
                  "struct": null
                }
              ],
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1443,
              "value_id": "370880",
              "value_name": "4x4"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 4,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1077007491",
          "site_id": "MCO",
          "title": "Chevrolet Captiva Sport",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 40000000,
          "prices": {
            "id": "MCO1077007491",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 40000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T13:44:53Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1077007491-chevrolet-captiva-sport-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_775698-MCO52482089180_112022-I.jpg",
          "thumbnail_id": "775698-MCO52482089180_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0NJVTQ0NjQx",
            "city_name": "Ciudad BolÃ­var",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Gladys G.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkFDQTQzMTI1Nw",
              "name": "Acacias"
            },
            "city": {
              "id": "TUNPQ0NJVTQ0NjQx",
              "name": "Ciudad BolÃ­var"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5604615,
            "longitude": -74.143814
          },
          "attributes": [
            {
              "value_id": "2230581",
              "attribute_group_id": "",
              "value_type": "list",
              "values": [
                {
                  "name": "Usado",
                  "struct": null,
                  "source": 1,
                  "id": "2230581"
                }
              ],
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "value_struct": null
            },
            {
              "value_id": "242085",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "value_type": "boolean",
              "name": "Aire acondicionado"
            },
            {
              "attribute_group_id": "FIND",
              "value_type": "string",
              "value_id": "58955",
              "value_struct": null,
              "value_name": "Chevrolet",
              "values": [
                {
                  "id": "58955",
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "BRAND",
              "name": "Marca"
            },
            {
              "source": 1443,
              "value_type": "number",
              "name": "Puertas",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_id": "FIND",
              "id": "DOORS",
              "value_name": "5",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "ENGINE",
              "name": "Motor",
              "value_id": null,
              "value_name": "2384",
              "source": 1443,
              "value_type": "string",
              "value_struct": null,
              "values": [
                {
                  "name": "2384",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_type": "list",
              "value_id": "64364",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "value_struct": null
            },
            {
              "value_struct": {
                "number": 69401,
                "unit": "km"
              },
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "69401 km",
              "values": [
                {
                  "id": null,
                  "name": "69401 km",
                  "struct": {
                    "number": 69401,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "name": "Modelo",
              "value_id": "68141",
              "value_name": "Captiva",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "68141",
                  "name": "Captiva"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "MODEL",
              "source": 1443
            },
            {
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_name": "Sport",
              "source": 1443,
              "value_struct": null,
              "values": [
                {
                  "id": "12309658",
                  "name": "Sport",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_id": "12309658"
            },
            {
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_name": "2012",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "AÃ±o",
              "values": [
                {
                  "id": null,
                  "name": "2012",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number"
            },
            {
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_struct": {
                "number": 2384,
                "unit": "cc"
              },
              "attribute_group_id": "OTHERS",
              "values": [
                {
                  "id": null,
                  "name": "2384 cc",
                  "struct": {
                    "number": 2384,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443,
              "id": "ENGINE_DISPLACEMENT",
              "value_id": null,
              "value_name": "2384 cc"
            },
            {
              "source": 1443,
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "value_name": "4x2",
              "value_struct": null,
              "values": [
                {
                  "name": "4x2",
                  "struct": null,
                  "source": 1443,
                  "id": "370879"
                }
              ],
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "id": "TRACTION_CONTROL",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 5,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1076793730",
          "site_id": "MCO",
          "title": "Renault Duster Dynamique",
          "seller": {
            "id": 570211167,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_CALLE134",
            "registration_date": "2020-05-18T16:38:57.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 55000000,
          "prices": {
            "id": "MCO1076793730",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 55000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T13:37:41Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1076793730-renault-duster-dynamique-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_864310-MCO52481834961_112022-I.jpg",
          "thumbnail_id": "864310-MCO52481834961_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Alfonso R.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkdSQTkwNDYx",
              "name": "Gratamira"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.72751,
            "longitude": -74.07472
          },
          "attributes": [
            {
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443,
                  "id": "242085"
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_id": "242085"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Renault",
              "source": 1443,
              "value_type": "string",
              "value_id": "9909",
              "values": [
                {
                  "id": "9909",
                  "name": "Renault",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "name": "Puertas",
              "value_id": null,
              "value_name": "5"
            },
            {
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": "423563",
              "value_name": "2.0",
              "value_struct": null,
              "values": [
                {
                  "id": "423563",
                  "name": "2.0",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_type": "list",
              "name": "Tipo de combustible",
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_name": "Gasolina"
            },
            {
              "name": "KilÃ³metros",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "145500 km",
                  "struct": {
                    "unit": "km",
                    "number": 145500
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_struct": {
                "number": 145500,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "value_name": "145500 km"
            },
            {
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "64855",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_name": "Duster",
              "value_struct": null,
              "values": [
                {
                  "id": "64855",
                  "name": "Duster",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRANSMISSION",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370877",
                  "name": "MecÃ¡nica"
                }
              ],
              "source": 1443,
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica"
            },
            {
              "source": 1443,
              "value_type": "string",
              "name": "VersiÃ³n",
              "value_id": "9741056",
              "value_name": "2.0 Dynamique 4x4",
              "attribute_group_id": "FIND",
              "id": "TRIM",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "9741056",
                  "name": "2.0 Dynamique 4x4",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2016",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2016",
                  "struct": null
                }
              ],
              "source": 1443,
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "attribute_group_name": "Ficha tÃ©cnica",
              "attribute_group_id": "FIND"
            },
            {
              "attribute_group_id": "OTHERS",
              "name": "Cilindrada",
              "values": [
                {
                  "source": 1443,
                  "id": "2326622",
                  "name": "2 L",
                  "struct": {
                    "number": 2,
                    "unit": "L"
                  }
                }
              ],
              "value_name": "2 L",
              "value_struct": {
                "number": 2,
                "unit": "L"
              },
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "2326622"
            },
            {
              "name": "Capacidad de personas",
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_id": null
            },
            {
              "id": "POWER",
              "name": "Potencia",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_id": "459187",
              "value_name": "138 hp",
              "value_struct": {
                "number": 138,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "459187",
                  "name": "138 hp",
                  "struct": {
                    "number": 138,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit"
            },
            {
              "value_id": "370880",
              "value_name": "4x4",
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_struct": null,
              "values": [
                {
                  "name": "4x4",
                  "struct": null,
                  "source": 1443,
                  "id": "370880"
                }
              ],
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 6,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1076596058",
          "site_id": "MCO",
          "title": "Kia Cerato Forte  Sx",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 38500000,
          "prices": {
            "id": "MCO1076596058",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 38500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T13:30:03Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1076596058-kia-cerato-forte-sx-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_935045-MCO52481783341_112022-I.jpg",
          "thumbnail_id": "935045-MCO52481783341_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0JPUzQwMzcw",
            "city_name": "Bosa",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "JOHANA  H.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkJPUzQ4MDk3",
              "name": "Bosa"
            },
            "city": {
              "id": "TUNPQ0JPUzQwMzcw",
              "name": "Bosa"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6086645,
            "longitude": -74.181335
          },
          "attributes": [
            {
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "value_id": "2230581",
              "value_name": "Usado"
            },
            {
              "name": "Aire acondicionado",
              "value_id": "242085",
              "attribute_group_id": "CONFORT",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "value_struct": null
            },
            {
              "name": "Marca",
              "value_name": "Kia",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "BRAND",
              "value_id": "374002",
              "values": [
                {
                  "id": "374002",
                  "name": "Kia",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "name": "Puertas",
              "value_id": null,
              "value_name": "4",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "DOORS",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "1600",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": null,
              "value_name": "1600"
            },
            {
              "value_id": "64364",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina"
                }
              ],
              "attribute_group_id": "FIND",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "source": 1443,
              "value_type": "list",
              "value_name": "Gasolina",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "108400 km",
              "values": [
                {
                  "id": null,
                  "name": "108400 km",
                  "struct": {
                    "number": 108400,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "KILOMETERS",
              "value_struct": {
                "number": 108400,
                "unit": "km"
              }
            },
            {
              "name": "Modelo",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "MODEL",
              "value_name": "CERATO FORTE",
              "values": [
                {
                  "name": "CERATO FORTE",
                  "struct": null,
                  "source": 1443,
                  "id": "5958936"
                }
              ],
              "source": 1443,
              "value_type": "string",
              "value_id": "5958936"
            },
            {
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_struct": null,
              "values": [
                {
                  "name": "SX",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_id": null,
              "value_name": "SX"
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2012",
              "value_struct": null,
              "value_type": "number",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "2012",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_name": "1600 cc",
              "value_struct": {
                "number": 1600,
                "unit": "cc"
              },
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "value_id": null,
              "name": "Cilindrada",
              "values": [
                {
                  "id": null,
                  "name": "1600 cc",
                  "struct": {
                    "number": 1600,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "id": "ENGINE_DISPLACEMENT"
            },
            {
              "id": "TRACTION_CONTROL",
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "source": 1443,
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "value_name": "4x2",
              "value_struct": null,
              "values": [
                {
                  "name": "4x2",
                  "struct": null,
                  "source": 1443,
                  "id": "370879"
                }
              ],
              "attribute_group_id": "SECURITY"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 7,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1076793321",
          "site_id": "MCO",
          "title": "Audi A6 Tsfi Multitronic",
          "seller": {
            "id": 570211167,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_CALLE134",
            "registration_date": "2020-05-18T16:38:57.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 55000000,
          "prices": {
            "id": "MCO1076793321",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 55000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-18T12:59:36Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-17T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1076793321-audi-a6-tsfi-multitronic-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_910699-MCO52481373712_112022-I.jpg",
          "thumbnail_id": "910699-MCO52481373712_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Jackeline U.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQk1BWjkxMDI2",
              "name": "MazurÃ©n"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.736685,
            "longitude": -74.05278
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "value_struct": null,
              "source": 1,
              "value_type": "list"
            },
            {
              "id": "SINGLE_OWNER",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "boolean",
              "name": "Ãšnico dueÃ±o",
              "value_id": "242085",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean",
              "attribute_group_id": "CONFORT"
            },
            {
              "value_id": "40661",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "value_name": "Audi",
              "value_struct": null,
              "values": [
                {
                  "name": "Audi",
                  "struct": null,
                  "source": 1443,
                  "id": "40661"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Marca"
            },
            {
              "id": "DOORS",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "4"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "name": "Puertas",
              "value_id": null,
              "value_name": "4",
              "attribute_group_id": "FIND"
            },
            {
              "name": "Motor",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "423563",
                  "name": "2.0"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "ENGINE",
              "value_id": "423563",
              "value_name": "2.0",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "Tipo de combustible",
              "attribute_group_name": "Ficha tÃ©cnica",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina"
                }
              ]
            },
            {
              "name": "KilÃ³metros",
              "value_name": "64500 km",
              "values": [
                {
                  "id": null,
                  "name": "64500 km",
                  "struct": {
                    "number": 64500,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "KILOMETERS",
              "value_id": null,
              "value_struct": {
                "unit": "km",
                "number": 64500
              },
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "name": "Modelo",
              "source": 1443,
              "value_type": "string",
              "values": [
                {
                  "source": 1443,
                  "id": "37931",
                  "name": "A6",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "MODEL",
              "value_id": "37931",
              "value_name": "A6",
              "value_struct": null
            },
            {
              "id": "TRANSMISSION",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_id": "9735242",
              "value_name": "2.0 Tfsi Multitronic",
              "value_struct": null,
              "values": [
                {
                  "id": "9735242",
                  "name": "2.0 Tfsi Multitronic",
                  "struct": null,
                  "source": 1443
                }
              ],
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2011",
              "value_struct": null,
              "values": [
                {
                  "name": "2011",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_struct": {
                "unit": "cc",
                "number": 1984
              },
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "969690",
              "value_name": "1984 cc",
              "values": [
                {
                  "struct": {
                    "number": 1984,
                    "unit": "cc"
                  },
                  "source": 1443,
                  "id": "969690",
                  "name": "1984 cc"
                }
              ],
              "source": 1443
            },
            {
              "id": "PASSENGER_CAPACITY",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "5"
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "number",
              "name": "Capacidad de personas",
              "value_name": "5",
              "attribute_group_name": "Otros"
            },
            {
              "source": 1443,
              "value_type": "number_unit",
              "name": "Potencia",
              "value_id": "458572",
              "value_name": "170 hp",
              "value_struct": {
                "number": 170,
                "unit": "hp"
              },
              "values": [
                {
                  "source": 1443,
                  "id": "458572",
                  "name": "170 hp",
                  "struct": {
                    "number": 170,
                    "unit": "hp"
                  }
                }
              ],
              "attribute_group_id": "OTHERS",
              "id": "POWER",
              "attribute_group_name": "Otros"
            },
            {
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "id": "TRACTION_CONTROL",
              "value_id": "493979",
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 8,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075750274",
          "site_id": "MCO",
          "title": "Ford Escape 2.0 Se",
          "seller": {
            "id": 464173900,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_LAPALMERACHIA",
            "registration_date": "2019-08-23T15:07:59.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 75000000,
          "prices": {
            "id": "MCO1075750274",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 75000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T21:43:07Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075750274-ford-escape-20-se-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_823118-MCO52472070922_112022-I.jpg",
          "thumbnail_id": "823118-MCO52472070922_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Diego Leon",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkFMQzgwMzE5",
              "name": "AlcalÃ¡"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.721128,
            "longitude": -74.05151
          },
          "attributes": [
            {
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "value_name": "Usado"
            },
            {
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "value_struct": null,
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "name": "Ãšnico dueÃ±o"
            },
            {
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING",
              "attribute_group_id": "CONFORT",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_id": "242085"
            },
            {
              "name": "Marca",
              "values": [
                {
                  "id": "66432",
                  "name": "Ford",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "BRAND",
              "value_name": "Ford",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_id": "66432"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_name": "5",
              "value_struct": null,
              "source": 1443
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "ENGINE",
              "value_name": "2.0",
              "values": [
                {
                  "id": "423563",
                  "name": "2.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "name": "Motor",
              "value_id": "423563",
              "value_struct": null,
              "source": 1443
            },
            {
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "value_id": "64364",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_name": "Gasolina"
            },
            {
              "value_id": null,
              "value_name": "71077 km",
              "value_struct": {
                "number": 71077,
                "unit": "km"
              },
              "values": [
                {
                  "struct": {
                    "number": 71077,
                    "unit": "km"
                  },
                  "source": 1443,
                  "id": null,
                  "name": "71077 km"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Modelo",
              "value_id": "68586",
              "value_name": "Escape",
              "value_struct": null,
              "values": [
                {
                  "id": "68586",
                  "name": "Escape",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "MODEL"
            },
            {
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_id": "370876",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRANSMISSION",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_name": "2.0 Se 4x4",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_id": "9740538",
              "value_struct": null,
              "values": [
                {
                  "id": "9740538",
                  "name": "2.0 Se 4x4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "value_struct": null,
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_name": "2016",
              "values": [
                {
                  "id": null,
                  "name": "2016",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "name": "AÃ±o"
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_struct": {
                "number": 2,
                "unit": "L"
              },
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit",
              "value_id": "2326622",
              "value_name": "2 L",
              "values": [
                {
                  "struct": {
                    "number": 2,
                    "unit": "L"
                  },
                  "source": 1443,
                  "id": "2326622",
                  "name": "2 L"
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443
            },
            {
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "name": "Capacidad de personas",
              "value_name": "5",
              "value_struct": null
            },
            {
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit",
              "value_id": "458665",
              "value_name": "240 hp",
              "value_struct": {
                "number": 240,
                "unit": "hp"
              },
              "attribute_group_name": "Otros",
              "source": 1443,
              "id": "POWER",
              "name": "Potencia",
              "values": [
                {
                  "id": "458665",
                  "name": "240 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 240
                  },
                  "source": 1443
                }
              ]
            },
            {
              "id": "TRACTION_CONTROL",
              "value_id": "370880",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370880",
                  "name": "4x4"
                }
              ],
              "value_type": "list",
              "name": "Control de tracciÃ³n",
              "value_name": "4x4",
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 9,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075706325",
          "site_id": "MCO",
          "title": "Honda Odyssey 3.5 Exl",
          "seller": {
            "id": 464173900,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_LAPALMERACHIA",
            "registration_date": "2019-08-23T15:07:59.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 120000000,
          "prices": {
            "id": "MCO1075706325",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 120000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T20:55:45Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075706325-honda-odyssey-35-exl-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_878916-MCO52471121557_112022-I.jpg",
          "thumbnail_id": "878916-MCO52471121557_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUENVTmE3NmQ4",
            "state_name": "Cundinamarca",
            "city_id": "TUNPQ0NPVGFiYzZm",
            "city_name": "Cota",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "John Jairo Ocampo",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "",
              "name": ""
            },
            "city": {
              "id": "TUNPQ0NPVGFiYzZm",
              "name": "Cota"
            },
            "state": {
              "id": "TUNPUENVTmE3NmQ4",
              "name": "Cundinamarca"
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.80985,
            "longitude": -74.10184
          },
          "attributes": [
            {
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1
            },
            {
              "name": "Ãšnico dueÃ±o",
              "value_id": "242085",
              "attribute_group_id": "ADICIONALES",
              "source": 1443,
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "242085",
                  "name": "SÃ­"
                }
              ],
              "attribute_group_name": "CaracterÃ­sticas generales"
            },
            {
              "value_id": "242085",
              "value_name": "SÃ­",
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "name": "Aire acondicionado"
            },
            {
              "value_id": "60559",
              "value_name": "Honda",
              "value_struct": null,
              "values": [
                {
                  "id": "60559",
                  "name": "Honda",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "BRAND",
              "name": "Marca",
              "value_type": "string",
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_struct": null,
              "name": "Puertas",
              "value_id": null,
              "value_name": "5",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "DOORS"
            },
            {
              "name": "Motor",
              "value_id": "436701",
              "value_struct": null,
              "values": [
                {
                  "id": "436701",
                  "name": "3.5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "ENGINE",
              "value_name": "3.5",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "attribute_group_id": "FIND"
            },
            {
              "name": "KilÃ³metros",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "138340 km",
                  "struct": {
                    "unit": "km",
                    "number": 138340
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "KILOMETERS",
              "value_name": "138340 km",
              "value_struct": {
                "number": 138340,
                "unit": "km"
              },
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "60574",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_name": "Odyssey",
              "values": [
                {
                  "id": "60574",
                  "name": "Odyssey",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "TransmisiÃ³n",
              "value_name": "AutomÃ¡tica",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRANSMISSION",
              "value_id": "370876",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "list"
            },
            {
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_id": "9740349",
              "value_struct": null,
              "source": 1443,
              "value_name": "3.5 Exl",
              "values": [
                {
                  "id": "9740349",
                  "name": "3.5 Exl",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2015",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2015",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "number"
            },
            {
              "value_type": "number_unit",
              "name": "Cilindrada",
              "values": [
                {
                  "id": "2326666",
                  "name": "3.5 L",
                  "struct": {
                    "number": 3.5,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "2326666",
              "value_name": "3.5 L",
              "value_struct": {
                "unit": "L",
                "number": 3.5
              }
            },
            {
              "name": "Capacidad de personas",
              "value_struct": null,
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "value_name": "5",
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "5",
                  "struct": null
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_id": null
            },
            {
              "value_id": "461211",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "id": "POWER",
              "name": "Potencia",
              "value_name": "248 hp",
              "value_struct": {
                "number": 248,
                "unit": "hp"
              },
              "values": [
                {
                  "struct": {
                    "number": 248,
                    "unit": "hp"
                  },
                  "source": 1443,
                  "id": "461211",
                  "name": "248 hp"
                }
              ]
            },
            {
              "value_type": "list",
              "value_id": "370879",
              "values": [
                {
                  "source": 1443,
                  "id": "370879",
                  "name": "4x2",
                  "struct": null
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "attribute_group_name": "Seguridad",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_name": "4x2",
              "value_struct": null
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 10,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075760098",
          "site_id": "MCO",
          "title": "Dfm Eq1020 Tf Estacas",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 29500000,
          "prices": {
            "id": "MCO1075760098",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 29500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T20:33:43Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075760098-dfm-eq1020-tf-estacas-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_852881-MCO52471090716_112022-I.jpg",
          "thumbnail_id": "852881-MCO52471090716_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0tFTjQyODYy",
            "city_name": "Kennedy",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Rodrigo L.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlBBVDE3NjIy",
              "name": "Patio Bonito I"
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.638154,
            "longitude": -74.162895
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_type": "list",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1
            },
            {
              "name": "Marca",
              "value_name": "DFM/DFSK",
              "value_struct": null,
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "value_id": "5826391",
              "values": [
                {
                  "id": "5826391",
                  "name": "DFM/DFSK",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_id": null,
              "value_name": "2",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas"
            },
            {
              "id": "ENGINE",
              "name": "Motor",
              "values": [
                {
                  "name": "1310",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "value_id": null,
              "value_name": "1310",
              "value_struct": null,
              "attribute_group_id": "FIND"
            },
            {
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "source": 1443,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "value_id": "64364",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "130000 km",
                  "struct": {
                    "unit": "km",
                    "number": 130000
                  },
                  "source": 1443
                }
              ],
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 130000,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "value_id": null,
              "value_name": "130000 km"
            },
            {
              "value_id": "8782436",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "MODEL",
              "value_name": "Eq1020Tf T03",
              "values": [
                {
                  "id": "8782436",
                  "name": "Eq1020Tf T03",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "Modelo"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_id": null,
              "value_name": "Estacas",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "Estacas",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "name": "AÃ±o",
              "value_name": "2011",
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2011",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "value_type": "number_unit",
              "attribute_group_name": "Otros",
              "source": 1443,
              "name": "Cilindrada",
              "value_id": null,
              "value_name": "1310 cc",
              "value_struct": {
                "number": 1310,
                "unit": "cc"
              },
              "values": [
                {
                  "id": null,
                  "name": "1310 cc",
                  "struct": {
                    "number": 1310,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS"
            },
            {
              "value_id": "370879",
              "value_name": "4x2",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "attribute_group_name": "Seguridad",
              "value_struct": null,
              "attribute_group_id": "SECURITY"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 11,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075705217",
          "site_id": "MCO",
          "title": "Renault Logan Expression + Life",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 46500000,
          "prices": {
            "id": "MCO1075705217",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 46500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T20:10:37Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075705217-renault-logan-expression-life-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_882019-MCO52471025099_112022-I.jpg",
          "thumbnail_id": "882019-MCO52471025099_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0tFTjQyODYy",
            "city_name": "Kennedy",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Ruperto H.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNJVTUxOTM1",
              "name": "Ciudad Kennedy"
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.63048,
            "longitude": -74.1553
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "value_id": "2230581",
              "value_name": "Usado",
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list"
            },
            {
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "id": "SINGLE_OWNER",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443,
                  "id": "242085"
                }
              ],
              "name": "Ãšnico dueÃ±o",
              "attribute_group_id": "ADICIONALES",
              "value_type": "boolean"
            },
            {
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "value_type": "boolean",
              "value_id": "242085",
              "value_struct": null,
              "value_name": "SÃ­",
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado"
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "value_id": "9909",
              "value_name": "Renault",
              "value_struct": null,
              "values": [
                {
                  "id": "9909",
                  "name": "Renault",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_name": "4",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "name": "Puertas",
              "value_id": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "4",
                  "struct": null
                }
              ],
              "source": 1443,
              "id": "DOORS"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "2164443",
              "value_struct": null,
              "value_name": "1.6",
              "values": [
                {
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443
            },
            {
              "value_id": "64364",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "FUEL_TYPE",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "name": "Tipo de combustible"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "32000 km",
              "value_struct": {
                "number": 32000,
                "unit": "km"
              },
              "values": [
                {
                  "struct": {
                    "number": 32000,
                    "unit": "km"
                  },
                  "source": 1443,
                  "id": null,
                  "name": "32000 km"
                }
              ],
              "attribute_group_id": "FIND",
              "name": "KilÃ³metros",
              "value_type": "number_unit"
            },
            {
              "name": "Modelo",
              "value_id": "62198",
              "value_name": "Logan",
              "value_struct": null,
              "values": [
                {
                  "name": "Logan",
                  "struct": null,
                  "source": 1443,
                  "id": "62198"
                }
              ],
              "id": "MODEL",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "values": [
                {
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443,
                  "id": "370877"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "attribute_group_id": "FIND",
              "value_type": "list"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "9733913",
                  "name": "1.6 Expression / Life +",
                  "struct": null,
                  "source": 1443
                }
              ],
              "name": "VersiÃ³n",
              "value_name": "1.6 Expression / Life +",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "TRIM",
              "value_id": "9733913"
            },
            {
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "AÃ±o",
              "value_name": "2020",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2020",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number"
            },
            {
              "values": [
                {
                  "id": "2326646",
                  "name": "1.6 L",
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "2326646",
              "value_name": "1.6 L",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_struct": {
                "number": 1.6,
                "unit": "L"
              },
              "attribute_group_id": "OTHERS"
            },
            {
              "name": "Capacidad de personas",
              "value_name": "5",
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "id": "PASSENGER_CAPACITY",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number"
            },
            {
              "source": 1443,
              "value_type": "number_unit",
              "value_struct": {
                "number": 85,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458565",
                  "name": "85 hp",
                  "struct": {
                    "number": 85,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "458565",
              "value_name": "85 hp"
            },
            {
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "value_struct": null,
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "value_id": "493979",
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 12,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075699258",
          "site_id": "MCO",
          "title": "Mitsubishi Nativa 3.0 L Sport",
          "seller": {
            "id": 1136754546,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_NIZA2",
            "registration_date": "2022-06-04T17:48:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 95000000,
          "prices": {
            "id": "MCO1075699258",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 95000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T20:00:03Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075699258-mitsubishi-nativa-30-l-sport-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_790924-MCO52470678671_112022-I.jpg",
          "thumbnail_id": "790924-MCO52470678671_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Jose GonzÃ¡lez",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQk5JWjQ3MDYz",
              "name": "Niza"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.705381,
            "longitude": -74.07554
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "attribute_group_id": "",
              "source": 1,
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "value_type": "list"
            },
            {
              "value_id": "242085",
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "1138",
                  "name": "Mitsubishi",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "1138",
              "value_name": "Mitsubishi",
              "source": 1443,
              "value_type": "string"
            },
            {
              "value_name": "5",
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Puertas",
              "value_struct": null
            },
            {
              "values": [
                {
                  "id": "2164458",
                  "name": "3.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "2164458",
              "value_type": "string",
              "value_name": "3.0",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "list"
            },
            {
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "81340 km",
                  "struct": {
                    "number": 81340,
                    "unit": "km"
                  }
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "KILOMETERS",
              "value_struct": {
                "number": 81340,
                "unit": "km"
              },
              "value_name": "81340 km",
              "attribute_group_id": "FIND",
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_id": null
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "1252920",
              "value_name": "Nativa",
              "values": [
                {
                  "id": "1252920",
                  "name": "Nativa",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_struct": null,
              "value_type": "string"
            },
            {
              "value_name": "AutomÃ¡tica",
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370876",
              "value_struct": null,
              "attribute_group_id": "FIND"
            },
            {
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": "9740695",
              "value_name": "3.0l Sport Fl",
              "value_struct": null,
              "values": [
                {
                  "id": "9740695",
                  "name": "3.0l Sport Fl",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "string"
            },
            {
              "value_type": "number",
              "value_id": null,
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2016",
              "values": [
                {
                  "id": null,
                  "name": "2016",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_name": "3 L",
              "value_struct": {
                "number": 3,
                "unit": "L"
              },
              "source": 1443,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_id": "2326653",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "values": [
                {
                  "id": "2326653",
                  "name": "3 L",
                  "struct": {
                    "number": 3,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ]
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_struct": null,
              "source": 1443,
              "value_type": "number",
              "value_id": null,
              "value_name": "5",
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros"
            },
            {
              "id": "POWER",
              "name": "Potencia",
              "source": 1443,
              "value_type": "number_unit",
              "value_id": "2181876",
              "value_name": "219 hp",
              "value_struct": {
                "number": 219,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "2181876",
                  "name": "219 hp",
                  "struct": {
                    "number": 219,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros"
            },
            {
              "name": "Control de tracciÃ³n",
              "value_name": "4x2",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "id": "TRACTION_CONTROL",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "value_id": "370879"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 13,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075698564",
          "site_id": "MCO",
          "title": "Kia Picanto",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 37500000,
          "prices": {
            "id": "MCO1075698564",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 37500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T19:34:27Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075698564-kia-picanto-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_874609-MCO52470202580_112022-I.jpg",
          "thumbnail_id": "874609-MCO52470202580_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Sebastian",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkxBNDgxODQ",
              "name": "La Floresta de Suba"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6922593,
            "longitude": -74.07481
          },
          "attributes": [
            {
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "value_type": "list",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "source": 1,
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "attribute_group_name": ""
            },
            {
              "value_id": "242084",
              "value_struct": null,
              "values": [
                {
                  "id": "242084",
                  "name": "No",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_name": "No"
            },
            {
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "source": 1443,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort"
            },
            {
              "value_id": "374002",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_struct": null,
              "values": [
                {
                  "id": "374002",
                  "name": "Kia",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Kia"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "DOORS",
              "name": "Puertas",
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "number",
              "value_id": null,
              "value_name": "5"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_name": "1.0",
              "values": [
                {
                  "id": "457508",
                  "name": "1.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "457508"
            },
            {
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "values": [
                {
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null
                }
              ],
              "source": 1443
            },
            {
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "52230 km",
              "values": [
                {
                  "id": null,
                  "name": "52230 km",
                  "struct": {
                    "unit": "km",
                    "number": 52230
                  },
                  "source": 1443
                }
              ],
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 52230,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "MODEL",
              "value_name": "Picanto",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Modelo",
              "value_id": "389565",
              "value_struct": null,
              "values": [
                {
                  "id": "389565",
                  "name": "Picanto",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_type": "list",
              "source": 1443,
              "id": "TRANSMISSION",
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_id": "10208021",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_name": "1.0 Ion R",
              "values": [
                {
                  "id": "10208021",
                  "name": "1.0 Ion R",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "AÃ±o",
              "value_name": "2017",
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2017",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_type": "number",
              "value_id": null
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "2326650",
              "value_name": "1 L",
              "value_struct": {
                "unit": "L",
                "number": 1
              },
              "attribute_group_name": "Otros",
              "source": 1443,
              "name": "Cilindrada",
              "values": [
                {
                  "id": "2326650",
                  "name": "1 L",
                  "struct": {
                    "number": 1,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number",
              "value_id": null,
              "value_name": "5"
            },
            {
              "source": 1443,
              "value_id": "459035",
              "value_name": "69 hp",
              "attribute_group_id": "OTHERS",
              "values": [
                {
                  "id": "459035",
                  "name": "69 hp",
                  "struct": {
                    "number": 69,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_struct": {
                "number": 69,
                "unit": "hp"
              }
            },
            {
              "id": "TRACTION_CONTROL",
              "value_name": "Delantera",
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "name": "Control de tracciÃ³n",
              "value_id": "493979",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 14,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075691811",
          "site_id": "MCO",
          "title": "Volkswagen Amarok 2.0 Comforline ",
          "seller": {
            "id": 464173900,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_LAPALMERACHIA",
            "registration_date": "2019-08-23T15:07:59.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 130000000,
          "prices": {
            "id": "MCO1075691811",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 130000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T19:22:51Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075691811-volkswagen-amarok-20-comforline-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_820400-MCO52470055118_112022-I.jpg",
          "thumbnail_id": "820400-MCO52470055118_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Luis Pinto",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNPTDIzNzA3",
              "name": "Colina Campestre I y II Etapa"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7296405,
            "longitude": -74.07187
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "values": [
                {
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null
                }
              ],
              "attribute_group_id": "",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "value_struct": null,
              "source": 1,
              "value_type": "list"
            },
            {
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "value_type": "boolean",
              "value_name": "No",
              "values": [
                {
                  "id": "242084",
                  "name": "No",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_id": "242084",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "value_struct": null,
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "60249",
              "value_name": "Volkswagen",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "60249",
                  "name": "Volkswagen"
                }
              ]
            },
            {
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_name": "4",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "source": 1443,
              "value_type": "string",
              "name": "Motor",
              "value_id": "423563",
              "value_struct": null,
              "values": [
                {
                  "id": "423563",
                  "name": "2.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "ENGINE",
              "value_name": "2.0"
            },
            {
              "id": "FUEL_TYPE",
              "value_name": "DiÃ©sel",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_type": "list",
              "name": "Tipo de combustible",
              "value_id": "60406",
              "values": [
                {
                  "name": "DiÃ©sel",
                  "struct": null,
                  "source": 1443,
                  "id": "60406"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "KILOMETERS",
              "value_name": "77800 km",
              "value_struct": {
                "number": 77800,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "77800 km",
                  "struct": {
                    "number": 77800,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "KilÃ³metros",
              "value_id": null,
              "value_type": "number_unit"
            },
            {
              "values": [
                {
                  "id": "63686",
                  "name": "Amarok",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "Modelo",
              "value_id": "63686",
              "value_struct": null,
              "id": "MODEL",
              "value_name": "Amarok",
              "value_type": "string"
            },
            {
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "source": 1443,
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list"
            },
            {
              "value_id": "9741227",
              "value_name": "2.0 Comfortline 4 p",
              "value_struct": null,
              "values": [
                {
                  "id": "9741227",
                  "name": "2.0 Comfortline 4 p",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2019",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "2019",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number"
            },
            {
              "name": "Cilindrada",
              "value_id": "2326622",
              "values": [
                {
                  "id": "2326622",
                  "name": "2 L",
                  "struct": {
                    "number": 2,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "value_name": "2 L",
              "value_struct": {
                "number": 2,
                "unit": "L"
              },
              "attribute_group_id": "OTHERS"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": null,
              "value_name": "5",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "5"
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number"
            },
            {
              "value_id": "460368",
              "value_name": "420 hp",
              "values": [
                {
                  "name": "420 hp",
                  "struct": {
                    "number": 420,
                    "unit": "hp"
                  },
                  "source": 1443,
                  "id": "460368"
                }
              ],
              "source": 1443,
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_struct": {
                "unit": "hp",
                "number": 420
              },
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros"
            },
            {
              "id": "TRACTION_CONTROL",
              "value_id": "370880",
              "values": [
                {
                  "name": "4x4",
                  "struct": null,
                  "source": 3282472529718136,
                  "id": "370880"
                }
              ],
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 3282472529718136,
              "value_type": "list",
              "name": "Control de tracciÃ³n",
              "value_name": "4x4",
              "value_struct": null
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 15,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075653128",
          "site_id": "MCO",
          "title": "Chery Yoyo Van Carga",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 42000000,
          "prices": {
            "id": "MCO1075653128",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 42000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T17:57:24Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075653128-chery-yoyo-van-carga-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_864723-MCO52468431674_112022-I.jpg",
          "thumbnail_id": "864723-MCO52468431674_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUENVTmE3NmQ4",
            "state_name": "Cundinamarca",
            "city_id": "TUNPQ1NPQTZlMjkx",
            "city_name": "Soacha",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Maria M.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlNPQTMyNDE3NQ",
              "name": "Soacha"
            },
            "city": {
              "id": "TUNPQ1NPQTZlMjkx",
              "name": "Soacha"
            },
            "state": {
              "id": "TUNPUENVTmE3NmQ4",
              "name": "Cundinamarca"
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5827227,
            "longitude": -74.21175
          },
          "attributes": [
            {
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "id": "ITEM_CONDITION",
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1
            },
            {
              "value_struct": null,
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443,
                  "id": "242085"
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "name": "Aire acondicionado",
              "value_id": "242085"
            },
            {
              "value_struct": null,
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Chery",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": "389168",
              "values": [
                {
                  "id": "389168",
                  "name": "Chery",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "value_struct": null,
              "name": "Puertas",
              "value_id": null,
              "value_name": "2",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "2"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "DOORS"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "1173",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "ENGINE",
              "name": "Motor",
              "value_id": null,
              "value_name": "1173",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_struct": null,
              "source": 1443,
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina"
                }
              ]
            },
            {
              "value_id": null,
              "value_name": "15745 km",
              "value_struct": {
                "number": 15745,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "values": [
                {
                  "id": null,
                  "name": "15745 km",
                  "struct": {
                    "number": 15745,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "id": "MODEL",
              "value_id": "119481",
              "value_struct": null,
              "value_type": "string",
              "name": "Modelo",
              "value_name": "YOYO",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "119481",
                  "name": "YOYO"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "TRANSMISSION",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_name": "1.2",
              "values": [
                {
                  "id": "2184703",
                  "name": "1.2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_id": "2184703",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2015",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_name": "2015",
              "value_type": "number",
              "name": "AÃ±o",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_struct": {
                "number": 1173,
                "unit": "cc"
              },
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "values": [
                {
                  "name": "1173 cc",
                  "struct": {
                    "number": 1173,
                    "unit": "cc"
                  },
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": null,
              "value_name": "1173 cc"
            },
            {
              "value_id": "370879",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "attribute_group_name": "Seguridad",
              "source": 1443,
              "value_type": "list",
              "value_name": "4x2",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370879",
                  "name": "4x2"
                }
              ]
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 16,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075505350",
          "site_id": "MCO",
          "title": "Chevrolet N300 Van Carga",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 44000000,
          "prices": {
            "id": "MCO1075505350",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 44000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T16:54:11Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075505350-chevrolet-n300-van-carga-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_836803-MCO52467442397_112022-I.jpg",
          "thumbnail_id": "836803-MCO52467442397_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0JPUzQwMzcw",
            "city_name": "Bosa",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Omar R.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlBJQTE1OTg3",
              "name": "Piamonte I Etapa"
            },
            "city": {
              "id": "TUNPQ0JPUzQwMzcw",
              "name": "Bosa"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.606372,
            "longitude": -74.19078
          },
          "attributes": [
            {
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "source": 1,
              "name": "CondiciÃ³n del Ã­tem"
            },
            {
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean",
              "name": "Aire acondicionado"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "58955",
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "BRAND",
              "name": "Marca",
              "value_id": "58955",
              "value_name": "Chevrolet",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "value_id": null,
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "name": "Puertas"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "ENGINE",
              "name": "Motor",
              "values": [
                {
                  "id": null,
                  "name": "1200",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "value_id": null,
              "value_name": "1200"
            },
            {
              "source": 1443,
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "FUEL_TYPE"
            },
            {
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 108000,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "108000 km",
                  "struct": {
                    "number": 108000,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "108000 km",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "name": "Modelo",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "value_id": "45893",
              "value_name": "N300",
              "values": [
                {
                  "id": "45893",
                  "name": "N300",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_id": "370877",
              "value_name": "MecÃ¡nica"
            },
            {
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "Van Carga",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": null,
              "value_name": "Van Carga"
            },
            {
              "id": "VEHICLE_YEAR",
              "source": 1443,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2016",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2016",
              "value_struct": null
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "value_struct": {
                "number": 1200,
                "unit": "cc"
              },
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "1200 cc",
                  "struct": {
                    "number": 1200,
                    "unit": "cc"
                  }
                }
              ],
              "source": 1443,
              "name": "Cilindrada",
              "value_id": null,
              "value_name": "1200 cc",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "value_struct": null,
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "value_id": "370879",
              "name": "Control de tracciÃ³n",
              "value_name": "4x2",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "id": "TRACTION_CONTROL"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 17,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075276269",
          "site_id": "MCO",
          "title": "Hyundai Accent 1.6 Hb20s",
          "seller": {
            "id": 464173900,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_LAPALMERACHIA",
            "registration_date": "2019-08-23T15:07:59.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 66000000,
          "prices": {
            "id": "MCO1075276269",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 66000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T15:59:53Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075276269-hyundai-accent-16-hb20s-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_709174-MCO52466489013_112022-I.jpg",
          "thumbnail_id": "709174-MCO52466489013_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUENVTmE3NmQ4",
            "state_name": "Cundinamarca",
            "city_id": "TUNPQ0NISTk4OWIx",
            "city_name": "ChÃ­a",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Jon Paul BarragÃ¡n",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "",
              "name": ""
            },
            "city": {
              "id": "TUNPQ0NISTk4OWIx",
              "name": "ChÃ­a"
            },
            "state": {
              "id": "TUNPUENVTmE3NmQ4",
              "name": "Cundinamarca"
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.864758,
            "longitude": -74.05092
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "attribute_group_name": "",
              "source": 1,
              "value_type": "list",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": ""
            },
            {
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_struct": null,
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "value_id": "242085",
              "value_name": "SÃ­",
              "attribute_group_id": "ADICIONALES"
            },
            {
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "value_name": "SÃ­",
              "name": "Aire acondicionado",
              "value_id": "242085",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING"
            },
            {
              "value_id": "1089",
              "value_name": "Hyundai",
              "value_struct": null,
              "values": [
                {
                  "name": "Hyundai",
                  "struct": null,
                  "source": 1443,
                  "id": "1089"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "BRAND",
              "source": 1443,
              "name": "Marca"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "DOORS",
              "name": "Puertas",
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "value_id": null,
              "value_name": "5"
            },
            {
              "value_name": "1600",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "1600",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "name": "Tipo de combustible",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_name": "Gasolina",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": "64364"
            },
            {
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 9900,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "9900 km",
              "values": [
                {
                  "id": null,
                  "name": "9900 km",
                  "struct": {
                    "number": 9900,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ]
            },
            {
              "value_type": "string",
              "name": "Modelo",
              "value_id": "63922",
              "value_struct": null,
              "values": [
                {
                  "id": "63922",
                  "name": "Accent",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "MODEL",
              "value_name": "Accent",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list"
            },
            {
              "name": "VersiÃ³n",
              "value_name": "HB20s",
              "value_type": "string",
              "id": "TRIM",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "HB20s",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2023",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "source": 1443,
              "value_type": "number",
              "value_name": "2023",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "Control de tracciÃ³n",
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "value_name": "4x2",
              "value_struct": null,
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_id": "370879"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 18,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075214862",
          "site_id": "MCO",
          "title": "Mercedes-benz Clase Cla 180 Amg Line",
          "seller": {
            "id": 570211167,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_CALLE134",
            "registration_date": "2020-05-18T16:38:57.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 158800000,
          "prices": {
            "id": "MCO1075214862",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 158800000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T14:16:52Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075214862-mercedes-benz-clase-cla-180-amg-line-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_793274-MCO52464873026_112022-I.jpg",
          "thumbnail_id": "793274-MCO52464873026_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Joaquin M.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkxBMTY3ODI",
              "name": "La Colina Campestre"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.726241,
            "longitude": -74.06655
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "attribute_group_name": "",
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": ""
            },
            {
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_struct": null,
              "value_name": "SÃ­",
              "source": 1443,
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085"
            },
            {
              "values": [
                {
                  "source": 1443,
                  "id": "75966",
                  "name": "Mercedes-Benz",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "BRAND",
              "value_id": "75966",
              "value_name": "Mercedes-Benz",
              "value_struct": null,
              "name": "Marca",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "value_name": "4",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number"
            },
            {
              "name": "Motor",
              "value_name": "1400",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "ENGINE",
              "value_id": null,
              "values": [
                {
                  "name": "1400",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "FUEL_TYPE",
              "value_name": "Gasolina",
              "values": [
                {
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list"
            },
            {
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 3000,
                "unit": "km"
              },
              "source": 1443,
              "value_type": "number_unit",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "3000 km",
              "values": [
                {
                  "id": null,
                  "name": "3000 km",
                  "struct": {
                    "number": 3000,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ]
            },
            {
              "id": "MODEL",
              "value_name": "Clase CLA",
              "values": [
                {
                  "id": "503621",
                  "name": "Clase CLA",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string",
              "name": "Modelo",
              "value_id": "503621",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "TRANSMISSION",
              "value_id": "370876",
              "value_type": "list",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "TransmisiÃ³n",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "value_name": "180 Amg Line 1.4 T",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "180 Amg Line 1.4 T",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "name": "VersiÃ³n"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "2022",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": null,
              "value_type": "number",
              "value_name": "2022",
              "value_struct": null,
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 19,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1075214048",
          "site_id": "MCO",
          "title": "Kia Picanto Ion R",
          "seller": {
            "id": 570211167,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_CALLE134",
            "registration_date": "2020-05-18T16:38:57.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 34600000,
          "prices": {
            "id": "MCO1075214048",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 34600000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T13:34:27Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-16T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1075214048-kia-picanto-ion-r-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_953169-MCO52465713001_112022-I.jpg",
          "thumbnail_id": "953169-MCO52465713001_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1VTQTY3MTQ1",
            "city_name": "UsaquÃ©n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Juan G.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkVMMTQ4OTg",
              "name": "El Contador"
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.72313,
            "longitude": -74.04609
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1,
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "value_type": "list"
            },
            {
              "value_id": "242085",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "value_type": "boolean",
              "name": "Ãšnico dueÃ±o",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "id": "SINGLE_OWNER"
            },
            {
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1443
            },
            {
              "attribute_group_id": "FIND",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "374002",
              "value_name": "Kia",
              "values": [
                {
                  "id": "374002",
                  "name": "Kia",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "value_name": "5",
              "value_struct": null
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "ENGINE",
              "value_id": "457508",
              "value_name": "1.0",
              "value_struct": null,
              "values": [
                {
                  "id": "457508",
                  "name": "1.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "name": "Motor",
              "source": 1443
            },
            {
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_name": "Gasolina",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "49000 km",
              "value_struct": {
                "number": 49000,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "49000 km",
                  "struct": {
                    "unit": "km",
                    "number": 49000
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "389565",
                  "name": "Picanto",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_name": "Picanto",
              "value_id": "389565",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "TRANSMISSION",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "name": "VersiÃ³n",
              "value_id": "10208021",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "TRIM",
              "value_name": "1.0 Ion R",
              "values": [
                {
                  "source": 1443,
                  "id": "10208021",
                  "name": "1.0 Ion R",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "name": "AÃ±o",
              "value_name": "2016",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "2016",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number"
            },
            {
              "value_id": "2326650",
              "value_struct": {
                "number": 1,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326650",
                  "name": "1 L",
                  "struct": {
                    "number": 1,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_name": "1 L",
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "value_struct": null,
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "name": "Capacidad de personas",
              "value_id": null,
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number"
            },
            {
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "459035",
              "value_struct": {
                "number": 69,
                "unit": "hp"
              },
              "attribute_group_id": "OTHERS",
              "value_name": "69 hp",
              "values": [
                {
                  "name": "69 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 69
                  },
                  "source": 1443,
                  "id": "459035"
                }
              ],
              "source": 1443
            },
            {
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "value_struct": null,
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY",
              "value_type": "list",
              "value_id": "493979",
              "attribute_group_name": "Seguridad",
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 20,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1073385422",
          "site_id": "MCO",
          "title": "Toyota Hilux 2.7 Imv 4x4",
          "seller": {
            "id": 1136754546,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_NIZA2",
            "registration_date": "2022-06-04T17:48:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 114000000,
          "prices": {
            "id": "MCO1073385422",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 114000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T21:34:03Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1073385422-toyota-hilux-27-imv-4x4-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_713151-MCO52451872456_112022-I.jpg",
          "thumbnail_id": "713151-MCO52451872456_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Sergio Herrera",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQk5JWjQ3MDYz",
              "name": "Niza"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.705381,
            "longitude": -74.07554
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem"
            },
            {
              "name": "Aire acondicionado",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "attribute_group_id": "CONFORT",
              "value_id": "242085"
            },
            {
              "id": "BRAND",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "name": "Marca",
              "value_id": "60297",
              "value_name": "Toyota",
              "values": [
                {
                  "name": "Toyota",
                  "struct": null,
                  "source": 1443,
                  "id": "60297"
                }
              ]
            },
            {
              "value_name": "2",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "DOORS",
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "name": "Puertas",
              "values": [
                {
                  "id": null,
                  "name": "2",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_id": "459208",
              "value_struct": null,
              "values": [
                {
                  "id": "459208",
                  "name": "2.7",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "string",
              "source": 1443,
              "id": "ENGINE",
              "name": "Motor",
              "value_name": "2.7",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "Gasolina",
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_struct": null,
              "name": "Tipo de combustible"
            },
            {
              "value_name": "156700 km",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "values": [
                {
                  "id": null,
                  "name": "156700 km",
                  "struct": {
                    "number": 156700,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_id": null,
              "value_struct": {
                "number": 156700,
                "unit": "km"
              }
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Modelo",
              "value_name": "Hilux",
              "value_struct": null,
              "values": [
                {
                  "id": "63613",
                  "name": "Hilux",
                  "struct": null,
                  "source": 1443
                }
              ],
              "id": "MODEL",
              "value_id": "63613",
              "source": 1443
            },
            {
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "source": 1443,
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "TRANSMISSION"
            },
            {
              "value_id": "9741394",
              "value_name": "2.7 Imv 4x4",
              "value_struct": null,
              "values": [
                {
                  "id": "9741394",
                  "name": "2.7 Imv 4x4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_type": "number",
              "value_id": null,
              "value_name": "2011",
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2011",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_id": "9743626",
              "value_name": "2700 cc",
              "value_struct": {
                "number": 2700,
                "unit": "cc"
              },
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "values": [
                {
                  "id": "9743626",
                  "name": "2700 cc",
                  "struct": {
                    "number": 2700,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443
            },
            {
              "id": "LINE",
              "value_id": "10566170",
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "string",
              "name": "LÃ­nea",
              "value_name": "g7",
              "values": [
                {
                  "id": "10566170",
                  "name": "g7",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros"
            },
            {
              "value_id": null,
              "value_name": "2",
              "value_type": "number",
              "source": 1443,
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2",
                  "struct": null
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros"
            },
            {
              "attribute_group_name": "Otros",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "459300",
              "value_name": "160 hp",
              "value_struct": {
                "number": 160,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "459300",
                  "name": "160 hp",
                  "struct": {
                    "number": 160,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "value_id": "370880",
              "value_name": "4x4",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370880",
                  "name": "4x4"
                }
              ],
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 21,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1073493762",
          "site_id": "MCO",
          "title": "Volkswagen Amarok Tredline Estacas ",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 115000000,
          "prices": {
            "id": "MCO1073493762",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 115000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T21:03:13Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1073493762-volkswagen-amarok-tredline-estacas-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_847330-MCO52451513513_112022-I.jpg",
          "thumbnail_id": "847330-MCO52451513513_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0tFTjQyODYy",
            "city_name": "Kennedy",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Jaime V.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNBUzI1MDYzOQ",
              "name": "Castilla"
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6395035,
            "longitude": -74.140144
          },
          "attributes": [
            {
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_struct": null
            },
            {
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "value_type": "boolean",
              "value_struct": null,
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "source": 1443,
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null
                }
              ],
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING"
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Volkswagen",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": "60249",
              "values": [
                {
                  "id": "60249",
                  "name": "Volkswagen",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "id": "DOORS",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "name": "Puertas",
              "value_id": null,
              "value_name": "2",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number"
            },
            {
              "id": "ENGINE",
              "value_name": "2.0",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "name": "Motor",
              "value_id": "423563",
              "value_struct": null,
              "values": [
                {
                  "id": "423563",
                  "name": "2.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_id": "60406",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_name": "DiÃ©sel",
              "values": [
                {
                  "id": "60406",
                  "name": "DiÃ©sel",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "name": "KilÃ³metros",
              "value_name": "85350 km",
              "value_struct": {
                "number": 85350,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "85350 km",
                  "struct": {
                    "number": 85350,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "values": [
                {
                  "source": 1443,
                  "id": "63686",
                  "name": "Amarok",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": "63686",
              "value_name": "Amarok",
              "value_struct": null,
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "attribute_group_id": "FIND"
            },
            {
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "attribute_group_id": "FIND"
            },
            {
              "name": "VersiÃ³n",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_struct": null,
              "values": [
                {
                  "name": "2.0 Trendline 2 p",
                  "struct": null,
                  "source": 1443,
                  "id": "9741878"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "TRIM",
              "value_id": "9741878",
              "value_name": "2.0 Trendline 2 p"
            },
            {
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "values": [
                {
                  "id": null,
                  "name": "2018",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_id": null,
              "value_name": "2018"
            },
            {
              "source": 1443,
              "value_type": "number_unit",
              "value_struct": {
                "number": 2,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326622",
                  "name": "2 L",
                  "struct": {
                    "unit": "L",
                    "number": 2
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326622",
              "value_name": "2 L"
            },
            {
              "value_id": null,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "values": [
                {
                  "id": null,
                  "name": "2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_name": "2",
              "value_struct": null
            },
            {
              "id": "POWER",
              "value_name": "340 hp",
              "values": [
                {
                  "source": 1443,
                  "id": "459144",
                  "name": "340 hp",
                  "struct": {
                    "number": 340,
                    "unit": "hp"
                  }
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "name": "Potencia",
              "value_id": "459144",
              "value_struct": {
                "number": 340,
                "unit": "hp"
              },
              "attribute_group_id": "OTHERS"
            },
            {
              "source": 1443,
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "value_name": "4x2",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 22,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1073403941",
          "site_id": "MCO",
          "title": "Chevrolet D-max",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 65000000,
          "prices": {
            "id": "MCO1073403941",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 65000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T21:00:19Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1073403941-chevrolet-d-max-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_680307-MCO52451339874_112022-I.jpg",
          "thumbnail_id": "680307-MCO52451339874_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Edgar",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlNBTjk5ODU4",
              "name": "San Carlos de Tibabuyes"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7459955,
            "longitude": -74.11823
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "source": 1,
              "value_type": "list"
            },
            {
              "value_id": "58955",
              "value_name": "Chevrolet",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "values": [
                {
                  "id": "58955",
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Marca"
            },
            {
              "value_name": "2",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": null,
              "name": "Puertas",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "DOORS"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "2500",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "ENGINE",
              "value_id": null,
              "value_name": "2500",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "name": "Motor"
            },
            {
              "name": "Tipo de combustible",
              "value_id": "60406",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "60406",
                  "name": "DiÃ©sel"
                }
              ],
              "source": 1443,
              "id": "FUEL_TYPE",
              "value_name": "DiÃ©sel",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list"
            },
            {
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 93300,
                "unit": "km"
              },
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "93300 km",
              "values": [
                {
                  "id": null,
                  "name": "93300 km",
                  "struct": {
                    "number": 93300,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "value_id": "2109390",
              "values": [
                {
                  "id": "2109390",
                  "name": "D-Max",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_name": "D-Max",
              "value_struct": null
            },
            {
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_id": "370877",
              "values": [
                {
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443,
                  "id": "370877"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list"
            },
            {
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "2.5 mt 4x2"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "value_name": "2.5 mt 4x2",
              "source": 1443,
              "value_type": "string",
              "name": "VersiÃ³n"
            },
            {
              "name": "AÃ±o",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "2011"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_name": "2011",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 23,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1073575755",
          "site_id": "MCO",
          "title": "Nissan Tiida 1.6",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 32500000,
          "prices": {
            "id": "MCO1073575755",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 32500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T20:51:12Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1073575755-nissan-tiida-16-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_889750-MCO52451224781_112022-I.jpg",
          "thumbnail_id": "889750-MCO52451224781_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUENVTmE3NmQ4",
            "state_name": "Cundinamarca",
            "city_id": "TUNPQ1NPQTZlMjkx",
            "city_name": "Soacha",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Augusto S.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlNPQTMyNDE3NQ",
              "name": "Soacha"
            },
            "city": {
              "id": "TUNPQ1NPQTZlMjkx",
              "name": "Soacha"
            },
            "state": {
              "id": "TUNPUENVTmE3NmQ4",
              "name": "Cundinamarca"
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5827227,
            "longitude": -74.21175
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list"
            },
            {
              "source": 1443,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_name": "SÃ­"
            },
            {
              "value_id": "60505",
              "value_name": "Nissan",
              "value_struct": null,
              "values": [
                {
                  "id": "60505",
                  "name": "Nissan",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_id": null,
              "value_name": "4",
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "ENGINE",
              "value_name": "1.6",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Motor",
              "value_id": "2164443",
              "values": [
                {
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "string"
            },
            {
              "id": "FUEL_TYPE",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "76378 km",
                  "struct": {
                    "number": 76378,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "KILOMETERS",
              "value_name": "76378 km",
              "value_struct": {
                "number": 76378,
                "unit": "km"
              },
              "source": 1443
            },
            {
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "61186",
              "value_struct": null,
              "values": [
                {
                  "id": "61186",
                  "name": "Tiida",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_name": "Tiida",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_struct": null,
              "value_type": "list",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": "9734619",
              "value_name": "1.6 Miio",
              "values": [
                {
                  "id": "9734619",
                  "name": "1.6 Miio",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string"
            },
            {
              "id": "VEHICLE_YEAR",
              "value_name": "2015",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "name": "AÃ±o",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "2015",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "values": [
                {
                  "id": "2326646",
                  "name": "1.6 L",
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443,
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "2326646",
              "value_name": "1.6 L",
              "value_struct": {
                "number": 1.6,
                "unit": "L"
              },
              "name": "Cilindrada",
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number",
              "value_name": "5",
              "name": "Capacidad de personas",
              "value_id": null,
              "attribute_group_name": "Otros",
              "source": 1443,
              "id": "PASSENGER_CAPACITY"
            },
            {
              "id": "POWER",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_struct": {
                "number": 106,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "459136",
                  "name": "106 hp",
                  "struct": {
                    "number": 106,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit",
              "name": "Potencia",
              "value_id": "459136",
              "value_name": "106 hp"
            },
            {
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "id": "TRACTION_CONTROL",
              "value_id": "493979",
              "value_struct": null,
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "source": 1443,
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 24,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1073403297",
          "site_id": "MCO",
          "title": "Renault Duster Dynamique",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 48000000,
          "prices": {
            "id": "MCO1073403297",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 48000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T20:35:29Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1073403297-renault-duster-dynamique-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_889677-MCO52451083292_112022-I.jpg",
          "thumbnail_id": "889677-MCO52451083292_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0tFTjQyODYy",
            "city_name": "Kennedy",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Andres C.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNJVTUxOTM1",
              "name": "Ciudad Kennedy"
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.63048,
            "longitude": -74.1553
          },
          "attributes": [
            {
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1,
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "value_type": "list",
              "id": "ITEM_CONDITION"
            },
            {
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "242085",
                  "name": "SÃ­"
                }
              ],
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443,
              "name": "Aire acondicionado"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_struct": null,
              "values": [
                {
                  "name": "Renault",
                  "struct": null,
                  "source": 1443,
                  "id": "9909"
                }
              ],
              "attribute_group_id": "FIND",
              "value_name": "Renault",
              "source": 1443,
              "id": "BRAND",
              "name": "Marca",
              "value_id": "9909"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Puertas",
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "value_id": null
            },
            {
              "value_id": "423563",
              "value_name": "2.0",
              "value_struct": null,
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "values": [
                {
                  "name": "2.0",
                  "struct": null,
                  "source": 1443,
                  "id": "423563"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "name": "Tipo de combustible",
              "value_id": "64364",
              "attribute_group_id": "FIND"
            },
            {
              "value_name": "113536 km",
              "values": [
                {
                  "id": null,
                  "name": "113536 km",
                  "struct": {
                    "number": 113536,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_id": null,
              "value_struct": {
                "number": 113536,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "KILOMETERS"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "64855",
              "value_name": "Duster",
              "values": [
                {
                  "id": "64855",
                  "name": "Duster",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_id": "370877",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRANSMISSION",
              "value_name": "MecÃ¡nica",
              "value_type": "list",
              "name": "TransmisiÃ³n"
            },
            {
              "name": "VersiÃ³n",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "TRIM",
              "value_id": "9740802",
              "value_name": "2.0 Dynamique 4x2",
              "values": [
                {
                  "id": "9740802",
                  "name": "2.0 Dynamique 4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "attribute_group_id": "FIND",
              "value_struct": null,
              "values": [
                {
                  "name": "2013",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2013",
              "value_type": "number"
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326622",
              "value_name": "2 L",
              "source": 1443,
              "value_struct": {
                "number": 2,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326622",
                  "name": "2 L",
                  "struct": {
                    "number": 2,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "source": 1443,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_name": "5",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "5"
                }
              ],
              "attribute_group_name": "Otros",
              "value_id": null,
              "value_struct": null,
              "attribute_group_id": "OTHERS"
            },
            {
              "id": "POWER",
              "name": "Potencia",
              "value_name": "138 hp",
              "value_struct": {
                "unit": "hp",
                "number": 138
              },
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_id": "459187",
              "values": [
                {
                  "id": "459187",
                  "name": "138 hp",
                  "struct": {
                    "number": 138,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "value_name": "4x2",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370879",
                  "name": "4x2"
                }
              ],
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 25,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1073383690",
          "site_id": "MCO",
          "title": "Volkswagen Polo Comfortline",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 43000000,
          "prices": {
            "id": "MCO1073383690",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 43000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T20:23:37Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1073383690-volkswagen-polo-comfortline-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_939043-MCO52450602768_112022-I.jpg",
          "thumbnail_id": "939043-MCO52450602768_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0NJVTQ0NjQx",
            "city_name": "Ciudad BolÃ­var",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Willian V.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkFDQTEwNTEz",
              "name": "Acacia "
            },
            "city": {
              "id": "TUNPQ0NJVTQ0NjQx",
              "name": "Ciudad BolÃ­var"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5975146,
            "longitude": -74.18491
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "attribute_group_id": "",
              "source": 1,
              "name": "CondiciÃ³n del Ã­tem"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "source": 1443,
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_id": "242085"
            },
            {
              "value_id": "60249",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Volkswagen",
              "values": [
                {
                  "id": "60249",
                  "name": "Volkswagen",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "id": "DOORS",
              "name": "Puertas",
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "value_id": null,
              "value_name": "5",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_name": "1.6",
              "name": "Motor",
              "value_id": "2164443",
              "values": [
                {
                  "source": 1443,
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null
                }
              ],
              "value_type": "string",
              "id": "ENGINE"
            },
            {
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null,
              "value_name": "Gasolina",
              "source": 1443,
              "value_type": "list"
            },
            {
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_struct": {
                "number": 53000,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "53000 km",
                  "struct": {
                    "number": 53000,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "53000 km",
              "attribute_group_id": "FIND"
            },
            {
              "id": "MODEL",
              "value_name": "Polo",
              "source": 1443,
              "name": "Modelo",
              "value_id": "61695",
              "value_struct": null,
              "values": [
                {
                  "id": "61695",
                  "name": "Polo",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "value_name": "MecÃ¡nica",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_struct": null,
              "values": [
                {
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443,
                  "id": "370877"
                }
              ]
            },
            {
              "name": "VersiÃ³n",
              "source": 1443,
              "value_type": "string",
              "id": "TRIM",
              "value_id": "1109957",
              "value_name": "1.6 Comfortline",
              "value_struct": null,
              "values": [
                {
                  "id": "1109957",
                  "name": "1.6 Comfortline",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2015",
                  "struct": null
                }
              ],
              "source": 1443,
              "value_type": "number",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2015"
            },
            {
              "value_struct": {
                "number": 1.6,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326646",
                  "name": "1.6 L",
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326646",
              "value_name": "1.6 L",
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "value_id": null,
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "source": 1443,
              "name": "Capacidad de personas",
              "value_name": "5"
            },
            {
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "id": "POWER",
              "value_name": "105 hp",
              "value_struct": {
                "number": 105,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458584",
                  "name": "105 hp",
                  "struct": {
                    "number": 105,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "name": "Potencia",
              "value_id": "458584",
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "493979",
              "value_name": "Delantera",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 26,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1072531912",
          "site_id": "MCO",
          "title": "Volkswagen Jetta New Jetta ",
          "seller": {
            "id": 570211167,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_CALLE134",
            "registration_date": "2020-05-18T16:38:57.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 45000000,
          "prices": {
            "id": "MCO1072531912",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 45000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T17:53:02Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1072531912-volkswagen-jetta-new-jetta-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_617310-MCO52448419204_112022-I.jpg",
          "thumbnail_id": "617310-MCO52448419204_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1BVRTg0NTU0",
            "city_name": "Puente Aranda",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Victor S.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlBSSTI1MTQz",
              "name": "Primavera"
            },
            "city": {
              "id": "TUNPQ1BVRTg0NTU0",
              "name": "Puente Aranda"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.614473,
            "longitude": -74.10858
          },
          "attributes": [
            {
              "attribute_group_id": "",
              "attribute_group_name": "",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION"
            },
            {
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "name": "Ãšnico dueÃ±o",
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "boolean",
              "id": "SINGLE_OWNER"
            },
            {
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­"
            },
            {
              "id": "BRAND",
              "value_name": "Volkswagen",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "Marca",
              "value_id": "60249",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "60249",
                  "name": "Volkswagen"
                }
              ]
            },
            {
              "name": "Puertas",
              "value_name": "4",
              "values": [
                {
                  "name": "4",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_id": null
            },
            {
              "id": "ENGINE",
              "name": "Motor",
              "value_name": "2480",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "2480"
                }
              ],
              "value_id": null,
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string"
            },
            {
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_name": "Gasolina"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "67160 km",
              "value_struct": {
                "number": 67160,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "67160 km",
                  "struct": {
                    "number": 67160,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number_unit"
            },
            {
              "value_type": "string",
              "id": "MODEL",
              "value_name": "Jetta",
              "value_struct": null,
              "values": [
                {
                  "id": "60567",
                  "name": "Jetta",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Modelo",
              "value_id": "60567",
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": "370876",
              "values": [
                {
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443,
                  "id": "370876"
                }
              ]
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "VersiÃ³n",
              "value_name": "2.5 New Jetta",
              "value_struct": null,
              "values": [
                {
                  "name": "2.5 New Jetta",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "id": "TRIM",
              "value_id": null
            },
            {
              "name": "AÃ±o",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2012",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_name": "2012",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 27,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1071585449",
          "site_id": "MCO",
          "title": "Kia Picanto Ion Extreme",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 32800000,
          "prices": {
            "id": "MCO1071585449",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 32800000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T17:07:24Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1071585449-kia-picanto-ion-extreme-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_794860-MCO52446985537_112022-I.jpg",
          "thumbnail_id": "794860-MCO52446985537_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0tFTjQyODYy",
            "city_name": "Kennedy",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Alejandro R.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkRFTDQzNDA0",
              "name": "Delicias"
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5971894,
            "longitude": -74.14308
          },
          "attributes": [
            {
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_struct": null,
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "attribute_group_name": "",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581"
            },
            {
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_type": "boolean"
            },
            {
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "374002",
              "value_struct": null,
              "value_name": "Kia",
              "values": [
                {
                  "source": 1443,
                  "id": "374002",
                  "name": "Kia",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "Puertas",
              "value_name": "5",
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "DOORS",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "ENGINE",
              "values": [
                {
                  "id": "423558",
                  "name": "1.2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Motor",
              "value_id": "423558",
              "value_name": "1.2",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_struct": null,
              "value_type": "list",
              "value_id": "64364",
              "value_name": "Gasolina",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_id": null,
              "value_struct": {
                "number": 129333,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "129333 km",
                  "struct": {
                    "number": 129333,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_name": "129333 km",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "389565",
              "value_name": "Picanto",
              "values": [
                {
                  "id": "389565",
                  "name": "Picanto",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_struct": null,
              "value_type": "string"
            },
            {
              "value_name": "MecÃ¡nica",
              "source": 1443,
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877"
            },
            {
              "values": [
                {
                  "id": "10207952",
                  "name": "1.25 Ion Xtrem",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "value_id": "10207952",
              "value_struct": null,
              "value_type": "string",
              "name": "VersiÃ³n",
              "value_name": "1.25 Ion Xtrem",
              "source": 1443
            },
            {
              "id": "VEHICLE_YEAR",
              "value_name": "2013",
              "value_type": "number",
              "source": 1443,
              "name": "AÃ±o",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2013",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "1.2 L",
              "source": 1443,
              "value_struct": {
                "number": 1.2,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326663",
                  "name": "1.2 L",
                  "struct": {
                    "unit": "L",
                    "number": 1.2
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326663"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "attribute_group_id": "OTHERS",
              "value_id": null,
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "5"
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number"
            },
            {
              "name": "Potencia",
              "value_name": "87 hp",
              "value_struct": {
                "unit": "hp",
                "number": 87
              },
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "id": "POWER",
              "values": [
                {
                  "id": "460847",
                  "name": "87 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 87
                  },
                  "source": 1443
                }
              ],
              "value_type": "number_unit",
              "value_id": "460847"
            },
            {
              "value_struct": null,
              "attribute_group_name": "Seguridad",
              "source": 1443,
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY",
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "value_id": "493979"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 28,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1072537575",
          "site_id": "MCO",
          "title": "Hyundai New Tucson",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 95000000,
          "prices": {
            "id": "MCO1072537575",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 95000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T16:39:34Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1072537575-hyundai-new-tucson-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_927342-MCO52446623079_112022-I.jpg",
          "thumbnail_id": "927342-MCO52446623079_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUENVTmE3NmQ4",
            "state_name": "Cundinamarca",
            "city_id": "TUNPQ1NPQTZlMjkx",
            "city_name": "Soacha",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Jorge M.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlNPQTMyNDE3NQ",
              "name": "Soacha"
            },
            "city": {
              "id": "TUNPQ1NPQTZlMjkx",
              "name": "Soacha"
            },
            "state": {
              "id": "TUNPUENVTmE3NmQ4",
              "name": "Cundinamarca"
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5827227,
            "longitude": -74.21175
          },
          "attributes": [
            {
              "value_id": "2230581",
              "attribute_group_id": "",
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "source": 1
            },
            {
              "source": 1443,
              "value_id": "242085",
              "value_name": "SÃ­",
              "attribute_group_name": "Confort",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_struct": null
            },
            {
              "name": "Marca",
              "value_name": "Hyundai",
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "BRAND",
              "value_id": "1089",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "1089",
                  "name": "Hyundai"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "source": 1443,
              "value_name": "5",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "ENGINE",
              "value_name": "2000",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "Motor",
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2000",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "id": "FUEL_TYPE",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "64364",
                  "name": "Gasolina"
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "list",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_type": "number_unit",
              "value_id": null,
              "value_name": "48650 km",
              "value_struct": {
                "number": 48650,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "48650 km",
                  "struct": {
                    "number": 48650,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "KILOMETERS",
              "name": "KilÃ³metros"
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "84809",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_name": "Tucson",
              "value_struct": null,
              "values": [
                {
                  "id": "84809",
                  "name": "Tucson",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string"
            },
            {
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_type": "list",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "id": "TRIM",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "VersiÃ³n",
              "value_id": "2158513",
              "value_name": "2.0",
              "values": [
                {
                  "id": "2158513",
                  "name": "2.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "name": "AÃ±o",
              "value_name": "2019",
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2019",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": null
            },
            {
              "source": 1443,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "values": [
                {
                  "struct": {
                    "number": 2000,
                    "unit": "cc"
                  },
                  "source": 1443,
                  "id": null,
                  "name": "2000 cc"
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_id": null,
              "value_name": "2000 cc",
              "value_struct": {
                "number": 2000,
                "unit": "cc"
              }
            },
            {
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_struct": null,
              "attribute_group_name": "Seguridad",
              "source": 1443,
              "value_type": "list",
              "value_id": "370879",
              "value_name": "4x2",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 29,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1072524327",
          "site_id": "MCO",
          "title": "Nissan Versa 1.6",
          "seller": {
            "id": 224662698,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_KENNEDY",
            "registration_date": "2016-08-09T15:11:48.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 35000000,
          "prices": {
            "id": "MCO1072524327",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 35000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T15:26:15Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1072524327-nissan-versa-16-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_986260-MCO52445508445_112022-I.jpg",
          "thumbnail_id": "986260-MCO52445508445_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0JPUzQwMzcw",
            "city_name": "Bosa",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Nicolas C.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkJPUzQ4MDk3",
              "name": "Bosa"
            },
            "city": {
              "id": "TUNPQ0JPUzQwMzcw",
              "name": "Bosa"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6086645,
            "longitude": -74.181335
          },
          "attributes": [
            {
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "attribute_group_id": "",
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_struct": null
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "source": 1443
            },
            {
              "id": "BRAND",
              "value_struct": null,
              "values": [
                {
                  "id": "60505",
                  "name": "Nissan",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "name": "Marca",
              "value_id": "60505",
              "value_name": "Nissan",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Puertas",
              "value_name": "4",
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "DOORS",
              "value_id": null,
              "value_struct": null,
              "source": 1443
            },
            {
              "name": "Motor",
              "value_id": null,
              "value_name": "1600",
              "source": 1443,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "ENGINE",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "1600"
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null,
              "value_type": "list",
              "value_name": "Gasolina"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "119400 km",
                  "struct": {
                    "number": 119400,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "119400 km",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 119400,
                "unit": "km"
              }
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Modelo",
              "value_id": "64402",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "64402",
                  "name": "Versa"
                }
              ],
              "source": 1443,
              "id": "MODEL",
              "value_name": "Versa",
              "value_struct": null
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370877",
                  "name": "MecÃ¡nica"
                }
              ],
              "value_id": "370877",
              "value_struct": null,
              "source": 1443,
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_struct": null,
              "values": [
                {
                  "id": "2157418",
                  "name": "1.6",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_name": "1.6",
              "source": 1443,
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_id": "2157418"
            },
            {
              "value_name": "2013",
              "value_struct": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2013",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "value_type": "number",
              "name": "AÃ±o",
              "attribute_group_id": "FIND"
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "value_struct": {
                "number": 1600,
                "unit": "cc"
              },
              "source": 1443,
              "value_type": "number_unit",
              "attribute_group_name": "Otros",
              "name": "Cilindrada",
              "value_id": null,
              "value_name": "1600 cc",
              "values": [
                {
                  "id": null,
                  "name": "1600 cc",
                  "struct": {
                    "number": 1600,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS"
            },
            {
              "attribute_group_name": "Seguridad",
              "id": "TRACTION_CONTROL",
              "value_name": "4x2",
              "value_struct": null,
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "value_type": "list",
              "name": "Control de tracciÃ³n",
              "value_id": "370879"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 30,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1072161587",
          "site_id": "MCO",
          "title": "Chevrolet Aveo Emotion",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 24800000,
          "prices": {
            "id": "MCO1072161587",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 24800000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T14:48:49Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-15T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1072161587-chevrolet-aveo-emotion-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_818720-MCO52445007257_112022-I.jpg",
          "thumbnail_id": "818720-MCO52445007257_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Luis",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlNVQjQyOTEx",
              "name": "Suba Centro"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7442074,
            "longitude": -74.08336
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list"
            },
            {
              "value_id": "242084",
              "value_name": "No",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "242084",
                  "name": "No"
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1443,
              "value_type": "boolean"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "source": 1443,
              "value_type": "boolean",
              "value_id": "242085",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort"
            },
            {
              "id": "BRAND",
              "value_id": "58955",
              "values": [
                {
                  "id": "58955",
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "name": "Marca",
              "value_name": "Chevrolet",
              "value_struct": null,
              "attribute_group_id": "FIND"
            },
            {
              "value_name": "4",
              "value_struct": null,
              "source": 1443,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "source": 1443,
              "value_type": "string",
              "name": "Motor",
              "value_name": "1.6",
              "value_struct": null,
              "values": [
                {
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "ENGINE",
              "value_id": "2164443"
            },
            {
              "value_id": "64364",
              "value_name": "Gasolina",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_struct": null,
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_name": "168454 km",
              "value_struct": {
                "number": 168454,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "source": 1443,
              "id": "KILOMETERS",
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "168454 km",
                  "struct": {
                    "number": 168454,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "name": "KilÃ³metros"
            },
            {
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "5958844",
              "value_name": "AVEO EMOTION",
              "values": [
                {
                  "id": "5958844",
                  "name": "AVEO EMOTION",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "name": "VersiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": "9418220",
                  "name": "1.6l",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "TRIM",
              "value_id": "9418220",
              "value_name": "1.6l",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "value_name": "2009",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2009",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "AÃ±o",
              "value_id": null,
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "value_struct": {
                "number": 1598,
                "unit": "cc"
              },
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "969873",
              "value_name": "1598 cc",
              "source": 1443,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "values": [
                {
                  "id": "969873",
                  "name": "1598 cc",
                  "struct": {
                    "number": 1598,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_id": null,
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "number"
            },
            {
              "value_name": "103 hp",
              "value_struct": {
                "unit": "hp",
                "number": 103
              },
              "values": [
                {
                  "id": "458887",
                  "name": "103 hp",
                  "struct": {
                    "number": 103,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_id": "458887",
              "attribute_group_id": "OTHERS"
            },
            {
              "attribute_group_name": "Seguridad",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "493979",
              "value_name": "Delantera",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "493979",
                  "name": "Delantera"
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 31,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067750562",
          "site_id": "MCO",
          "title": "Renault Logan 1.6 Dynamique",
          "seller": {
            "id": 1136754546,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_NIZA2",
            "registration_date": "2022-06-04T17:48:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 36000000,
          "prices": {
            "id": "MCO1067750562",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 36000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T22:18:21Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067750562-renault-logan-16-dynamique-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_926934-MCO52434686843_112022-I.jpg",
          "thumbnail_id": "926934-MCO52434686843_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Ana Maria Uribe",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQk5JWjQ3MDYz",
              "name": "Niza"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.705381,
            "longitude": -74.07554
          },
          "attributes": [
            {
              "attribute_group_name": "",
              "source": 1,
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_id": "",
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ]
            },
            {
              "name": "Aire acondicionado",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "source": 1443
            },
            {
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "BRAND",
              "name": "Marca",
              "value_id": "9909",
              "value_name": "Renault",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "9909",
                  "name": "Renault"
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_name": "4",
              "value_struct": null
            },
            {
              "id": "ENGINE",
              "value_struct": null,
              "value_type": "string",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "Motor",
              "value_id": "2164443",
              "value_name": "1.6",
              "values": [
                {
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_name": "Gasolina",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "list",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null
            },
            {
              "value_id": null,
              "value_name": "74000 km",
              "values": [
                {
                  "struct": {
                    "number": 74000,
                    "unit": "km"
                  },
                  "source": 1443,
                  "id": null,
                  "name": "74000 km"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_struct": {
                "unit": "km",
                "number": 74000
              },
              "attribute_group_id": "FIND",
              "source": 1443
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_struct": null,
              "values": [
                {
                  "id": "62198",
                  "name": "Logan",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "string",
              "value_id": "62198",
              "value_name": "Logan",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "attribute_group_id": "FIND",
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica"
            },
            {
              "source": 1443,
              "value_id": "2157555",
              "value_name": "1.6 Dynamique",
              "value_struct": null,
              "values": [
                {
                  "id": "2157555",
                  "name": "1.6 Dynamique",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n"
            },
            {
              "source": 1443,
              "name": "AÃ±o",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_name": "2018",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "2018",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "value_id": null
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_type": "number_unit",
              "value_id": "2326646",
              "value_name": "1.6 L",
              "value_struct": {
                "number": 1.6,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326646",
                  "name": "1.6 L",
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443
            },
            {
              "name": "Capacidad de personas",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1443,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "value_id": null,
              "value_name": "5",
              "attribute_group_name": "Otros"
            },
            {
              "value_name": "85 hp",
              "value_struct": {
                "number": 85,
                "unit": "hp"
              },
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "458565",
              "values": [
                {
                  "id": "458565",
                  "name": "85 hp",
                  "struct": {
                    "number": 85,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS"
            },
            {
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1443,
              "value_type": "list",
              "value_struct": null,
              "values": [
                {
                  "name": "Delantera",
                  "struct": null,
                  "source": 1443,
                  "id": "493979"
                }
              ],
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "493979",
              "value_name": "Delantera"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 32,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067858151",
          "site_id": "MCO",
          "title": "Toyota Fortuner ",
          "seller": {
            "id": 1239899270,
            "permalink": "http://perfil.mercadolibre.com.co/RDA6727333",
            "registration_date": "2022-11-15T18:01:30.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 104500000,
          "prices": {
            "id": "MCO1067858151",
            "prices": [
              {
                "id": "2",
                "type": "standard",
                "amount": 104500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-17T17:58:48Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [
              {
                "id": "3",
                "type": "min_standard",
                "conditions": {
                  "context_restrictions": [
                    "channel_marketplace"
                  ],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "amount": 1.045E8,
                "currency_id": "COP",
                "exchange_rate_context": "DEFAULT",
                "tags": [],
                "last_updated": "2022-11-17T17:58:56Z"
              }
            ],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:01:54.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067858151-toyota-fortuner-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_847106-MCO52434599636_112022-I.jpg",
          "thumbnail_id": "847106-MCO52434599636_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0ZPTjcyNzAz",
            "city_name": "FontibÃ³n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ0ZPTjcyNzAz",
              "name": "FontibÃ³n"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "DANIEL R.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TVhYWm9uYSBGcmFuY2FUVU5QUTBaUFRqY3lOe",
              "name": "Zona Franca"
            },
            "city": {
              "id": "TUNPQ0ZPTjcyNzAz",
              "name": "FontibÃ³n"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6700993,
            "longitude": -74.15776
          },
          "attributes": [
            {
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_name": ""
            },
            {
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "value_struct": null,
              "value_name": "SÃ­",
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "242085",
                  "name": "SÃ­"
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "name": "Ãšnico dueÃ±o",
              "value_id": "242085"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "CONFORT",
              "value_type": "boolean",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "source": 1073977811386678
            },
            {
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "string",
              "value_id": "60297",
              "value_name": "Toyota",
              "values": [
                {
                  "id": "60297",
                  "name": "Toyota",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "BRAND",
              "name": "Marca"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "DOORS",
              "name": "Puertas",
              "value_name": "5",
              "source": 1073977811386678,
              "value_type": "number",
              "value_id": "60252",
              "value_struct": null,
              "values": [
                {
                  "id": "60252",
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ]
            },
            {
              "name": "Motor",
              "value_id": "459208",
              "value_struct": null,
              "values": [
                {
                  "id": "459208",
                  "name": "2.7",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "id": "ENGINE",
              "value_name": "2.7",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "list",
              "value_id": "64364",
              "value_name": "Gasolina",
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "64364"
                }
              ]
            },
            {
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 82050,
                "unit": "km"
              },
              "values": [
                {
                  "source": 1073977811386678,
                  "id": null,
                  "name": "82050 km",
                  "struct": {
                    "number": 82050,
                    "unit": "km"
                  }
                }
              ],
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "82050 km",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_type": "string",
              "value_id": "2318140",
              "value_name": "Fortuner",
              "values": [
                {
                  "name": "Fortuner",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "2318140"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "MODEL",
              "name": "Modelo",
              "value_struct": null,
              "source": 1073977811386678
            },
            {
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "source": 1073977811386678
            },
            {
              "values": [
                {
                  "id": "9741786",
                  "name": "2.7l 4x2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "VersiÃ³n",
              "value_struct": null,
              "value_name": "2.7l 4x2",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "TRIM",
              "value_id": "9741786"
            },
            {
              "id": "VEHICLE_YEAR",
              "source": 1073977811386678,
              "value_type": "number",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "AÃ±o",
              "value_id": "436662",
              "value_name": "2013",
              "value_struct": null,
              "values": [
                {
                  "name": "2013",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "436662"
                }
              ]
            },
            {
              "source": 1073977811386678,
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_name": "2.7 L",
              "value_struct": {
                "number": 2.7,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326616",
                  "name": "2.7 L",
                  "struct": {
                    "number": 2.7,
                    "unit": "L"
                  },
                  "source": 1073977811386678
                }
              ],
              "value_id": "2326616",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "458562",
                  "name": "5"
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "source": 1073977811386678,
              "value_id": "458562",
              "attribute_group_name": "Otros"
            },
            {
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "POWER",
              "value_name": "158 hp",
              "values": [
                {
                  "name": "158 hp",
                  "struct": {
                    "number": 158,
                    "unit": "hp"
                  },
                  "source": 1073977811386678,
                  "id": "459937"
                }
              ],
              "value_type": "number_unit",
              "name": "Potencia",
              "value_id": "459937",
              "value_struct": {
                "unit": "hp",
                "number": 158
              }
            },
            {
              "id": "TRACTION_CONTROL",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "value_name": "4x2",
              "value_struct": null
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17067041",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 33,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067875989",
          "site_id": "MCO",
          "title": "Nissan D22/np300 2012",
          "seller": {
            "id": 1239898277,
            "permalink": "http://perfil.mercadolibre.com.co/CAN5131392",
            "registration_date": "2022-11-15T18:00:52.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 55000000,
          "prices": {
            "id": "MCO1067875989",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 55000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T22:01:20Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:01:51.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067875989-nissan-d22np300-2012-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_605181-MCO52434623287_112022-I.jpg",
          "thumbnail_id": "605181-MCO52434623287_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0NBTjU1NTU5",
            "city_name": "La Candelaria",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ0NBTjU1NTU5",
              "name": "La Candelaria"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Anderson C.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNBTjI2MzI5",
              "name": "Candelaria"
            },
            "city": {
              "id": "TUNPQ0NBTjU1NTU5",
              "name": "La Candelaria"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.595587,
            "longitude": -74.0726
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_struct": null,
              "attribute_group_id": "",
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION"
            },
            {
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_id": "242084",
              "value_name": "No",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "source": 1073977811386678,
              "values": [
                {
                  "id": "242084",
                  "name": "No",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "CaracterÃ­sticas generales",
              "value_type": "boolean"
            },
            {
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "242085",
                  "name": "SÃ­"
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "value_id": "242085"
            },
            {
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "60505",
              "value_struct": null,
              "value_name": "Nissan",
              "values": [
                {
                  "name": "Nissan",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "60505"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "id": "DOORS",
              "name": "Puertas",
              "value_name": "2",
              "value_struct": null,
              "values": [
                {
                  "name": "2",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "60258"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "value_id": "60258",
              "attribute_group_id": "FIND",
              "source": 1073977811386678
            },
            {
              "value_type": "string",
              "id": "ENGINE",
              "values": [
                {
                  "id": "2164465",
                  "name": "2.4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_name": "2.4",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "name": "Motor",
              "value_id": "2164465"
            },
            {
              "attribute_group_id": "FIND",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "372590",
              "value_name": "Gasolina y gas",
              "value_type": "list",
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "372590",
                  "name": "Gasolina y gas",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "value_name": "102211 km",
              "value_struct": {
                "number": 102211,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_id": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": null,
                  "name": "102211 km",
                  "struct": {
                    "number": 102211,
                    "unit": "km"
                  }
                }
              ]
            },
            {
              "value_name": "Frontier",
              "values": [
                {
                  "id": "61198",
                  "name": "Frontier",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "61198",
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "id": "TRANSMISSION",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null
            },
            {
              "name": "VersiÃ³n",
              "value_name": "2.4 Ax D22",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "TRIM",
              "value_id": "10936667",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "10936667",
                  "name": "2.4 Ax D22",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": "436707",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "value_name": "2012",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "436707",
                  "name": "2012",
                  "struct": null
                }
              ],
              "source": 1073977811386678
            },
            {
              "value_struct": {
                "number": 2389,
                "unit": "cc"
              },
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "value_name": "2389 cc",
              "values": [
                {
                  "id": "1195442",
                  "name": "2389 cc",
                  "struct": {
                    "number": 2389,
                    "unit": "cc"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Otros",
              "name": "Cilindrada",
              "value_id": "1195442"
            },
            {
              "value_type": "string",
              "name": "LÃ­nea",
              "value_struct": null,
              "values": [
                {
                  "id": "10936739",
                  "name": "d22",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "LINE",
              "value_id": "10936739",
              "value_name": "d22",
              "attribute_group_id": "OTHERS"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "458560",
                  "name": "2",
                  "struct": null
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number",
              "name": "Capacidad de personas",
              "value_id": "458560",
              "value_name": "2",
              "source": 1073977811386678
            },
            {
              "name": "Potencia",
              "value_struct": {
                "number": 150,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458589",
                  "name": "150 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 150
                  },
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "POWER",
              "value_id": "458589",
              "value_name": "150 hp",
              "attribute_group_id": "OTHERS"
            },
            {
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "370880",
              "values": [
                {
                  "id": "370880",
                  "name": "4x4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1073977811386678,
              "value_name": "4x4",
              "value_struct": null,
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17061704",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 34,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067882117",
          "site_id": "MCO",
          "title": "Mercedes Benz C 180 1.6 Turbo ",
          "seller": {
            "id": 1239889177,
            "permalink": "http://perfil.mercadolibre.com.co/CMA2607733",
            "registration_date": "2022-11-15T17:46:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 66000000,
          "prices": {
            "id": "MCO1067882117",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 66000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T21:46:21Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:01:53.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067882117-mercedes-benz-c-180-16-turbo-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_982318-MCO52434472770_112022-I.jpg",
          "thumbnail_id": "982318-MCO52434472770_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0NIQTk2OTI1",
            "city_name": "Chapinero",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ0NIQTk2OTI1",
              "name": "Chapinero"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "MAURICIO C.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNIQTY0MzE5",
              "name": "Chapinero Alto"
            },
            "city": {
              "id": "TUNPQ0NIQTk2OTI1",
              "name": "Chapinero"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.634584,
            "longitude": -74.06159
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_name": ""
            },
            {
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "boolean"
            },
            {
              "attribute_group_id": "FIND",
              "value_type": "string",
              "name": "Marca",
              "value_id": "75966",
              "value_name": "Mercedes-Benz",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "BRAND",
              "value_struct": null,
              "values": [
                {
                  "name": "Mercedes-Benz",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "75966"
                }
              ]
            },
            {
              "id": "DOORS",
              "value_id": "60241",
              "value_struct": null,
              "values": [
                {
                  "id": "60241",
                  "name": "4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "name": "Puertas",
              "value_name": "4",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number"
            },
            {
              "name": "Motor",
              "value_id": "2164443",
              "value_struct": null,
              "source": 872287608638709,
              "value_type": "string",
              "id": "ENGINE",
              "value_name": "1.6",
              "values": [
                {
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null,
                  "source": 872287608638709
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "source": 1073977811386678,
              "id": "FUEL_TYPE",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "list",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina"
            },
            {
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "78500 km",
              "value_struct": {
                "unit": "km",
                "number": 78500
              },
              "values": [
                {
                  "name": "78500 km",
                  "struct": {
                    "number": 78500,
                    "unit": "km"
                  },
                  "source": 872287608638709,
                  "id": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "attribute_group_id": "FIND",
              "source": 872287608638709
            },
            {
              "id": "MODEL",
              "attribute_group_id": "FIND",
              "value_type": "string",
              "name": "Modelo",
              "value_id": "503625",
              "value_name": "Clase C",
              "value_struct": null,
              "values": [
                {
                  "id": "503625",
                  "name": "Clase C",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "value_struct": null,
              "name": "TransmisiÃ³n",
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "source": 1073977811386678,
              "id": "TRANSMISSION"
            },
            {
              "value_type": "string",
              "name": "VersiÃ³n",
              "source": 872287608638709,
              "value_name": "1.6 Cgi Blueefficiency",
              "value_struct": null,
              "values": [
                {
                  "id": "9733098",
                  "name": "1.6 Cgi Blueefficiency",
                  "struct": null,
                  "source": 872287608638709
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "value_id": "9733098"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": "423566",
              "name": "AÃ±o",
              "value_name": "2014",
              "values": [
                {
                  "id": "423566",
                  "name": "2014",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "number",
              "id": "VEHICLE_YEAR"
            },
            {
              "value_id": null,
              "value_name": "1.6 L",
              "value_struct": {
                "unit": "L",
                "number": 1.6
              },
              "values": [
                {
                  "name": "1.6 L",
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 872287608638709,
                  "id": null
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 872287608638709,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada"
            },
            {
              "value_name": "5",
              "values": [
                {
                  "id": "458562",
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": "458562",
              "value_struct": null,
              "value_type": "number"
            },
            {
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "POWER",
              "name": "Potencia",
              "attribute_group_id": "OTHERS",
              "values": [
                {
                  "id": "459072",
                  "name": "204 hp",
                  "struct": {
                    "number": 204,
                    "unit": "hp"
                  },
                  "source": 1073977811386678
                }
              ],
              "value_type": "number_unit",
              "value_id": "459072",
              "value_name": "204 hp",
              "value_struct": {
                "number": 204,
                "unit": "hp"
              }
            },
            {
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "493980",
              "value_name": "Trasera",
              "attribute_group_id": "SECURITY",
              "source": 1073977811386678,
              "value_struct": null,
              "values": [
                {
                  "id": "493980",
                  "name": "Trasera",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17058670",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 35,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067851412",
          "site_id": "MCO",
          "title": "Wolkswagen Jetta 2.0 Europa",
          "seller": {
            "id": 1136754546,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_NIZA2",
            "registration_date": "2022-06-04T17:48:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 43000000,
          "prices": {
            "id": "MCO1067851412",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 43000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T21:45:42Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067851412-wolkswagen-jetta-20-europa-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_830930-MCO52434274953_112022-I.jpg",
          "thumbnail_id": "830930-MCO52434274953_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Yesid Buitrgo",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkdSQTkwNDYx",
              "name": "Gratamira"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.72751,
            "longitude": -74.07472
          },
          "attributes": [
            {
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "attribute_group_id": "",
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "value_struct": null,
              "source": 1,
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "attribute_group_name": ""
            },
            {
              "value_id": "242085",
              "value_struct": null,
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443,
              "value_type": "boolean",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ]
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "60249",
                  "name": "Volkswagen",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "string",
              "name": "Marca",
              "value_id": "60249",
              "value_name": "Volkswagen",
              "source": 1443,
              "id": "BRAND",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1443
                }
              ],
              "id": "DOORS",
              "value_id": null,
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "name": "Puertas",
              "value_name": "4",
              "attribute_group_id": "FIND"
            },
            {
              "source": 1443,
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "423563",
              "value_name": "2.0",
              "values": [
                {
                  "id": "423563",
                  "name": "2.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443,
                  "id": "64364"
                }
              ],
              "source": 1443,
              "value_type": "list",
              "value_id": "64364",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 47810,
                "unit": "km"
              },
              "values": [
                {
                  "name": "47810 km",
                  "struct": {
                    "number": 47810,
                    "unit": "km"
                  },
                  "source": 1443,
                  "id": null
                }
              ],
              "source": 1443,
              "id": "KILOMETERS",
              "value_id": null,
              "value_name": "47810 km",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit"
            },
            {
              "name": "Modelo",
              "value_name": "Jetta",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "value_id": "60567",
              "values": [
                {
                  "id": "60567",
                  "name": "Jetta",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "id": "TRANSMISSION",
              "attribute_group_name": "Ficha tÃ©cnica",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370876",
                  "name": "AutomÃ¡tica"
                }
              ]
            },
            {
              "value_type": "string",
              "id": "TRIM",
              "value_id": "9733821",
              "value_name": "2.0 Europa",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "VersiÃ³n",
              "value_struct": null,
              "values": [
                {
                  "id": "9733821",
                  "name": "2.0 Europa",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "2015",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": null,
              "value_name": "2015"
            },
            {
              "values": [
                {
                  "id": "2326622",
                  "name": "2 L",
                  "struct": {
                    "number": 2,
                    "unit": "L"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_name": "2 L",
              "value_struct": {
                "number": 2,
                "unit": "L"
              },
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326622"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "10566172",
                  "name": "v",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "string",
              "id": "LINE",
              "name": "LÃ­nea",
              "value_id": "10566172",
              "value_name": "v",
              "attribute_group_name": "Otros",
              "source": 1443
            },
            {
              "value_name": "5",
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "5",
                  "struct": null
                }
              ],
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": null,
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number"
            },
            {
              "value_struct": {
                "number": 114,
                "unit": "hp"
              },
              "source": 1443,
              "id": "POWER",
              "name": "Potencia",
              "values": [
                {
                  "id": "460401",
                  "name": "114 hp",
                  "struct": {
                    "number": 114,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "value_id": "460401",
              "value_name": "114 hp"
            },
            {
              "name": "Control de tracciÃ³n",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "493979",
                  "name": "Delantera"
                }
              ],
              "source": 1443,
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "value_name": "Delantera",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "value_id": "493979"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 36,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067750072",
          "site_id": "MCO",
          "title": "Ram 700 Big Horn Crew Cab Mt ",
          "seller": {
            "id": 1239882659,
            "permalink": "http://perfil.mercadolibre.com.co/PAD750437",
            "registration_date": "2022-11-15T17:41:56.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 77500000,
          "prices": {
            "id": "MCO1067750072",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 77500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T21:41:59Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:04.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067750072-ram-700-big-horn-crew-cab-mt-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_876643-MCO52433805163_112022-I.jpg",
          "thumbnail_id": "876643-MCO52433805163_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0VORzkzMTUz",
            "city_name": "Engativa",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ0VORzkzMTUz",
              "name": "EngativÃ¡"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "ADOLFO P.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQk5PUjE1NzAx",
              "name": "NormandÃ­a"
            },
            "city": {
              "id": "TUNPQ0VORzkzMTUz",
              "name": "Engativa"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.669268,
            "longitude": -74.105644
          },
          "attributes": [
            {
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "attribute_group_id": "",
              "value_type": "list",
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado"
            },
            {
              "name": "Ãšnico dueÃ±o",
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "242085"
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_name": "CaracterÃ­sticas generales"
            },
            {
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_struct": null,
              "source": 1073977811386678,
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "attribute_group_id": "CONFORT"
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "value_id": "66708",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_name": "Dodge",
              "value_struct": null,
              "values": [
                {
                  "id": "66708",
                  "name": "Dodge",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "value_id": null,
              "value_name": "4",
              "values": [
                {
                  "id": null,
                  "name": "4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "name": "Puertas",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "id": "DOORS"
            },
            {
              "value_id": "64364",
              "value_name": "Gasolina",
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_type": "list",
              "value_struct": null,
              "source": 1073977811386678
            },
            {
              "value_name": "12300 km",
              "values": [
                {
                  "id": null,
                  "name": "12300 km",
                  "struct": {
                    "number": 12300,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 12300,
                "unit": "km"
              }
            },
            {
              "id": "MODEL",
              "value_name": "Ram",
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "75044",
                  "name": "Ram"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "name": "Modelo",
              "value_id": "75044",
              "value_struct": null,
              "attribute_group_id": "FIND"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370877",
                  "name": "MecÃ¡nica"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "id": "TRANSMISSION",
              "value_type": "list"
            },
            {
              "name": "VersiÃ³n",
              "value_id": null,
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "value_name": "BIG HORN CREW CAB MT 1.4",
              "values": [
                {
                  "id": null,
                  "name": "BIG HORN CREW CAB MT 1.4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": null,
              "value_name": "2022",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": null,
                  "name": "2022",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o"
            },
            {
              "name": "Cilindrada",
              "value_name": "1400 cc",
              "value_struct": {
                "unit": "cc",
                "number": 1400
              },
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": null,
              "values": [
                {
                  "struct": {
                    "number": 1400,
                    "unit": "cc"
                  },
                  "source": 1073977811386678,
                  "id": null,
                  "name": "1400 cc"
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 37,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067875616",
          "site_id": "MCO",
          "title": "Kia Cerato Pro Sx 2018",
          "seller": {
            "id": 1239883156,
            "permalink": "http://perfil.mercadolibre.com.co/TMA3956374",
            "registration_date": "2022-11-15T17:36:32.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 65000000,
          "prices": {
            "id": "MCO1067875616",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 65000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T21:36:37Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:04.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067875616-kia-cerato-pro-sx-2018-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_702026-MCO52434455262_112022-I.jpg",
          "thumbnail_id": "702026-MCO52434455262_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1JBRjkyNTA2",
            "city_name": "Rafael Uribe Uribe",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1JBRjkyNTA2",
              "name": "Rafael Uribe Uribe"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Mabel T.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkhPUzM2NDg3",
              "name": "Hospital San Carlos"
            },
            "city": {
              "id": "TUNPQ1JBRjkyNTA2",
              "name": "Rafael Uribe Uribe"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5720077,
            "longitude": -74.106346
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "source": 1,
              "name": "CondiciÃ³n del Ã­tem"
            },
            {
              "attribute_group_id": "ADICIONALES",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_id": "242084",
              "value_name": "No",
              "value_struct": null,
              "values": [
                {
                  "id": "242084",
                  "name": "No",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1073977811386678,
              "value_type": "boolean"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "242085"
                }
              ],
              "attribute_group_id": "CONFORT",
              "value_type": "boolean",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "source": 1073977811386678
            },
            {
              "name": "Marca",
              "value_id": "374002",
              "value_name": "Kia",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "BRAND",
              "value_struct": null,
              "values": [
                {
                  "id": "374002",
                  "name": "Kia",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "DOORS",
              "value_id": "60241",
              "value_name": "4",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number",
              "name": "Puertas",
              "value_struct": null,
              "values": [
                {
                  "id": "60241",
                  "name": "4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "2164443",
                  "name": "1.6"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "id": "ENGINE",
              "value_name": "1.6",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Motor",
              "value_id": "2164443"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "52821 km",
                  "struct": {
                    "number": 52821,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 52821,
                "unit": "km"
              },
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "value_id": null,
              "value_name": "52821 km"
            },
            {
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "MODEL",
              "values": [
                {
                  "id": "5958935",
                  "name": "CERATO PRO",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_name": "CERATO PRO",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Modelo",
              "value_id": "5958935"
            },
            {
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_struct": null
            },
            {
              "name": "VersiÃ³n",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "value_id": "9418220",
              "value_name": "1.6l",
              "values": [
                {
                  "id": "9418220",
                  "name": "1.6l",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": "460382",
              "values": [
                {
                  "id": "460382",
                  "name": "2018",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "number",
              "value_name": "2018",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326646",
              "value_name": "1.6 L",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "value_struct": {
                "number": 1.6,
                "unit": "L"
              },
              "values": [
                {
                  "id": "2326646",
                  "name": "1.6 L",
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678
            },
            {
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "458562",
                  "name": "5",
                  "struct": null
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": "458562",
              "value_name": "5"
            },
            {
              "value_id": "458640",
              "value_struct": {
                "number": 128,
                "unit": "hp"
              },
              "source": 1073977811386678,
              "id": "POWER",
              "name": "Potencia",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "value_name": "128 hp",
              "values": [
                {
                  "id": "458640",
                  "name": "128 hp",
                  "struct": {
                    "number": 128,
                    "unit": "hp"
                  },
                  "source": 1073977811386678
                }
              ]
            },
            {
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null
                }
              ],
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "name": "Control de tracciÃ³n",
              "value_id": "493979",
              "value_name": "Delantera",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "value_type": "list",
              "id": "TRACTION_CONTROL"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17054695",
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 38,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067863998",
          "site_id": "MCO",
          "title": "Peugeot 5008",
          "seller": {
            "id": 1239865096,
            "permalink": "http://perfil.mercadolibre.com.co/OJU8259407",
            "registration_date": "2022-11-15T17:12:43.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 119900000,
          "prices": {
            "id": "MCO1067863998",
            "prices": [
              {
                "id": "2",
                "type": "standard",
                "amount": 119900000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T13:41:54Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [
              {
                "id": "3",
                "type": "min_standard",
                "conditions": {
                  "context_restrictions": [
                    "channel_marketplace"
                  ],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "amount": 1.199E8,
                "currency_id": "COP",
                "exchange_rate_context": "DEFAULT",
                "tags": [],
                "last_updated": "2022-11-16T13:41:58Z"
              }
            ],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:06.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067863998-peugeot-5008-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_854594-MCO52434265134_112022-I.jpg",
          "thumbnail_id": "854594-MCO52434265134_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0tFTjQyODYy",
            "city_name": "Kennedy",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "JULIAN O.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlZJTDU1MjAz",
              "name": "Villa Alsacia"
            },
            "city": {
              "id": "TUNPQ0tFTjQyODYy",
              "name": "Kennedy"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.6444244,
            "longitude": -74.13721
          },
          "attributes": [
            {
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "source": 1,
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581"
            },
            {
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_id": "242085",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "CONFORT"
            },
            {
              "values": [
                {
                  "id": "60279",
                  "name": "Peugeot",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "60279",
              "value_name": "Peugeot"
            },
            {
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "60252"
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "name": "Puertas",
              "value_struct": null,
              "value_name": "5",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "DOORS",
              "value_id": "60252"
            },
            {
              "name": "Motor",
              "value_id": "2164443",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "2164443",
                  "name": "1.6"
                }
              ],
              "value_type": "string",
              "id": "ENGINE",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_name": "1.6"
            },
            {
              "value_id": "64364",
              "value_name": "Gasolina",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "list"
            },
            {
              "name": "KilÃ³metros",
              "value_id": null,
              "value_name": "55000 km",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "KILOMETERS",
              "value_struct": {
                "number": 55000,
                "unit": "km"
              },
              "values": [
                {
                  "name": "55000 km",
                  "struct": {
                    "number": 55000,
                    "unit": "km"
                  },
                  "source": 1073977811386678,
                  "id": null
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number_unit"
            },
            {
              "name": "Modelo",
              "value_name": "5008",
              "value_struct": null,
              "values": [
                {
                  "id": "9857",
                  "name": "5008",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "string",
              "id": "MODEL",
              "value_id": "9857",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "list",
              "value_id": "370876",
              "value_name": "AutomÃ¡tica"
            },
            {
              "value_name": "1.6 Allure",
              "value_struct": null,
              "values": [
                {
                  "id": "2157571",
                  "name": "1.6 Allure",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_id": "2157571",
              "attribute_group_id": "FIND"
            },
            {
              "value_id": "2451646",
              "values": [
                {
                  "id": "2451646",
                  "name": "2019",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "number",
              "source": 1073977811386678,
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2019",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_name": "1.6 L",
              "value_struct": {
                "number": 1.6,
                "unit": "L"
              },
              "values": [
                {
                  "struct": {
                    "number": 1.6,
                    "unit": "L"
                  },
                  "source": 1073977811386678,
                  "id": "2326646",
                  "name": "1.6 L"
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "2326646",
              "attribute_group_id": "OTHERS"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": "458562",
              "value_struct": null,
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "458562"
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number",
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678
            },
            {
              "id": "POWER",
              "value_name": "165 hp",
              "value_struct": {
                "number": 165,
                "unit": "hp"
              },
              "values": [
                {
                  "name": "165 hp",
                  "struct": {
                    "number": 165,
                    "unit": "hp"
                  },
                  "source": 1073977811386678,
                  "id": "458835"
                }
              ],
              "attribute_group_name": "Otros",
              "name": "Potencia",
              "value_id": "458835",
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "value_type": "number_unit"
            },
            {
              "attribute_group_id": "SECURITY",
              "source": 1073977811386678,
              "value_id": "370880",
              "value_name": "4x4",
              "value_struct": null,
              "values": [
                {
                  "id": "370880",
                  "name": "4x4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "attribute_group_name": "Seguridad",
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17063717",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 39,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067844312",
          "site_id": "MCO",
          "title": "Audi Q7 3.0 T",
          "seller": {
            "id": 1136754546,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_NIZA2",
            "registration_date": "2022-06-04T17:48:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 95000000,
          "prices": {
            "id": "MCO1067844312",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 95000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T21:13:44Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067844312-audi-q7-30-t-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_771972-MLA52475733442_112022-I.jpg",
          "thumbnail_id": "771972-MLA52475733442_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Alejandro Rodrigez",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlBPTjg5NjYx",
              "name": "Pontevedra"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7010636,
            "longitude": -74.07774
          },
          "attributes": [
            {
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "source": 1,
              "value_type": "list",
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "values": [
                {
                  "source": 1443,
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443
            },
            {
              "values": [
                {
                  "id": "40661",
                  "name": "Audi",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "BRAND",
              "value_id": "40661",
              "value_name": "Audi",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Marca"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "value_name": "5",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "5"
                }
              ],
              "source": 1443
            },
            {
              "id": "ENGINE",
              "value_id": "2164458",
              "value_struct": null,
              "values": [
                {
                  "id": "2164458",
                  "name": "3.0",
                  "struct": null,
                  "source": 1443
                }
              ],
              "value_type": "string",
              "name": "Motor",
              "value_name": "3.0",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "KilÃ³metros",
              "value_name": "99300 km",
              "value_struct": {
                "number": 99300,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "99300 km",
                  "struct": {
                    "number": 99300,
                    "unit": "km"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "Q7",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string",
              "id": "MODEL",
              "value_id": "15698",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "15698",
                  "name": "Q7"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "Modelo",
              "value_struct": null
            },
            {
              "attribute_group_id": "FIND",
              "source": 1443,
              "name": "TransmisiÃ³n",
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370876",
                  "name": "AutomÃ¡tica"
                }
              ],
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_id": "370876"
            },
            {
              "id": "TRIM",
              "name": "VersiÃ³n",
              "values": [
                {
                  "id": "9741399",
                  "name": "V6 3.0 Tfsi Quattro",
                  "struct": null,
                  "source": 1443
                }
              ],
              "source": 1443,
              "value_type": "string",
              "value_id": "9741399",
              "value_name": "V6 3.0 Tfsi Quattro",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "value_id": null,
              "values": [
                {
                  "name": "2013",
                  "struct": null,
                  "source": 1443,
                  "id": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "AÃ±o",
              "value_name": "2013",
              "value_struct": null
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "969862",
              "value_struct": {
                "unit": "cc",
                "number": 2995
              },
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_name": "2995 cc",
              "values": [
                {
                  "id": "969862",
                  "name": "2995 cc",
                  "struct": {
                    "number": 2995,
                    "unit": "cc"
                  },
                  "source": 1443
                }
              ]
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": null,
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number"
            },
            {
              "id": "POWER",
              "name": "Potencia",
              "value_id": "458775",
              "attribute_group_name": "Otros",
              "source": 1443,
              "value_name": "272 hp",
              "value_struct": {
                "number": 272,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458775",
                  "name": "272 hp",
                  "struct": {
                    "number": 272,
                    "unit": "hp"
                  },
                  "source": 1443
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit"
            },
            {
              "value_name": "4x4",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": "370880",
                  "name": "4x4"
                }
              ],
              "attribute_group_id": "SECURITY",
              "source": 1443,
              "value_type": "list",
              "value_id": "370880",
              "name": "Control de tracciÃ³n",
              "attribute_group_name": "Seguridad",
              "id": "TRACTION_CONTROL"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 40,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067843874",
          "site_id": "MCO",
          "title": "Toyota Fortuner 2013",
          "seller": {
            "id": 1239850058,
            "permalink": "http://perfil.mercadolibre.com.co/GFA6285139",
            "registration_date": "2022-11-15T16:52:41.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 86000000,
          "prices": {
            "id": "MCO1067843874",
            "prices": [
              {
                "id": "2",
                "type": "standard",
                "amount": 86000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-16T20:51:23Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [
              {
                "id": "3",
                "type": "min_standard",
                "conditions": {
                  "context_restrictions": [
                    "channel_marketplace"
                  ],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "amount": 8.6E7,
                "currency_id": "COP",
                "exchange_rate_context": "DEFAULT",
                "tags": [],
                "last_updated": "2022-11-16T21:59:56Z"
              }
            ],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:04.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067843874-toyota-fortuner-2013-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_808115-MCO52434074569_112022-I.jpg",
          "thumbnail_id": "808115-MCO52434074569_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1VTQTY3MTQ1",
            "city_name": "UsaquÃ©n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "FABIO  GUZMAN",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNFRDEzNzQw",
              "name": "Cedritos"
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7251363,
            "longitude": -74.03956
          },
          "attributes": [
            {
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "value_struct": null,
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "value_name": "Usado"
            },
            {
              "value_id": "242085",
              "value_struct": null,
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1073977811386678
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Toyota",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_id": "60297",
              "values": [
                {
                  "name": "Toyota",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "60297"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "source": 1073977811386678,
              "value_type": "number",
              "name": "Puertas",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "values": [
                {
                  "id": "60252",
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "DOORS",
              "value_id": "60252",
              "value_name": "5"
            },
            {
              "values": [
                {
                  "id": "459208",
                  "name": "2.7",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "string",
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "459208",
              "value_name": "2.7",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "source": 1073977811386678,
              "value_type": "list",
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "value_struct": null,
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "64364"
                }
              ]
            },
            {
              "values": [
                {
                  "source": 1073977811386678,
                  "id": null,
                  "name": "90000 km",
                  "struct": {
                    "number": 90000,
                    "unit": "km"
                  }
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_name": "90000 km",
              "value_struct": {
                "number": 90000,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "name": "KilÃ³metros",
              "value_id": null
            },
            {
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string",
              "value_id": "2318140",
              "value_name": "Fortuner",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "MODEL",
              "name": "Modelo",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "2318140",
                  "name": "Fortuner",
                  "struct": null
                }
              ]
            },
            {
              "value_id": "370876",
              "value_name": "AutomÃ¡tica",
              "value_struct": null,
              "values": [
                {
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370876"
                }
              ],
              "source": 1073977811386678,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "VersiÃ³n",
              "value_id": "9741786",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "TRIM",
              "value_name": "2.7l 4x2",
              "values": [
                {
                  "id": "9741786",
                  "name": "2.7l 4x2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "string"
            },
            {
              "value_struct": null,
              "values": [
                {
                  "name": "2013",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "436662"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number",
              "value_id": "436662",
              "value_name": "2013",
              "attribute_group_id": "FIND",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o"
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "value_struct": {
                "number": 2.7,
                "unit": "L"
              },
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_id": "2326616",
              "value_name": "2.7 L",
              "values": [
                {
                  "name": "2.7 L",
                  "struct": {
                    "number": 2.7,
                    "unit": "L"
                  },
                  "source": 1073977811386678,
                  "id": "2326616"
                }
              ],
              "attribute_group_id": "OTHERS"
            },
            {
              "name": "Capacidad de personas",
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "458562",
                  "name": "5",
                  "struct": null
                }
              ],
              "source": 1073977811386678,
              "id": "PASSENGER_CAPACITY",
              "value_id": "458562",
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number"
            },
            {
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "id": "POWER",
              "name": "Potencia",
              "value_id": "459937",
              "value_name": "158 hp",
              "value_struct": {
                "number": 158,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "459937",
                  "name": "158 hp",
                  "struct": {
                    "number": 158,
                    "unit": "hp"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "value_name": "4x2",
              "value_struct": null,
              "attribute_group_id": "SECURITY"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17067041",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 41,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067868896",
          "site_id": "MCO",
          "title": "Chevrolet Aveo Emotion 2011",
          "seller": {
            "id": 1239842977,
            "permalink": "http://perfil.mercadolibre.com.co/MJU4177237",
            "registration_date": "2022-11-15T16:43:01.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 32000000,
          "prices": {
            "id": "MCO1067868896",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 32000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T20:43:20Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:01:55.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067868896-chevrolet-aveo-emotion-2011-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_657261-MCO52434038425_112022-I.jpg",
          "thumbnail_id": "657261-MCO52434038425_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1VTQTY3MTQ1",
            "city_name": "UsaquÃ©n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "JUAN  MACEA",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkxJSjk5NjM5Nw",
              "name": "LijacÃ¡"
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7636094,
            "longitude": -74.029274
          },
          "attributes": [
            {
              "id": "ITEM_CONDITION",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "value_type": "list",
              "name": "CondiciÃ³n del Ã­tem",
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1
            },
            {
              "attribute_group_id": "CONFORT",
              "source": 1073977811386678,
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Confort",
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_name": "SÃ­"
            },
            {
              "value_name": "Chevrolet",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "58955",
              "values": [
                {
                  "id": "58955",
                  "name": "Chevrolet",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "name": "Puertas",
              "value_name": "4",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "DOORS",
              "value_id": "60241",
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "60241",
                  "name": "4"
                }
              ]
            },
            {
              "value_name": "1.6",
              "values": [
                {
                  "id": "2164443",
                  "name": "1.6",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "string",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "2164443",
              "value_struct": null
            },
            {
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_name": "Gasolina",
              "attribute_group_id": "FIND",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "list"
            },
            {
              "values": [
                {
                  "struct": {
                    "number": 90884,
                    "unit": "km"
                  },
                  "source": 1073977811386678,
                  "id": null,
                  "name": "90884 km"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "name": "KilÃ³metros",
              "value_name": "90884 km",
              "value_struct": {
                "number": 90884,
                "unit": "km"
              },
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "AVEO EMOTION",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_struct": null,
              "values": [
                {
                  "name": "AVEO EMOTION",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "5958844"
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string",
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "5958844"
            },
            {
              "id": "TRANSMISSION",
              "value_struct": null,
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "attribute_group_id": "FIND",
              "source": 1073977811386678
            },
            {
              "value_id": "9418220",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_name": "1.6l",
              "values": [
                {
                  "id": "9418220",
                  "name": "1.6l",
                  "struct": null,
                  "source": 1073977811386678
                }
              ]
            },
            {
              "value_id": "436698",
              "value_name": "2011",
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "436698",
                  "name": "2011",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_type": "number"
            },
            {
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "969873",
              "value_struct": {
                "number": 1598,
                "unit": "cc"
              },
              "values": [
                {
                  "id": "969873",
                  "name": "1598 cc",
                  "struct": {
                    "number": 1598,
                    "unit": "cc"
                  },
                  "source": 1073977811386678
                }
              ],
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_name": "1598 cc",
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678
            },
            {
              "id": "PASSENGER_CAPACITY",
              "value_id": "458562",
              "value_name": "5",
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "name": "Capacidad de personas",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "458562",
                  "name": "5"
                }
              ],
              "value_type": "number"
            },
            {
              "id": "POWER",
              "value_name": "103 hp",
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit",
              "name": "Potencia",
              "value_id": "458887",
              "value_struct": {
                "number": 103,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458887",
                  "name": "103 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 103
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1073977811386678
            },
            {
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null
                }
              ],
              "attribute_group_id": "SECURITY",
              "id": "TRACTION_CONTROL",
              "value_id": "493979",
              "value_struct": null,
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "value_type": "list"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17045626",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 42,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067717520",
          "site_id": "MCO",
          "title": "Toyota Hilux 2.8 Diesel 4x4 ",
          "seller": {
            "id": 1239833297,
            "permalink": "http://perfil.mercadolibre.com.co/GJU4815802",
            "registration_date": "2022-11-15T16:31:37.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 230000000,
          "prices": {
            "id": "MCO1067717520",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 230000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T20:31:41Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:05.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067717520-toyota-hilux-28-diesel-4x4-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_615253-MCO52433819813_112022-I.jpg",
          "thumbnail_id": "615253-MCO52433819813_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "JULIAN G.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkxBMTY3ODI",
              "name": "La Colina Campestre"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.726241,
            "longitude": -74.06655
          },
          "attributes": [
            {
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "attribute_group_id": "",
              "source": 1,
              "value_id": "2230581",
              "name": "CondiciÃ³n del Ã­tem",
              "value_name": "Usado",
              "value_struct": null,
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION"
            },
            {
              "value_id": "242085",
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "value_name": "SÃ­",
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "242085"
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "name": "Ãšnico dueÃ±o"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "value_name": "SÃ­",
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678
            },
            {
              "source": 1073977811386678,
              "value_type": "string",
              "name": "Marca",
              "value_id": "60297",
              "value_name": "Toyota",
              "values": [
                {
                  "id": "60297",
                  "name": "Toyota",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "id": "BRAND",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "DOORS",
              "value_struct": null,
              "source": 1073977811386678,
              "name": "Puertas",
              "value_id": "60241",
              "value_name": "4",
              "values": [
                {
                  "id": "60241",
                  "name": "4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "ENGINE",
              "value_name": "2.8",
              "value_struct": null,
              "values": [
                {
                  "id": "2164455",
                  "name": "2.8",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "name": "Motor",
              "value_id": "2164455"
            },
            {
              "name": "Tipo de combustible",
              "value_name": "DiÃ©sel",
              "values": [
                {
                  "id": "60406",
                  "name": "DiÃ©sel",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "value_id": "60406",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 36000,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "value_id": null,
              "value_name": "36000 km",
              "values": [
                {
                  "id": null,
                  "name": "36000 km",
                  "struct": {
                    "number": 36000,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ]
            },
            {
              "id": "MODEL",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "name": "Modelo",
              "value_id": "63613",
              "value_name": "Hilux",
              "values": [
                {
                  "id": "63613",
                  "name": "Hilux",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string"
            },
            {
              "name": "TransmisiÃ³n",
              "value_name": "AutomÃ¡tica",
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_id": "370876",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "name": "VersiÃ³n",
              "value_id": "3023600",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "TRIM",
              "values": [
                {
                  "id": "3023600",
                  "name": "2.8",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_name": "2.8"
            },
            {
              "value_id": "6730991",
              "value_struct": null,
              "source": 1073977811386678,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2020",
              "values": [
                {
                  "id": "6730991",
                  "name": "2020",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_struct": {
                "number": 2.8,
                "unit": "L"
              },
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_id": "2326638",
              "value_name": "2.8 L",
              "values": [
                {
                  "name": "2.8 L",
                  "struct": {
                    "number": 2.8,
                    "unit": "L"
                  },
                  "source": 1073977811386678,
                  "id": "2326638"
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1073977811386678
            },
            {
              "value_name": "5",
              "values": [
                {
                  "id": "458562",
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number",
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_id": "458562",
              "value_struct": null,
              "source": 1073977811386678
            },
            {
              "name": "Potencia",
              "value_id": "459051",
              "value_name": "175 hp",
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "id": "POWER",
              "value_struct": {
                "number": 175,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "459051",
                  "name": "175 hp",
                  "struct": {
                    "number": 175,
                    "unit": "hp"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number_unit"
            },
            {
              "id": "TRACTION_CONTROL",
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "value_type": "list",
              "name": "Control de tracciÃ³n",
              "value_id": "370880",
              "value_name": "4x4",
              "value_struct": null,
              "values": [
                {
                  "id": "370880",
                  "name": "4x4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "SECURITY"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17067310",
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 43,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067836974",
          "site_id": "MCO",
          "title": "Toyota Prado Vx 3.4",
          "seller": {
            "id": 1239829373,
            "permalink": "http://perfil.mercadolibre.com.co/BOM541948",
            "registration_date": "2022-11-15T16:30:12.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 63500000,
          "prices": {
            "id": "MCO1067836974",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 63500000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T20:30:15Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:03.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067836974-toyota-prado-vx-34-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_827017-MCO52431088800_112022-I.jpg",
          "thumbnail_id": "827017-MCO52431088800_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ0VORzkzMTUz",
            "city_name": "Engativa",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ0VORzkzMTUz",
              "name": "EngativÃ¡"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "OMAR B.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkJPUzE5NjMw",
              "name": "Bosques De Mariana"
            },
            "city": {
              "id": "TUNPQ0VORzkzMTUz",
              "name": "Engativa"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.708737,
            "longitude": -74.12583
          },
          "attributes": [
            {
              "value_id": "2230581",
              "value_name": "Usado",
              "values": [
                {
                  "struct": null,
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado"
                }
              ],
              "value_type": "list",
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_struct": null,
              "attribute_group_id": ""
            },
            {
              "source": 1073977811386678,
              "value_type": "boolean",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_id": "242085",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ]
            },
            {
              "value_type": "boolean",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort"
            },
            {
              "value_name": "Toyota",
              "attribute_group_id": "FIND",
              "value_id": "60297",
              "name": "Marca",
              "value_struct": null,
              "values": [
                {
                  "id": "60297",
                  "name": "Toyota",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "BRAND"
            },
            {
              "value_name": "5",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "name": "Puertas",
              "value_id": "60252",
              "value_type": "number",
              "id": "DOORS",
              "values": [
                {
                  "id": "60252",
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ]
            },
            {
              "value_id": "460575",
              "value_name": "3.4",
              "value_struct": null,
              "values": [
                {
                  "id": "460575",
                  "name": "3.4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "id": "ENGINE",
              "name": "Motor",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "247585 km",
              "value_struct": {
                "number": 247585,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "247585 km",
                  "struct": {
                    "number": 247585,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "value_id": null,
              "name": "KilÃ³metros",
              "attribute_group_id": "FIND",
              "id": "KILOMETERS"
            },
            {
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "MODEL",
              "value_id": "1252924",
              "value_struct": null,
              "values": [
                {
                  "id": "1252924",
                  "name": "Prado",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "name": "Modelo",
              "value_name": "Prado",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "values": [
                {
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_id": "370877",
              "value_name": "MecÃ¡nica",
              "value_struct": null
            },
            {
              "source": 1073977811386678,
              "value_type": "string",
              "value_id": "9742014",
              "value_name": "3.4 Vx",
              "value_struct": null,
              "values": [
                {
                  "id": "9742014",
                  "name": "3.4 Vx",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "name": "VersiÃ³n"
            },
            {
              "source": 1073977811386678,
              "value_id": "436685",
              "values": [
                {
                  "id": "436685",
                  "name": "2004",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_name": "2004"
            },
            {
              "value_id": "9743594",
              "values": [
                {
                  "id": "9743594",
                  "name": "3400 cc",
                  "struct": {
                    "number": 3400,
                    "unit": "cc"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_name": "3400 cc",
              "value_struct": {
                "number": 3400,
                "unit": "cc"
              },
              "id": "ENGINE_DISPLACEMENT"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_name": "5",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_id": "458562",
              "value_struct": null,
              "values": [
                {
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "458562"
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number"
            },
            {
              "value_id": "458608",
              "value_struct": {
                "unit": "hp",
                "number": 180
              },
              "source": 1073977811386678,
              "id": "POWER",
              "value_name": "180 hp",
              "values": [
                {
                  "id": "458608",
                  "name": "180 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 180
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "name": "Potencia"
            },
            {
              "source": 1073977811386678,
              "name": "Control de tracciÃ³n",
              "value_name": "4x4",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "370880",
                  "name": "4x4",
                  "struct": null
                }
              ],
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "value_id": "370880",
              "value_struct": null,
              "attribute_group_id": "SECURITY"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17067685",
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 44,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067855543",
          "site_id": "MCO",
          "title": "Mazda Cx-30 Grand Touring 2.0 Mod 2021",
          "seller": {
            "id": 1239830173,
            "permalink": "http://perfil.mercadolibre.com.co/LOJO4050330",
            "registration_date": "2022-11-15T16:26:47.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 120000000,
          "prices": {
            "id": "MCO1067855543",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 120000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T20:26:54Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:04.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067855543-mazda-cx-30-grand-touring-20-mod-2021-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_619887-MCO52433712616_112022-I.jpg",
          "thumbnail_id": "619887-MCO52433712616_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEFOVGFiZWI3",
            "state_name": "Antioquia",
            "city_id": "TUNPQ01FRGRjNjc4",
            "city_name": "MedellÃ­n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-ANT",
              "name": "Antioquia"
            },
            "city": {
              "id": "TUNPQ01FRGRjNjc4",
              "name": "MedellÃ­n"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Jorge Lozano",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkVMUDI3MDA0Ng",
              "name": "El Poblado"
            },
            "city": {
              "id": "TUNPQ01FRGRjNjc4",
              "name": "MedellÃ­n"
            },
            "state": {
              "id": "TUNPUEFOVGFiZWI3",
              "name": "Antioquia"
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 6.213287,
            "longitude": -75.576256
          },
          "attributes": [
            {
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_struct": null,
              "attribute_group_id": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "source": 1
            },
            {
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Confort",
              "source": 1073977811386678,
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "attribute_group_id": "CONFORT",
              "value_type": "boolean",
              "name": "Aire acondicionado"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Mazda",
              "value_struct": null,
              "values": [
                {
                  "id": "66811",
                  "name": "Mazda",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "string",
              "value_id": "66811"
            },
            {
              "id": "DOORS",
              "name": "Puertas",
              "value_id": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "value_name": "5",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678
            },
            {
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "423563",
                  "name": "2.0",
                  "struct": null
                }
              ],
              "source": 1073977811386678,
              "id": "ENGINE",
              "value_id": "423563",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "name": "Motor",
              "value_name": "2.0",
              "attribute_group_id": "FIND"
            },
            {
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "attribute_group_id": "FIND",
              "source": 1073977811386678
            },
            {
              "source": 1073977811386678,
              "value_id": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_struct": {
                "number": 59440,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "59440 km",
                  "struct": {
                    "number": 59440,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ],
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_name": "59440 km"
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_id": "2113350",
              "value_name": "CX-30",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "2113350",
                  "name": "CX-30",
                  "struct": null
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_name": "AutomÃ¡tica",
              "value_id": "370876",
              "values": [
                {
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370876"
                }
              ]
            },
            {
              "source": 1073977811386678,
              "value_type": "string",
              "id": "TRIM",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "values": [
                {
                  "name": "2.0 Grand Touring",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "9734444"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "VersiÃ³n",
              "value_id": "9734444",
              "value_name": "2.0 Grand Touring"
            },
            {
              "values": [
                {
                  "id": null,
                  "name": "2021",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_id": null,
              "name": "AÃ±o",
              "value_name": "2021",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "id": "VEHICLE_YEAR"
            },
            {
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "values": [
                {
                  "id": null,
                  "name": "2000 cc",
                  "struct": {
                    "number": 2000,
                    "unit": "cc"
                  },
                  "source": 1073977811386678
                }
              ],
              "value_name": "2000 cc",
              "value_struct": {
                "number": 2000,
                "unit": "cc"
              },
              "id": "ENGINE_DISPLACEMENT",
              "value_id": null
            },
            {
              "values": [
                {
                  "id": "370879",
                  "name": "4x2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "list",
              "source": 1073977811386678,
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_id": "370879",
              "value_name": "4x2",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 45,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067836083",
          "site_id": "MCO",
          "title": "Toyota Prado Sumo 2008",
          "seller": {
            "id": 1239821498,
            "permalink": "http://perfil.mercadolibre.com.co/MMI7798193",
            "registration_date": "2022-11-15T16:19:58.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 80000000,
          "prices": {
            "id": "MCO1067836083",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 80000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T20:20:05Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:05.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067836083-toyota-prado-sumo-2008-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_639095-MCO52433805078_112022-I.jpg",
          "thumbnail_id": "639095-MCO52433805078_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1JBRjkyNTA2",
            "city_name": "Rafael Uribe Uribe",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1JBRjkyNTA2",
              "name": "Rafael Uribe Uribe"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Miguel M.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlFVSTk3MTAz",
              "name": "Quiroga Central"
            },
            "city": {
              "id": "TUNPQ1JBRjkyNTA2",
              "name": "Rafael Uribe Uribe"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.579084,
            "longitude": -74.113716
          },
          "attributes": [
            {
              "attribute_group_id": "",
              "source": 1,
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado",
              "value_struct": null,
              "values": [
                {
                  "name": "Usado",
                  "struct": null,
                  "source": 1,
                  "id": "2230581"
                }
              ],
              "attribute_group_name": ""
            },
            {
              "value_name": "No",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_id": "242084",
              "value_struct": null,
              "values": [
                {
                  "id": "242084",
                  "name": "No",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "ADICIONALES"
            },
            {
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Confort",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "CONFORT",
              "source": 1073977811386678,
              "value_type": "boolean",
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado"
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "value_id": "60297",
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "string",
              "value_name": "Toyota",
              "values": [
                {
                  "id": "60297",
                  "name": "Toyota",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "2",
              "values": [
                {
                  "id": null,
                  "name": "2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number",
              "name": "Puertas",
              "value_id": null,
              "id": "DOORS",
              "value_struct": null
            },
            {
              "values": [
                {
                  "name": "2.7",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "459208"
                }
              ],
              "value_type": "string",
              "value_name": "2.7",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "ENGINE",
              "name": "Motor",
              "value_id": "459208"
            },
            {
              "values": [
                {
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "64364"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "list",
              "value_id": "64364",
              "value_name": "Gasolina",
              "value_struct": null,
              "source": 1073977811386678,
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible"
            },
            {
              "value_id": null,
              "values": [
                {
                  "id": null,
                  "name": "149100 km",
                  "struct": {
                    "number": 149100,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_name": "149100 km",
              "value_struct": {
                "number": 149100,
                "unit": "km"
              },
              "attribute_group_id": "FIND"
            },
            {
              "id": "MODEL",
              "name": "Modelo",
              "value_name": "Prado",
              "value_struct": null,
              "values": [
                {
                  "id": "1252924",
                  "name": "Prado",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_id": "1252924",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370877",
                  "name": "MecÃ¡nica"
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "list",
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877"
            },
            {
              "value_id": "9740787",
              "value_name": "2.7 Sumo",
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "9740787",
                  "name": "2.7 Sumo",
                  "struct": null
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "value_id": "436677",
              "value_name": "2008",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "VEHICLE_YEAR",
              "values": [
                {
                  "id": "436677",
                  "name": "2008",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number",
              "name": "AÃ±o"
            },
            {
              "id": "ENGINE_DISPLACEMENT",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "9743626",
                  "name": "2700 cc",
                  "struct": {
                    "number": 2700,
                    "unit": "cc"
                  }
                }
              ],
              "attribute_group_name": "Otros",
              "value_struct": {
                "unit": "cc",
                "number": 2700
              },
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "name": "Cilindrada",
              "value_id": "9743626",
              "value_name": "2700 cc"
            },
            {
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "458562",
                  "name": "5"
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "PASSENGER_CAPACITY",
              "value_name": "5",
              "value_struct": null,
              "value_type": "number",
              "name": "Capacidad de personas",
              "value_id": "458562",
              "attribute_group_id": "OTHERS"
            },
            {
              "value_name": "150 hp",
              "source": 1073977811386678,
              "id": "POWER",
              "value_id": "458589",
              "value_struct": {
                "number": 150,
                "unit": "hp"
              },
              "values": [
                {
                  "id": "458589",
                  "name": "150 hp",
                  "struct": {
                    "number": 150,
                    "unit": "hp"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "name": "Potencia"
            },
            {
              "value_name": "4x4",
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "value_id": "370880",
              "name": "Control de tracciÃ³n",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370880",
                  "name": "4x4"
                }
              ],
              "value_type": "list",
              "id": "TRACTION_CONTROL"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17067720",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 46,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067861617",
          "site_id": "MCO",
          "title": "Renault Twingo Access 2012",
          "seller": {
            "id": 1239784171,
            "permalink": "http://perfil.mercadolibre.com.co/MOM1594069",
            "registration_date": "2022-11-15T15:25:09.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 23400000,
          "prices": {
            "id": "MCO1067861617",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 23400000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T20:09:18Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:06.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067861617-renault-twingo-access-2012-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_659749-MCO52433155653_112022-I.jpg",
          "thumbnail_id": "659749-MCO52433155653_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1JBRjkyNTA2",
            "city_name": "Rafael Uribe Uribe",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1JBRjkyNTA2",
              "name": "Rafael Uribe Uribe"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Omar M.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQlFVSTMyODQ3",
              "name": "Quiroga"
            },
            "city": {
              "id": "TUNPQ1JBRjkyNTA2",
              "name": "Rafael Uribe Uribe"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.5808687,
            "longitude": -74.11005
          },
          "attributes": [
            {
              "value_name": "Usado",
              "value_type": "list",
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_struct": null,
              "values": [
                {
                  "source": 1,
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null
                }
              ],
              "attribute_group_id": ""
            },
            {
              "name": "Ãšnico dueÃ±o",
              "value_id": "242084",
              "value_name": "No",
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "id": "SINGLE_OWNER",
              "value_struct": null,
              "values": [
                {
                  "id": "242084",
                  "name": "No",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "boolean"
            },
            {
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "boolean",
              "attribute_group_name": "Confort",
              "source": 1073977811386678,
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_struct": null,
              "attribute_group_id": "CONFORT"
            },
            {
              "id": "BRAND",
              "name": "Marca",
              "value_name": "Renault",
              "attribute_group_id": "FIND",
              "value_type": "string",
              "value_id": "9909",
              "value_struct": null,
              "values": [
                {
                  "id": "9909",
                  "name": "Renault",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "3",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "DOORS",
              "value_id": null,
              "value_name": "3",
              "value_type": "number",
              "name": "Puertas"
            },
            {
              "name": "Motor",
              "value_struct": null,
              "values": [
                {
                  "name": "1.2",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "423558"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "ENGINE",
              "value_id": "423558",
              "value_name": "1.2",
              "value_type": "string"
            },
            {
              "value_id": "64364",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 96225,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "96225 km",
                  "struct": {
                    "number": 96225,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "value_type": "number_unit",
              "value_id": null,
              "value_name": "96225 km"
            },
            {
              "value_id": "389630",
              "value_name": "Twingo",
              "values": [
                {
                  "name": "Twingo",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "389630"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "name": "Modelo",
              "value_struct": null,
              "id": "MODEL"
            },
            {
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_name": "MecÃ¡nica",
              "values": [
                {
                  "name": "MecÃ¡nica",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370877"
                }
              ],
              "value_type": "list",
              "value_id": "370877",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "value_id": "9734819",
              "value_name": "1.2 Access",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_struct": null,
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "9734819",
                  "name": "1.2 Access",
                  "struct": null
                }
              ]
            },
            {
              "id": "VEHICLE_YEAR",
              "value_id": "436707",
              "attribute_group_id": "FIND",
              "value_type": "number",
              "name": "AÃ±o",
              "value_name": "2012",
              "value_struct": null,
              "values": [
                {
                  "id": "436707",
                  "name": "2012",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "source": 1073977811386678,
              "name": "Cilindrada",
              "value_name": "1150 cc",
              "value_struct": {
                "number": 1150,
                "unit": "cc"
              },
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "id": "ENGINE_DISPLACEMENT",
              "value_id": "4581762",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "4581762",
                  "name": "1150 cc",
                  "struct": {
                    "number": 1150,
                    "unit": "cc"
                  }
                }
              ],
              "value_type": "number_unit"
            },
            {
              "id": "PASSENGER_CAPACITY",
              "value_id": "458562",
              "values": [
                {
                  "id": "458562",
                  "name": "5",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Otros",
              "value_type": "number",
              "name": "Capacidad de personas",
              "value_name": "5",
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678
            },
            {
              "name": "Potencia",
              "value_id": "458723",
              "value_name": "75 hp",
              "value_struct": {
                "number": 75,
                "unit": "hp"
              },
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "id": "POWER",
              "values": [
                {
                  "id": "458723",
                  "name": "75 hp",
                  "struct": {
                    "number": 75,
                    "unit": "hp"
                  },
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "OTHERS",
              "value_type": "number_unit"
            },
            {
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera",
              "attribute_group_id": "SECURITY",
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "value_type": "list",
              "value_id": "493979",
              "value_struct": null,
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1073977811386678
                }
              ]
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17065099",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 47,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067746450",
          "site_id": "MCO",
          "title": "Renault Clio ",
          "seller": {
            "id": 131871417,
            "permalink": "http://perfil.mercadolibre.com.co/TUC_SUBA",
            "registration_date": "2013-01-14T18:33:38.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "franchise",
              "messages_as_seller"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "60 months",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "60 months",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 34000000,
          "prices": {
            "id": "MCO1067746450",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 34000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T19:35:01Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:00.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067746450-renault-clio-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_732070-MCO52433245551_112022-I.jpg",
          "thumbnail_id": "732070-MCO52433245551_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1NVQjUzNzQ4",
            "city_name": "Suba",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "Francisco",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkVMMjQ3MTQ",
              "name": "El PÃ³rtico"
            },
            "city": {
              "id": "TUNPQ1NVQjUzNzQ4",
              "name": "Suba"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7427783,
            "longitude": -74.09227
          },
          "attributes": [
            {
              "value_struct": null,
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_id": "",
              "attribute_group_name": "",
              "value_type": "list",
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_name": "Usado",
              "source": 1
            },
            {
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1443,
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_type": "boolean",
              "name": "Aire acondicionado",
              "value_name": "SÃ­"
            },
            {
              "value_type": "string",
              "id": "BRAND",
              "name": "Marca",
              "value_id": "9909",
              "value_name": "Renault",
              "value_struct": null,
              "values": [
                {
                  "name": "Renault",
                  "struct": null,
                  "source": 1443,
                  "id": "9909"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443
            },
            {
              "id": "DOORS",
              "value_struct": null,
              "values": [
                {
                  "id": null,
                  "name": "5",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "name": "Puertas",
              "value_id": null,
              "value_name": "5",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "value_type": "number"
            },
            {
              "id": "ENGINE",
              "name": "Motor",
              "value_id": null,
              "value_name": "1200",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1443,
                  "id": null,
                  "name": "1200"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "attribute_group_id": "FIND",
              "source": 1443,
              "value_type": "string"
            },
            {
              "value_name": "Gasolina",
              "source": 1443,
              "value_type": "list",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_id": "64364",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "81473 km",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "KILOMETERS",
              "value_id": null,
              "values": [
                {
                  "source": 1443,
                  "id": null,
                  "name": "81473 km",
                  "struct": {
                    "number": 81473,
                    "unit": "km"
                  }
                }
              ],
              "value_type": "number_unit",
              "name": "KilÃ³metros",
              "value_struct": {
                "number": 81473,
                "unit": "km"
              }
            },
            {
              "value_name": "Clio",
              "values": [
                {
                  "id": "60485",
                  "name": "Clio",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "name": "Modelo",
              "value_id": "60485",
              "value_struct": null,
              "value_type": "string",
              "id": "MODEL"
            },
            {
              "value_name": "MecÃ¡nica",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1443,
              "id": "TRANSMISSION",
              "name": "TransmisiÃ³n",
              "value_id": "370877",
              "values": [
                {
                  "source": 1443,
                  "id": "370877",
                  "name": "MecÃ¡nica",
                  "struct": null
                }
              ],
              "value_type": "list"
            },
            {
              "value_name": "1.2 Style Mt",
              "value_struct": null,
              "source": 1443,
              "name": "VersiÃ³n",
              "value_id": "1199390",
              "values": [
                {
                  "id": "1199390",
                  "name": "1.2 Style Mt",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string",
              "id": "TRIM"
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number",
              "value_id": null,
              "value_name": "2016",
              "values": [
                {
                  "id": null,
                  "name": "2016",
                  "struct": null,
                  "source": 1443
                }
              ],
              "attribute_group_id": "FIND",
              "source": 1443
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": null,
          "tags": [
            "good_quality_picture",
            "moderation_penalty"
          ],
          "order_backend": 48,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067690789",
          "site_id": "MCO",
          "title": "Nissan 370z Coupe 3.7 Cabriolet ",
          "seller": {
            "id": 1239783384,
            "permalink": "http://perfil.mercadolibre.com.co/GJU9896814",
            "registration_date": "2022-11-15T15:29:07.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 199900000,
          "prices": {
            "id": "MCO1067690789",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 199900000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T19:29:10Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:00:05.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067690789-nissan-370z-coupe-37-cabriolet-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_786535-MCO52433271590_112022-I.jpg",
          "thumbnail_id": "786535-MCO52433271590_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1VTQTY3MTQ1",
            "city_name": "UsaquÃ©n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "JUAN G.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQk1VTDIyMzM5",
              "name": "Multicentro"
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.701993,
            "longitude": -74.03735
          },
          "attributes": [
            {
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION",
              "name": "CondiciÃ³n del Ã­tem",
              "value_id": "2230581",
              "value_struct": null,
              "attribute_group_id": "",
              "value_type": "list"
            },
            {
              "name": "Ãšnico dueÃ±o",
              "value_id": "242085",
              "value_name": "SÃ­",
              "value_struct": null,
              "attribute_group_id": "ADICIONALES",
              "attribute_group_name": "CaracterÃ­sticas generales",
              "id": "SINGLE_OWNER",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null
                }
              ],
              "source": 1073977811386678,
              "value_type": "boolean"
            },
            {
              "name": "Aire acondicionado",
              "value_name": "SÃ­",
              "value_struct": null,
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "CONFORT",
              "attribute_group_name": "Confort",
              "source": 1073977811386678,
              "id": "HAS_AIR_CONDITIONING",
              "value_id": "242085",
              "value_type": "boolean"
            },
            {
              "name": "Marca",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "id": "BRAND",
              "value_id": "60505",
              "value_name": "Nissan",
              "value_struct": null,
              "values": [
                {
                  "id": "60505",
                  "name": "Nissan",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "string"
            },
            {
              "values": [
                {
                  "name": "2",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "60258"
                }
              ],
              "id": "DOORS",
              "value_name": "2",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number",
              "name": "Puertas",
              "value_id": "60258"
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "attribute_group_id": "FIND",
              "name": "Motor",
              "value_id": "2164453",
              "value_name": "3.7",
              "value_struct": null,
              "values": [
                {
                  "id": "2164453",
                  "name": "3.7",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "id": "ENGINE"
            },
            {
              "id": "FUEL_TYPE",
              "value_id": "64364",
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_type": "list",
              "name": "Tipo de combustible",
              "value_name": "Gasolina",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "id": "KILOMETERS",
              "value_id": null,
              "value_struct": {
                "number": 20000,
                "unit": "km"
              },
              "attribute_group_id": "FIND",
              "name": "KilÃ³metros",
              "value_name": "20000 km",
              "values": [
                {
                  "source": 1073977811386678,
                  "id": null,
                  "name": "20000 km",
                  "struct": {
                    "number": 20000,
                    "unit": "km"
                  }
                }
              ],
              "value_type": "number_unit"
            },
            {
              "value_id": "62298",
              "value_struct": null,
              "values": [
                {
                  "id": "62298",
                  "name": "370Z",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "id": "MODEL",
              "value_name": "370Z",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "name": "Modelo"
            },
            {
              "value_struct": null,
              "source": 1073977811386678,
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_name": "AutomÃ¡tica",
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "370876",
                  "name": "AutomÃ¡tica"
                }
              ],
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "name": "TransmisiÃ³n",
              "value_id": "370876"
            },
            {
              "value_struct": null,
              "attribute_group_id": "FIND",
              "id": "TRIM",
              "name": "VersiÃ³n",
              "value_name": "3.7 Coupe",
              "source": 1073977811386678,
              "value_type": "string",
              "value_id": "9733548",
              "values": [
                {
                  "name": "3.7 Coupe",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "9733548"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "source": 1073977811386678,
              "value_type": "number",
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_struct": null,
              "values": [
                {
                  "id": "436698",
                  "name": "2011",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_id": "436698",
              "value_name": "2011",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "name": "Cilindrada",
              "value_name": "3696 cc",
              "value_id": "1028169",
              "value_struct": {
                "number": 3696,
                "unit": "cc"
              },
              "values": [
                {
                  "id": "1028169",
                  "name": "3696 cc",
                  "struct": {
                    "number": 3696,
                    "unit": "cc"
                  },
                  "source": 1073977811386678
                }
              ]
            },
            {
              "id": "PASSENGER_CAPACITY",
              "value_name": "2",
              "values": [
                {
                  "id": "458560",
                  "name": "2",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "name": "Capacidad de personas",
              "value_id": "458560",
              "value_struct": null,
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_type": "number"
            },
            {
              "name": "Potencia",
              "value_id": "1025933",
              "value_name": "332 hp",
              "value_struct": {
                "number": 332,
                "unit": "hp"
              },
              "attribute_group_id": "OTHERS",
              "id": "POWER",
              "values": [
                {
                  "name": "332 hp",
                  "struct": {
                    "unit": "hp",
                    "number": 332
                  },
                  "source": 1073977811386678,
                  "id": "1025933"
                }
              ],
              "attribute_group_name": "Otros",
              "source": 1073977811386678,
              "value_type": "number_unit"
            },
            {
              "attribute_group_name": "Seguridad",
              "source": 1073977811386678,
              "value_type": "list",
              "value_name": "Delantera",
              "name": "Control de tracciÃ³n",
              "value_id": "493979",
              "value_struct": null,
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "SECURITY",
              "id": "TRACTION_CONTROL"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17061148",
          "tags": [
            "good_quality_picture"
          ],
          "order_backend": 49,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        },
        {
          "id": "MCO1067746028",
          "site_id": "MCO",
          "title": "Mazda 3 Touring 2.0 ",
          "seller": {
            "id": 1239777371,
            "permalink": "http://perfil.mercadolibre.com.co/FST5486300",
            "registration_date": "2022-11-15T15:19:18.000-04:00",
            "car_dealer": false,
            "real_estate_agency": false,
            "tags": [
              "normal"
            ],
            "seller_reputation": {
              "power_seller_status": null,
              "level_id": null,
              "metrics": {
                "cancellations": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "claims": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "delayed_handling_time": {
                  "period": "365 days",
                  "rate": 0,
                  "value": 0
                },
                "sales": {
                  "period": "365 days",
                  "completed": 0
                }
              },
              "transactions": {
                "canceled": 0,
                "period": "historic",
                "total": 0,
                "ratings": {
                  "negative": 0,
                  "neutral": 0,
                  "positive": 0
                },
                "completed": 0
              }
            }
          },
          "price": 88000000,
          "prices": {
            "id": "MCO1067746028",
            "prices": [
              {
                "id": "1",
                "type": "standard",
                "amount": 88000000,
                "regular_amount": null,
                "currency_id": "COP",
                "last_updated": "2022-11-15T19:19:21Z",
                "conditions": {
                  "context_restrictions": [],
                  "start_time": null,
                  "end_time": null,
                  "eligible": true
                },
                "exchange_rate_context": "DEFAULT",
                "metadata": {}
              }
            ],
            "presentation": {
              "display_currency": "COP"
            },
            "payment_method_prices": [],
            "reference_prices": [],
            "purchase_discounts": []
          },
          "sale_price": null,
          "currency_id": "COP",
          "available_quantity": 1,
          "sold_quantity": 0,
          "buying_mode": "classified",
          "listing_type_id": "gold_premium",
          "stop_time": "2023-01-14T04:01:53.000Z",
          "condition": "used",
          "permalink": "https://carro.mercadolibre.com.co/MCO-1067746028-mazda-3-touring-20-_JM",
          "thumbnail": "http://http2.mlstatic.com/D_991635-MCO52433147541_112022-I.jpg",
          "thumbnail_id": "991635-MCO52433147541_112022",
          "accepts_mercadopago": false,
          "installments": null,
          "address": {
            "state_id": "TUNPUEJPR1gxMDljZA",
            "state_name": "BogotÃ¡ D.C.",
            "city_id": "TUNPQ1VTQTY3MTQ1",
            "city_name": "UsaquÃ©n",
            "area_code": "",
            "phone1": ""
          },
          "promotions": null,
          "shipping": {
            "free_shipping": false,
            "mode": "not_specified",
            "tags": [],
            "logistic_type": null,
            "store_pick_up": false
          },
          "seller_address": {
            "id": "",
            "comment": "",
            "address_line": "",
            "zip_code": "",
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "state": {
              "id": "CO-DC",
              "name": "BogotÃ¡ D.C."
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "latitude": "",
            "longitude": ""
          },
          "seller_contact": {
            "contact": "STELLA F.",
            "other_info": "",
            "area_code": "",
            "phone": "",
            "area_code2": "",
            "phone2": "",
            "email": "",
            "webpage": ""
          },
          "location": {
            "address_line": "",
            "zip_code": "",
            "subneighborhood": null,
            "neighborhood": {
              "id": "TUNPQkNFRDEzNzQw",
              "name": "Cedritos"
            },
            "city": {
              "id": "TUNPQ1VTQTY3MTQ1",
              "name": "UsaquÃ©n"
            },
            "state": {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C."
            },
            "country": {
              "id": "CO",
              "name": "Colombia"
            },
            "latitude": 4.7251363,
            "longitude": -74.03956
          },
          "attributes": [
            {
              "value_name": "Usado",
              "values": [
                {
                  "id": "2230581",
                  "name": "Usado",
                  "struct": null,
                  "source": 1
                }
              ],
              "value_type": "list",
              "value_id": "2230581",
              "name": "CondiciÃ³n del Ã­tem",
              "value_struct": null,
              "attribute_group_id": "",
              "attribute_group_name": "",
              "source": 1,
              "id": "ITEM_CONDITION"
            },
            {
              "attribute_group_name": "CaracterÃ­sticas generales",
              "source": 1073977811386678,
              "value_type": "boolean",
              "value_id": "242085",
              "values": [
                {
                  "id": "242085",
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "ADICIONALES",
              "value_struct": null,
              "id": "SINGLE_OWNER",
              "name": "Ãšnico dueÃ±o",
              "value_name": "SÃ­"
            },
            {
              "id": "HAS_AIR_CONDITIONING",
              "name": "Aire acondicionado",
              "value_id": "242085",
              "value_name": "SÃ­",
              "values": [
                {
                  "name": "SÃ­",
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "242085"
                }
              ],
              "attribute_group_id": "CONFORT",
              "source": 1073977811386678,
              "value_type": "boolean",
              "value_struct": null,
              "attribute_group_name": "Confort"
            },
            {
              "id": "BRAND",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "value_type": "string",
              "name": "Marca",
              "value_id": "66811",
              "value_name": "Mazda",
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "66811",
                  "name": "Mazda"
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678
            },
            {
              "name": "Puertas",
              "value_struct": null,
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "number",
              "id": "DOORS",
              "value_id": "60241",
              "value_name": "4",
              "values": [
                {
                  "id": "60241",
                  "name": "4",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND"
            },
            {
              "value_id": "423563",
              "value_struct": null,
              "values": [
                {
                  "id": "423563",
                  "name": "2.0",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_id": "FIND",
              "id": "ENGINE",
              "name": "Motor",
              "value_name": "2.0",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string"
            },
            {
              "value_id": "64364",
              "value_name": "Gasolina",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "id": "FUEL_TYPE",
              "name": "Tipo de combustible",
              "value_struct": null,
              "values": [
                {
                  "id": "64364",
                  "name": "Gasolina",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "list"
            },
            {
              "value_id": null,
              "value_name": "24890 km",
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "value_type": "number_unit",
              "id": "KILOMETERS",
              "name": "KilÃ³metros",
              "source": 1073977811386678,
              "value_struct": {
                "number": 24890,
                "unit": "km"
              },
              "values": [
                {
                  "id": null,
                  "name": "24890 km",
                  "struct": {
                    "number": 24890,
                    "unit": "km"
                  },
                  "source": 1073977811386678
                }
              ]
            },
            {
              "name": "Modelo",
              "value_name": "3",
              "attribute_group_id": "FIND",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "MODEL",
              "value_id": "49506",
              "value_struct": null,
              "values": [
                {
                  "id": "49506",
                  "name": "3",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "value_name": "AutomÃ¡tica",
              "attribute_group_id": "FIND",
              "value_type": "list",
              "id": "TRANSMISSION",
              "value_id": "370876",
              "values": [
                {
                  "id": "370876",
                  "name": "AutomÃ¡tica",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "name": "TransmisiÃ³n",
              "value_struct": null
            },
            {
              "values": [
                {
                  "id": "2235113",
                  "name": "2.0 Touring",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "value_id": "2235113",
              "name": "VersiÃ³n",
              "value_name": "2.0 Touring",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica",
              "source": 1073977811386678,
              "value_type": "string",
              "id": "TRIM"
            },
            {
              "id": "VEHICLE_YEAR",
              "name": "AÃ±o",
              "value_id": "6730991",
              "values": [
                {
                  "id": "6730991",
                  "name": "2020",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "source": 1073977811386678,
              "value_type": "number",
              "value_name": "2020",
              "value_struct": null,
              "attribute_group_id": "FIND",
              "attribute_group_name": "Ficha tÃ©cnica"
            },
            {
              "attribute_group_name": "Otros",
              "value_type": "number_unit",
              "id": "ENGINE_DISPLACEMENT",
              "value_name": "2 L",
              "values": [
                {
                  "struct": {
                    "number": 2,
                    "unit": "L"
                  },
                  "source": 1073977811386678,
                  "id": "2326622",
                  "name": "2 L"
                }
              ],
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "name": "Cilindrada",
              "value_id": "2326622",
              "value_struct": {
                "number": 2,
                "unit": "L"
              }
            },
            {
              "source": 1073977811386678,
              "id": "PASSENGER_CAPACITY",
              "name": "Capacidad de personas",
              "value_struct": null,
              "values": [
                {
                  "struct": null,
                  "source": 1073977811386678,
                  "id": "458562",
                  "name": "5"
                }
              ],
              "attribute_group_id": "OTHERS",
              "attribute_group_name": "Otros",
              "value_id": "458562",
              "value_name": "5",
              "value_type": "number"
            },
            {
              "value_struct": {
                "number": 153,
                "unit": "hp"
              },
              "attribute_group_id": "OTHERS",
              "source": 1073977811386678,
              "value_type": "number_unit",
              "id": "POWER",
              "name": "Potencia",
              "value_id": "459930",
              "value_name": "153 hp",
              "values": [
                {
                  "name": "153 hp",
                  "struct": {
                    "number": 153,
                    "unit": "hp"
                  },
                  "source": 1073977811386678,
                  "id": "459930"
                }
              ],
              "attribute_group_name": "Otros"
            },
            {
              "source": 1073977811386678,
              "value_id": "493979",
              "value_struct": null,
              "attribute_group_id": "SECURITY",
              "values": [
                {
                  "id": "493979",
                  "name": "Delantera",
                  "struct": null,
                  "source": 1073977811386678
                }
              ],
              "attribute_group_name": "Seguridad",
              "value_type": "list",
              "id": "TRACTION_CONTROL",
              "name": "Control de tracciÃ³n",
              "value_name": "Delantera"
            }
          ],
          "original_price": null,
          "category_id": "MCO1744",
          "official_store_id": null,
          "domain_id": "MCO-CARS_AND_VANS",
          "catalog_product_id": "MCO17057093",
          "tags": [],
          "order_backend": 50,
          "use_thumbnail_id": true,
          "offer_score": null,
          "offer_share": null,
          "match_score": null,
          "winner_item_id": null,
          "melicoin": null,
          "discounts": null,
          "inventory_id": null
        }
      ],
      "sort": {
        "id": "relevance",
        "name": "MÃ¡s relevantes"
      },
      "available_sorts": [
        {
          "id": "price_asc",
          "name": "Menor precio"
        },
        {
          "id": "price_desc",
          "name": "Mayor precio"
        }
      ],
      "filters": [
        {
          "id": "category",
          "name": "CategorÃ­as",
          "type": "text",
          "values": [
            {
              "id": "MCO1744",
              "name": "Carros y Camionetas",
              "path_from_root": [
                {
                  "id": "MCO1743",
                  "name": "Carros, Motos y Otros"
                },
                {
                  "id": "MCO1744",
                  "name": "Carros y Camionetas"
                }
              ]
            }
          ]
        }
      ],
      "available_filters": [
        {
          "id": "official_store",
          "name": "Tiendas oficiales",
          "type": "text",
          "values": [
            {
              "id": "all",
              "name": "Todas las tiendas oficiales",
              "results": 6527
            }
          ]
        },
        {
          "id": "state",
          "name": "UbicaciÃ³n",
          "type": "text",
          "values": [
            {
              "id": "TUNPUEJPR1gxMDljZA",
              "name": "BogotÃ¡ D.C.",
              "results": 17228
            },
            {
              "id": "TUNPUEFOVGFiZWI3",
              "name": "Antioquia",
              "results": 9121
            },
            {
              "id": "TUNPUFZBTGExNmNjNg",
              "name": "Valle Del Cauca",
              "results": 3435
            },
            {
              "id": "TUNPUENVTmE3NmQ4",
              "name": "Cundinamarca",
              "results": 1790
            },
            {
              "id": "TUNPUFNBTnJlMjMw",
              "name": "Santander",
              "results": 1465
            },
            {
              "id": "TUNPUEFUTG9mNDk5",
              "name": "AtlÃ¡ntico",
              "results": 1305
            },
            {
              "id": "TUNPUFJJU2ExMWIyYg",
              "name": "Risaralda",
              "results": 1010
            },
            {
              "id": "TUNPUEJPWWE4YzMz",
              "name": "Boyaca",
              "results": 629
            },
            {
              "id": "TUNPUE1FVGExNzFjNQ",
              "name": "Meta",
              "results": 458
            },
            {
              "id": "TUNPUE5PUnIxNDkyZg",
              "name": "Norte De Santander",
              "results": 447
            },
            {
              "id": "TUNPUENBTHNjODY4",
              "name": "Caldas",
              "results": 443
            },
            {
              "id": "TUNPUFRPTGExNGZkNA",
              "name": "Tolima",
              "results": 442
            },
            {
              "id": "TUNPUEJPTHI1Mzlk",
              "name": "BolÃ­var",
              "results": 335
            },
            {
              "id": "TUNPUFFVSW9kYmZm",
              "name": "Quindio",
              "results": 319
            },
            {
              "id": "TUNPUENFU3IxODA4Mg",
              "name": "Cesar",
              "results": 262
            },
            {
              "id": "TUNPUEhVSWExNDVkMQ",
              "name": "Huila",
              "results": 252
            },
            {
              "id": "TUNPUE5BUm8xYzk4",
              "name": "NariÃ±o",
              "results": 192
            },
            {
              "id": "TUNPUE1BR2FiZjQ0",
              "name": "Magdalena",
              "results": 146
            },
            {
              "id": "TUNPUENPUmFkZGIw",
              "name": "CÃ³rdoba",
              "results": 118
            },
            {
              "id": "TUNPUENBVWExM2Q1NQ",
              "name": "Cauca",
              "results": 117
            },
            {
              "id": "TUNPUENBU2U2OWIy",
              "name": "Casanare",
              "results": 85
            },
            {
              "id": "TUNPUEdVQWExOTYx",
              "name": "Guajira",
              "results": 40
            },
            {
              "id": "TUNPUFNVQ2U4ZWQ0",
              "name": "Sucre",
              "results": 31
            },
            {
              "id": "TUNPUENBUWExNjM3MA",
              "name": "Caqueta",
              "results": 19
            },
            {
              "id": "TUNPUEFSQWExM2U4Mw",
              "name": "Arauca",
              "results": 11
            },
            {
              "id": "TUNPUFBVVG8xODQzMA",
              "name": "Putumayo",
              "results": 6
            },
            {
              "id": "TUNPUENIT28xNDgzNg",
              "name": "Choco",
              "results": 4
            },
            {
              "id": "TUNPUEdVQWVhMjEy",
              "name": "Guaviare",
              "results": 3
            },
            {
              "id": "TUNPUEFSQ2E4Zjc3",
              "name": "San Andres y Providencia",
              "results": 1
            }
          ]
        },
        {
          "id": "price",
          "name": "Precio",
          "type": "range",
          "values": [
            {
              "id": "*-4.5E7",
              "name": "Hasta ${'$'}45.000.000",
              "results": 12631
            },
            {
              "id": "4.5E7-8.0E7",
              "name": "${'$'}45.000.000 a ${'$'}80.000.000",
              "results": 12936
            },
            {
              "id": "8.0E7-*",
              "name": "MÃ¡s de ${'$'}80.000.000",
              "results": 14147
            }
          ]
        },
        {
          "id": "power_seller",
          "name": "Filtro por calidad de vendedores",
          "type": "boolean",
          "values": [
            {
              "id": "yes",
              "name": "Mejores vendedores",
              "results": 61
            }
          ]
        },
        {
          "id": "since",
          "name": "Filtro por fecha de comienzo",
          "type": "text",
          "values": [
            {
              "id": "today",
              "name": "Publicados hoy",
              "results": 1142
            }
          ]
        },
        {
          "id": "until",
          "name": "Filtro por fecha de finalizaciÃ³n",
          "type": "text",
          "values": [
            {
              "id": "today",
              "name": "Finalizan hoy",
              "results": 478
            }
          ]
        },
        {
          "id": "has_video",
          "name": "Filtro por publicaciones con video",
          "type": "boolean",
          "values": [
            {
              "id": "yes",
              "name": "Publicaciones con video",
              "results": 8607
            }
          ]
        },
        {
          "id": "has_pictures",
          "name": "Filtro por publicaciones con imÃ¡genes",
          "type": "boolean",
          "values": [
            {
              "id": "yes",
              "name": "Con fotos",
              "results": 39567
            }
          ]
        },
        {
          "id": "seller_type",
          "name": "Vendedor",
          "type": "text",
          "values": [
            {
              "id": "private_seller",
              "name": "Directo",
              "results": 21044
            },
            {
              "id": "car_dealer",
              "name": "Concesionario",
              "results": 18670
            }
          ]
        },
        {
          "id": "BRAND",
          "name": "Marca",
          "type": "STRING",
          "values": [
            {
              "id": "58955",
              "name": "Chevrolet",
              "results": 5565
            },
            {
              "id": "9909",
              "name": "Renault",
              "results": 4870
            },
            {
              "id": "60297",
              "name": "Toyota",
              "results": 3782
            },
            {
              "id": "66811",
              "name": "Mazda",
              "results": 3340
            },
            {
              "id": "66432",
              "name": "Ford",
              "results": 2882
            },
            {
              "id": "60505",
              "name": "Nissan",
              "results": 2712
            },
            {
              "id": "374002",
              "name": "Kia",
              "results": 2561
            },
            {
              "id": "60249",
              "name": "Volkswagen",
              "results": 2380
            },
            {
              "id": "75966",
              "name": "Mercedes-Benz",
              "results": 1773
            },
            {
              "id": "66352",
              "name": "BMW",
              "results": 1455
            },
            {
              "id": "1089",
              "name": "Hyundai",
              "results": 1162
            },
            {
              "id": "43943",
              "name": "Suzuki",
              "results": 1007
            },
            {
              "id": "40661",
              "name": "Audi",
              "results": 744
            },
            {
              "id": "60395",
              "name": "Jeep",
              "results": 564
            },
            {
              "id": "1138",
              "name": "Mitsubishi",
              "results": 557
            },
            {
              "id": "66708",
              "name": "Dodge",
              "results": 422
            },
            {
              "id": "60559",
              "name": "Honda",
              "results": 414
            },
            {
              "id": "60279",
              "name": "Peugeot",
              "results": 326
            },
            {
              "id": "60658",
              "name": "Volvo",
              "results": 274
            },
            {
              "id": "67781",
              "name": "Fiat",
              "results": 249
            },
            {
              "id": "65127",
              "name": "Mini",
              "results": 248
            },
            {
              "id": "389169",
              "name": "CitroÃ«n",
              "results": 213
            },
            {
              "id": "66655",
              "name": "Land Rover",
              "results": 209
            },
            {
              "id": "60285",
              "name": "Subaru",
              "results": 206
            },
            {
              "id": "378447",
              "name": "Ssangyong",
              "results": 201
            },
            {
              "id": "60268",
              "name": "SEAT",
              "results": 146
            },
            {
              "id": "60244",
              "name": "Acura",
              "results": 131
            },
            {
              "id": "56870",
              "name": "Porsche",
              "results": 131
            },
            {
              "id": "389168",
              "name": "Chery",
              "results": 112
            },
            {
              "id": "5826391",
              "name": "DFM/DFSK",
              "results": 84
            },
            {
              "id": "71552",
              "name": "Lexus",
              "results": 83
            },
            {
              "id": "10075",
              "name": "Daihatsu",
              "results": 74
            },
            {
              "id": "2839844",
              "name": "JAC",
              "results": 62
            },
            {
              "id": "2710997",
              "name": "RAM",
              "results": 60
            },
            {
              "id": "2317930",
              "name": "Skoda",
              "results": 60
            },
            {
              "id": "396748",
              "name": "Foton",
              "results": 54
            },
            {
              "id": "23629",
              "name": "Jaguar",
              "results": 40
            },
            {
              "id": "2130485",
              "name": "DS",
              "results": 30
            },
            {
              "id": "1119493",
              "name": "Great Wall",
              "results": 30
            },
            {
              "id": "389167",
              "name": "Changan",
              "results": 29
            },
            {
              "id": "4208",
              "name": "Daewoo",
              "results": 24
            },
            {
              "id": "64522",
              "name": "MG",
              "results": 23
            },
            {
              "id": "61705",
              "name": "Opel",
              "results": 23
            },
            {
              "id": "389176",
              "name": "Mahindra",
              "results": 23
            },
            {
              "id": "2103733",
              "name": "BYD",
              "results": 18
            },
            {
              "id": "378443",
              "name": "Hafei",
              "results": 17
            },
            {
              "id": "67695",
              "name": "Alfa Romeo",
              "results": 16
            },
            {
              "id": "2103728",
              "name": "Zotye",
              "results": 14
            },
            {
              "id": "60407",
              "name": "Hummer",
              "results": 11
            },
            {
              "id": "64049",
              "name": "Maserati",
              "results": 10
            },
            {
              "id": "2220871",
              "name": "JMC",
              "results": 9
            },
            {
              "id": "66395",
              "name": "Chrysler",
              "results": 7
            },
            {
              "id": "389171",
              "name": "Geely",
              "results": 7
            },
            {
              "id": "389166",
              "name": "Chana",
              "results": 7
            },
            {
              "id": "24050",
              "name": "Cadillac",
              "results": 7
            },
            {
              "id": "2130484",
              "name": "Tesla",
              "results": 6
            },
            {
              "id": "2103723",
              "name": "Brilliance",
              "results": 6
            },
            {
              "id": "399561",
              "name": "Willys",
              "results": 5
            },
            {
              "id": "378444",
              "name": "Lada",
              "results": 5
            },
            {
              "id": "2103732",
              "name": "Haval",
              "results": 5
            },
            {
              "id": "2103721",
              "name": "Changhe",
              "results": 5
            },
            {
              "id": "2088960",
              "name": "Baic",
              "results": 5
            },
            {
              "id": "503290",
              "name": "Hino",
              "results": 4
            },
            {
              "id": "380878",
              "name": "Lifan",
              "results": 4
            },
            {
              "id": "14419",
              "name": "Infiniti",
              "results": 4
            },
            {
              "id": "1253268",
              "name": "Dongfeng",
              "results": 4
            },
            {
              "id": "8569062",
              "name": "Jetour",
              "results": 3
            },
            {
              "id": "66671",
              "name": "Lincoln",
              "results": 3
            },
            {
              "id": "60589",
              "name": "Rover",
              "results": 3
            },
            {
              "id": "60552",
              "name": "GMC",
              "results": 3
            },
            {
              "id": "8239317",
              "name": "UAZ",
              "results": 2
            },
            {
              "id": "70603",
              "name": "Faw",
              "results": 2
            },
            {
              "id": "505278",
              "name": "Polaris",
              "results": 2
            },
            {
              "id": "2400401",
              "name": "Higer",
              "results": 2
            },
            {
              "id": "2103724",
              "name": "Gonow",
              "results": 2
            },
            {
              "id": "19595",
              "name": "International",
              "results": 2
            },
            {
              "id": "12237783",
              "name": "Duster",
              "results": 2
            },
            {
              "id": "905799",
              "name": "Ranger",
              "results": 1
            },
            {
              "id": "8782169",
              "name": "Dfac",
              "results": 1
            },
            {
              "id": "8",
              "name": "Panasonic",
              "results": 1
            },
            {
              "id": "5826392",
              "name": "Zhongxing",
              "results": 1
            },
            {
              "id": "505277",
              "name": "Piaggio",
              "results": 1
            },
            {
              "id": "503296",
              "name": "Mack",
              "results": 1
            },
            {
              "id": "396749",
              "name": "Iveco",
              "results": 1
            },
            {
              "id": "380886",
              "name": "Shineray",
              "results": 1
            },
            {
              "id": "3643800",
              "name": "Land",
              "results": 1
            },
            {
              "id": "3211325",
              "name": "Mercedes-AMG",
              "results": 1
            },
            {
              "id": "3061510",
              "name": "Range Rover",
              "results": 1
            },
            {
              "id": "2787006",
              "name": "Spark",
              "results": 1
            },
            {
              "id": "2617857",
              "name": "Mini Cooper",
              "results": 1
            },
            {
              "id": "25099",
              "name": "Onix",
              "results": 1
            },
            {
              "id": "23937",
              "name": "Ferrari",
              "results": 1
            },
            {
              "id": "2103734",
              "name": "Wuling",
              "results": 1
            },
            {
              "id": "2103729",
              "name": "Zna",
              "results": 1
            },
            {
              "id": "2103633",
              "name": "Internacional",
              "results": 1
            },
            {
              "id": "134413",
              "name": "Delta",
              "results": 1
            },
            {
              "id": "1218189",
              "name": "Tata",
              "results": 1
            },
            {
              "id": "12179201",
              "name": "Shana",
              "results": 1
            }
          ]
        },
        {
          "id": "COLOR",
          "name": "Color",
          "type": "string",
          "values": [
            {
              "id": "283165",
              "name": "Gris",
              "results": 6642
            },
            {
              "id": "52055",
              "name": "Blanco",
              "results": 5871
            },
            {
              "id": "52053",
              "name": "Plateado",
              "results": 5038
            },
            {
              "id": "51993",
              "name": "Rojo",
              "results": 2576
            },
            {
              "id": "52049",
              "name": "Negro",
              "results": 2191
            },
            {
              "id": "52028",
              "name": "Azul",
              "results": 1648
            },
            {
              "id": "283164",
              "name": "Dorado",
              "results": 410
            },
            {
              "id": "52014",
              "name": "Verde",
              "results": 358
            },
            {
              "id": "52005",
              "name": "MarrÃ³n",
              "results": 159
            },
            {
              "id": "52007",
              "name": "Amarillo",
              "results": 135
            },
            {
              "id": "52000",
              "name": "Naranja",
              "results": 81
            },
            {
              "id": "52035",
              "name": "Violeta",
              "results": 19
            },
            {
              "id": "52021",
              "name": "Celeste",
              "results": 17
            },
            {
              "id": "52001",
              "name": "Beige",
              "results": 7
            },
            {
              "id": "52051",
              "name": "Gris oscuro",
              "results": 5
            },
            {
              "id": "52033",
              "name": "Azul oscuro",
              "results": 1
            },
            {
              "id": "51994",
              "name": "Rosa",
              "results": 1
            },
            {
              "id": "283161",
              "name": "Azul marino",
              "results": 1
            }
          ]
        },
        {
          "id": "DOORS",
          "name": "Puertas",
          "type": "range",
          "values": [
            {
              "id": "[2-2]",
              "name": "2",
              "results": 2749
            },
            {
              "id": "[3-3]",
              "name": "3",
              "results": 858
            },
            {
              "id": "[4-4]",
              "name": "4",
              "results": 11401
            },
            {
              "id": "[5-5]",
              "name": "5",
              "results": 24626
            },
            {
              "id": "[6-6]",
              "name": "6",
              "results": 12
            }
          ]
        },
        {
          "id": "FUEL_TYPE",
          "name": "Tipo de combustible",
          "type": "STRING",
          "values": [
            {
              "id": "64364",
              "name": "Gasolina",
              "results": 35206
            },
            {
              "id": "60406",
              "name": "DiÃ©sel",
              "results": 3327
            },
            {
              "id": "61257",
              "name": "HÃ­brido",
              "results": 732
            },
            {
              "id": "372590",
              "name": "Gasolina y gas",
              "results": 348
            },
            {
              "id": "403613",
              "name": "ElÃ©ctrico",
              "results": 74
            }
          ]
        },
        {
          "id": "HAS_ABS_BRAKES",
          "name": "Otras caracterÃ­sticas",
          "type": "boolean",
          "values": [
            {
              "id": "242085",
              "name": "Con frenos ABS",
              "results": 25503
            }
          ]
        },
        {
          "id": "HAS_AIR_CONDITIONING",
          "name": "Otras caracterÃ­sticas",
          "type": "boolean",
          "values": [
            {
              "id": "242085",
              "name": "Con aire acondicionado",
              "results": 28363
            }
          ]
        },
        {
          "id": "HAS_POWER_WINDOWS",
          "name": "Otras caracterÃ­sticas",
          "type": "boolean",
          "values": [
            {
              "id": "242085",
              "name": "Con vidrios elÃ©ctricos",
              "results": 17367
            }
          ]
        },
        {
          "id": "IS_FINANCEABLE",
          "name": "Financiable",
          "type": "boolean",
          "values": [
            {
              "id": "242085",
              "name": "Es financiable",
              "results": 28283
            }
          ]
        },
        {
          "id": "ITEM_CONDITION",
          "name": "CondiciÃ³n",
          "type": "STRING",
          "values": [
            {
              "id": "2230284",
              "name": "Nuevo",
              "results": 2165
            }
          ]
        },
        {
          "id": "KILOMETERS",
          "name": "KilÃ³metros",
          "type": "range",
          "values": [
            {
              "id": "[0km-0km]",
              "name": "0 km",
              "results": 2165
            },
            {
              "id": "[0.001km-30000km]",
              "name": "0 a 30.000 km",
              "results": 8090
            },
            {
              "id": "[30000km-60000km]",
              "name": "30.000 a 60.000 km",
              "results": 8297
            },
            {
              "id": "[60000km-100000km]",
              "name": "60.000 a 100.000 km",
              "results": 9811
            },
            {
              "id": "[100000km-*)",
              "name": "100.000 km o mÃ¡s",
              "results": 11541
            }
          ]
        },
        {
          "id": "LICENSE_PLATE_LAST_DIGIT",
          "name": "Ãšltimo dÃ­gito de la placa",
          "type": "range",
          "values": [
            {
              "id": "[0-0]",
              "name": "0",
              "results": 4631
            },
            {
              "id": "[1-1]",
              "name": "1",
              "results": 3399
            },
            {
              "id": "[2-2]",
              "name": "2",
              "results": 3357
            },
            {
              "id": "[3-3]",
              "name": "3",
              "results": 3405
            },
            {
              "id": "[4-4]",
              "name": "4",
              "results": 3188
            },
            {
              "id": "[5-5]",
              "name": "5",
              "results": 3410
            },
            {
              "id": "[6-6]",
              "name": "6",
              "results": 3141
            },
            {
              "id": "[7-7]",
              "name": "7",
              "results": 3778
            },
            {
              "id": "[8-8]",
              "name": "8",
              "results": 3384
            },
            {
              "id": "[9-9]",
              "name": "9",
              "results": 3310
            }
          ]
        },
        {
          "id": "LICENSE_PLATE_PARITY",
          "name": "Paridad de la placa",
          "type": "STRING",
          "values": [
            {
              "id": "6832186",
              "name": "Par",
              "results": 17701
            },
            {
              "id": "6832187",
              "name": "Impar",
              "results": 17302
            }
          ]
        },
        {
          "id": "MODEL",
          "name": "Modelo",
          "type": "STRING",
          "values": [
            {
              "id": "1252924",
              "name": "Prado",
              "results": 927
            },
            {
              "id": "49506",
              "name": "3",
              "results": 879
            },
            {
              "id": "62198",
              "name": "Logan",
              "results": 830
            },
            {
              "id": "64855",
              "name": "Duster",
              "results": 755
            },
            {
              "id": "60694",
              "name": "Sandero",
              "results": 754
            },
            {
              "id": "59481",
              "name": "2",
              "results": 736
            },
            {
              "id": "389565",
              "name": "Picanto",
              "results": 708
            },
            {
              "id": "2318140",
              "name": "Fortuner",
              "results": 660
            },
            {
              "id": "66659",
              "name": "Fiesta",
              "results": 607
            },
            {
              "id": "63613",
              "name": "Hilux",
              "results": 607
            },
            {
              "id": "69370",
              "name": "Tracker",
              "results": 592
            },
            {
              "id": "66926",
              "name": "CX-5",
              "results": 580
            },
            {
              "id": "389601",
              "name": "Sportage",
              "results": 576
            },
            {
              "id": "61627",
              "name": "March",
              "results": 538
            },
            {
              "id": "123144",
              "name": "Rio",
              "results": 527
            },
            {
              "id": "62109",
              "name": "Gol",
              "results": 523
            },
            {
              "id": "68586",
              "name": "Escape",
              "results": 514
            },
            {
              "id": "60567",
              "name": "Jetta",
              "results": 509
            },
            {
              "id": "61416",
              "name": "Stepway",
              "results": 499
            },
            {
              "id": "2109385",
              "name": "Sail",
              "results": 495
            },
            {
              "id": "123123",
              "name": "Onix",
              "results": 488
            },
            {
              "id": "68141",
              "name": "Captiva",
              "results": 479
            },
            {
              "id": "2318081",
              "name": "Spark GT",
              "results": 434
            },
            {
              "id": "55925",
              "name": "Spark",
              "results": 432
            },
            {
              "id": "61198",
              "name": "Frontier",
              "results": 430
            },
            {
              "id": "60412",
              "name": "Land Cruiser",
              "results": 394
            },
            {
              "id": "2113350",
              "name": "CX-30",
              "results": 385
            },
            {
              "id": "503625",
              "name": "Clase C",
              "results": 363
            },
            {
              "id": "389630",
              "name": "Twingo",
              "results": 345
            },
            {
              "id": "60334",
              "name": "Corolla",
              "results": 331
            },
            {
              "id": "64402",
              "name": "Versa",
              "results": 327
            },
            {
              "id": "66398",
              "name": "Serie 3",
              "results": 323
            },
            {
              "id": "8859",
              "name": "Explorer",
              "results": 318
            },
            {
              "id": "1148994",
              "name": "Kwid",
              "results": 314
            },
            {
              "id": "66902",
              "name": "Montero",
              "results": 313
            },
            {
              "id": "43731",
              "name": "Swift",
              "results": 305
            },
            {
              "id": "69114",
              "name": "Aveo",
              "results": 294
            },
            {
              "id": "42649",
              "name": "Journey",
              "results": 293
            },
            {
              "id": "67001",
              "name": "Sonic",
              "results": 292
            },
            {
              "id": "60485",
              "name": "Clio",
              "results": 291
            },
            {
              "id": "61071",
              "name": "Sentra",
              "results": 255
            },
            {
              "id": "62828",
              "name": "Grand Vitara",
              "results": 241
            },
            {
              "id": "60924",
              "name": "4Runner",
              "results": 241
            },
            {
              "id": "503622",
              "name": "Clase A",
              "results": 236
            },
            {
              "id": "67429",
              "name": "Ranger",
              "results": 235
            },
            {
              "id": "389642",
              "name": "Vitara",
              "results": 232
            },
            {
              "id": "389468",
              "name": "Ecosport",
              "results": 231
            },
            {
              "id": "63922",
              "name": "Accent",
              "results": 223
            },
            {
              "id": "64501",
              "name": "Qashqai",
              "results": 222
            },
            {
              "id": "60382",
              "name": "Koleos",
              "results": 221
            },
            {
              "id": "66416",
              "name": "Cooper",
              "results": 195
            },
            {
              "id": "66665",
              "name": "Optra",
              "results": 194
            },
            {
              "id": "389648",
              "name": "Voyage",
              "results": 194
            },
            {
              "id": "65389",
              "name": "X-Trail",
              "results": 192
            },
            {
              "id": "63686",
              "name": "Amarok",
              "results": 192
            },
            {
              "id": "8796",
              "name": "X3",
              "results": 191
            },
            {
              "id": "61186",
              "name": "Tiida",
              "results": 191
            },
            {
              "id": "8938",
              "name": "Wrangler",
              "results": 190
            },
            {
              "id": "31172",
              "name": "Q5",
              "results": 188
            },
            {
              "id": "93447",
              "name": "F-150",
              "results": 182
            },
            {
              "id": "503629",
              "name": "Clase E",
              "results": 179
            },
            {
              "id": "60561",
              "name": "CR-V",
              "results": 178
            },
            {
              "id": "60651",
              "name": "RAV4",
              "results": 176
            },
            {
              "id": "8818107",
              "name": "Ecosport 2",
              "results": 173
            },
            {
              "id": "69693",
              "name": "Edge",
              "results": 169
            },
            {
              "id": "61537",
              "name": "Tiguan",
              "results": 158
            },
            {
              "id": "503621",
              "name": "Clase CLA",
              "results": 154
            },
            {
              "id": "84809",
              "name": "Tucson",
              "results": 152
            },
            {
              "id": "66564",
              "name": "LUV",
              "results": 144
            },
            {
              "id": "6387",
              "name": "X5",
              "results": 137
            },
            {
              "id": "59833",
              "name": "6",
              "results": 135
            },
            {
              "id": "2109390",
              "name": "D-Max",
              "results": 134
            },
            {
              "id": "2109309",
              "name": "BT-50",
              "results": 133
            },
            {
              "id": "1007118",
              "name": "Kicks",
              "results": 131
            },
            {
              "id": "1252940",
              "name": "Clase GLC",
              "results": 129
            },
            {
              "id": "5958873",
              "name": "TUCSON IX-35",
              "results": 128
            },
            {
              "id": "1046551",
              "name": "Integra",
              "results": 128
            },
            {
              "id": "66351",
              "name": "Serie 1",
              "results": 127
            },
            {
              "id": "64614",
              "name": "Captur",
              "results": 126
            },
            {
              "id": "5958935",
              "name": "CERATO PRO",
              "results": 126
            },
            {
              "id": "1252987",
              "name": "Clase GLE",
              "results": 124
            },
            {
              "id": "1252939",
              "name": "Clase GLA",
              "results": 119
            },
            {
              "id": "389467",
              "name": "Duster Oroch",
              "results": 118
            },
            {
              "id": "63661",
              "name": "XC60",
              "results": 117
            },
            {
              "id": "5958844",
              "name": "AVEO EMOTION",
              "results": 116
            },
            {
              "id": "66905",
              "name": "Cruze",
              "results": 115
            },
            {
              "id": "60959",
              "name": "Pathfinder",
              "results": 114
            },
            {
              "id": "61557",
              "name": "Golf",
              "results": 113
            },
            {
              "id": "59350",
              "name": "A3",
              "results": 112
            },
            {
              "id": "66459",
              "name": "A4",
              "results": 108
            },
            {
              "id": "103788",
              "name": "Beat",
              "results": 108
            },
            {
              "id": "72638",
              "name": "Q3",
              "results": 107
            },
            {
              "id": "61534",
              "name": "Crossfox",
              "results": 103
            },
            {
              "id": "7556085",
              "name": "T-Cross",
              "results": 101
            },
            {
              "id": "61232",
              "name": "Cherokee",
              "results": 99
            },
            {
              "id": "389611",
              "name": "Symbol",
              "results": 99
            },
            {
              "id": "6520",
              "name": "X1",
              "results": 97
            },
            {
              "id": "389594",
              "name": "Sorento",
              "results": 96
            },
            {
              "id": "15027",
              "name": "Joy",
              "results": 96
            },
            {
              "id": "66609",
              "name": "Corsa",
              "results": 92
            },
            {
              "id": "45893",
              "name": "N300",
              "results": 92
            },
            {
              "id": "66531",
              "name": "Serie 5",
              "results": 90
            },
            {
              "id": "5958936",
              "name": "CERATO FORTE",
              "results": 89
            },
            {
              "id": "60983",
              "name": "Grand Cherokee",
              "results": 88
            },
            {
              "id": "68463",
              "name": "Focus",
              "results": 86
            },
            {
              "id": "60337",
              "name": "Yaris",
              "results": 86
            },
            {
              "id": "52512",
              "name": "Fusion",
              "results": 86
            },
            {
              "id": "60482",
              "name": "Kangoo",
              "results": 85
            },
            {
              "id": "64669",
              "name": "Santa Fe",
              "results": 80
            },
            {
              "id": "73586",
              "name": "Serie 2",
              "results": 79
            },
            {
              "id": "503696",
              "name": "CX-3",
              "results": 77
            },
            {
              "id": "503704",
              "name": "CX-9",
              "results": 75
            },
            {
              "id": "67383",
              "name": "Bronco",
              "results": 74
            },
            {
              "id": "389484",
              "name": "Fj Cruiser",
              "results": 74
            },
            {
              "id": "62175",
              "name": "S-Cross",
              "results": 72
            },
            {
              "id": "63273",
              "name": "Forester",
              "results": 71
            },
            {
              "id": "2109371",
              "name": "C4 Cactus",
              "results": 69
            },
            {
              "id": "84854",
              "name": "Korando",
              "results": 68
            },
            {
              "id": "66640",
              "name": "Equinox",
              "results": 68
            },
            {
              "id": "61471",
              "name": "i10",
              "results": 68
            },
            {
              "id": "60377",
              "name": "Megane",
              "results": 68
            },
            {
              "id": "65895",
              "name": "2008",
              "results": 67
            },
            {
              "id": "503710",
              "name": "ML",
              "results": 67
            },
            {
              "id": "66422",
              "name": "Blazer",
              "results": 66
            },
            {
              "id": "69031",
              "name": "Traverse",
              "results": 65
            },
            {
              "id": "75044",
              "name": "Ram",
              "results": 64
            },
            {
              "id": "61443",
              "name": "Elantra",
              "results": 64
            },
            {
              "id": "64491",
              "name": "Evoque",
              "results": 62
            },
            {
              "id": "389415",
              "name": "Carens",
              "results": 62
            },
            {
              "id": "16270",
              "name": "X6",
              "results": 62
            },
            {
              "id": "71137",
              "name": "Serie 4",
              "results": 61
            },
            {
              "id": "55602",
              "name": "Mustang",
              "results": 61
            },
            {
              "id": "2953881",
              "name": "Taos",
              "results": 61
            },
            {
              "id": "16696",
              "name": "Compass",
              "results": 61
            },
            {
              "id": "1252926",
              "name": "Burbuja",
              "results": 61
            },
            {
              "id": "60439",
              "name": "Cayenne",
              "results": 60
            },
            {
              "id": "5958853",
              "name": "ALASKAN",
              "results": 60
            },
            {
              "id": "32212",
              "name": "Civic",
              "results": 59
            },
            {
              "id": "1252963",
              "name": "Alto",
              "results": 59
            },
            {
              "id": "85019",
              "name": "XV",
              "results": 58
            },
            {
              "id": "61646",
              "name": "3008",
              "results": 58
            },
            {
              "id": "1252956",
              "name": "Patrol",
              "results": 58
            },
            {
              "id": "2662817",
              "name": "Virtus",
              "results": 57
            },
            {
              "id": "17108",
              "name": "X4",
              "results": 56
            },
            {
              "id": "389382",
              "name": "626",
              "results": 55
            },
            {
              "id": "73530",
              "name": "Uno",
              "results": 54
            },
            {
              "id": "53433",
              "name": "206",
              "results": 53
            },
            {
              "id": "389420",
              "name": "Cerato",
              "results": 53
            },
            {
              "id": "15698",
              "name": "Q7",
              "results": 52
            },
            {
              "id": "13278",
              "name": "323",
              "results": 52
            },
            {
              "id": "389577",
              "name": "Renegade",
              "results": 51
            },
            {
              "id": "389523",
              "name": "Jimny",
              "results": 51
            },
            {
              "id": "1252920",
              "name": "Nativa",
              "results": 51
            },
            {
              "id": "84808",
              "name": "Getz",
              "results": 50
            },
            {
              "id": "235012",
              "name": "Soul",
              "results": 49
            },
            {
              "id": "61695",
              "name": "Polo",
              "results": 48
            },
            {
              "id": "503630",
              "name": "Clase B",
              "results": 48
            },
            {
              "id": "71644",
              "name": "GX",
              "results": 47
            },
            {
              "id": "66817",
              "name": "Durango",
              "results": 47
            },
            {
              "id": "66573",
              "name": "Colorado",
              "results": 47
            },
            {
              "id": "84853",
              "name": "Actyon",
              "results": 46
            },
            {
              "id": "67536",
              "name": "Atos",
              "results": 46
            },
            {
              "id": "5958876",
              "name": "L200 SPORTERO",
              "results": 46
            },
            {
              "id": "61447",
              "name": "Grand i10",
              "results": 45
            },
            {
              "id": "5958865",
              "name": "ALLEGRO",
              "results": 45
            },
            {
              "id": "2318104",
              "name": "Megane 2",
              "results": 45
            },
            {
              "id": "8818143",
              "name": "Nivus",
              "results": 43
            },
            {
              "id": "60723",
              "name": "Ibiza",
              "results": 43
            },
            {
              "id": "60542",
              "name": "Murano",
              "results": 42
            },
            {
              "id": "389398",
              "name": "Baleno",
              "results": 42
            },
            {
              "id": "100811",
              "name": "Pulse",
              "results": 42
            },
            {
              "id": "60789",
              "name": "Saveiro",
              "results": 41
            },
            {
              "id": "389629",
              "name": "Trailblazer",
              "results": 40
            },
            {
              "id": "37931",
              "name": "A6",
              "results": 40
            },
            {
              "id": "2318066",
              "name": "XC40",
              "results": 39
            },
            {
              "id": "1252869",
              "name": "Escarabajo",
              "results": 39
            },
            {
              "id": "10994",
              "name": "B2200",
              "results": 39
            },
            {
              "id": "61755",
              "name": "Pilot",
              "results": 38
            },
            {
              "id": "60776",
              "name": "XC90",
              "results": 38
            },
            {
              "id": "3905208",
              "name": "Arona",
              "results": 38
            },
            {
              "id": "275412",
              "name": "Mobi",
              "results": 38
            },
            {
              "id": "9003",
              "name": "C3",
              "results": 37
            },
            {
              "id": "60677",
              "name": "Bora",
              "results": 37
            },
            {
              "id": "2109402",
              "name": "Celerio",
              "results": 36
            },
            {
              "id": "2903",
              "name": "S60",
              "results": 35
            },
            {
              "id": "1007110",
              "name": "Creta",
              "results": 35
            },
            {
              "id": "64071",
              "name": "Samurai",
              "results": 34
            },
            {
              "id": "1252997",
              "name": "Clase GLS",
              "results": 33
            },
            {
              "id": "60451",
              "name": "Beetle",
              "results": 32
            },
            {
              "id": "5958858",
              "name": "YOYA",
              "results": 32
            },
            {
              "id": "77649",
              "name": "Macan",
              "results": 31
            },
            {
              "id": "67950",
              "name": "Outlander",
              "results": 31
            },
            {
              "id": "60311",
              "name": "Leon",
              "results": 31
            },
            {
              "id": "503699",
              "name": "CX-7",
              "results": 31
            },
            {
              "id": "389446",
              "name": "Cobalt",
              "results": 31
            },
            {
              "id": "2318100",
              "name": "Fabia",
              "results": 31
            },
            {
              "id": "1252959",
              "name": "Navara",
              "results": 31
            },
            {
              "id": "5958934",
              "name": "NEW SPORTAGE",
              "results": 30
            },
            {
              "id": "389617",
              "name": "Terios",
              "results": 30
            },
            {
              "id": "9215",
              "name": "207",
              "results": 29
            },
            {
              "id": "61710",
              "name": "Accord",
              "results": 29
            },
            {
              "id": "61053",
              "name": "Scenic",
              "results": 29
            },
            {
              "id": "70248",
              "name": "Countryman",
              "results": 28
            },
            {
              "id": "63360",
              "name": "Fluence",
              "results": 28
            },
            {
              "id": "60461",
              "name": "Impreza",
              "results": 28
            },
            {
              "id": "60043",
              "name": "Note",
              "results": 28
            },
            {
              "id": "121559",
              "name": "A5",
              "results": 27
            },
            {
              "id": "1119441",
              "name": "Niro",
              "results": 27
            },
            {
              "id": "8679211",
              "name": "S-Presso",
              "results": 26
            },
            {
              "id": "66739",
              "name": "Range Rover",
              "results": 26
            },
            {
              "id": "483995",
              "name": "WR-V",
              "results": 26
            },
            {
              "id": "11510704",
              "name": "Corolla Cross",
              "results": 26
            },
            {
              "id": "1007093",
              "name": "Discovery sport",
              "results": 26
            },
            {
              "id": "84850",
              "name": "Kyron",
              "results": 25
            },
            {
              "id": "7698",
              "name": "A1",
              "results": 25
            },
            {
              "id": "5958833",
              "name": "VAN CARGA",
              "results": 25
            },
            {
              "id": "84815",
              "name": "Trooper",
              "results": 24
            },
            {
              "id": "71553",
              "name": "LX",
              "results": 24
            },
            {
              "id": "3936",
              "name": "L200",
              "results": 24
            },
            {
              "id": "389621",
              "name": "Tiggo",
              "results": 24
            },
            {
              "id": "36763",
              "name": "Fox",
              "results": 24
            },
            {
              "id": "2109403",
              "name": "Ertiga",
              "results": 24
            },
            {
              "id": "68313",
              "name": "Camaro",
              "results": 23
            },
            {
              "id": "67931",
              "name": "Lancer",
              "results": 23
            },
            {
              "id": "503632",
              "name": "Clase GLK",
              "results": 23
            },
            {
              "id": "9064",
              "name": "200",
              "results": 22
            },
            {
              "id": "68820",
              "name": "Strada",
              "results": 22
            },
            {
              "id": "66675",
              "name": "Chevy",
              "results": 22
            },
            {
              "id": "64016",
              "name": "Vento",
              "results": 22
            },
            {
              "id": "60574",
              "name": "Odyssey",
              "results": 22
            },
            {
              "id": "5388",
              "name": "700",
              "results": 22
            },
            {
              "id": "36046",
              "name": "307",
              "results": 22
            },
            {
              "id": "22349",
              "name": "Q2",
              "results": 22
            },
            {
              "id": "1252932",
              "name": "C-ElysÃ©e",
              "results": 22
            },
            {
              "id": "67077",
              "name": "Discovery",
              "results": 21
            },
            {
              "id": "65482",
              "name": "Rexton",
              "results": 21
            },
            {
              "id": "5958937",
              "name": "CERATO KOUP",
              "results": 21
            },
            {
              "id": "389458",
              "name": "D21",
              "results": 21
            },
            {
              "id": "1252957",
              "name": "D22",
              "results": 21
            },
            {
              "id": "9857",
              "name": "5008",
              "results": 20
            },
            {
              "id": "9069",
              "name": "500",
              "results": 20
            },
            {
              "id": "79790",
              "name": "R9",
              "results": 20
            },
            {
              "id": "74118",
              "name": "ASX",
              "results": 20
            },
            {
              "id": "60435",
              "name": "Tacoma",
              "results": 20
            },
            {
              "id": "55660",
              "name": "Santana",
              "results": 20
            },
            {
              "id": "503623",
              "name": "Clase SLK",
              "results": 20
            },
            {
              "id": "84805",
              "name": "Veracruz",
              "results": 19
            },
            {
              "id": "8295767",
              "name": "Clase GLB",
              "results": 19
            },
            {
              "id": "62342",
              "name": "Almera",
              "results": 19
            },
            {
              "id": "5958869",
              "name": "I25",
              "results": 19
            },
            {
              "id": "37720",
              "name": "Fit",
              "results": 19
            },
            {
              "id": "3572358",
              "name": "DS7",
              "results": 19
            },
            {
              "id": "101997",
              "name": "N200",
              "results": 19
            },
            {
              "id": "67967",
              "name": "Zafira",
              "results": 18
            },
            {
              "id": "66694",
              "name": "TT",
              "results": 18
            },
            {
              "id": "62950",
              "name": "Tundra",
              "results": 18
            },
            {
              "id": "58615",
              "name": "5",
              "results": 18
            },
            {
              "id": "503633",
              "name": "Clase GL",
              "results": 18
            },
            {
              "id": "44684",
              "name": "Expedition",
              "results": 18
            },
            {
              "id": "389514",
              "name": "HR-V",
              "results": 18
            },
            {
              "id": "34711",
              "name": "B2000",
              "results": 18
            },
            {
              "id": "123230",
              "name": "Esteem",
              "results": 18
            },
            {
              "id": "12098",
              "name": "C4",
              "results": 18
            },
            {
              "id": "1119452",
              "name": "Ateca",
              "results": 18
            },
            {
              "id": "62906",
              "name": "Van",
              "results": 17
            },
            {
              "id": "60874",
              "name": "Commander",
              "results": 17
            },
            {
              "id": "60284",
              "name": "Outback",
              "results": 17
            },
            {
              "id": "5958927",
              "name": "SJ",
              "results": 17
            },
            {
              "id": "5246",
              "name": "308",
              "results": 17
            },
            {
              "id": "49666",
              "name": "C5",
              "results": 17
            },
            {
              "id": "389463",
              "name": "DS3",
              "results": 17
            },
            {
              "id": "2318123",
              "name": "Tivoli",
              "results": 17
            },
            {
              "id": "2109301",
              "name": "Mini Truck",
              "results": 17
            },
            {
              "id": "1253283",
              "name": "Tunland",
              "results": 17
            },
            {
              "id": "73558",
              "name": "Range Rover Sport",
              "results": 16
            },
            {
              "id": "64003",
              "name": "Veloster",
              "results": 16
            },
            {
              "id": "503715",
              "name": "Willys",
              "results": 16
            },
            {
              "id": "389509",
              "name": "HB20S",
              "results": 16
            },
            {
              "id": "389507",
              "name": "HB20",
              "results": 16
            },
            {
              "id": "35111",
              "name": "Q8",
              "results": 16
            },
            {
              "id": "2109392",
              "name": "R19",
              "results": 16
            },
            {
              "id": "2109296",
              "name": "Pik-Up",
              "results": 16
            },
            {
              "id": "9301",
              "name": "208",
              "results": 15
            },
            {
              "id": "8569066",
              "name": "Seltos",
              "results": 15
            },
            {
              "id": "7556087",
              "name": "Teramont",
              "results": 15
            },
            {
              "id": "66716",
              "name": "Silverado",
              "results": 15
            },
            {
              "id": "66586",
              "name": "Z4",
              "results": 15
            },
            {
              "id": "5958867",
              "name": "B2600",
              "results": 15
            },
            {
              "id": "5958839",
              "name": "LASER",
              "results": 15
            },
            {
              "id": "59423",
              "name": "Kona",
              "results": 15
            },
            {
              "id": "503705",
              "name": "I35",
              "results": 15
            },
            {
              "id": "335579",
              "name": "SAHARA",
              "results": 15
            },
            {
              "id": "2347926",
              "name": "Super carry",
              "results": 15
            },
            {
              "id": "2109360",
              "name": "Eon",
              "results": 15
            },
            {
              "id": "20752",
              "name": "V700",
              "results": 15
            },
            {
              "id": "159489",
              "name": "Sprint",
              "results": 15
            },
            {
              "id": "12401",
              "name": "V40",
              "results": 15
            },
            {
              "id": "67557",
              "name": "Cheyenne",
              "results": 14
            },
            {
              "id": "66524",
              "name": "Tahoe",
              "results": 14
            },
            {
              "id": "61050",
              "name": "Urvan",
              "results": 14
            },
            {
              "id": "60289",
              "name": "Boxster",
              "results": 14
            },
            {
              "id": "2767284",
              "name": "Gladiator",
              "results": 14
            },
            {
              "id": "2662815",
              "name": "Range Rover Velar",
              "results": 14
            },
            {
              "id": "2109393",
              "name": "Wingle 5",
              "results": 14
            },
            {
              "id": "19542",
              "name": "Optima",
              "results": 14
            },
            {
              "id": "10561",
              "name": "M3",
              "results": 14
            },
            {
              "id": "10279",
              "name": "301",
              "results": 14
            },
            {
              "id": "67096",
              "name": "Freelander",
              "results": 13
            },
            {
              "id": "64300",
              "name": "Scala",
              "results": 13
            },
            {
              "id": "5958978",
              "name": "FJ-40",
              "results": 13
            },
            {
              "id": "5958926",
              "name": "LJ",
              "results": 13
            },
            {
              "id": "51558",
              "name": "306",
              "results": 13
            },
            {
              "id": "43756",
              "name": "S3",
              "results": 13
            },
            {
              "id": "2318134",
              "name": "D-22",
              "results": 13
            },
            {
              "id": "9560",
              "name": "Genesis",
              "results": 12
            },
            {
              "id": "84862",
              "name": "New Beetle",
              "results": 12
            },
            {
              "id": "7556086",
              "name": "Tarraco",
              "results": 12
            },
            {
              "id": "69368",
              "name": "Epica",
              "results": 12
            },
            {
              "id": "61687",
              "name": "Legacy",
              "results": 12
            },
            {
              "id": "34007",
              "name": "S2",
              "results": 12
            },
            {
              "id": "26434",
              "name": "X2",
              "results": 12
            },
            {
              "id": "2318149",
              "name": "Octavia",
              "results": 12
            },
            {
              "id": "2318067",
              "name": "Vivant",
              "results": 12
            },
            {
              "id": "17594",
              "name": "M4",
              "results": 12
            },
            {
              "id": "16563",
              "name": "C30",
              "results": 12
            },
            {
              "id": "1252967",
              "name": "Sirion",
              "results": 12
            },
            {
              "id": "68050",
              "name": "Palio",
              "results": 11
            },
            {
              "id": "63213",
              "name": "I30",
              "results": 11
            },
            {
              "id": "503337",
              "name": "Aumark",
              "results": 11
            },
            {
              "id": "389545",
              "name": "Mohave",
              "results": 11
            },
            {
              "id": "389483",
              "name": "Fiorino",
              "results": 11
            },
            {
              "id": "3228220",
              "name": "E-Pace",
              "results": 11
            },
            {
              "id": "2311147",
              "name": "Felicia",
              "results": 11
            },
            {
              "id": "2109362",
              "name": "Starex",
              "results": 11
            },
            {
              "id": "1252906",
              "name": "QQ",
              "results": 11
            },
            {
              "id": "11015",
              "name": "230",
              "results": 11
            },
            {
              "id": "8804",
              "name": "X7",
              "results": 10
            },
            {
              "id": "60078",
              "name": "Idea",
              "results": 10
            },
            {
              "id": "40110",
              "name": "M2",
              "results": 10
            },
            {
              "id": "2682519",
              "name": "Tonic",
              "results": 10
            },
            {
              "id": "2662827",
              "name": "Haval",
              "results": 10
            },
            {
              "id": "2318124",
              "name": "Actyon Sports",
              "results": 10
            },
            {
              "id": "2243260",
              "name": "Mini Van",
              "results": 10
            },
            {
              "id": "1119442",
              "name": "Twizy",
              "results": 10
            },
            {
              "id": "77642",
              "name": "i3",
              "results": 9
            },
            {
              "id": "66514",
              "name": "Serie 7",
              "results": 9
            },
            {
              "id": "63000",
              "name": "Rodeo",
              "results": 9
            },
            {
              "id": "60259",
              "name": "911",
              "results": 9
            },
            {
              "id": "513724",
              "name": "Master",
              "results": 9
            },
            {
              "id": "503711",
              "name": "Mito",
              "results": 9
            },
            {
              "id": "389476",
              "name": "F-100",
              "results": 9
            },
            {
              "id": "2109344",
              "name": "CJ",
              "results": 9
            },
            {
              "id": "1252912",
              "name": "Miata",
              "results": 9
            },
            {
              "id": "978",
              "name": "F20",
              "results": 8
            },
            {
              "id": "63513",
              "name": "XE",
              "results": 8
            },
            {
              "id": "61661",
              "name": "Tribeca",
              "results": 8
            },
            {
              "id": "60253",
              "name": "Passat",
              "results": 8
            },
            {
              "id": "561187",
              "name": "Sprinter",
              "results": 8
            },
            {
              "id": "503624",
              "name": "Clase G",
              "results": 8
            },
            {
              "id": "44626",
              "name": "Corvette",
              "results": 8
            },
            {
              "id": "389496",
              "name": "Grand Blazer",
              "results": 8
            },
            {
              "id": "329756",
              "name": "Siena",
              "results": 8
            },
            {
              "id": "2347946",
              "name": "Nomada",
              "results": 8
            },
            {
              "id": "2318118",
              "name": "Demio",
              "results": 8
            },
            {
              "id": "2109391",
              "name": "Oroch",
              "results": 8
            },
            {
              "id": "1252978",
              "name": "Cooper S",
              "results": 8
            },
            {
              "id": "119481",
              "name": "YOYO",
              "results": 8
            },
            {
              "id": "1046548",
              "name": "F-PACE",
              "results": 8
            },
            {
              "id": "71835",
              "name": "Defender",
              "results": 7
            },
            {
              "id": "66583",
              "name": "Serie 6",
              "results": 7
            },
            {
              "id": "63626",
              "name": "Highlander",
              "results": 7
            },
            {
              "id": "62233",
              "name": "Trafic",
              "results": 7
            },
            {
              "id": "62028",
              "name": "H3",
              "results": 7
            },
            {
              "id": "61722",
              "name": "Touareg",
              "results": 7
            },
            {
              "id": "503679",
              "name": "Minivan",
              "results": 7
            },
            {
              "id": "2318160",
              "name": "XL-7",
              "results": 7
            },
            {
              "id": "2249065",
              "name": "Glory",
              "results": 7
            },
            {
              "id": "2109377",
              "name": "Minyi",
              "results": 7
            },
            {
              "id": "16600",
              "name": "R18",
              "results": 7
            },
            {
              "id": "1119416",
              "name": "Argo",
              "results": 7
            },
            {
              "id": "84852",
              "name": "Rodius",
              "results": 6
            },
            {
              "id": "84806",
              "name": "i20",
              "results": 6
            },
            {
              "id": "71651",
              "name": "Clase S",
              "results": 6
            },
            {
              "id": "71529",
              "name": "Giulietta",
              "results": 6
            },
            {
              "id": "70390",
              "name": "Clase SL",
              "results": 6
            },
            {
              "id": "68258",
              "name": "HHR",
              "results": 6
            },
            {
              "id": "6658900",
              "name": "NKR",
              "results": 6
            },
            {
              "id": "66002",
              "name": "R12",
              "results": 6
            },
            {
              "id": "62854",
              "name": "SX4",
              "results": 6
            },
            {
              "id": "62015",
              "name": "City",
              "results": 6
            },
            {
              "id": "60430",
              "name": "Cayman",
              "results": 6
            },
            {
              "id": "5958878",
              "name": "LC200",
              "results": 6
            },
            {
              "id": "5958860",
              "name": "XCROSS",
              "results": 6
            },
            {
              "id": "561190",
              "name": "Partner",
              "results": 6
            },
            {
              "id": "48516",
              "name": "R4",
              "results": 6
            },
            {
              "id": "46465",
              "name": "Rush",
              "results": 6
            },
            {
              "id": "4611",
              "name": "S40",
              "results": 6
            },
            {
              "id": "389618",
              "name": "Terracan",
              "results": 6
            },
            {
              "id": "389572",
              "name": "Porter",
              "results": 6
            },
            {
              "id": "389510",
              "name": "HB20X",
              "results": 6
            },
            {
              "id": "389480",
              "name": "Feroza",
              "results": 6
            },
            {
              "id": "389464",
              "name": "DS4",
              "results": 6
            },
            {
              "id": "389425",
              "name": "Cielo",
              "results": 6
            },
            {
              "id": "2109404",
              "name": "Carry",
              "results": 6
            },
            {
              "id": "109469",
              "name": "Racer",
              "results": 6
            },
            {
              "id": "10630",
              "name": "250",
              "results": 6
            },
            {
              "id": "8782475",
              "name": "Zs",
              "results": 5
            },
            {
              "id": "8782465",
              "name": "S2 Urban",
              "results": 5
            },
            {
              "id": "84859",
              "name": "Tercel",
              "results": 5
            },
            {
              "id": "71670",
              "name": "Orlando",
              "results": 5
            },
            {
              "id": "4940486",
              "name": "Yuan",
              "results": 5
            },
            {
              "id": "389620",
              "name": "Tiburon",
              "results": 5
            },
            {
              "id": "389614",
              "name": "T8",
              "results": 5
            },
            {
              "id": "389550",
              "name": "Niva",
              "results": 5
            },
            {
              "id": "389530",
              "name": "Lanos",
              "results": 5
            },
            {
              "id": "389527",
              "name": "L300",
              "results": 5
            },
            {
              "id": "389445",
              "name": "Clubman",
              "results": 5
            },
            {
              "id": "33878",
              "name": "V5",
              "results": 5
            },
            {
              "id": "26347",
              "name": "NP300",
              "results": 5
            },
            {
              "id": "2347939",
              "name": "Sport Trac",
              "results": 5
            },
            {
              "id": "18080",
              "name": "RX",
              "results": 5
            },
            {
              "id": "17764",
              "name": "21",
              "results": 5
            },
            {
              "id": "175584",
              "name": "A7",
              "results": 5
            },
            {
              "id": "1252902",
              "name": "LC",
              "results": 5
            },
            {
              "id": "110493",
              "name": "121",
              "results": 5
            },
            {
              "id": "109031",
              "name": "Monza",
              "results": 5
            },
            {
              "id": "1007112",
              "name": "Tiggo 2",
              "results": 5
            },
            {
              "id": "9787",
              "name": "550",
              "results": 4
            },
            {
              "id": "8943",
              "name": "100",
              "results": 4
            },
            {
              "id": "8782437",
              "name": "Eq1020Tf",
              "results": 4
            },
            {
              "id": "84858",
              "name": "Celica",
              "results": 4
            },
            {
              "id": "84821",
              "name": "Ghibli",
              "results": 4
            },
            {
              "id": "8037",
              "name": "1500",
              "results": 4
            },
            {
              "id": "7128943",
              "name": "KUV100",
              "results": 4
            },
            {
              "id": "68315",
              "name": "Town & Country",
              "results": 4
            },
            {
              "id": "68144",
              "name": "Escalade",
              "results": 4
            },
            {
              "id": "67281",
              "name": "Eclipse",
              "results": 4
            },
            {
              "id": "66648",
              "name": "Suburban",
              "results": 4
            },
            {
              "id": "64494",
              "name": "Zoe",
              "results": 4
            },
            {
              "id": "63974",
              "name": "Sonata",
              "results": 4
            },
            {
              "id": "62450",
              "name": "Juke",
              "results": 4
            },
            {
              "id": "62030",
              "name": "XF",
              "results": 4
            },
            {
              "id": "60704",
              "name": "Altima",
              "results": 4
            },
            {
              "id": "6047",
              "name": "Q",
              "results": 4
            },
            {
              "id": "60388",
              "name": "Camry",
              "results": 4
            },
            {
              "id": "503697",
              "name": "MX-5",
              "results": 4
            },
            {
              "id": "503690",
              "name": "Leaf",
              "results": 4
            },
            {
              "id": "503658",
              "name": "Pregio",
              "results": 4
            },
            {
              "id": "4669133",
              "name": "405",
              "results": 4
            },
            {
              "id": "389654",
              "name": "Xsara Picasso",
              "results": 4
            },
            {
              "id": "389638",
              "name": "Vera Cruz",
              "results": 4
            },
            {
              "id": "389452",
              "name": "Cross Up",
              "results": 4
            },
            {
              "id": "3228238",
              "name": "Ioniq",
              "results": 4
            },
            {
              "id": "2243259",
              "name": "Pick Up",
              "results": 4
            },
            {
              "id": "16776",
              "name": "GT",
              "results": 4
            },
            {
              "id": "1252988",
              "name": "Clase SLC",
              "results": 4
            },
            {
              "id": "1252900",
              "name": "MÃ©gane III",
              "results": 4
            },
            {
              "id": "1252890",
              "name": "R 4",
              "results": 4
            },
            {
              "id": "1252866",
              "name": "Furgon",
              "results": 4
            },
            {
              "id": "1119451",
              "name": "718",
              "results": 4
            },
            {
              "id": "1046544",
              "name": "NP300 Frontier",
              "results": 4
            },
            {
              "id": "1007100",
              "name": "WRX",
              "results": 4
            },
            {
              "id": "1007098",
              "name": "Levante",
              "results": 4
            },
            {
              "id": "8818125",
              "name": "E-tron",
              "results": 3
            },
            {
              "id": "8782449",
              "name": "Mustang Shelby",
              "results": 3
            },
            {
              "id": "8782441",
              "name": "K05S",
              "results": 3
            },
            {
              "id": "8701049",
              "name": "Q3 Sportback",
              "results": 3
            },
            {
              "id": "84857",
              "name": "Corona",
              "results": 3
            },
            {
              "id": "84800",
              "name": "Festiva",
              "results": 3
            },
            {
              "id": "84788",
              "name": "Chevette",
              "results": 3
            },
            {
              "id": "76866",
              "name": "F-250",
              "results": 3
            },
            {
              "id": "76864",
              "name": "F-350",
              "results": 3
            },
            {
              "id": "7556088",
              "name": "Tiggo 4",
              "results": 3
            },
            {
              "id": "68376",
              "name": "280 SE",
              "results": 3
            },
            {
              "id": "66850",
              "name": "Galant",
              "results": 3
            },
            {
              "id": "62298",
              "name": "370Z",
              "results": 3
            },
            {
              "id": "62180",
              "name": "Crafter",
              "results": 3
            },
            {
              "id": "61398",
              "name": "F-Type",
              "results": 3
            },
            {
              "id": "60472",
              "name": "Kizashi",
              "results": 3
            },
            {
              "id": "5958944",
              "name": "VELOCE",
              "results": 3
            },
            {
              "id": "5958924",
              "name": "ZONORA",
              "results": 3
            },
            {
              "id": "5958889",
              "name": "JUNYI",
              "results": 3
            },
            {
              "id": "5958884",
              "name": "FJ",
              "results": 3
            },
            {
              "id": "5958871",
              "name": "I40",
              "results": 3
            },
            {
              "id": "5958859",
              "name": "YOKI",
              "results": 3
            },
            {
              "id": "5958856",
              "name": "NICE",
              "results": 3
            },
            {
              "id": "5958849",
              "name": "NUEVO JETTA",
              "results": 3
            },
            {
              "id": "5958848",
              "name": "LUV D-MAX",
              "results": 3
            },
            {
              "id": "503709",
              "name": "CLK",
              "results": 3
            },
            {
              "id": "503686",
              "name": "John Cooper Works",
              "results": 3
            },
            {
              "id": "503666",
              "name": "Econoline",
              "results": 3
            },
            {
              "id": "503659",
              "name": "Pride",
              "results": 3
            },
            {
              "id": "49634",
              "name": "H2",
              "results": 3
            },
            {
              "id": "47432",
              "name": "Raptor",
              "results": 3
            },
            {
              "id": "46833",
              "name": "R8",
              "results": 3
            },
            {
              "id": "418332",
              "name": "H6",
              "results": 3
            },
            {
              "id": "389649",
              "name": "Wagon",
              "results": 3
            },
            {
              "id": "389619",
              "name": "Terrano",
              "results": 3
            },
            {
              "id": "389576",
              "name": "Quoris",
              "results": 3
            },
            {
              "id": "389573",
              "name": "Premio",
              "results": 3
            },
            {
              "id": "389501",
              "name": "Grand ScÃ©nic",
              "results": 3
            },
            {
              "id": "389475",
              "name": "Excel",
              "results": 3
            },
            {
              "id": "389466",
              "name": "Duna",
              "results": 3
            },
            {
              "id": "389417",
              "name": "Carnival",
              "results": 3
            },
            {
              "id": "389401",
              "name": "Berlingo",
              "results": 3
            },
            {
              "id": "3228228",
              "name": "Nueva Ranger",
              "results": 3
            },
            {
              "id": "31919",
              "name": "C31",
              "results": 3
            },
            {
              "id": "2347960",
              "name": "Forman",
              "results": 3
            },
            {
              "id": "2347932",
              "name": "B-CROSS",
              "results": 3
            },
            {
              "id": "2318085",
              "name": "Ruiyi",
              "results": 3
            },
            {
              "id": "2318064",
              "name": "Grand Tiggo",
              "results": 3
            },
            {
              "id": "2109416",
              "name": "Refine",
              "results": 3
            },
            {
              "id": "2109396",
              "name": "M 4",
              "results": 3
            },
            {
              "id": "2109387",
              "name": "C-10",
              "results": 3
            },
            {
              "id": "2109378",
              "name": "Luzun",
              "results": 3
            },
            {
              "id": "16806",
              "name": "Stylus",
              "results": 3
            },
            {
              "id": "16258",
              "name": "C2",
              "results": 3
            },
            {
              "id": "15180",
              "name": "Astra",
              "results": 3
            },
            {
              "id": "1252936",
              "name": "C3 Aircross",
              "results": 3
            },
            {
              "id": "1252929",
              "name": "Saxo",
              "results": 3
            },
            {
              "id": "1252892",
              "name": "R 12",
              "results": 3
            },
            {
              "id": "1245805",
              "name": "K 2700",
              "results": 3
            },
            {
              "id": "1119444",
              "name": "Ciaz",
              "results": 3
            },
            {
              "id": "10517",
              "name": "350",
              "results": 3
            },
            {
              "id": "102288",
              "name": "S6",
              "results": 3
            },
            {
              "id": "9894",
              "name": "205",
              "results": 2
            },
            {
              "id": "97270",
              "name": "Vision",
              "results": 2
            },
            {
              "id": "94474",
              "name": "Bolt",
              "results": 2
            },
            {
              "id": "8782474",
              "name": "Grand Carnival Sedona",
              "results": 2
            },
            {
              "id": "8782423",
              "name": "Kenbo",
              "results": 2
            },
            {
              "id": "8679212",
              "name": "Ranger Raptor",
              "results": 2
            },
            {
              "id": "85036",
              "name": "Palio Adventure",
              "results": 2
            },
            {
              "id": "84807",
              "name": "Azera",
              "results": 2
            },
            {
              "id": "84803",
              "name": "Prelude",
              "results": 2
            },
            {
              "id": "8272",
              "name": "1000",
              "results": 2
            },
            {
              "id": "7556082",
              "name": "DS7 Crossback",
              "results": 2
            },
            {
              "id": "7556080",
              "name": "CS15",
              "results": 2
            },
            {
              "id": "73890",
              "name": "Punto",
              "results": 2
            },
            {
              "id": "7276",
              "name": "2500",
              "results": 2
            },
            {
              "id": "7128937",
              "name": "Eclipse Cross",
              "results": 2
            },
            {
              "id": "69624",
              "name": "SRX",
              "results": 2
            },
            {
              "id": "69057",
              "name": "Grandis",
              "results": 2
            },
            {
              "id": "68883",
              "name": "Serie 8",
              "results": 2
            },
            {
              "id": "68310",
              "name": "Stilo",
              "results": 2
            },
            {
              "id": "67343",
              "name": "Apache",
              "results": 2
            },
            {
              "id": "67216",
              "name": "Lobo",
              "results": 2
            },
            {
              "id": "67047",
              "name": "Continental",
              "results": 2
            },
            {
              "id": "66918",
              "name": "Ram 1500",
              "results": 2
            },
            {
              "id": "66797",
              "name": "Malibu",
              "results": 2
            },
            {
              "id": "66594",
              "name": "M6",
              "results": 2
            },
            {
              "id": "64610",
              "name": "JX",
              "results": 2
            },
            {
              "id": "63326",
              "name": "RCZ",
              "results": 2
            },
            {
              "id": "62528",
              "name": "QX60",
              "results": 2
            },
            {
              "id": "62424",
              "name": "QX80",
              "results": 2
            },
            {
              "id": "61783",
              "name": "MDX",
              "results": 2
            },
            {
              "id": "61393",
              "name": "Vito",
              "results": 2
            },
            {
              "id": "60830",
              "name": "Altea",
              "results": 2
            },
            {
              "id": "59791",
              "name": "S5",
              "results": 2
            },
            {
              "id": "59778",
              "name": "Star",
              "results": 2
            },
            {
              "id": "5958872",
              "name": "SANTRO",
              "results": 2
            },
            {
              "id": "5958832",
              "name": "XTREAM",
              "results": 2
            },
            {
              "id": "58843",
              "name": "147",
              "results": 2
            },
            {
              "id": "52421",
              "name": "NX",
              "results": 2
            },
            {
              "id": "503714",
              "name": "Rubicon",
              "results": 2
            },
            {
              "id": "503708",
              "name": "GLA",
              "results": 2
            },
            {
              "id": "503703",
              "name": "Mazda 2",
              "results": 2
            },
            {
              "id": "503631",
              "name": "Clase CLS",
              "results": 2
            },
            {
              "id": "493975",
              "name": "Sunny",
              "results": 2
            },
            {
              "id": "47582",
              "name": "AX",
              "results": 2
            },
            {
              "id": "39826",
              "name": "M5",
              "results": 2
            },
            {
              "id": "389653",
              "name": "Xsara",
              "results": 2
            },
            {
              "id": "389623",
              "name": "Tipo",
              "results": 2
            },
            {
              "id": "389588",
              "name": "Scorpio",
              "results": 2
            },
            {
              "id": "389574",
              "name": "Primera",
              "results": 2
            },
            {
              "id": "389560",
              "name": "Palio Weekend",
              "results": 2
            },
            {
              "id": "389552",
              "name": "Nubira",
              "results": 2
            },
            {
              "id": "389524",
              "name": "Jumper",
              "results": 2
            },
            {
              "id": "389503",
              "name": "Grand Sportage",
              "results": 2
            },
            {
              "id": "389499",
              "name": "Grand Move",
              "results": 2
            },
            {
              "id": "389497",
              "name": "Grand C4 Picasso",
              "results": 2
            },
            {
              "id": "389486",
              "name": "Foison",
              "results": 2
            },
            {
              "id": "389474",
              "name": "Evasion",
              "results": 2
            },
            {
              "id": "389410",
              "name": "C4 Picasso",
              "results": 2
            },
            {
              "id": "3871",
              "name": "S80",
              "results": 2
            },
            {
              "id": "3769990",
              "name": "CS 15",
              "results": 2
            },
            {
              "id": "35214",
              "name": "Titan",
              "results": 2
            },
            {
              "id": "34318",
              "name": "X60",
              "results": 2
            },
            {
              "id": "33283",
              "name": "X70",
              "results": 2
            },
            {
              "id": "2400668",
              "name": "A113",
              "results": 2
            },
            {
              "id": "2347925",
              "name": "Wingle",
              "results": 2
            },
            {
              "id": "2243265",
              "name": "GLE",
              "results": 2
            },
            {
              "id": "2220951",
              "name": "K2500",
              "results": 2
            },
            {
              "id": "2109382",
              "name": "F0",
              "results": 2
            },
            {
              "id": "2109381",
              "name": "Benni",
              "results": 2
            },
            {
              "id": "2109379",
              "name": "CS 35",
              "results": 2
            },
            {
              "id": "2109326",
              "name": "Rich",
              "results": 2
            },
            {
              "id": "2011",
              "name": "Delta",
              "results": 2
            },
            {
              "id": "1252976",
              "name": "K2700 Pick-Up",
              "results": 2
            },
            {
              "id": "1252955",
              "name": "Ad Wagon",
              "results": 2
            },
            {
              "id": "1252941",
              "name": "Clase CLC",
              "results": 2
            },
            {
              "id": "1252915",
              "name": "Santamo",
              "results": 2
            },
            {
              "id": "1252897",
              "name": "ScÃ©nic",
              "results": 2
            },
            {
              "id": "1252846",
              "name": "Sumo",
              "results": 2
            },
            {
              "id": "11688225",
              "name": "Taycan",
              "results": 2
            },
            {
              "id": "10627",
              "name": "Quest",
              "results": 2
            },
            {
              "id": "10203",
              "name": "Legend",
              "results": 2
            },
            {
              "id": "1007131",
              "name": "RS Q3",
              "results": 2
            },
            {
              "id": "9980",
              "name": "245",
              "results": 1
            },
            {
              "id": "9475",
              "name": "420",
              "results": 1
            },
            {
              "id": "93448",
              "name": "Cayenne S",
              "results": 1
            },
            {
              "id": "9159",
              "name": "3000",
              "results": 1
            },
            {
              "id": "9029",
              "name": "Flyer",
              "results": 1
            },
            {
              "id": "8818118",
              "name": "Camioneta baja",
              "results": 1
            },
            {
              "id": "8818115",
              "name": "C5 Aircross",
              "results": 1
            },
            {
              "id": "8818112",
              "name": "Crossback",
              "results": 1
            },
            {
              "id": "8818108",
              "name": "XJ6",
              "results": 1
            },
            {
              "id": "8818106",
              "name": "Mz45",
              "results": 1
            },
            {
              "id": "8818105",
              "name": "Mz40",
              "results": 1
            },
            {
              "id": "8799",
              "name": "Brio",
              "results": 1
            },
            {
              "id": "8782473",
              "name": "Tribeca B9",
              "results": 1
            },
            {
              "id": "8782466",
              "name": "Tiger 5",
              "results": 1
            },
            {
              "id": "8782450",
              "name": "Ec",
              "results": 1
            },
            {
              "id": "8782448",
              "name": "Zastava",
              "results": 1
            },
            {
              "id": "8782443",
              "name": "V29",
              "results": 1
            },
            {
              "id": "8782438",
              "name": "Eq1021Gf 24Q",
              "results": 1
            },
            {
              "id": "8782436",
              "name": "Eq1020Tf T03",
              "results": 1
            },
            {
              "id": "8782435",
              "name": "Duolika",
              "results": 1
            },
            {
              "id": "8782431",
              "name": "Sportvan",
              "results": 1
            },
            {
              "id": "8782428",
              "name": "Star 7",
              "results": 1
            },
            {
              "id": "8701048",
              "name": "A5 Sportback",
              "results": 1
            },
            {
              "id": "8569065",
              "name": "CH-R",
              "results": 1
            },
            {
              "id": "856",
              "name": "F50",
              "results": 1
            },
            {
              "id": "85230",
              "name": "TTS",
              "results": 1
            },
            {
              "id": "84994",
              "name": "X5 M",
              "results": 1
            },
            {
              "id": "84860",
              "name": "Previa",
              "results": 1
            },
            {
              "id": "84835",
              "name": "Expo",
              "results": 1
            },
            {
              "id": "84826",
              "name": "Protege",
              "results": 1
            },
            {
              "id": "8266732",
              "name": "Yumsun",
              "results": 1
            },
            {
              "id": "8161471",
              "name": "F-150 Raptor",
              "results": 1
            },
            {
              "id": "76702",
              "name": "F-450",
              "results": 1
            },
            {
              "id": "7556083",
              "name": "Model 3",
              "results": 1
            },
            {
              "id": "72340",
              "name": "GLC",
              "results": 1
            },
            {
              "id": "72275",
              "name": "GranTurismo",
              "results": 1
            },
            {
              "id": "7167",
              "name": "408",
              "results": 1
            },
            {
              "id": "70723",
              "name": "D 350",
              "results": 1
            },
            {
              "id": "69631",
              "name": "Verna",
              "results": 1
            },
            {
              "id": "68964",
              "name": "Impala",
              "results": 1
            },
            {
              "id": "68906",
              "name": "Pacifica",
              "results": 1
            },
            {
              "id": "68529",
              "name": "Endeavor",
              "results": 1
            },
            {
              "id": "68238",
              "name": "Explorer Sport Trac",
              "results": 1
            },
            {
              "id": "68124",
              "name": "Quattroporte",
              "results": 1
            },
            {
              "id": "67986",
              "name": "D 100",
              "results": 1
            },
            {
              "id": "67714",
              "name": "159",
              "results": 1
            },
            {
              "id": "67572",
              "name": "Maverick",
              "results": 1
            },
            {
              "id": "67558",
              "name": "Caravan",
              "results": 1
            },
            {
              "id": "67551",
              "name": "Taurus",
              "results": 1
            },
            {
              "id": "67052",
              "name": "Navigator",
              "results": 1
            },
            {
              "id": "66935",
              "name": "Ram 2500",
              "results": 1
            },
            {
              "id": "66914",
              "name": "Cavalier",
              "results": 1
            },
            {
              "id": "66771",
              "name": "Dakota",
              "results": 1
            },
            {
              "id": "66667",
              "name": "Captiva Sport",
              "results": 1
            },
            {
              "id": "66613",
              "name": "Seville",
              "results": 1
            },
            {
              "id": "66140",
              "name": "Pick-Up",
              "results": 1
            },
            {
              "id": "64624",
              "name": "Cabriolet",
              "results": 1
            },
            {
              "id": "64076",
              "name": "Datsun",
              "results": 1
            },
            {
              "id": "63927",
              "name": "Avalon",
              "results": 1
            },
            {
              "id": "63428",
              "name": "Matiz",
              "results": 1
            },
            {
              "id": "6310",
              "name": "760",
              "results": 1
            },
            {
              "id": "62898",
              "name": "CJ7",
              "results": 1
            },
            {
              "id": "62880",
              "name": "XC70",
              "results": 1
            },
            {
              "id": "62779",
              "name": "Grand Wagoneer",
              "results": 1
            },
            {
              "id": "62274",
              "name": "406",
              "results": 1
            },
            {
              "id": "62117",
              "name": "Cabstar",
              "results": 1
            },
            {
              "id": "62037",
              "name": "CJ5",
              "results": 1
            },
            {
              "id": "61853",
              "name": "Toledo",
              "results": 1
            },
            {
              "id": "61747",
              "name": "9-5",
              "results": 1
            },
            {
              "id": "61327",
              "name": "Laguna",
              "results": 1
            },
            {
              "id": "61188",
              "name": "Armada",
              "results": 1
            },
            {
              "id": "61084",
              "name": "Doble Cabina",
              "results": 1
            },
            {
              "id": "61025",
              "name": "XK",
              "results": 1
            },
            {
              "id": "60815",
              "name": "Transporter",
              "results": 1
            },
            {
              "id": "60640",
              "name": "X-Type",
              "results": 1
            },
            {
              "id": "60601",
              "name": "XJ",
              "results": 1
            },
            {
              "id": "60415",
              "name": "Sequoia",
              "results": 1
            },
            {
              "id": "60397",
              "name": "Patriot",
              "results": 1
            },
            {
              "id": "60348",
              "name": "TSX",
              "results": 1
            },
            {
              "id": "60298",
              "name": "Sienna",
              "results": 1
            },
            {
              "id": "59624",
              "name": "F3",
              "results": 1
            },
            {
              "id": "5958985",
              "name": "GRAND TIGER",
              "results": 1
            },
            {
              "id": "5958946",
              "name": "SMILE",
              "results": 1
            },
            {
              "id": "5958933",
              "name": "LEONE",
              "results": 1
            },
            {
              "id": "5958932",
              "name": "DEMON",
              "results": 1
            },
            {
              "id": "5958916",
              "name": "JOYEAR",
              "results": 1
            },
            {
              "id": "5958891",
              "name": "STAR VAN",
              "results": 1
            },
            {
              "id": "5958883",
              "name": "MACHO",
              "results": 1
            },
            {
              "id": "5958864",
              "name": "B1600",
              "results": 1
            },
            {
              "id": "5958857",
              "name": "VANCARGO",
              "results": 1
            },
            {
              "id": "5958855",
              "name": "VAN PASS",
              "results": 1
            },
            {
              "id": "5958854",
              "name": "ETOILE",
              "results": 1
            },
            {
              "id": "5958846",
              "name": "BELAIR",
              "results": 1
            },
            {
              "id": "5958829",
              "name": "XYLO",
              "results": 1
            },
            {
              "id": "58957",
              "name": "XL7",
              "results": 1
            },
            {
              "id": "58436",
              "name": "Family",
              "results": 1
            },
            {
              "id": "583587",
              "name": "F25",
              "results": 1
            },
            {
              "id": "576584",
              "name": "Crown",
              "results": 1
            },
            {
              "id": "561313",
              "name": "Rapid",
              "results": 1
            },
            {
              "id": "56013",
              "name": "520",
              "results": 1
            },
            {
              "id": "527000",
              "name": "Bluebird",
              "results": 1
            },
            {
              "id": "52379",
              "name": "H1",
              "results": 1
            },
            {
              "id": "50877",
              "name": "940",
              "results": 1
            },
            {
              "id": "506855",
              "name": "H220",
              "results": 1
            },
            {
              "id": "503701",
              "name": "Mazda 3",
              "results": 1
            },
            {
              "id": "503660",
              "name": "Sedona",
              "results": 1
            },
            {
              "id": "503656",
              "name": "Forte",
              "results": 1
            },
            {
              "id": "503634",
              "name": "Clase R",
              "results": 1
            },
            {
              "id": "48710",
              "name": "TL",
              "results": 1
            },
            {
              "id": "47303",
              "name": "508",
              "results": 1
            },
            {
              "id": "42378",
              "name": "407",
              "results": 1
            },
            {
              "id": "41716",
              "name": "106",
              "results": 1
            },
            {
              "id": "41497",
              "name": "Bravo",
              "results": 1
            },
            {
              "id": "389643",
              "name": "Vivio",
              "results": 1
            },
            {
              "id": "389610",
              "name": "Syclone",
              "results": 1
            },
            {
              "id": "389604",
              "name": "SSR",
              "results": 1
            },
            {
              "id": "389599",
              "name": "Spacefox",
              "results": 1
            },
            {
              "id": "389598",
              "name": "Space Wagon",
              "results": 1
            },
            {
              "id": "389590",
              "name": "Serie 3 Touring",
              "results": 1
            },
            {
              "id": "389589",
              "name": "Sephia",
              "results": 1
            },
            {
              "id": "389562",
              "name": "Parati",
              "results": 1
            },
            {
              "id": "389558",
              "name": "Paceman",
              "results": 1
            },
            {
              "id": "389557",
              "name": "Opirus",
              "results": 1
            },
            {
              "id": "389548",
              "name": "Musso",
              "results": 1
            },
            {
              "id": "389535",
              "name": "Magentis",
              "results": 1
            },
            {
              "id": "389531",
              "name": "Leganza",
              "results": 1
            },
            {
              "id": "389529",
              "name": "Land Cruiser Prado",
              "results": 1
            },
            {
              "id": "389465",
              "name": "DS5",
              "results": 1
            },
            {
              "id": "389453",
              "name": "CRX",
              "results": 1
            },
            {
              "id": "389421",
              "name": "Charade",
              "results": 1
            },
            {
              "id": "36577",
              "name": "H100",
              "results": 1
            },
            {
              "id": "3572355",
              "name": "K01",
              "results": 1
            },
            {
              "id": "35328",
              "name": "X30",
              "results": 1
            },
            {
              "id": "3487212",
              "name": "Vigus",
              "results": 1
            },
            {
              "id": "34189",
              "name": "E1",
              "results": 1
            },
            {
              "id": "33743",
              "name": "S4",
              "results": 1
            },
            {
              "id": "3349536",
              "name": "EVEREST",
              "results": 1
            },
            {
              "id": "32360",
              "name": "V60",
              "results": 1
            },
            {
              "id": "3228241",
              "name": "Dzire",
              "results": 1
            },
            {
              "id": "27251",
              "name": "7",
              "results": 1
            },
            {
              "id": "26060",
              "name": "HD65",
              "results": 1
            },
            {
              "id": "256745",
              "name": "S7",
              "results": 1
            },
            {
              "id": "25056",
              "name": "460",
              "results": 1
            },
            {
              "id": "246464",
              "name": "H5",
              "results": 1
            },
            {
              "id": "2400679",
              "name": "C37",
              "results": 1
            },
            {
              "id": "2400678",
              "name": "V27",
              "results": 1
            },
            {
              "id": "2347959",
              "name": "Campero",
              "results": 1
            },
            {
              "id": "2318141",
              "name": "Grace",
              "results": 1
            },
            {
              "id": "2318133",
              "name": "D-21",
              "results": 1
            },
            {
              "id": "2318125",
              "name": "MG 3",
              "results": 1
            },
            {
              "id": "2318122",
              "name": "Stavic",
              "results": 1
            },
            {
              "id": "2318088",
              "name": "Voleex C30",
              "results": 1
            },
            {
              "id": "2318063",
              "name": "IQ 1100",
              "results": 1
            },
            {
              "id": "2318056",
              "name": "Oting",
              "results": 1
            },
            {
              "id": "2251655",
              "name": "Tiguan Allspace",
              "results": 1
            },
            {
              "id": "2243266",
              "name": "GLS",
              "results": 1
            },
            {
              "id": "2220976",
              "name": "Tiggo 3",
              "results": 1
            },
            {
              "id": "2220967",
              "name": "Terrano II",
              "results": 1
            },
            {
              "id": "2220965",
              "name": "Ceres",
              "results": 1
            },
            {
              "id": "2220952",
              "name": "Sephia ii",
              "results": 1
            },
            {
              "id": "2220938",
              "name": "Clase ML",
              "results": 1
            },
            {
              "id": "2201540",
              "name": "Model X",
              "results": 1
            },
            {
              "id": "2176998",
              "name": "C35",
              "results": 1
            },
            {
              "id": "2109414",
              "name": "JCW",
              "results": 1
            },
            {
              "id": "2109412",
              "name": "MK",
              "results": 1
            },
            {
              "id": "2109364",
              "name": "Canter",
              "results": 1
            },
            {
              "id": "2109327",
              "name": "Indica",
              "results": 1
            },
            {
              "id": "2109325",
              "name": "Succe",
              "results": 1
            },
            {
              "id": "2109297",
              "name": "Mini Van Cargo",
              "results": 1
            },
            {
              "id": "2097605",
              "name": "R 21",
              "results": 1
            },
            {
              "id": "200949",
              "name": "Freedom",
              "results": 1
            },
            {
              "id": "1596",
              "name": "T3",
              "results": 1
            },
            {
              "id": "15021",
              "name": "Coupe",
              "results": 1
            },
            {
              "id": "14748",
              "name": "Dart",
              "results": 1
            },
            {
              "id": "139381",
              "name": "Qin",
              "results": 1
            },
            {
              "id": "13441",
              "name": "968",
              "results": 1
            },
            {
              "id": "1252970",
              "name": "Rocky",
              "results": 1
            },
            {
              "id": "1252962",
              "name": "Wagon R",
              "results": 1
            },
            {
              "id": "1252938",
              "name": "Clase CLK",
              "results": 1
            },
            {
              "id": "1252933",
              "name": "2CV",
              "results": 1
            },
            {
              "id": "1252909",
              "name": "Damas",
              "results": 1
            },
            {
              "id": "1252907",
              "name": "Tacuma",
              "results": 1
            },
            {
              "id": "1252905",
              "name": "Fulwin",
              "results": 1
            },
            {
              "id": "1252893",
              "name": "R 18",
              "results": 1
            },
            {
              "id": "1241787",
              "name": "X25",
              "results": 1
            },
            {
              "id": "12254",
              "name": "280",
              "results": 1
            },
            {
              "id": "120048",
              "name": "300 D",
              "results": 1
            },
            {
              "id": "1165458",
              "name": "244",
              "results": 1
            },
            {
              "id": "1148987",
              "name": "Daily",
              "results": 1
            },
            {
              "id": "11447",
              "name": "Express",
              "results": 1
            },
            {
              "id": "1119453",
              "name": "Golf GTI",
              "results": 1
            },
            {
              "id": "110580",
              "name": "488",
              "results": 1
            },
            {
              "id": "10498",
              "name": "330",
              "results": 1
            },
            {
              "id": "10490",
              "name": "325",
              "results": 1
            },
            {
              "id": "10481",
              "name": "4008",
              "results": 1
            },
            {
              "id": "10470",
              "name": "90",
              "results": 1
            },
            {
              "id": "1046562",
              "name": "Bolt EV",
              "results": 1
            },
            {
              "id": "1046560",
              "name": "570 S Spyder",
              "results": 1
            },
            {
              "id": "102",
              "name": "320",
              "results": 1
            },
            {
              "id": "1007120",
              "name": "Range Rover Vogue",
              "results": 1
            },
            {
              "id": "1007105",
              "name": "V22 Pick-Up",
              "results": 1
            },
            {
              "id": "1007090",
              "name": "Sandero Stepway",
              "results": 1
            }
          ]
        },
        {
          "id": "SHIPPING_ORIGIN",
          "name": "Tipo de compra",
          "type": "STRING",
          "values": [
            {
              "id": "10215068",
              "name": "Local",
              "results": 39690
            }
          ]
        },
        {
          "id": "STEERING",
          "name": "DirecciÃ³n",
          "type": "STRING",
          "values": [
            {
              "id": "370874",
              "name": "HidrÃ¡ulica",
              "results": 14595
            },
            {
              "id": "405719",
              "name": "Electroasistida",
              "results": 2833
            },
            {
              "id": "370873",
              "name": "Asistida",
              "results": 2384
            },
            {
              "id": "370875",
              "name": "MecÃ¡nica",
              "results": 368
            }
          ]
        },
        {
          "id": "TRACTION_CONTROL",
          "name": "Control de tracciÃ³n",
          "type": "STRING",
          "values": [
            {
              "id": "493979",
              "name": "Delantera",
              "results": 14952
            },
            {
              "id": "370880",
              "name": "4x4",
              "results": 9682
            },
            {
              "id": "370879",
              "name": "4x2",
              "results": 8300
            },
            {
              "id": "493980",
              "name": "Trasera",
              "results": 1062
            }
          ]
        },
        {
          "id": "TRANSMISSION",
          "name": "TransmisiÃ³n",
          "type": "STRING",
          "values": [
            {
              "id": "370877",
              "name": "MecÃ¡nica",
              "results": 19952
            },
            {
              "id": "370876",
              "name": "AutomÃ¡tica",
              "results": 19738
            }
          ]
        },
        {
          "id": "VEHICLE_BODY_TYPE",
          "name": "Tipo de carrocerÃ­a",
          "type": "STRING",
          "values": [
            {
              "id": "452761",
              "name": "Camioneta",
              "results": 12311
            },
            {
              "id": "452758",
              "name": "SedÃ¡n",
              "results": 8381
            },
            {
              "id": "479344",
              "name": "Hatchback",
              "results": 7723
            },
            {
              "id": "452756",
              "name": "Pick-Up",
              "results": 2349
            },
            {
              "id": "452759",
              "name": "SUV",
              "results": 918
            },
            {
              "id": "452760",
              "name": "Station Wagon",
              "results": 904
            },
            {
              "id": "452749",
              "name": "CoupÃ©",
              "results": 687
            },
            {
              "id": "452750",
              "name": "FurgÃ³n",
              "results": 272
            },
            {
              "id": "452748",
              "name": "Convertible",
              "results": 185
            },
            {
              "id": "452754",
              "name": "Off-Road",
              "results": 65
            },
            {
              "id": "452755",
              "name": "Van",
              "results": 64
            },
            {
              "id": "452752",
              "name": "Monovolumen",
              "results": 23
            },
            {
              "id": "452753",
              "name": "Minivan",
              "results": 22
            },
            {
              "id": "452757",
              "name": "Roadster",
              "results": 11
            },
            {
              "id": "452751",
              "name": "Light Truck",
              "results": 7
            }
          ]
        },
        {
          "id": "VEHICLE_YEAR",
          "name": "AÃ±o",
          "type": "range",
          "values": [
            {
              "id": "[2023-2023]",
              "name": "2023",
              "results": 2096
            },
            {
              "id": "[2022-2022]",
              "name": "2022",
              "results": 3273
            },
            {
              "id": "[2021-2021]",
              "name": "2021",
              "results": 2113
            },
            {
              "id": "[2020-2020]",
              "name": "2020",
              "results": 2819
            },
            {
              "id": "[2019-2019]",
              "name": "2019",
              "results": 2771
            },
            {
              "id": "[2018-2018]",
              "name": "2018",
              "results": 2593
            },
            {
              "id": "[2017-2017]",
              "name": "2017",
              "results": 2929
            },
            {
              "id": "[2016-2016]",
              "name": "2016",
              "results": 2442
            },
            {
              "id": "[2015-2015]",
              "name": "2015",
              "results": 2807
            },
            {
              "id": "[2014-2014]",
              "name": "2014",
              "results": 2400
            },
            {
              "id": "[2013-2013]",
              "name": "2013",
              "results": 2251
            },
            {
              "id": "[2012-2012]",
              "name": "2012",
              "results": 2015
            },
            {
              "id": "[2011-2011]",
              "name": "2011",
              "results": 1863
            },
            {
              "id": "[2010-2010]",
              "name": "2010",
              "results": 972
            },
            {
              "id": "[2009-2009]",
              "name": "2009",
              "results": 760
            },
            {
              "id": "[2008-2008]",
              "name": "2008",
              "results": 1049
            },
            {
              "id": "[2007-2007]",
              "name": "2007",
              "results": 839
            },
            {
              "id": "[2006-2006]",
              "name": "2006",
              "results": 555
            },
            {
              "id": "[2005-2005]",
              "name": "2005",
              "results": 381
            },
            {
              "id": "[2004-2004]",
              "name": "2004",
              "results": 234
            },
            {
              "id": "[2003-2003]",
              "name": "2003",
              "results": 173
            },
            {
              "id": "[2002-2002]",
              "name": "2002",
              "results": 125
            },
            {
              "id": "[2001-2001]",
              "name": "2001",
              "results": 90
            },
            {
              "id": "[2000-2000]",
              "name": "2000",
              "results": 88
            },
            {
              "id": "[1999-1999]",
              "name": "1999",
              "results": 128
            },
            {
              "id": "[1998-1998]",
              "name": "1998",
              "results": 257
            },
            {
              "id": "[1997-1997]",
              "name": "1997",
              "results": 295
            },
            {
              "id": "[1996-1996]",
              "name": "1996",
              "results": 305
            },
            {
              "id": "[1995-1995]",
              "name": "1995",
              "results": 182
            },
            {
              "id": "[1994-1994]",
              "name": "1994",
              "results": 141
            },
            {
              "id": "[1993-1993]",
              "name": "1993",
              "results": 104
            },
            {
              "id": "[1992-1992]",
              "name": "1992",
              "results": 60
            },
            {
              "id": "[1991-1991]",
              "name": "1991",
              "results": 53
            },
            {
              "id": "[1990-1990]",
              "name": "1990",
              "results": 29
            },
            {
              "id": "[1989-1989]",
              "name": "1989",
              "results": 29
            },
            {
              "id": "[1988-1988]",
              "name": "1988",
              "results": 20
            },
            {
              "id": "[1987-1987]",
              "name": "1987",
              "results": 23
            },
            {
              "id": "[1986-1986]",
              "name": "1986",
              "results": 24
            },
            {
              "id": "[1985-1985]",
              "name": "1985",
              "results": 28
            },
            {
              "id": "[1984-1984]",
              "name": "1984",
              "results": 15
            },
            {
              "id": "[1983-1983]",
              "name": "1983",
              "results": 35
            },
            {
              "id": "[1982-1982]",
              "name": "1982",
              "results": 48
            },
            {
              "id": "[1981-1981]",
              "name": "1981",
              "results": 29
            },
            {
              "id": "[1980-1980]",
              "name": "1980",
              "results": 29
            },
            {
              "id": "[1979-1979]",
              "name": "1979",
              "results": 21
            },
            {
              "id": "[1978-1978]",
              "name": "1978",
              "results": 31
            },
            {
              "id": "[1977-1977]",
              "name": "1977",
              "results": 18
            },
            {
              "id": "[1976-1976]",
              "name": "1976",
              "results": 6
            },
            {
              "id": "[1975-1975]",
              "name": "1975",
              "results": 6
            },
            {
              "id": "[1974-1974]",
              "name": "1974",
              "results": 17
            },
            {
              "id": "[1973-1973]",
              "name": "1973",
              "results": 4
            },
            {
              "id": "[1972-1972]",
              "name": "1972",
              "results": 14
            },
            {
              "id": "[1971-1971]",
              "name": "1971",
              "results": 7
            },
            {
              "id": "[1970-1970]",
              "name": "1970",
              "results": 9
            },
            {
              "id": "[1969-1969]",
              "name": "1969",
              "results": 3
            },
            {
              "id": "[1968-1968]",
              "name": "1968",
              "results": 4
            },
            {
              "id": "[1967-1967]",
              "name": "1967",
              "results": 4
            },
            {
              "id": "[1966-1966]",
              "name": "1966",
              "results": 6
            },
            {
              "id": "[1965-1965]",
              "name": "1965",
              "results": 2
            },
            {
              "id": "[1964-1964]",
              "name": "1964",
              "results": 2
            },
            {
              "id": "[1963-1963]",
              "name": "1963",
              "results": 1
            },
            {
              "id": "[1962-1962]",
              "name": "1962",
              "results": 2
            },
            {
              "id": "[1961-1961]",
              "name": "1961",
              "results": 10
            },
            {
              "id": "[1960-1960]",
              "name": "1960",
              "results": 2
            },
            {
              "id": "[1959-1959]",
              "name": "1959",
              "results": 5
            },
            {
              "id": "[1957-1957]",
              "name": "1957",
              "results": 2
            },
            {
              "id": "[1956-1956]",
              "name": "1956",
              "results": 6
            },
            {
              "id": "[1955-1955]",
              "name": "1955",
              "results": 13
            },
            {
              "id": "[1954-1954]",
              "name": "1954",
              "results": 9
            },
            {
              "id": "[1953-1953]",
              "name": "1953",
              "results": 5
            },
            {
              "id": "[1952-1952]",
              "name": "1952",
              "results": 2
            },
            {
              "id": "[1950-1950]",
              "name": "1950",
              "results": 2
            },
            {
              "id": "[1949-1949]",
              "name": "1949",
              "results": 1
            },
            {
              "id": "[1948-1948]",
              "name": "1948",
              "results": 1
            },
            {
              "id": "[1939-1939]",
              "name": "1939",
              "results": 1
            },
            {
              "id": "[1936-1936]",
              "name": "1936",
              "results": 1
            },
            {
              "id": "[1929-1929]",
              "name": "1929",
              "results": 1
            }
          ]
        }
      ]
    },
""".trimIndent()

val malformedGetCategories = """
    {
      "id": "MCO",
      "name": "Colombia",
      "country_id": "CO",
      "sale_fees_mode": "not_free",
      "mercadopago_version": 3,
      "default_currency_id": "COP",
      "immediate_payment": "optional",
      "payment_method_ids": [
        "MCOMP",
        "MCOWC",
        "MCOVS",
        "MCOMC",
        "MCOAM",
        "MCOWT",
        "MCOCO",
        "MCOMO",
        "MCOCH",
        "MCOBC",
        "MCOOT",
        "MCOPO",
        "MCOON"
      ],
      "settings": {
        "identification_types": [
          "C.C.",
          "C.E.",
          "RUT",
          "NIT"
        ],
        "taxpayer_types": [],
        "identification_types_rules": null
      },
      "currencies": [
        {
          "id": "COP",
          "symbol": "${'$'}"
        },
        {
          "id": "USD",
          "symbol": "U"
        }
      ],
      "categories": [
        {
          "id": "MCO1747",
          "name": "Accesorios para VehÃ­culos"
        },
        {
          "id": "MCO441917",
          "name": "Agro"
        },
        {
          "id": "MCO1403",
          "name": "Alimentos y Bebidas"
        },
        {
          "id": "MCO1071",
          "name": "Animales y Mascotas"
        },
        {
          "id": "MCO1367",
          "name": "AntigÃ¼edades y Colecciones"
        },
        {
          "id": "MCO1368",
          "name": "Arte, PapelerÃ­a y MercerÃ­a"
        },
        {
          "id": "MCO1384",
          "name": "BebÃ©s"
        },
        {
          "id": "MCO1246",
          "name": "Belleza y Cuidado Personal"
        },
        {
          "id": "MCO40433",
          "name": "Boletas para EspectÃ¡culos"
        },
        {
          "id": "MCO1039",
          "name": "CÃ¡maras y Accesorios"
        },
        {
          "id": "MCO1743",
          "name": "Carros, Motos y Otros"
        },
        {
          "id": "MCO1051",
          "name": "Celulares y TelÃ©fonos"
        },
        {
          "id": "MCO1648",
          "name": "ComputaciÃ³n"
        },
        {
          "id": "MCO1144",
          "name": "Consolas y Videojuegos"
        },
        {
          "id": "MCO172890",
          "name": "ConstrucciÃ³n"
        },
        {
          "id": "MCO1276",
          "name": "Deportes y Fitness"
        },
        {
          "id": "MCO5726",
          "name": "ElectrodomÃ©sticos"
        },
        {
          "id": "MCO1000",
          "name": "ElectrÃ³nica, Audio y Video"
        },
        {
          "id": "MCO175794",
          "name": "Herramientas"
        },
        {
          "id": "MCO1574",
          "name": "Hogar y Muebles"
        },
        {
          "id": "MCO1499",
          "name": "Industrias y Oficinas"
        },
        {
          "id": "MCO1459",
          "name": "Inmuebles"
        },
        {
          "id": "MCO1182",
          "name": "Instrumentos Musicales"
        },
        {
          "id": "MCO1132",
          "name": "Juegos y Juguetes"
        },
        {
          "id": "MCO3025",
          "name": "Libros, Revistas y Comics"
        },
        {
          "id": "MCO1168",
          "name": "MÃºsica, PelÃ­culas y Series"
        },
        {
          "id": "MCO118204",
          "name": "Recuerdos, PiÃ±aterÃ­a y Fiestas"
        },
        {
          "id": "MCO3937",
          "name": "Relojes y Joyas"
        },
        {
          "id": "MCO1430",
          "name": "Ropa y Accesorios"
        },
        {
          "id": "MCO180800",
          "name": "Salud y Equipamiento MÃ©dico"
        },
        {
          "id": "MCO1540",
          "name": "Servicios"
        },
        {
          "id": "MCO1953",
          "name": "Otras categorÃ­as"
        }
      ],
      "channels": [
        "marketplace",
        "mshops",
        "private",
        "mp-merchants"
      ]
    },
""".trimIndent()

val malformedGeDescription = """
    {
      "text": "",
      "plain_text": "Ponque Casero Biombo Vainilla X 220G PONQUE CASERO BIOMBO VAINILLA X 220G Presentacion: CAJA \n Marca: RAMO \n\n Garantia: Bajo evaluaciÃ³n del estado del producto al momento de la entrega, se hace reintegro o cambio del producto. Como tienda oficial, nos apegamos a las politicas de cambio y devoluciÃ³n de Mercadolibre y Mercadopago.",
      "last_updated": "2022-10-28T06:36:26.141Z",
      "date_created": "2021-02-19T03:56:36.000Z",
      "snapshot": {
        "url": "http://descriptions.mlstatic.com/D-MCO608207485.jpg?hash=8520c3b8559cb08aa7e782b8f5334ffe_0x0",
        "width": 0,
        "height": 0,
        "status": ""
      }
    },
""".trimIndent()

val malformedGetDetails = """
    {
      "id": "MCO608207485",
      "site_id": "MCO",
      "title": "Ponque Casero Biombo Vainilla X 220g",
      "subtitle": null,
      "seller_id": 280824856,
      "category_id": "MCO177945",
      "official_store_id": 1287,
      "price": 3550,
      "base_price": 3550,
      "original_price": null,
      "currency_id": "COP",
      "initial_quantity": 34,
      "available_quantity": 1,
      "sold_quantity": 5,
      "sale_terms": [],
      "buying_mode": "buy_it_now",
      "listing_type_id": "gold_special",
      "start_time": "2021-02-19T03:56:36.000Z",
      "stop_time": "2041-02-13T04:00:00.000Z",
      "condition": "new",
      "permalink": "https://articulo.mercadolibre.com.co/MCO-608207485-ponque-casero-biombo-vainilla-x-220g-_JM",
      "thumbnail_id": "794868-MCO44931443397_022021",
      "thumbnail": "http://http2.mlstatic.com/D_794868-MCO44931443397_022021-I.jpg",
      "secure_thumbnail": "https://http2.mlstatic.com/D_794868-MCO44931443397_022021-I.jpg",
      "pictures": [
        {
          "id": "794868-MCO44931443397_022021",
          "url": "http://http2.mlstatic.com/D_794868-MCO44931443397_022021-O.jpg",
          "secure_url": "https://http2.mlstatic.com/D_794868-MCO44931443397_022021-O.jpg",
          "size": "453x500",
          "max_size": "880x970",
          "quality": ""
        }
      ],
      "video_id": null,
      "descriptions": [],
      "accepts_mercadopago": true,
      "non_mercado_pago_payment_methods": [],
      "shipping": {
        "mode": "me2",
        "methods": [],
        "tags": [
          "self_service_in"
        ],
        "dimensions": null,
        "local_pick_up": false,
        "free_shipping": false,
        "logistic_type": "cross_docking",
        "store_pick_up": false
      },
      "international_delivery_mode": "none",
      "seller_address": {
        "city": {
          "id": "TUNPQ0FOVDMyNjIx",
          "name": "Antonio NariÃ±o"
        },
        "state": {
          "id": "CO-DC",
          "name": "BogotÃ¡ D.C."
        },
        "country": {
          "id": "CO",
          "name": "Colombia"
        },
        "search_location": {
          "neighborhood": {
            "id": "TUNPQlJFUzEzNjE1",
            "name": "Restrepo"
          },
          "city": {
            "id": "TUNPQ0FOVDMyNjIx",
            "name": "Antonio NariÃ±o"
          },
          "state": {
            "id": "TUNPUEJPR1gxMDljZA",
            "name": "BogotÃ¡ D.C."
          }
        },
        "id": 1127547780
      },
      "seller_contact": null,
      "location": {},
      "coverage_areas": [],
      "attributes": [
        {
          "id": "BRAND",
          "name": "Marca",
          "value_id": "11750302",
          "value_name": "Locatel",
          "value_struct": null,
          "values": [
            {
              "id": "11750302",
              "name": "Locatel",
              "struct": null
            }
          ],
          "attribute_group_id": "OTHERS",
          "attribute_group_name": "Otros"
        },
        {
          "id": "GTIN",
          "name": "CÃ³digo universal de producto",
          "value_id": null,
          "value_name": "7705326079152",
          "value_struct": null,
          "values": [
            {
              "id": null,
              "name": "7705326079152",
              "struct": null
            }
          ],
          "attribute_group_id": "OTHERS",
          "attribute_group_name": "Otros"
        },
        {
          "id": "ITEM_CONDITION",
          "name": "CondiciÃ³n del Ã­tem",
          "value_id": "2230284",
          "value_name": "Nuevo",
          "value_struct": null,
          "values": [
            {
              "id": "2230284",
              "name": "Nuevo",
              "struct": null
            }
          ],
          "attribute_group_id": "OTHERS",
          "attribute_group_name": "Otros"
        },
        {
          "id": "SELLER_SKU",
          "name": "SKU",
          "value_id": null,
          "value_name": "26715",
          "value_struct": null,
          "values": [
            {
              "id": null,
              "name": "26715",
              "struct": null
            }
          ],
          "attribute_group_id": "OTHERS",
          "attribute_group_name": "Otros"
        }
      ],
      "warnings": [],
      "listing_source": "",
      "variations": [],
      "status": "active",
      "sub_status": [],
      "tags": [
        "good_quality_picture",
        "good_quality_thumbnail",
        "loyalty_discount_eligible",
        "immediate_payment",
        "cart_eligible"
      ],
      "warranty": null,
      "catalog_product_id": null,
      "domain_id": "MCO-CANDIES",
      "parent_item_id": null,
      "differential_pricing": null,
      "deal_ids": [],
      "automatic_relist": false,
      "date_created": "2021-02-19T03:56:36.000Z",
      "last_updated": "2022-11-18T11:15:52.915Z",
      "health": 0.75,
      "catalog_listing": false,
      "channels": [
        "marketplace"
      ]
    },
""".trimIndent()