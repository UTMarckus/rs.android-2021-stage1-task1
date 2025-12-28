package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int) = bill.toMutableList()
        .apply { removeAt(k) }.sum().let { if (it / 2 == b) "Bon Appetit" else "${b - it / 2}" }
}
