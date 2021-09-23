package com.javatar.component.managers

import com.javatar.component.Component
import com.javatar.component.ComponentManager
import com.javatar.component.di.DependencyInjection
import kotlin.reflect.KClass

class DIComponentManager<BASE : Component>(val di: DependencyInjection) : ComponentManager<BASE> {

    @Deprecated("Not Supported", level = DeprecationLevel.HIDDEN)
    override fun add(kClass: KClass<BASE>, comp: BASE) {}

    @Deprecated("Not Supported", level = DeprecationLevel.HIDDEN)
    override fun remove(kClass: KClass<BASE>) {}

    override fun get(kClass: KClass<BASE>): BASE {
        return di.getInstance(kClass)
    }

    inline operator fun <reified C : BASE> invoke() : C {
        return di.getInstance(C::class)
    }

}