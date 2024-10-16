public class ex {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that does not exist in the classpath
            Class.forName("com.example.nonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
