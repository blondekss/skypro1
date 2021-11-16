package pro.sky.java.course1.coursework;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("Ivanov Ivan Ivanovich", 1, 1000.0f),
            new Employee("Gumilev Petr Ivanovich", 2, 800.0f),
            new Employee("Petrov Aleksandr Ivanovich", 2, 100.0f),
            new Employee("Medvedko Viktor Ivanovich", 1, 1450.6f),
            new Employee("Bezzubov Aleksei Ivanovich", 3, 56000.7f),
            new Employee("Sidorov Dmitrii Ivanovich", 4, 1000.2f),
            new Employee("Gavrilov Mihail Ivanovich", 5, 2000.1f),
            new Employee("Popov Konstantin Ivanovich", 5, 1000.5f),
            new Employee("Sokolov Pavel Ivanovich", 1, 1500.6f),
            new Employee("Pavlov Zahar Ivanovich", 3, 2000.7f)
        };

        printFullInformation(employees);
        System.out.println("Total salary is: " + getTotalSalary(employees));
        System.out.println("Employee with min salary is: " + getEmployeeWithMinSalary(employees));
        System.out.println("Employee with max salary is: " + getEmployeeWithMaxSalary(employees));
        System.out.println("Middle salary value is: " + getSalaryMiddleValue(employees));
        printFIOForAll(employees);
	// write your code here
    }

    private static void printFullInformation(Employee[] employees){
        for (int i = 0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    private static void printFIOForAll(Employee[] employees){
        for (int i = 0; i<employees.length; i++){
            System.out.println(employees[i].getFio());
        }
    }

    private static float getTotalSalary(Employee[] employees){
        float result = 0;
        for (int i = 0; i<employees.length; i++){
            result = result + employees[i].getSalary();
        }
        return result;
    }

    private static Employee getEmployeeWithMinSalary(Employee[] employees){
        float minSalary = Float.MAX_VALUE;
        Employee employee = null;
        for (int i = 0; i<employees.length; i++){
            if(minSalary > employees[i].getSalary()){
                minSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    private static Employee getEmployeeWithMaxSalary(Employee[] employees){
        float maxSalary = 0;
        Employee employee = null;
        for (int i = 0; i<employees.length; i++){
            if(maxSalary < employees[i].getSalary()){
                maxSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    private static float getSalaryMiddleValue(Employee[] employees){
        float totalSalary = getTotalSalary(employees);
        return totalSalary/employees.length;
    }
}
