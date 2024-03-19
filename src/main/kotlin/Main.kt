fun lab1(){
    for(i in  1 .. 5){
        for (j in 1 .. i)
            print(i)
        println()
    }
}

fun lab2(){
    val currentNumber: Int = 8
    while (true){
        print("Введите число от 1 до 9: ")
        val number = readln()
        if (number.toInt() != currentNumber)
            println("Попробуйте еще раз!")
        else
            break
    }
}

fun lab3(number: Int){
    for(i in 1 .. number){
        if (number%i==0){
            if (i == number)
                print(i)
            else
                print("$i, ")
        }
    }
    println()
}

fun lab4(number: String){
    var even: Int = 0
    var odd: Int = 0
    for (i in number) {
        if (i.toInt()%2==0)
            even++
        else
            odd++
    }
    println("even = $even")
    println("odd = $odd")
}

fun lab5(): Int{
    var sum = 0
    for (i in 1 .. 100){
        if (i%4==0)
            sum+=i
    }
    return sum
}

fun lab6(): Int{
    var sum = 0
    var i = 4
    while (i!=57){
        i++
        if (i == 34 || i == 46 || i == 52)
            continue
        else
            sum+=i
    }
    return sum
}

fun main(args: Array<String>) {
    lab1()
    println()

    lab2()
    println()

    print("num1 = ")
    var num1 = readln()
    lab3(num1.toInt())
    println()

    print("num2 = ")
    var num2 = readln()
    lab4(num2)
    println()

    println(lab5())
    println()

    println(lab6())
    println()

}