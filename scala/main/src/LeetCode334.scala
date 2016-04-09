
object LeetCode334 {
	def main(args:Array[String]) ={
		val arr:Array[Int] =  Array(4,3,2,1)
		val (i,j,k) = increasingThreeSubsequence(arr)
		println(" i = " + i + ", j = " + j + " , k = " + k)
	}
	
	def increasingThreeSubsequence(arr:Array[Int]):(Int,Int,Int)={
		var min = 0
		var max = 0
		var secondMin:Int = -1

		if(arr.size == 2)
			return (-1,-1,-1)

		for(i <- 1 to arr.size - 1){
			println("min = " + min + ", max = " + max)
			if(arr(i) < arr(min))
				secondMin = i
			else if(arr(i) > arr(max) && (max - min) > 0)
				return (min,max,i)
			else{
				
				if(max - min > 0 && secondMin > 0){
					min = secondMin
					secondMin = -1
				}

				max = i
				
			}

		}
		return (-1,-1,-1)
	}
	

}