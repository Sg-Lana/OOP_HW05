package OOP.OOP_HW.HW05;

public class App {
    public static void main(String[] args) {
        WorkerView view = new WorkerView();
        WorkerModel model = new WorkerModel();
        WorkerPresenter presenter = new WorkerPresenter(view, model);
    }
}
