import java.util.Scanner; //스캐너 클래스를 사용하기 위해 추가
public class 화면입력 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //스캐너 클래스 객체를 생성
        String input = scanner.nextLine();
        //입력받은 내용을 인풋에 저장
        int num = Integer.parseInt(input);
        //입력받은 내용을 int 타입의 값으로 저장
    }
}
