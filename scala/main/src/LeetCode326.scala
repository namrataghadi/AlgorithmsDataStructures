object LeetCode326 extends App{

	val num = 6

	if(Math.log10(num) / Math.log10(3) % 1 == 0)
		println("Power of three")
	else
		println("Not a power of three")
}