package OOP.OOP_HW.HW05;
import java.util.ArrayList;
import java.util.List;

public class WorkerModel {
    private List<Worker> workerList;

    public WorkerModel() {
        workerList = new ArrayList<Worker>();
        // Инициализируем список сотрудников
        workerList.add(new Worker(1, "John Smith", "Manager", 5000));
        workerList.add(new Worker(2, "Jane Doe", "Developer", 4000));
        workerList.add(new Worker(3, "Bob Johnson", "Developer", 4500));
    }

    public Worker[] getAllWorkers() {
        return workerList.toArray(new Worker(0, null, null, 0)[0]);
    }

    public Worker getEmployeeById(int id) {
        for (Worker employee : workerList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void addWorker(Worker worker) {
        workerList.add(worker);
    }

    public void updateWorker(Worker worker) {
        Worker oldWorker = getEmployeeById(worker.getId());
        oldWorker.setName(worker.getName());
        oldWorker.setPosition(worker.getPosition());
        oldWorker.setSalary(worker.getSalary());
    }

    public void deleteEmployee(int id) {
        Worker worker = getEmployeeById(id);
        workerList.remove(worker);
    }
}
