package com.thoughtworks.workshop.kotlin.cmd.pizza

import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.CheeseBurst
import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.Just
import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.description
import com.thoughtworks.workshop.kotlin.cmd.pizza.dsl.pizza
import com.thoughtworks.workshop.kotlin.cmd.pizza.helper.with
import com.thoughtworks.workshop.kotlin.pizza.Pizza
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class ApplicationKtTest {
    @Test
    fun `should allow user to make Cheese burst Farm House pizza with supplied toppings`() {
        val pizza: Pizza = CheeseBurst farmhouse pizza {
            topped with "Golden corn"
            topped with "Paneer Tikka Cubes"
        }
        pizza.description() shouldBe "A Farm House pizza with Cheese burst, topped with [Onion, Tomato, Mashroom, Golden corn, Paneer Tikka Cubes] and priced at 290.0"
    }

    @Test
    fun `should allow user to make pizza with regular dough`() {
        val pizza: Pizza = Just farmhouse pizza {
            topped with "Golden corn"
            topped with "Paneer Tikka Cubes"
        }
        pizza.description() shouldBe "A Farm House pizza with Regular, topped with [Onion, Tomato, Mashroom, Golden corn, Paneer Tikka Cubes] and priced at 240.0"
    }
}