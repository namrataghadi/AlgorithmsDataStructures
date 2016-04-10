case class Node (elem:Int,var left:Boolean=false,var right:Boolean=false)

object LeetCode331{
	def main(args:Array[String])={
		val arr = Array("9","3","4","#","#","1","#","#","2","#","6","#","#")
		println(isPreOrderTraversal(arr))
	}

	def isPreOrderTraversal(arr:Array[String]):Boolean ={

		val stack = new scala.collection.mutable.Stack[Node]


		if(arr.size == 0 || arr(0) == "#")
			return false

		stack.push(Node(arr(0).toInt))

		val tail = arr.toList.tail

		tail.foreach{
			x =>

       	if(stack.isEmpty)
				return false

			if(x == "#"){

				if(!stack.top.left){
					 println(stack.top)
		
					stack.top.left = true
				}
				else{

					while(!stack.isEmpty && stack.top.left == true){
						println(stack.top)
						stack.pop()

					}
					if(!stack.isEmpty){
						stack.top.left = true
					}
						
				}
			}
			else{
					stack.push(Node(x.toInt))

			}
			

		}
		return true

	}
}