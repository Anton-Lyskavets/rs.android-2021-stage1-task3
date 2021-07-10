package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        //throw NotImplementedError("Not implemented")

        val finishArray = ArrayList<String>()
        val arrayNumber = number.toCharArray()
        val stringBuilder = StringBuilder(number)
        for (i in arrayNumber.indices) {
            if (stringBuilder[i] != '-') {
                when (stringBuilder[i]) {
                    '1' -> {
                        stringBuilder.setCharAt(i, '2')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '4')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '1')
                    }
                    '2' -> {
                        stringBuilder.setCharAt(i, '1')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '3')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '5')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '2')
                    }
                    '3' -> {
                        stringBuilder.setCharAt(i, '2')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '6')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '3')
                    }
                    '4' -> {
                        stringBuilder.setCharAt(i, '1')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '5')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '7')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '4')
                    }
                    '5' -> {
                        stringBuilder.setCharAt(i, '2')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '4')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '6')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '8')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '5')
                    }
                    '6' -> {
                        stringBuilder.setCharAt(i, '3')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '5')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '9')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '6')
                    }
                    '7' -> {
                        stringBuilder.setCharAt(i, '4')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '8')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '7')
                    }
                    '8' -> {
                        stringBuilder.setCharAt(i, '5')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '7')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '9')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '0')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '8')
                    }
                    '9' -> {
                        stringBuilder.setCharAt(i, '6')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '8')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '9')
                    }
                    '0' -> {
                        stringBuilder.setCharAt(i, '8')
                        finishArray.add(stringBuilder.toString())
                        stringBuilder.setCharAt(i, '0')
                    }
                }
            } else {
                return null
            }
        }
        return finishArray.toTypedArray()
    }
}
