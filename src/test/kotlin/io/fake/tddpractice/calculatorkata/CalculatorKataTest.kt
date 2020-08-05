package io.fake.tddpractice.calculatorkata

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class CalculatorKataTest {

    //TDD practice from https://osherove.com/tdd-kata-1/

    @Test
    fun `requirement 1-1`() {
        assertThat(addNumbers("")).isEqualTo(0)
    }

    @Test
    fun `requirement 1-2`() {
        assertThat(addNumbers("1")).isEqualTo(1)
    }

    @Test
    fun `requirement 1-3`() {
        assertThat(addNumbers("1,2")).isEqualTo(3)
    }

    @Test
    fun `requirement 2`() {
        assertThat(addNumbers("1,2,3")).isEqualTo(6)
    }

    @Test
    fun `requirement 3`() {
        assertThat(addNumbers("1\n2,3")).isEqualTo(6)
    }

    @Test
    fun `requirement 4`() {
        assertThat(addNumbers("//;\n1;2")).isEqualTo(3)
    }

}