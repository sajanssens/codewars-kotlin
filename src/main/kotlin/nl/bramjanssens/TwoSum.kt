package nl.bramjanssens

object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
        for ((i, x) in numbers.withIndex()) {
            for ((j, y) in numbers.sliceArray(i + 1 until numbers.size).withIndex())
                if (x + y == target) return i to i + j + 1
        }
        TODO()
    }
}
