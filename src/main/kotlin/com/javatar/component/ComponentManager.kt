package com.javatar.component

import kotlin.reflect.KClass

interface ComponentManager<BASE : Component> {

    val componentMap: Map<KClass<*>, BASE>
    val components: List<BASE>

    fun add(kClass: KClass<BASE>, comp: BASE)
    fun remove(kClass: KClass<BASE>)
    fun get(kClass: KClass<BASE>) : BASE
}