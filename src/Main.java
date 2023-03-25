import model.UserDB;
import model.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>Популярні завдання для закріплення теорії з тем про функціональне програмування, функціональні інтерефейси
 * та Stream API. 10 задач, які містять практичне застосування всіх важливих методів з інтерфейсу Stream.</p>
 * <p>Початкова реалізація задач відповідно до типу повертаємого значення повертає null, 0d або false.</p>
 * <p>Успішним результатом виконання завдання є проходження всіх тестів з класу Test.</p>
 */
public class Main {
    /**
     * Перетворення об'єкту одного типу даних в інший. Існує модель, що містить усю інформацію про користувача,
     * яка лежить в базі даних, а є модель, яку потрібно передати на клієнтську частину - без паролю та email-у.
     *
     * @param users колекція користувачів з БД.
     * @return колекція моделей користувачів для клієнта.
     */
    public static List<UserDTO> userDBToUserDTO(final List<UserDB> users) {
        return null;
    }

    /**
     * Знайти всіх користувачів за вказаним ріком народження.
     *
     * @param year рік народження.
     * @return колекція користувачів, що відповідає умові.
     */
    public static List<UserDTO> findUsersByYear(final int year) {
        return null;
    }

    /**
     * Знайти середнє арифметичне значненя віку користувачів.
     *
     * @param users колекція користувачів з БД.
     * @return середнє арифметичне віку.
     */
    public static double getAverageUsersAge(final List<UserDB> users) {
        return 0d;
    }

    /**
     * Кластеризувати користувачів за країною.
     *
     * @param users колекція користувачів з БД.
     * @return хеш-таблиця, ключ якої - країна, а значення - список користувачів з відповідної країни.
     */
    public static Map<String, List<UserDTO>> partitionUsersByCountry(final List<UserDB> users) {
        return null;
    }

    /**
     * Сортувати користувачів за прізвищем та повернути перших п'ятьох.
     *
     * @param users колекція користувачів з БД.
     * @return відсортовані п'ять користувачів у списку.
     */
    public static List<UserDTO> sortByLastNameAndReturnFirstFive(final List<UserDB> users) {
        return null;
    }

    /**
     * Групувати прізвища користувачів за роком народження та відсортувати прізвища у множинах.
     *
     * @param users колекція користувачів з БД.
     * @return хеш-таблиця, ключ якої - рік, а значення - відсортовані прізвища.
     */
    public static Map<Integer, Set<String>> groupSortedLastNamesByYear(final List<UserDB> users) {
        return null;
    }

    /**
     * Сортувати користувачів за ім'ям та за прізвищем.
     *
     * @param users колекція користувачів з БД.
     * @return колекція відсортованих користувачів.
     */
    public static List<UserDTO> sortByFirstNameAndLastName(final List<UserDB> users) {
        return null;
    }

    /**
     * Перевірити чи існує користувач з відповідною адресою електронної поштової скриньки.
     *
     * @param email ел. адреса користувача.
     * @return true - якщо такий користувач наявний, false - інакше.
     */
    public static boolean isUserWithEmailExists(final String email) {
        return false;
    }

    /**
     * <p>Повернути список-сторінку. Вона має містити кількість записів відповідно pageSize та вказувати ті записи,
     * які належать сторінці номер page.</p>
     * <p>Наприклад, якщо в базі даних 10 користувачів, а вхідні аргументи page = 0, pageSize = 5, то мають бути видані
     * перші 5 користувачів (з індексу 0 до 4 включно).</p>
     * <p>Якщо вхідні аргументи page = 2, pageSize = 2, то мають бути видані користувачі за індексом 4 та 5. Перша (0)
     * сторінка містить користувачів за індексом 0, 1, а друга (1) сторінка - користувачів за індексом 2 і 3.</p>
     * <p><b>Формула skip = page * pageSize, limit = pageSize.</b></p>
     *
     * @param page     номер сторінки.
     * @param pageSize розмір сторінки.
     * @return визначена кількість елементів визначеної сторінки.
     */
    public static List<UserDTO> returnPageWithSize(final int page, final int pageSize) {
        return null;
    }

    /**
     * Кількість згадувань кожного символу (кожної літери) в усіх прізвищах користувачів.
     *
     * @param users колекція користувачів з БД.
     * @return хеш-таблиця, ключ якої - символ (літера), а значення - її кількість в усіх прізвищах.
     */
    public Map<Character, Integer> getCharsFrequencyFromLastName(final List<UserDB> users) {
        return null;
    }
}
