package ex_list_iterator_interface

private fun moveToNext(iter: ListIterator<Int>)
{
    print("${iter.hasPrevious()}, ")
    print("${iter.hasNext()}, ")
    print("${iter.previousIndex()}, ")
    print("${iter.nextIndex()}, ")
    println("${iter.next()}, ")
}


fun main()
{
    val iter: ListIterator<Int> = listOf(701, 704, 708).listIterator()

    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}

