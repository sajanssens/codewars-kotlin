package nl.bramjanssens

fun comp(a: IntArray?, b: IntArray?) =
    if (a == null || b == null) false
    else a.map { it * it }.sorted() == b.sorted()

