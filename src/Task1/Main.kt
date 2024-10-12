package Task1

fun main (){
    val cinema = Cinema ("Каро")
    var arrayOfFilmArchive : Array<Cinema.FilmArchive> = arrayOf()

    println("Заполнить форму для выдачи билета\n 1.Да \n 2.Нет")
    if (readln() == "1"){
        while (true){
            println("Введите название фильма, время сеанса и место")
            val name = readln()
            val time = readln()
            val place = readln()
            arrayOfFilmArchive += Cinema.FilmArchive(name, time, place)
            println("Продолжить: \n1.Да \n2.Нет")
            if (readln() == "2") break
        }
    }
    println("Архив проданных билето кинотеатра: ${cinema.name}")
    if (arrayOfFilmArchive.isNotEmpty()) println(arrayOfFilmArchive.contentToString())
    else println("Архив пуст")
}