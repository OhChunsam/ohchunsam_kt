package com.example.myapplication

fun main() {
    val calculator = Calculator()
    while (true) {
        print("계산할 식을 입력하세요 (예:1 + 1): ")
        val input = readLine()

        if (input.equals("exit", ignoreCase = true)) {
            println("계산기 종료.")
            break
        }

        try {
            if (input != null) {
                val parts = input.trim().split(" ")
                if (parts.size != 3) {
                    throw IllegalArgumentException("잘못된 입력 형식입니다.")
                }

                val num1 = parts[0].toDouble()
                val operator = parts[1]
                val num2 = parts[2].toDouble()

                val result = when (operator) {
                    "+" -> calculator.add(num1, num2)
                    "-" -> calculator.subtract(num1, num2)
                    "*" -> calculator.multiply(num1, num2)
                    "/" -> calculator.divide(num1, num2)
                    else -> throw IllegalArgumentException("잘못된 연산자입니다.")
                }

                println("결과: $result")
            } else {
                println("입력이 없습니다. 다시 시도하세요.")
            }
        } catch (e: Exception) {
            println("오류가 발생했습니다: ${e.message}")
        }
    }
}