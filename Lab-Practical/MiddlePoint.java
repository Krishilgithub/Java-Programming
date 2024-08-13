class Middle{
    float x, y;

    Middle(float x, float y){
        this.x = x;
        this.y = y;
    }

    void findMiddle(Middle m){
        x = ( m.x + x )/2;
        y = ( m.y + y )/2;  
    }

    void getResult(){
        System.out.println(x+","+y);
    }
}

public class MiddlePoint {
    public static void main(String[] args) {
        Middle m1 = new Middle(2,4);
        Middle m2 = new Middle(4, 6);
        m2.findMiddle(m1);
        m2.getResult();
    }
}
