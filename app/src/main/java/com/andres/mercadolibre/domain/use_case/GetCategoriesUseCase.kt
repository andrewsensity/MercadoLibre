package com.andres.mercadolibre.domain.use_case

import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote

class GetCategoriesUseCase(
    private val repositoryRemote: MeliRepositoryRemote,
) {

    suspend operator fun invoke() = repositoryRemote.getCategories()
}