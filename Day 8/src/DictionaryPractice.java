import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> engSpanDictionary = new HashMap<String, String>();

        // Putting things inside our dictionary
        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miércoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sábado");
        engSpanDictionary.put("Sunday", "Domingo");

        //Retrieve things from our dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));

        // Print out all keys
        System.out.println(engSpanDictionary.keySet());

        // Print out all values
        System.out.println(engSpanDictionary.values());

        // Print out size
        System.out.println(engSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

        // Put stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Chapati", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Jaggery", Boolean.TRUE);

        // Retrieve Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Jaggery"));

        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());

        // Is Empty?
        System.out.println(shoppingList.isEmpty());

        // Remove things
        shoppingList.remove("Eggs");

        // Replace values for a certain key
        shoppingList.replace("Chapati", Boolean.FALSE);

        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());

        // Clear our dictionary
        shoppingList.clear();

        // Is Empty?
        System.out.println(shoppingList.isEmpty());
    }
}