package proxy;

public class proxy implements Subject{
    public Real_Subject subject;
    public String name;

    public void set_Name(String name) {
        System.out.println("proxy가 대신해서 처리할 수 있음.");
        if(subject != null){
            subject.set_Name(name);
        }
        this.name = name;
    }

    public void Show_Name()
    {
        System.out.println("proxy가 대신 처리함.(Show_Name 함수)");
        System.out.println("my name is "+name);
    }

    public void Complicated_Work()
    {
        subject = new Real_Subject();
        subject.Complicated_Work();
    }

}
