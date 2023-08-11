package com.example.myapplication

class drink(val name:String,val price:Double,val info:String) {

}
fun main() {
    val coffee = drink("아메리카노", 2.0,"전국민 피로회복제")
    val coffee1 = drink("라떼는말이야", 3.5,"라떼는말이야 2:2:2였어")
    val coffee2 = drink("카페모카", 4.5,"커피의 쌉쌀함과 초코의 달콤함을 고소한 우유가 감싸안은 커피")
    val coffee3 = drink("아포가토", 4.5,"쌉쌀한 에스프레소와 달콤한 바닐라의 환상적인 달콤 쌉싸름함")
    val coffee4 = drink("핫초코", 5.0,"당충전이 필요해")
    val coffee5 = drink("밀크쉐이크", 3.5,"따라서 들어왔는데 뭐 먹지..? 그럴땐 밀크쉐이크")

    println("==========================음료를 선택해주세요.=========================")
    println("1. 음료 이름:${coffee.name} ㅣ가격:${coffee.price} ㅣ설명:${coffee.info}")
    println("2. 음료 이름:${coffee1.name}ㅣ가격:${coffee1.price}ㅣ설명:${coffee1.info}")
    println("3. 음료 이름:${coffee2.name}ㅣ가격:${coffee2.price}ㅣ설명:${coffee2.info}")
    println("4. 음료 이름:${coffee3.name}ㅣ가격:${coffee3.price}ㅣ설명:${coffee3.info}")
    println("5. 음료 이름:${coffee4.name}ㅣ가격:${coffee4.price}ㅣ설명:${coffee4.info}")
    println("6. 음료 이름:${coffee5.name}ㅣ가격:${coffee5.price}ㅣ설명:${coffee5.info}")

    val choice = readLine()?.toInt()

    when (choice) {
        1 -> order(coffee)
        2 -> order(coffee1)
        3 -> order(coffee2)
        4 -> order(coffee3)
        5 -> order(coffee4)
        6 -> order(coffee5)
        else -> println("다시 선택해 주세요.")
    }
}

fun order(Drink:drink) {
    println("선택하신 음료: ${Drink.name}")
    println("가격: ${Drink.price}")
    println("주문이 완료되었습니다.")
}
//?