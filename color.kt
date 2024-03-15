 public enum class color {
    RED, BLUE, YELLOW, GREEN;

    fun get_zn() {
        println(when (this) {
            RED -> "Красный"
            BLUE -> "Синий"
            YELLOW -> "Жёлтый"
            GREEN -> "Зелёный"
        })
    }

    fun get_number() {
        println(this.ordinal + 1)
    }
}