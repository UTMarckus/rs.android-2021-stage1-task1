package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val res = sadArray.toMutableList()

        var isNotHappy = true

        while (isNotHappy) {
            isNotHappy = false

            for (i in res.indices) {
                if (i == 0 || i == res.lastIndex) continue

                if (res[i - 1] + res[i + 1] < res[i]) {
                    res.removeAt(i)
                    isNotHappy = true
                    break
                }
            }
        }

        return res.toIntArray()
    }
}
