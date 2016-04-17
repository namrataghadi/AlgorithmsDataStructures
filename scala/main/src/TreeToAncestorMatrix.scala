import scala.collection.immutable.Queue

case class Node1(data:Int,left:Node1,right:Node1)
object TreeToAncestorMatrix extends App{

  def traverseTree(root:Node1,  anc:scala.collection.mutable.ListBuffer[Node1],matrix:Array[Array[Int]]):Int = {
    if (root == null) return 0

    val data = root.data
    var ancTemp = anc

    anc.foreach{
      ancestorNode =>
        matrix(ancestorNode.data)(data) = 1
    }

    anc += root

    val leftSize = traverseTree(root.left,anc,matrix)
    val rightSize = traverseTree(root.right,anc,matrix)

    anc -= root

    leftSize + rightSize + 1


  }
}