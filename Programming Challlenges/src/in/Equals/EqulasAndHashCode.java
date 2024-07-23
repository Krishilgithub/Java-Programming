package in.Equals;

public class EqulasAndHashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Krishil", 18, 001);
        Person person2 = new Person("Krishil", 18, 001);

        if (person1.equals(person2)) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        String str1 = "Krishil";
        String str2 = new String("Krishil");
        str1+=1;
        str2+=1;
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        if (str1.equals(str2)) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        } 

    }
}
