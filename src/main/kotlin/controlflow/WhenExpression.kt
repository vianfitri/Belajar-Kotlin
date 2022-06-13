package controlflow

fun main(){
    val value = 7
    val value1 = 20

    /* when expression as variable expression */
    val value2 = when(value1) {
        6 -> "value is 6"
        7 -> "value is 7"
        else -> "value cannot be reached"
    }

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
    println(value2)
}