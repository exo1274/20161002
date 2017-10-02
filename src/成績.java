public class 成績 {
    public static void main(String[]args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("請輸入第一個成績");
    double a = sc.nextDouble();
        System.out.println("請輸入第二個成績");
        double b = sc.nextDouble();
        System.out.println("請輸入第三個成績");
        double c = sc.nextDouble();


    double d =a+b+c;
    double e = d/3;
    System.out.println("總分：" + d);
    System.out.println("平均：" + e);
    }
}
