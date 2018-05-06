package oopConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_Bal);
		//USBank.min_Bal=200;-its final in nature
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.carLoan();
		
		
		//Dynamic polymerphism
		
		USBank b= new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//b.educationloan(); -error
	}

}
