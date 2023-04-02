package OOP.OOP_HW.HW05;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkerPresenter {
    private WorkerView view;
    private WorkerModel model;

    public WorkerPresenter(WorkerView view, WorkerModel model) {
        this.view = view;
        this.model = model;

        view.setWorkerList(model.getAllWorkers());
        view.setAddActionListener(new AddWorkerActionListener());
        view.setDeleteActionListener(new DeleteEmployeeActionListener());
        view.setUpdateActionListener(new UpdateEmployeeActionListener());
    }

    private class AddWorkerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Worker employee = view.getWorkerInputData();
            model.addWorker(worker);
            view.setWorkerList(model.getAllWorkers());
        }
    }

    private class DeleteEmployeeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedEmployeeId = view.getSelectedWorkerId();
            model.deleteWorker(selectedWorkerId);
            view.setWorkerList(model.getAllWorkers());
        }
    }

    private class UpdateEmployeeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Worker employee = view.getWorkerInputData();
            model.updateWorker(employee);
            view.setWorkerList(model.getAllWorkers());
        }
    }
}
