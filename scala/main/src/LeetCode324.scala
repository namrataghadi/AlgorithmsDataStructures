object LeetCode324 extends App{

	val arr = Array(1,  2, 2, 3,3, 1)

	for(i <- 0 to arr.size - 2){
		if(((i % 2) == 0 && arr(i) > arr(i+1)) || 
		   ((i % 2) == 1 && arr(i) < arr(i+1)) )
			swap(arr,i,i+1)
		
	}

	arr.foreach{println}

	def swap(arr:Array[Int], i:Int, j:Int)= {
		val temp = arr(i)
		arr(i) = arr(j)
		arr(j) = temp
	}
}