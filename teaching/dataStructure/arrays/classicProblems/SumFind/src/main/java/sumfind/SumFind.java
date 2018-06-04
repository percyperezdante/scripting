
public class SumFind {

	public static void main(String[] args) {
		SumFindTotal a = new SumFindTotal();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(3);

		System.out.println("find 7 "+a.find(7));
		System.out.println("find 8 "+a.find(8));
	}

}
