package domain;

/**
 * Клас Manager представляє керівника у компанії
 */
public class Manager extends Employee {

    private Employee[] employees; 

    /**
     * Конструктор для створення об'єкта Manager з заданими підлеглими працівниками, ім'ям, посадою, рівнем та відділом.
     * @param employees Підлеглі працівники керівника.
     * @param name Ім'я керівника.
     * @param jobTitle Посада керівника.
     * @param level Рівень керівника.
     * @param dept Відділ керівника.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept); 
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення керівника, включаючи інформацію про підлеглих працівників.
     * @return Рядкове представлення керівника.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees(); 
    }

    /**
     * Конструктор для створення об'єкта Manager з заданими підлеглими працівниками.
     * @param employees Підлеглі працівники керівника.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор для створення об'єкта Manager з випадково згенерованим ID та масивом підлеглих працівників довжиною 10.
     */
    public Manager() {
        super(); 
        employees = new Employee[10]; 
    }

    /**
     * Повертає рядок з іменами підлеглих працівників керівника.
     * @return Рядок з іменами підлеглих працівників.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2); 
        return s;
    }

    /**
     * Встановлює масив підлеглих працівників керівника.
     * @param employees Масив підлеглих працівників.
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих працівників керівника.
     * @return Масив підлеглих працівників керівника.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
