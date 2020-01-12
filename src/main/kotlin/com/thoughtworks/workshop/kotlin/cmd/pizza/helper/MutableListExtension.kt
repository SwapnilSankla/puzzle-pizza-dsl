package com.thoughtworks.workshop.kotlin.cmd.pizza.helper

infix fun MutableList<String>.with(topping: String) {
    this += topping
}