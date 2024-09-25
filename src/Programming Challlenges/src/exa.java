public class exa {
    public static void main(String[] args) {
                try {
                    Class.forName("com.example.NonExistentClass");
                } catch (ClassNotFoundException e) {
                    System.out.println("ClassNotFoundException caught: " + e.getMessage());
                }
    }
}