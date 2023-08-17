package antivirus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Antivirus antivirus=new Antivirus();
        Transaction transaction = new Transaction();
        transaction.transactionDone();
        antivirus = new Antivirus("product-key");
        antivirus.antivirusStatus(transaction);

	}

}
