/**
 *  Diamond Problem Preview
 */

interface DigitalRecorder { fun burn(): Unit }

interface CDBurner : DigitalRecorder
{
    override fun burn() = println("CD를 사용한다.")
}

interface DVDBurner : DigitalRecorder
{
    override fun burn() = println("DVD를 사용한다.")
}

class ComboDrive : CDBurner, DVDBurner
{
    override fun burn()
    {
        println("멀티미디어를 저장해야하는데 뭘로 하지?")
        super<DVDBurner>.burn()
    }
}

fun main() {
    ComboDrive().burn()
}