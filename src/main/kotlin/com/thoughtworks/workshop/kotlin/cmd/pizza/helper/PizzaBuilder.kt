package com.thoughtworks.workshop.kotlin.cmd.pizza.helper

import com.thoughtworks.workshop.kotlin.pizza.FarmHouse
import com.thoughtworks.workshop.kotlin.pizza.Pizza
import com.thoughtworks.workshop.kotlin.pizza.Topping

class PizzaBuilder {
    var topped: MutableList<String> = mutableListOf()

    fun build(): Pizza {
        var pizza: Pizza = FarmHouse()
        for (i in 0 until topped.size) {
            pizza = Topping(pizza, topped[i])
        }
        return pizza
    }
}