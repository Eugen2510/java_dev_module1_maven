package maven;

import com.google.gson.Gson;

public class PersonNameShower {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Eugene");
        person.setLastname("Luhovyi");
        System.out.println(new Gson().toJson(person));
    }
}
