package com.thoughtworks.workshop.kotlin.cmd.pizza.dsl

import com.thoughtworks.workshop.kotlin.cmd.pizza.helper.PizzaBuilder
import com.thoughtworks.workshop.kotlin.pizza.Dough
import com.thoughtworks.workshop.kotlin.pizza.Pizza

class CheeseBurst {
    companion object {
        infix fun farmhouse(pizza: Pizza) = Dough(pizza, "Cheese burst", 50.0)
    }
}

class Just {
    companion object {
        infix fun farmhouse(pizza: Pizza) = pizza
    }
}

val pizza = PizzaBuilder().build()

fun pizza(action: (PizzaBuilder.() -> Unit)): Pizza {
    val pizzaBuilder = PizzaBuilder()
    action.let { pizzaBuilder.it() }
    return pizzaBuilder.build()
}

fun Pizza.description() = "A $name pizza with $dough, topped with $toppings and priced at $price"

