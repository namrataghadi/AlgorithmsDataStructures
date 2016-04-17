import collection.mutable.ListBuffer

object TreeSubTree extends App{


  case class TreeNode(data:Int, left:TreeNode, right:TreeNode)

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

  val tree = inorderTraversal(one,List[Int]())

  tree.foreach{println}

  def inorderTraversal(root:TreeNode,  arr:List[Int]): List[Int] ={
    var abc:List[Int] = arr

    if(root.left != null)
      inorderTraversal(root.left,abc)

    abc = abc :+ root.data

    if(root.right != null)
      inorderTraversal(root.right,abc)

    abc


//    if (root == null)
//     return abc
//
//
//
//    abc = abc :+ root.data
//
//    inorderTraversal(root.right,abc)

  }

//  def preOrderTraversal(root:TreeNode,  arr:List[Int]): List[Int] ={
//    var abc = arr
//
//
//    if (root == null)
//      abc
//
//    abc  = arr :+ root.data
//    preOrderTraversal(root.left,abc)
//    preOrderTraversal(root.right,abc)
//
//  }

}