public class 부호있는정수의오버플로우 {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32678;
        char cMin = 0, cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax-1 = " + (short)(sMax-1));
        System.out.println("cMin = " + (int)(cMin));
        System.out.println("cMin-1 = " + (int)(--cMin));
        System.out.println("cMax = " + (int)(cMax));
        System.out.println("cMax+1 = " + (int)(++cMax));

        //최솟값에서 1을 빼면 최댓값이 되고
        //최댓값에서 1을 더하면 최솟값이 된다.

        //솔직히 뭔말인지 이해는 가지 않는다.

    }
}
