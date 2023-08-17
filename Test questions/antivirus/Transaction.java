package antivirus;

public class Transaction {
	private boolean payment;
	Transaction(){
		this.payment=payment;
		
	}
	public Boolean doTransaction() {
		return payment;
	}

    public void transactionDone(){
        payment = true;
    }

}
