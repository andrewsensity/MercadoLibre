package com.andres.mercadolibre.di

import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote
import com.andres.mercadolibre.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MeliDomainModule {

    @ViewModelScoped
    @Provides
    fun provideMeliUseCases(
        meliRepositoryRemote: MeliRepositoryRemote,
    ): MeliUseCases {
        return MeliUseCases(
            getDescriptionUseCase = GetDescriptionUseCase(meliRepositoryRemote),
            getDetailUseCase = GetDetailUseCase(meliRepositoryRemote),
            getBySearchUseCase = GetBySearchUseCase(meliRepositoryRemote),
            getCategoriesUseCase = GetCategoriesUseCase(meliRepositoryRemote)
        )
    }
}