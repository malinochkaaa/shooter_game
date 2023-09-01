package module11_Sravneniye.Homework

class Stack<T> {

    private val stack = java.util.Stack<Any>()

    fun push(item: T){
        stack.push(item)
    }
    fun pop(): T?{
        return stack.pop() as? T?
    }
    fun isEmpty(): Boolean{
        return stack.isEmpty()
    }
}