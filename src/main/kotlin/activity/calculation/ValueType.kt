package activity.calculation

class ValueType<T>(val value: T) {

    override fun toString(): String = value.toString()

    operator fun plus(other: ValueType<*>): Number? {
        return when (other.value) {

            is Int if value is Int-> other.value + value

            is Long if value is Long-> other.value + value

            is Float if value is Float-> other.value + value

            is Double if value is Double-> other.value + value

            else -> null
        }
    }

    operator fun minus(other: ValueType<*>): Number? {
        return when (other.value) {

            is Int if value is Int-> other.value - value

            is Long if value is Long-> other.value - value

            is Float if value is Float-> other.value - value

            is Double if value is Double-> other.value - value

            else -> null
        }
    }

    operator fun times(other: ValueType<*>): Number? {
        return when (other.value) {

            is Int if value is Int-> other.value * value

            is Long if value is Long-> other.value * value

            is Float if value is Float-> other.value * value

            is Double if value is Double-> other.value * value

            else -> null
        }
    }

    operator fun div(other: ValueType<*>): Number? {
        return when (other.value) {

            is Int if value is Int-> other.value / value

            is Long if value is Long-> other.value / value

            is Float if value is Float-> other.value / value

            is Double if value is Double-> other.value / value

            else -> null
        }
    }
    operator fun rem(other: ValueType<*>): Number? {
        return when (other.value) {

            is Int if value is Int-> other.value % value

            is Long if value is Long-> other.value % value

            is Float if value is Float-> other.value % value

            is Double if value is Double-> other.value % value

            else -> null
        }
    }
}