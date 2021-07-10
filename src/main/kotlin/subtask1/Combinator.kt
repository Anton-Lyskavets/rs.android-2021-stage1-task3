package subtask1

import java.math.BigInteger

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        //throw NotImplementedError("Not implemented")
        var number = 0
        val x: BigInteger = BigInteger.valueOf(array[0].toLong())
        val n = array[1]
        var nFactorial = BigInteger.valueOf(1)
        var kFactorial = 1
        var nMinusKfactorial = 1
        for (i in 1..n) {
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i.toLong()))
        }
        for (k in 1..n) {
            for (i in 1..k) {
                kFactorial *= i
            }
            for (i in 1..n - k) {
                nMinusKfactorial *= i
            }
            val c = nFactorial.divide(
                BigInteger.valueOf(nMinusKfactorial.toLong()).multiply(BigInteger.valueOf(kFactorial.toLong()))
            )
            if (x == c) {
                number = k
                break
            } else if (k == n) {
                number = 0
            } else {
                kFactorial = 1
                nMinusKfactorial = 1
            }
        }
        return if (number == 0){
            null
        } else{
            number
        }
    }
}
