package Task1

class Cinema (val name : String){

    class FilmArchive(val name:String, val time: String, val place : String ){
        override fun toString(): String {
            return "Название фильма:$name\n Время сеанса:$time\n Место: $place)"
        }
    }
}