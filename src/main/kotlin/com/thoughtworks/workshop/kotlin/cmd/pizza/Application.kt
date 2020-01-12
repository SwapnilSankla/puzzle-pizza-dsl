package com.thoughtworks.workshop.kotlin.cmd.pizza

import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.CheeseBurst
import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.description
import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.pizza
import com.thoughtworks.workshop.kotlin.cmd.pizza.helper.with
import com.thoughtworks.workshop.kotlin.pizza.Pizza

fun main() {
    val pizza: Pizza = CheeseBurst farmhouse pizza {
        topped with "Golden corn"
        topped with "Paneer Tikka Cubes"
    }
    println(pizza.description())
}