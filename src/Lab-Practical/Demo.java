class Demo {

    {
        System.out.println("I am a Instance Block");
    }

    static {
        System.out.println("This is the static block");
    }

    public static void main(String args[]) {

		
        // int a = 7, b = 8;
        // System.in("Enter a number: ");
        // for (int i = 0; i < 4; i++) {
        //     System.out.println(a + b);
        // }
		System.out.println("I am main block");
    }

	static{
		System.out.println("I am a static block after main block");
	}
}