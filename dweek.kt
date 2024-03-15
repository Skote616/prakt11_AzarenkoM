    public enum class dweek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


        fun get_zn() {
            println(when (this) {
                MONDAY -> "Понедельник"
                TUESDAY -> "Вторник"
                WEDNESDAY -> "Среда"
                THURSDAY -> "Четверг"
                FRIDAY -> "Пятница"
                SATURDAY -> "Суббота"
                SUNDAY -> "Воскресенье"
            })
        }

            fun get_number() {
                println(this.ordinal + 1)
            }

    }

