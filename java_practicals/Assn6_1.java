import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Assn6_1 {
    public static void main(String[] args) {

        class descendingphone implements Comparator<Long> {


            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o2 - o1);
            }
        }
        TreeMap<Long, Contact> contacts = new TreeMap<>(new descendingphone());
        Contact c1 = new Contact(9899232, "mohan", "123@gmail.com", Contact.Gender.male);
        Contact c2 = new Contact(9899899, "mohan", "123@gmail.com", Contact.Gender.male);
        Contact c3 = new Contact(9899899, "mohan", "123@gmail.com", Contact.Gender.male);
        Contact c4 = new Contact(9899898, "mohan", "123@gmail.com", Contact.Gender.male);
        contacts.put(c1.phoneNumber, c1);
        contacts.put(c2.phoneNumber, c2);
        contacts.put(c3.phoneNumber, c3);
        contacts.put(c4.phoneNumber, c4);
        Set<Long> keys = contacts.keySet();

        System.out.println(keys);
        var values = contacts.values();
        System.out.println(values);
        System.out.println(contacts);


    }

    private static class Contact {
        long phoneNumber;
        String name, email;

        enum Gender {
            male, female
        }

        Gender gender;

        public Contact(long phoneNumber, String name, String email, Gender val) {
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.email = email;
            this.gender = val;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "phoneNumber=" + phoneNumber +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}' + "\n";
        }
    }
}
