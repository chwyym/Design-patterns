package observer;

public interface Subject {
    public void registerObserver(Observer o); // observer를 등록해야해서 Observer객체 필요
    public void removeObserver(Observer o); // 삭제를위해 필요
    public void notifyObservers();
}
