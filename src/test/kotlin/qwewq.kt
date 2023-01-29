import kotlin.math.pow

fun main()
{
    print("Введите радиус шара")
    val x :Float = readLine()!! .toFloat()
    val d = 4*3.14*x.pow(3) / 3;
    val c = 4* 3.14 * x.pow(2);
    println("Объем щара = $d")
    println("Площадь поверхности шара = $c")
}