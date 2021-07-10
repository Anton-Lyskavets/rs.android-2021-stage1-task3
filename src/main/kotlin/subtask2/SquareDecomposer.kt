package subtask2

import java.math.BigInteger

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
//        throw NotImplementedError("Not implemented")
        val numberSquare = BigInteger.valueOf(number.toLong()) * BigInteger.valueOf(number.toLong())
        return sequence(numberSquare, number)?.toTypedArray()
    }

    private fun sequence(numberSquare: BigInteger, number: Int): ArrayList<Int>? {
        if (numberSquare < BigInteger.valueOf(0)) return null
        if (numberSquare == BigInteger.valueOf(0)) return arrayListOf()
        var arrayList: ArrayList<Int>? = null
        var newNumber = number
        while (newNumber > 1 && arrayList == null) {
            newNumber--
            val difference =
                numberSquare - (BigInteger.valueOf(newNumber.toLong()) * BigInteger.valueOf(newNumber.toLong()))
            arrayList = sequence(difference, newNumber)
        }
        arrayList?.add(newNumber)
        return arrayList
    }
}
