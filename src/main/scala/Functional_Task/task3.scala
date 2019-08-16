package Functional_Task

object task3 {
    def main(args: Array[String]): Unit = {
        var array = Array(1,2,3,4)
        var arrayOdd = Odd(array)
        var arrayEven = Even(array)
        println("Odd Number")
        for(i <- arrayOdd)
            println(i)
        println("Even Number")
        for(i <- arrayEven)
            println(i)

        println(s"Res: ${arrayEven.sum+arrayOdd.sum}")
    }
    def Odd(a:Array[Int]):Array[Int] = a.filter(_ % 2 == 1)
    def Even(a:Array[Int]):Array[Int] = a.filter(_ % 2 == 0)
}
