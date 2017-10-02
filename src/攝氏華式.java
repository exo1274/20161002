public class 攝氏華式 {
    public static void main(String[]args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入攝氏");
        double c = sc.nextDouble();
        double f = 9/5*c+32;
        System.out.println("攝氏：" + c);
        System.out.println("華式：" + f);
    }
}
