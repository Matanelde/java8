package java8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyClass {

	static Function<String, String> f = s -> s.trim();
	static Consumer<String> print = s -> System.out.println(s);
	static Supplier<String> getString = () -> "ss";

	public static void main(String[] args) {
		String s = " a ";
		print.accept(f.apply(s));
		Runnable r = () -> {
			while (true) {
				System.out.println(new Date());
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();

		
//		List<String> strs = Arrays.asList("1", "2", "3");
//		strs.stream()
//				.peek(i->System.out.println(i))
//				.filter(s2 -> !s2.equals("2"))
//				.map(s2->Integer.valueOf(s2))
//				
//				.flatMap(mapper)findFirst().ifPresent(bobo->System.out.println("ss"+bobo));
		

		// Stream.of("1","2","3")

	}

}
