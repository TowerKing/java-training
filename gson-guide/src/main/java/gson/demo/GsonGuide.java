package gson.demo;

import com.google.gson.Gson;

public class GsonGuide {

    public static void main(String[] args) {
        jsonConvertObjectEachOther();
    }

    private static void jsonConvertObjectEachOther() {
        Gson gson = new Gson();
        Person person = new Person();
        person.setId(1);
        person.setAge(8);
        person.setName("TK");
        System.out.println(gson.toJson(person));

        String personJson = "{\"id\":1,\"name\":\"TK2\",\"age\":8}";
        Person person1 = gson.fromJson(personJson, Person.class);
        System.out.println(person1);
    }
}
