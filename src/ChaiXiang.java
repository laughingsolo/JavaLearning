public class ChaiXiang {
    public static void main(String[] args) {
        int a=1;
        Integer aa = new Integer(a);//装箱
        int b=aa.intValue();//拆箱
        int c=aa;//自动拆箱
        System.out.println(a+" "+b+" "+c);


    }
}
