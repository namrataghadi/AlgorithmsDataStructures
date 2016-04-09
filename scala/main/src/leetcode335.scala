object Leetcode335 extends App{

	val arr = Array(1,2,3,4, 2, 1, 1,2)

	if(checkInterescts(arr))
		println("This array intesects")
	else
		println("This array does not intersect")


	def checkInterescts(arr:Array[Int]):Boolean ={
		if (arr.size < 4)
			return false

		for (i <- 3 to arr.size - 1){
			if(arr(i) >= arr(i - 2) && arr(i-1) <= arr(i-3))
				return true
		}

		return false
	}
}