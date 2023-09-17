public class 두변수의값바꾸기 {
    public static void main(String[] args) {
        //두변수 x,y에 저장된 값을 바꾸려면 어떻게 해야하나?
        int x = 10;
        int y = 20;

        int tmp;
        //임시로 값을 저장하기 위한 변수
        //빈 컵 역할
        tmp = x;  //x의 값을 tmp에 저장
        x = y;  //y의 값을 x에 저장
        y = tmp; // tmp에 저장된 값을 y에 저장

        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
