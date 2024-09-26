fun main() {
    // с использованием встроеной функции
    task1_a() //Написать функцию сортировки списка: пользователь вводит какое-то количество чисел. Функция сортирует массив и он выводится в консоль.
    // без использования встроеной функции

}

fun task1_a(){
    val list_num = mutableListOf<Int>()
    println("Вводите числа. Введите слово <всё> если хотите выйти:")
    while (true){

        val chel = readLine()!!

        if (chel == "всё"){
            list_num.sort()
            println(list_num)
            break
        }

        list_num.add(chel.toInt())

    }
}
fun task1_b(){
    val list_num = mutableListOf<Int>()
    println("Вводите числа. Введите слово <всё> если хотите выйти:")

    while (true){

        val chel = readLine()!!

        if (chel == "всё"){
            bubble_sort(list_num)
            println(list_num)
            break
        }

        list_num.add(chel.toInt())

    }
}

fun bubble_sort(List:MutableList<Int>){

}