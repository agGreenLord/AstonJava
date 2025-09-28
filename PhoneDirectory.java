import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {
    HashMap<String, String> phoneDict = new HashMap<>();

    public void add(String phone, String lastName) {
        phoneDict.put(phone, lastName);
    }

    public void get(String lastName) {
        List<String> phoneList = new ArrayList<>();
        for (String phone : phoneDict.keySet()) {
            if (phoneDict.get(phone).equals(lastName)) {
                phoneList.add(phone);
            }
        }
        System.out.println(phoneList);
    }
}
