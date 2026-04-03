package activity.game

open class SourceCode {
//    agar input yang asli tidak bisa di eksploitasi
    private val sourceCode: MutableList<String> = mutableListOf()
//    hanya untuk di get atau di lihat saja
    val getSourceCode: List<String> = sourceCode
//    karena sourceCode asli hanya bisa di set di class ini
    fun setSourceCode(inputUserCode: String) {
        sourceCode.add(inputUserCode)
    }
}