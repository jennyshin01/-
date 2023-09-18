public class 타입간의변환 {
    public static void main(String[] args) {
        //숫자를 문자로 변환 >> 숫자에 0을 더한다.
        //(char)(3 + '0') >> 3

        //문자를 숫자로 변환 >> 문자에서 '0'을 뺀다.
        //'3' - '0' >> 3

        //숫자를 문자열로 변환 >> 숫자에서 빈 문자열("")을 더한다.
        //3 + "" >> "3"

        //문자열을 숫자로 변환 >> Interger.parseInt()
        // >> Double.parseDouble()을 사용한다.
        //Interger.parseInt("3") >> 3
        //Double.parseDouble("3.14") >> 3.14

        //문자열을 문자로 변환 >> charAt(0)을 사용한다.
        //"3".charAt(0) >> '3'

        //문자를 문자열로 변환 >>빈 문자열("")을 더한다.
        //'3' + "" >> "3"

        String str = "3";
        //문자열 3입니다.

        System.out.println(str.charAt(0) - '0');
        //문자열을 문자로 변환하는 것
        //0을 뺌으로서 문자를 숫자로 변환
        //결과값은 숫자 3이 나옴

        System.out.println('3' - '0' + 1);
        //문자를 숫자로 변환
        //숫자에서 1을 더함
        //4
        System.out.println(Integer.parseInt("3")+1);
        //문자열을 숫자로 변환
        //숫자에서 더하기 1
        //4
        System.out.println("3"+1);
        //문자열 3에서 1을 더함?
        //31?
        System.out.println((char) (3 + '0'));
        //문자열을 문자로 변환 3
        //문자에 '0'을 더해서 숫자로 변환
        //3

    }
}
