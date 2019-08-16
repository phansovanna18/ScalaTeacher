package Functional_Task

import java.util.Scanner

object task1 {
    def main(args: Array[String]): Unit = {
        val scanner = new Scanner(System.in)
        var n1 = scanner.nextInt()
        var n2 = scanner.nextInt()
        print(s"${sumCub1(n1,n2)}")
    }

    def sumCub1(a:Int,b:Int):Int = (if(a>8) a*a*a else 0) + (if(b>8) b*b*b else 0)
}
