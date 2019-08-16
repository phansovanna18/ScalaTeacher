package Functional_Task

import java.util.Scanner

object task2 {
    def main(args: Array[String]): Unit = {
        val scanner = new Scanner(System.in)
        print("WhatApp = ")
        var n1 = scanner.nextFloat()
        print("Telegram = ")
        var n2 = scanner.nextFloat()
        print("Line = ")
        var n3 = scanner.nextFloat()
        print(s"Top Rating: ${rating(n1,n2,n3)}")
    }
//    def max(x:Int,y:Int,z:Int):Int
    def rating(x:Float,y:Float,z:Float):String = if(x>y) if (x>z) "WhatApp" else "Line" else if(y>z) "Telegram" else "Line"
}
