import java.util.stream.IntStream;

public class Multiples35 {

	public static void main(String[] args) {
		System.out.println(
		    IntStream
		        .range(0, 1000)
		        .filter(x -> x % 3 == 0 || x % 5 == 0)
		        .sum());
	}

}
