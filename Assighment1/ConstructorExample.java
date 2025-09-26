package Assighment1;

public class ConstructorExample {
	int x;

    // Constructor
    ConstructorExample(int num) {
        x = num;
        System.out.println("Constructor called, value = " + x);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(10);
    }


}
