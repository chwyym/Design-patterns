package proxy;

public class Main {

    public static void main(String args[])
    {
        proxy proxy1 = new proxy();

        proxy1.set_Name("홍길동");
        System.out.println("================");

        proxy1.Show_Name();
        System.out.println("================");

        proxy1.Complicated_Work();
    }
}
