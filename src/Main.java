import java.util.Random;

public class Main {


    private final static Random RANDOM = new Random();
    private final static String NAMES[] = {"Алексей", "Вадим", "Иван", "Артем", "Данил", "Михаил", "Андрей",};
    private final static String SURNAMES[] = {"Малофеев", "Морозов", "Соврасов", "Аникин", "Карпенко", "Шишенин", "Михалев",};
    private final static String PATRONYMIC_NAMES[] = {"Романович", "Валентинович", "Иванович", "Андреевич", "Данилович", "Михайлович", "Андреевич",};


    private static Employee[] employee = new Employee[10];

    private static void initemployee() {
        for (int i = 0; i < employee.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                    PATRONYMIC_NAMES[RANDOM.nextInt(0, PATRONYMIC_NAMES.length)];

            employee[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(75_000, 120_000));

        }
    }

    public static void main(String[] args) {
        initemployee();
        print();
        System.out.println("Сумма затрат на ЗП сотрудников " + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной ЗП " + MinSalary());
        System.out.println("Сотрудник с максимальной ЗП " + MaxSalary());
        System.out.println("Среднее значение зарплат сотрудников " + calculateAverageOfSalaries());
        printFullNames();

    }

    private static void print() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employee) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee MinSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : employee) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee MaxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : employee) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / employee.length;
    }

    private static void printFullNames() {
        for (Employee employee : employee) {
            System.out.println(employee.getFullName());
        }
    }


}