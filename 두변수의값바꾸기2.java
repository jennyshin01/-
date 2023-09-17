public class 두변수의값바꾸기2 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x=" + x);
        System.out.println("y="+y);

        int tmp = x;    //x의 값을 tmp에 저장
        x = y;   //y의 값을 x에 저장
        y = tmp;    //tmp에 저장된 값을 y에 저장

        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
