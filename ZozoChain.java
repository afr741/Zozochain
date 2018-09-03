
public class ZozoChain {
 public static void main(String[] args) {
	 
	 Block genesisBlock  = new Block("Hi i am the first block", "0");
	 System.out.println("Hash for block 1: " + genesisBlock.hash);
	 
	 Block secondBlock = new Block("Hi i am the second block", genesisBlock.hash);
	 System.out.println("Hash for block 2: " + secondBlock.hash);
	 
	 
	 Block thirdBlock = new Block("Hi i am the third block", secondBlock.hash);
	 System.out.println("Hash for block 2: " + thirdBlock.hash);
	 
	 
 }
}