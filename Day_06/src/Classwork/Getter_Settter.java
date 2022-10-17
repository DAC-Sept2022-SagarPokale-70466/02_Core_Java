package Classwork;

public class Getter_Settter {

	public static void main(String[] args) {
		
		get_set g1 = new get_set(10,"Sagar");
		
		System.out.println(g1.getRollno()	);
		System.out.println(g1.getName());

		g1.setRollno(15);
		g1.setName("Pokale");
		
		System.out.println(g1.getRollno());
		System.out.println(g1.getName());
		
		System.out.println(g1);
	}

}
