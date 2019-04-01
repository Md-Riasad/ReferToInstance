import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperation mo =new MathOperation();
		
		BiFunction<Integer,Integer,Integer>add1=mo::add;
		System.out.println("Add :"+add1.apply(4, 5));
		
		BiFunction<Integer,Integer,Integer>sub1=mo::sub;
		System.out.println("Sub :"+sub1.apply(4, 5));
		
	}

}
