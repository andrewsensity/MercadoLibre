package com.andres.mercadolibre.domain.use_case

import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote

class GetDescriptionUseCase(
    private val repositoryRemote: MeliRepositoryRemote
) {
    suspend operator fun invoke(id: String) = repositoryRemote.getDescription(id)
}