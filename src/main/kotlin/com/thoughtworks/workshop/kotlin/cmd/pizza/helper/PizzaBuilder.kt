package com.thoughtworks.workshop.kotlin.cmd.pizza.helper

import com.thoughtworks.workshop.kotlin.pizza.FarmHouse
import com.thoughtworks.workshop.kotlin.pizza.Pizza
import com.thoughtworks.workshop.kotlin.pizza.Topping

class PizzaBuilder {
    var topped: MutableList<String> = mutableListOf()

    fun build() = topped.fold(FarmHouse()) { pizza: Pizza, topping -> Topping(pizza, topping) }
}