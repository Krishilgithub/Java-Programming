public class Abnormal {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("First line in the finally has executed");
            System.out.println("Second line in the finally has executed");
        }
    }
}