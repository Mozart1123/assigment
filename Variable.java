public class Variable {
    int instanceVariable= 15;
    static int staticVariable= 30;

    public void method(){
        int localVariable= 45;

        System.out.println(localVariable + " is my localVariable");


    }
    public static void main(String[]args){
Variable joseph = new Variable();

System.out.println(joseph.instanceVariable + " is my instanceVariable");
System.out.println(staticVariable +" is my StaticVariable");
    }
}