
object LeetCode338 extends App{
	val arrSize = 10 // goes from 0 to 4
	 // val arrBits = Array(0, 1, 10, 11, 100,101,110,111,1000,1001,1010)
	val num = 5
	var res:Array[Int] = new Array[Int](num)

	println("Size: "+res.length)
	println("Value: "+res(0))
	res(0) = 0
	
	
	for(i <- 1 to (num - 1)){
		res(i) = res((i/2)) + i % 2
	}

	res.foreach{println}

}
