package Practise;

public class Accntmain {
	public static void main(String[] args) {
		Accnt acc = new Accnt();
		acc.setAccno(101);
		acc.setAmount(5000);
		acc.setName("Karin");
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
	}

}
