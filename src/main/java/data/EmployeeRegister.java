package data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
    List<Employee> register;

    public EmployeeRegister() {
        register = new ArrayList<>();
    }

    public EmployeeRegister(int i) {
        if (i>0) this.register = new ArrayList<>(i);
        else register = new ArrayList<>();
    }


    /** Добавление сторудника в справочник
     * @param e класс Emploee
     */
    public void addEmployee(Employee e) {
        register.add(e);
    }

    /** Поиск по стажу
     * @param experiece
     * @return
     */
    public List<Employee> findByExperience(int experiece) {
        return  register.stream()
                .filter(employee -> employee.getExperience()==experiece)
                .toList();
    }

    /** Поиск номера телефона по имени
     * @param name имя сотрудника
     * @return
     */
    public List<String> getPhoneNumberByName(String name) {
        List<String> result = new ArrayList<>();
        register.forEach(employee -> {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhoneNumber());
            }
        });
        return result;
    }

    /** Поиск по табельному номеру
     * @param tabel табельный номер
     * @return список сотрудников
     */
    public List<Employee> findByTabelNumber(int tabel) {
        return register.stream()
                .filter(employee -> employee.tabelNumber == tabel)
                .toList();
    }

    /** Число сотрудников в списке
     * @return
     */
    public int size(){
        return register.size();
    }
}
