package Functional_Task
import scala.io.StdIn.{readInt}


object task4 {

    def sum(a:Array[Int]):Int = a.filter(_>15).sum

    def main(args: Array[String]): Unit = {
        val a1 = readInt()
        val a2 = readInt()
        val a3 = readInt()
        val a4 = readInt()
        val a5 = readInt()
        print(s"Res : ${sum(Array(a1,a2,a3,a4,a5))}")
    }
}
