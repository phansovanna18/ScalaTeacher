package Higher_Order_Function

object task1 {
    def main(args: Array[String]): Unit = {
        val result = (math(500,200,10,(x,y)=>x*y))
        val result1 = math(500,200,10,_*_)
        val r = result + result1
        println(result)
        println(result1)
        println(r)

    }

    def math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double = f(f(x,y),z)
}
