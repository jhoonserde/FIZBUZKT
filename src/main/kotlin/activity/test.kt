package activity

import activity.calculation.formula.areaAndPerimeterOfShapes.Square
import activity.calculation.ValueType

fun test() {
    val square = Square(side = ValueType(8))
//    println(square.countArea)
//    println(square.countPerimeter)
    println(square.getFormula())
}