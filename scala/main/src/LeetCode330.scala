
object LeetCode330 extends App{
        val initial = List(1,3)
		var arr = List(1,3)
		val num = 6
		var result = List[List[Int]]()
		var finalResult = new Array[Int](num)

		arr.foreach{
			index =>
			finalResult(index  - 1) = 1
		}

		val temp = getAllCombinations(arr,result)
		var patch = getNextPatchNumber(temp,num,finalResult)

		while (patch != null){
			arr = arr ++ patch
			val temp = getAllCombinations(arr,result)
			patch = getNextPatchNumber(temp,num,finalResult)

		}
		
		println("Number of patches required = " + (arr.size - initial.size))

		def getNextPatchNumber(temp:List[List[Int]],num:Int, finalResult:Array[Int]):List[Int] ={
				temp.foreach{
					list =>
					val index = list.foldLeft(0){
									(x,y) => (x + y)
								} - 1
				 if(index <= num -1 && finalResult(index) == 0)
				    	finalResult(index) = 1
				}
				
				for(i <- 0 to num - 1){
					if (finalResult(i) == 0)
						return List(i + 1)
				}

				return null
		}
		



	def getAllCombinations(arr:List[Int],  res:List[List[Int]]):List[List[Int]] ={
		var result = res
		
		arr.foreach{
			x =>

			var temp:List[List[Int]] = List(List(x))

			result.foreach{
				resList =>
				temp = temp ++ List(List(x) ++ resList)
			}
			result = result ++ temp

            

		}

		result
	}


}