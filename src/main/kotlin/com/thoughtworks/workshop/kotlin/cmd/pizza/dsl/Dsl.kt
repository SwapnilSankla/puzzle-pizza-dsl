package com.thoughtworks.workshop.kotlin.cmd.pizza.dsl

import com.thoughtworks.workshop.kotlin.pizza.Dough
import com.thoughtworks.workshop.kotlin.pizza.FarmHouse
import com.thoughtworks.workshop.kotlin.pizza.Pizza
import com.thoughtworks.workshop.kotlin.pizza.Topping

class CheeseBurst {
    companion object {
        infix fun farmhouse(pizza: Pizza): Pizza {
            return Dough(pizza, "Cheese burst", 50.0)
        }
    }
}

infix fun MutableList<String>.with(topping: String) {
    this += topping
}

fun pizza(action: PizzaBuilder.() -> Unit): Pizza {
    val pizzaBuilder = PizzaBuilder()
    pizzaBuilder.action()
    return pizzaBuilder.build()
}

fun Pizza.description(): String {
    return "A $name pizza with $dough, topped with $toppings and priced at $price"
}

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