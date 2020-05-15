package domain;

public interface IObservable {
    public void notificar();
    public void agregarObservable(IObserver ... observers);
    public void eleminarObservable(IObserver observer);
}
