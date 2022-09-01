package nl.bramjanssens

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SameKtTest {

    @Test
    fun comp() {
        val a = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)

        val b1 = intArrayOf(121, 14641, 20736, 361, 25921, 361, 20736, 361)
        val b2 = intArrayOf(132, 14641, 20736, 361, 25921, 361, 20736, 361)
        val b3 = intArrayOf(121, 14641, 20736, 36100, 25921, 361, 20736, 361)

        assertTrue(comp(a, b1))
        assertFalse(comp(a, b2))
        assertFalse(comp(a, b3))
    }

}
