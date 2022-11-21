package com.andres.mercadolibre.domain.use_case

import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote

class GetBySearchUseCase(
    private val repositoryRemote: MeliRepositoryRemote,
) {
    suspend operator fun invoke(product: String, limit: Int, offset: Int) =
        repositoryRemote.getBySearch(product, limit, offset)
}