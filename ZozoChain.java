import java.util.Date;


public class ZozoChain {
	
	

 public String hash;
 public String previousHash;
 private String data;
 private long timeStamp;
 
 
//block contructor
 
 
 public ZozoChain(String data, String previousHash ) {
	this.data = data;
	this.previousHash = previousHash;
	this.timeStamp = new Date().getTime();
	
 }
 }