package Functional_Task2

object task1 {

    def fact(x:Double):Double = {
        var p = 1
        for(i <- 1 to x.toInt)
            p = p*i
        p
    }

    def power(x:Double,y:Int):Double = {
        var p = x
        for(i<-1 until y)
            p = x*p
        p
    }

    def evaluation(x:Double): Double ={
        var sum = 1.0 + x
        for(i <- 2 to 10)
            sum = sum + power(x,i)/fact(i)
        sum
    }

    def main(args: Array[String]): Unit = {
        print(evaluation(5))
    }
}