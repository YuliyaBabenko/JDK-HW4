import data.Employee;
import data.EmployeeRegister;

public class App {
    public static void main(String[] args) {
        EmployeeRegister register = new EmployeeRegister(5);
        setRegister(register);//добавляем сотрудников

        System.out.println("Число сотрудников: " + register.size());
        System.out.println("\n============= Поиск телефона по имени ============");
        printFindPhoneByName("Алексей Петров", register);
        printFindPhoneByName("Антон Иванов", register);

        System.out.println("\n============= Поиск по табельному номеру==========");
        printFindByTabelNumber(10, register);
        printFindByTabelNumber(12, register);

        System.out.println("\n============= Поиск по стажу =====================");
        prinFindByExperience(5, register);
        prinFindByExperience(2, register);
    }

    private static void prinFindByExperience(int exp, EmployeeRegister reg) {
        System.out.println("Сотрудники со стажем " + exp);
        for (Employee employee : reg.findByExperience(exp)) {
            System.out.println("\t"+employee);
        }
        System.out.println();
    }

    private static void printFindByTabelNumber(int tabel, EmployeeRegister reg) {
        System.out.println("Табельный номер: " + tabel);
        reg.findByTabelNumber(tabel).forEach(e -> {
            System.out.println("\t"+e);
        });
        System.out.println();
    }

    private static void printFindPhoneByName(String name, EmployeeRegister reg) {
        System.out.println("Имя: " + name + "\nНайденные телефоны:");
        reg.getPhoneNumberByName(name).forEach(e -> {
            System.out.println("\t" + e);
        });
        System.out.println();
    }

    private static void setRegister(EmployeeRegister register) {
        register.addEmployee(new Employee(1, "+7 (917) 456-7890", "Иван Иванов", 5));
        register.addEmployee(new Employee(2, "+7 (987) 567-8901", "Алексей Петров", 10));
        register.addEmployee(new Employee(3, "+7 (965) 678-9012", "Елена Смирнова", 3));
        register.addEmployee(new Employee(4, "+7 (911) 789-0123", "Анна Ковалева", 8));
        register.addEmployee(new Employee(5, "+7 (965) 890-1234", "Дмитрий Николаев", 15));
        register.addEmployee(new Employee(6, "+7 (917) 901-2345", "Ольга Соколова", 2));
        register.addEmployee(new Employee(7, "+7 (987) 012-3456", "Алексей Петров", 2));
        register.addEmployee(new Employee(8, "+7 (890) 123-4567", "Екатерина Петрова", 12));
        register.addEmployee(new Employee(9, "+7 (901) 234-5678", "Александра Смирнова", 4));
        register.addEmployee(new Employee(10, "+7 (012) 345-6789", "Игорь Ковалев", 9));
        register.addEmployee(new Employee(11, "+7 (123) 456-7890", "Наталья Николаева", 16));
        register.addEmployee(new Employee(12, "+7 (234) 567-8901", "Сергей Соколов", 2));
        register.addEmployee(new Employee(13, "+7 (345) 678-9012", "Антон Иванов", 6));
        register.addEmployee(new Employee(14, "+7 (456) 789-0123", "Людмила Петрова", 1));
        register.addEmployee(new Employee(15, "+7 (567) 890-1234", "Павел Смирнов", 3));
    }
}
