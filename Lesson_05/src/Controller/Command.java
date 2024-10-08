package Controller;

/**
 * Перечисление, представляющее команды для управления программой.
 */
public enum Command {
    NONE, // Нет команды
    READ, // Команда для чтения данных
    CREATE, // Команда для создания данных
    UPDATE, // Команда для обновления данных
    LIST, // Команда для вывода списка данных
    DELETE, // Команда для удаления данных
    EXIT // Команда для выхода из программы
}
