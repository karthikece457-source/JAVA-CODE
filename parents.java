class grandpa {
    void display() {
        System.out.println("my grandpa is farmer");
    }
}
class daddy extends grandpa {
    void show(){
        System.out.println("my father is business man");
    }

}
class me extends daddy{
    void display1(){
        System.out.println("I am a engineering student");
    }
}
public class parent {
    public static void main(String[]args){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display1();

        
    }
}



    

