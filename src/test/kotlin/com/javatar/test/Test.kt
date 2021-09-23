package com.javatar.test

import com.javatar.component.Component
import com.javatar.component.di.DependencyInjection
import org.junit.jupiter.api.Test
import org.koin.core.annotation.KoinInternalApi
import org.koin.core.context.GlobalContext
import org.koin.core.context.startKoin
import org.koin.core.definition.BeanDefinition
import org.koin.core.definition.Kind
import org.koin.core.definition.indexKey
import org.koin.core.instance.ScopedInstanceFactory
import org.koin.dsl.module
import kotlin.reflect.KClass

class Test {

    object KoinDI : DependencyInjection {
        override fun <T : Component> getInstance(kClass: KClass<T>): T {
            return GlobalContext.get().get(kClass)
        }
    }

    @Test
    fun `di test`() {


    }

}