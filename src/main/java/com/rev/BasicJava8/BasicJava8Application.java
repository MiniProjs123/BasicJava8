package com.rev.BasicJava8;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rev.BasicJava8.interfaces.MyDefaultInterface;
import com.rev.BasicJava8.interfaces.MyDefaultInterfaceIllustrator;
import com.rev.BasicJava8.methodrefs.MyMethodReferenceMachine;

@SpringBootApplication
public class BasicJava8Application {

	
	public BasicJava8Application() {
		// java 8 constructs
		new BasicStreamOps();
		new CopyByValue();
		new DateTimeApi();
		
		// map iterations
		new MapLooper();
		
		// interfaces
		new MyDefaultInterfaceIllustrator();
		interfacesPlay();
		
		new StringJoinerPlus();
		
		immutablePlay();
		
		new ConcurrentModificationBlues();
		
		new MyMethodReferenceMachine();
	}
	
	
	
	private static void immutablePlay() {
		
		// use the cloned age in the ImmutableMe constructor to stop post creation modification of the passed in object
		MutableAge mutableAge = new MutableAge(27);
		int ageBefore = mutableAge.getAge();
		ImmutableMe changeMeContructorNot = new ImmutableMe("Paul", mutableAge);
		mutableAge.setAge(47);
		System.out.println("Age was " + ageBefore + ", but happily still unchanged: " + changeMeContructorNot.getAge().getAge());
				
		// use the cloned age in the ImmutableMe.getAge() method to stop modifying age via the set method		
		ImmutableMe changeMeNot = new ImmutableMe("Paul", new MutableAge(24));
		int ageWas = changeMeNot.getAge().getAge();
		changeMeNot.getAge().setAge(47);
		System.out.println("Age was " + ageWas + ", but happily still unchanged: " + changeMeNot.getAge().getAge());
				
				
	}
		
	
	private static void interfacesPlay() {
		MyDefaultInterface test = new MyDefaultInterfaceIllustrator();
		test.doSomethingMoreInteresting();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BasicJava8Application.class, args);
	}
	

}
