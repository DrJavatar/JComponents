package com.javatar.component.di

import com.javatar.component.Component
import kotlin.reflect.KClass

interface DependencyInjection {

    fun <T : Component> getInstance(kClass: KClass<T>) : T

}