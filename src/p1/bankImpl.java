package p1;

public class bankImpl implements Bank {

	@Override
	public void transferAmount() {
		System.out.println(12);
		
		
	}

	@Override
	public void onlineRechare() {
		System.out.println(2222);
		
		
	}

	@Override
	public void statements() {
		System.out.println(555);
		
		
	}
	public static void main(String[] args) {
		bankImpl T = new bankImpl();
		T.transferAmount();
		T.onlineRechare();
		T.statements();
	}

}
