package bai_3;

public class MyIfElse {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		//case 1
		if(a == b){
			System.out.println("a equal b");
		}
		
		//case 2
		if(a == 10){
			System.out.println("a equal 10");
		}else{
			System.out.println("a <> 10");
		}
		
		//case 3
		if(a == 10){
			System.out.println("a equal 10");
		}else if (b == 5){
			System.out.println("b equal 5");
		}else{
			System.out.println("other value");
		}

	}

}
