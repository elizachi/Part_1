import java.util.*

// убирает лишние пробелы из строки для дальнейшей обработки
fun converter(): String {
    val scanner = Scanner(System.`in`)
    val str: String = scanner.nextLine().trim();
    var flag = true
    var newStr = ""
    for(element in str){
        if(element == ' ' && flag){
            newStr += element
            flag = false
        }
        else if(element != ' '){
            newStr += element
            flag = true
        }
    }
    return newStr
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