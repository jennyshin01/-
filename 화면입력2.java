import  java.util.Scanner;
public class 화면입력2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 자리 정수를 하나 입력해주세요. >> ");
        //print는 char,불린, int, 다 가능
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력 내용 : " +input);
        System.out.printf("num = %d%n", num);
        //스트링 함수라서 println이 아닌 printf를 적어야함
    }
}
