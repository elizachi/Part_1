// два массива заданы локально для более простой работы с ними
var keys = Array<String>(1000) { _ -> "" } // Создаю массив ключей (id) типа String
var values = Array<Array<String>>(1000) {_ -> Array(4){_ -> ""} } // Создаю массив значений из массивов
// стартовая команда
fun start() {
    print("Вы можете использовать любую из доступных Вам команд:\n\n" +
            "create <имя> <цвет> <возраст> <вес> - добавить элемент\n" +
            "read <имя>                          - дать информацию о существующем элементе\n" +
            "delete <имя>                        - удалить существующий элемент\n" +
            "readall                             - дать информацию о всех существующих элементах\n" +
            "\nдля выхода нажмите Enter\n")
} // команда добавления нового элемента
fun create(catInfo: String) {
    val index = keys.indexOf("")
    if(index != -1) {
        // добавление id элемента в ключи
        keys[index] = getFirstWord(catInfo)
        // массив значений к соответствующему ключу
        values[index] = getArguments(catInfo).split(" ").toTypedArray()
    }
    print("Элемент $catInfo создан успешно.\n")
} // команда выдачи информации об уже существующем элементе
fun read(catId: String){
    val index = keys.indexOf(catId)
    if(index != -1) {
        print(keys[index] + " --> ")
        for(element in values[index]){
            print("$element ")
        }
    } else {
        print("Такого элемента нет.")
    }
    print("\n")
} // команда удаления уже существующего элемента
fun delete(catId: String){
    val index = keys.indexOf(catId)
    if(index != -1) {
        keys[index] = "" // удаление элемента из ключей
        values[index] = Array(4){_ -> ""} // удаление массива значений к соответствующему ключу
        print("Элемент $catId успешно удалён.\n")
    } else {
        print("Такого элемента нет.\n")
    }
} // команда выдачи информации о всех существующих элементах
fun readall(){
    for(i in keys.indices){
        if(keys[i] != "") {
            print(keys[i] + " --> ")
            for (element in values[i]) {
                print("$element ")
            }
            print("\n")
        }
    }
}