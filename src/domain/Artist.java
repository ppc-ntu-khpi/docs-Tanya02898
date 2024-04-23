package domain;

/**
 * Клас Artist представляє працівника у компанії
 */
public class Artist extends Employee {

    private String[] skills; 

    /**
     * Конструктор для створення об'єкта Artist з заданими навичками, ім'ям, посадою, рівнем та відділом.
     * @param skills Навички
     * @param name Ім'я
     * @param jobTitle Посада
     * @param level Рівень
     * @param dept Відділ
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор для створення об'єкта Artist з заданими навичками та випадково згенерованим ідентифікатором.
     * @param skills Навички митця.
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Конструктор для створення об'єкта Artist з випадково згенерованим ідентифікатором та порожнім масивом навичок.
     */
    public Artist() {
        super(); 
        this.skills = new String[10]; 
    }

    /**
     * Повертає рядкове представлення митця, включаючи ідентифікатор, ім'я, посаду, рівень та відділ, а також навички.
     * @return Рядкове представлення митця.
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає рядок навичок митця.
     * @return Рядок навичок митця.
     */
    public String getSkills() {
        String s = "";
        for (String skill : skills) {
            s = s + skill + ", ";
        }
        // Видаляє останню кому та пробіл.
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички митця.
     * @param skills Навички митця.
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає масив навичок митця.
     * @return Масив навичок митця.
     */
    public String[] getSkillsList() {
        return skills;
    }
}
