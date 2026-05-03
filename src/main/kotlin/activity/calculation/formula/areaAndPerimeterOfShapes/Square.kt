package activity.calculation.formula.areaAndPerimeterOfShapes

import activity.calculation.ValueType

class Square(val side: ValueType<*>) : AreaAndPerimeterOfShapes() {

    private val sideSquare = ValueType(value = 4)

    fun countArea(): Number? = side * side

    fun countPerimeter(): Number? = side * sideSquare

    fun getFormula(): String {
        return """
            Area = s²
                 = s x s
                 = $side x $side
                 = ${countArea()}
            Perimeter = 4 x s
                      = 4 x $side  
                      = ${countPerimeter()}
        """.trimIndent()
    }
}