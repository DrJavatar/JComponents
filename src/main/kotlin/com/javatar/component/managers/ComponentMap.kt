package com.javatar.component.managers

import com.javatar.component.Component
import com.javatar.component.ComponentManager
import kotlin.reflect.KClass

class ComponentMap<BASE : Component> : ComponentManager<BASE> {

    private val _componentMap = mutableMapOf<KClass<*>, BASE>()

    override val componentMap: Map<KClass<*>, BASE>
        get() = _componentMap
    override val components: List<BASE>
        get() = _componentMap.values.toList()

    override fun add(kClass: KClass<BASE>, comp: BASE) {
        _componentMap.putIfAbsent(kClass, comp)
    }

    override fun remove(kClass: KClass<BASE>) {
        _componentMap.remove(kClass)
    }

    override fun get(kClass: KClass<BASE>): BASE {
        return componentMap[kClass] ?: error("Component ${kClass.simpleName} does not exist.")
    }

    inline operator fun <reified C : BASE> invoke() : C {
        return componentMap[C::class] as C
    }
}