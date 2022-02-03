import java.util.*

// убирает лишние пробелы из строки для дальнейшей обработки
fun converter(): String {
    val scanner = Scanner(System.`in`)
    var str: String = scanner.nextLine().trim();
    while(str.contains("  ")) {
        str = str.replace("  ", " ")
    }
    return str
} // вырезаем первое слово из общей строки
fun getFirstWord(str: String): String {
    val index = str.indexOf(' ')
    if(index != -1){
        return str.substring(0, index)
    }
    return str
} // обрезка строки без первого слова для дальнейшей работы
fun getArguments(str: String): String{
    return str.substring(str.indexOf(' ') + 1, str.length)
}