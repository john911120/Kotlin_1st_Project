package ex_delegated_Property

import kotlin.reflect.KProperty

class OnlyPositive
{
    private var realValue: Int = 0

    operator fun getValue(thisRef: Any?, Property:KProperty<*>): Int
    {
        return realValue
    }

    operator fun setValue(thisRef: Any?, Property: KProperty<*>, value: Int)
    {
        realValue = if(value > 0) value else 0
    }
}