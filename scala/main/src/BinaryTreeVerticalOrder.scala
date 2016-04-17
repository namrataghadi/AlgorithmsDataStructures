import scala.collection.JavaConverters._

case class TreeNode(data:Int, left:TreeNode,right:TreeNode)
object BinaryTreeVerticalOrder extends App{
  val eight = TreeNode(8,null,null)
  val nine = TreeNode(9,null,null)
  val ten = TreeNode(10,null,null)
  val five = TreeNode(5,eight,nine)
  val seven = TreeNode(7,null,ten)
  val four = TreeNode(4,null,null)
  val two = TreeNode(2,four,five)
  val six = TreeNode(6,null,null)
  val three = TreeNode(3,six,seven)
  val one = TreeNode(1,two,three)

  val distanceMap = scala.collection.mutable.HashMap[Int,List[TreeNode]]()
  distanceMap(0) = List(one)

  printBinaryTreeVerticalOrder(one,0,distanceMap).foreach{
    case (k,v) =>
      println("Distance = " +k)

      v.foreach{
        node =>
        println("Node = " + node.data)
      }
  }

  def printBinaryTreeVerticalOrder (root: TreeNode , distance:Int,distanceMap:scala.collection.mutable.HashMap[Int,List[TreeNode]]):scala.collection.mutable.HashMap[Int,List[TreeNode]]  = {

    if (root == null)
      return distanceMap


    var nodesAtDistance = distanceMap.getOrElse(distance, null)

    //println(distance)
    if(nodesAtDistance == null)
      nodesAtDistance = List(root )
    else
      nodesAtDistance = root :: nodesAtDistance
     println(distance)

    distanceMap(distance) = nodesAtDistance

    printBinaryTreeVerticalOrder(root.left, distance - 1, distanceMap)

    printBinaryTreeVerticalOrder(root.right, distance + 1, distanceMap)


  }
}