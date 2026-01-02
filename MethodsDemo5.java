public class MethodsDemo5 {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double d1,double d2){
        return d1+d2;
    }
    public static void main(String[] args){
        int result1=add(10,20);
        System.out.println(result1);
        int result2=add(10,20,30);
        System.out.println(result2);

    }
}