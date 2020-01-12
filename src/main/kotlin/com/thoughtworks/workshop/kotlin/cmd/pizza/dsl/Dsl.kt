package com.thoughtworks.workshop.kotlin.cmd.pizza.dsl

import com.thoughtworks.workshop.kotlin.cmd.pizza.helper.PizzaBuilder
import com.thoughtworks.workshop.kotlin.pizza.Dough
import com.thoughtworks.workshop.kotlin.pizza.Pizza

class CheeseBurst {
    companion object {
        infix fun farmhouse(pizza: Pizza): Pizza {
            return Dough(pizza, "Cheese burst", 50.0)
        }
    }
}

fun pizza(action: PizzaBuilder.() -> Unit): Pizza {
    val pizzaBuilder = PizzaBuilder()
    pizzaBuilder.action()
    return pizzaBuilder.build()
}

fun Pizza.description(): String {
    return "A $name pizza with $dough, topped with $toppings and priced at $price"
}

