package Functional_Task2

import scala.io.StdIn.{readLine}


object task2 {
    def filter(a:List[Int],x:Int):List[Int] = a.filter(_ < x)

    def main(args: Array[String]): Unit = {
        var x = readLine().toInt
        var array:List[Int] = Nil
        var b = readLine()
        while (b != ""){
            array = array :::List(b.toInt)
            b = readLine()
        }
        var array1 = filter(array,x)
        for(x <- array1){
            println(x)
        }
    }
}
