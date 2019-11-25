package proxy;

public class Real_Subject implements Subject {
    private String name;

    @Override
    public void Show_Name() {
        System.out.println("my name is "+name);
    }

    public void set_Name(String name)
    {
        this.name=name;
    }

    @Override
    public void Complicated_Work() {
        System.out.println("proxy가 처리 못하는 작업을 수행합니다.");
    }
}
