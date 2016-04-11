
object LeetCode332 extends App{

	val tickets = List(("JFK","SFO"),("JFK","ATL"),("SFO","ATL"),("ATL","JFK"),("ATL","SFO"))

	val map = scala.collection.mutable.Map.empty[String, List[String]]
    
    addToMap(tickets,map)
	
	var currentStation = "JFK"

    while(!map.isEmpty){
    	print(currentStation+ " -> ")
    	val previousStation = currentStation
    	currentStation = map(currentStation).head
    	removeFromMap(previousStation,map)
    }
    println(currentStation)
    
	map.foreach{
		case (k,v) =>
		v.foreach{println}
		println()
	}
	
	def addToMap(tickets:List[(String,String)],map:scala.collection.mutable.Map[String,List[String]])={
		tickets.foreach{
			ticket =>

			map += (ticket._1 -> (ticket._2 :: (map get ticket._1 getOrElse Nil)).sorted)
			
		}
		
	}

	def removeFromMap(key:String,map:scala.collection.mutable.Map[String,List[String]])={
		

		 val value = map(key)

           if(!value.tail.isEmpty){
           		map += (key -> value.tail)
           }else{
           	map -= key
           }
			
			
		
	}


}