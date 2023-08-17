package antivirus;
public class Antivirus {
	private final String productKey;
	private boolean activate;
	Antivirus(){
		this.productKey = null;
		this.activate=false;
		System.out.println("You are using free version, please upgrade");
	}
	Antivirus(String productKey){
		this.productKey = productKey;
		this.activate=false;
		System.out.println("please pay first to approve product key");
		
		
	}
    public void antivirusStatus(Transaction transaction){
        if(transaction.doTransaction()){
            activate = true;
            System.out.println("Transaction is done and product key approved");

        }
        else {
            System.out.println("Transaction not done-please pay first to approve product key");
         
        }
	
	
    }
	
	

}
