package domain;

/**
 * Клас Employee представляє працівника у компанії
 **/
public class Employee {

    private String name; 
    private String jobTitle; 
    private int ID; 
    private int level; 
    private String dept; 

    /**
     * Конструктор для створення об'єкта Employee з заданими ім'ям, посадою, рівнем та відділом.
     * @param name Ім'я працівника.
     * @param jobTitle Посада працівника.
     * @param level Рівень працівника.
     * @param dept Відділ працівника.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); 
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор для створення об'єкта Employee з випадково згенерованим ID.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
    }

    /**
     * Встановлює посаду працівника.
     * @param job Посада працівника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     * @return Посада працівника.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     * @return Ім'я працівника.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     * @param level Рівень працівника.
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     * @return Рівень працівника.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     * @return Відділ працівника.
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     * @param dept Відділ працівника.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     * Якщо задане ім'я не відповідає очікуваному формату, встановлює ім'я на "John Doe".
     * @param name Ім'я працівника.
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }

    /**
     * Повертає рядкове представлення працівника.
     * @return Рядкове представлення працівника, включаючи ID, ім'я, посаду, рівень та відділ.
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
}
