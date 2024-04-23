package domain;

/**
 * Клас Editor представляє редактора у компанії
 */
public class Editor extends Artist {

    private boolean electronicEditing; 

    /**
     * Конструктор для створення об'єкта Editor з заданими налаштуваннями електронного редагування, навичками, ім'ям, посадою, рівнем та відділом.
     * @param electronicEditing Показує, чи використовує редактор електронне редагування.
     * @param skills Навички редактора.
     * @param name Ім'я редактора.
     * @param jobTitle Посада редактора.
     * @param level Рівень редактора.
     * @param dept Відділ, в якому працює редактор.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept); 
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення об'єкта Editor з заданими налаштуваннями електронного редагування та навичками.
     * @param electronicEditing Показує, чи використовує редактор електронне редагування.
     * @param skills Навички редактора.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills); 
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення об'єкта Editor з заданими налаштуваннями електронного редагування.
     * @param electronicEditing Показує, чи використовує редактор електронне редагування.
     */
    public Editor(boolean electronicEditing) {
        super(); 
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор для створення об'єкта Editor з випадково згенерованим ідентифікатором та налаштуванням електронного редагування, встановленим за замовчуванням.
     */
    public Editor() {
        super(); // Викликає конструктор батьківського класу для генерації ідентифікатора.
        this.electronicEditing = true; 
    }

    /**
     * Повертає рядкове представлення редактора, включаючи ідентифікатор, ім'я, посаду, рівень, відділ та налаштування редагування.
     * @return Рядкове представлення редактора.
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= "; 
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає налаштування редагування редактора.
     * @return true, якщо редактор використовує електронне редагування, false - у протилежному випадку.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює налаштування редагування редактора.
     * @param electronic Показує, чи використовує редактор електронне редагування.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
