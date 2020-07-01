package io.fake.tddpractice.greetingkata

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class GreetingKataTests {

    //TDD practice from https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata

    @Test
    fun `requirement 1`() {
        assertThat(greet(mutableListOf("Bob"))).isEqualTo("Hello, Bob.")
    }

    @Test
    fun `requirement 2`() {
        assertThat(greet(mutableListOf(null))).isEqualTo("Hello, my friend.")
    }

    @Test
    fun `requirement 3`() {
        assertThat(greet(mutableListOf("JERRY"))).isEqualTo("HELLO JERRY!")
    }

    @Test
    fun `requirement 4`() {
        assertThat(greet(mutableListOf("Jill", "Jane"))).isEqualTo("Hello, Jill and Jane.")
    }

    @Test
    fun `requirement 5`() {
        assertThat(greet(mutableListOf("Amy", "Brian", "Charlotte"))).isEqualTo("Hello, Amy, Brian, and Charlotte.")
    }

    @Test
    fun `requirement 6`() {
        assertThat(
            greet(
                mutableListOf(
                    "Amy",
                    "BRIAN",
                    "Charlotte"
                )
            )
        ).isEqualTo("Hello, Amy and Charlotte. AND HELLO BRIAN!")
    }

    @Test
    fun `requirement 7`() {
        assertThat(greet(mutableListOf("Bob", "Charlie, Dianne"))).isEqualTo("Hello, Bob, Charlie, and Dianne.")
    }

    @Test
    fun `requirement 8`() {
        assertThat(greet(mutableListOf("Bob", "\"Charlie, Dianne\""))).isEqualTo("Hello, Bob and Charlie, Dianne.")
    }
}