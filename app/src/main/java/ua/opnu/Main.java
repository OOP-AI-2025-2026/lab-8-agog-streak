package ua.opnu;

public class Main {
    public static void main(String[] args) {
        //1
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse: " + middleName.orElse("немає"));

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username);
        System.out.println("isPresent: " + username.isPresent());
        System.out.println("get(): " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));

        try {
            middleName.get();
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        try {
            MyOptional<String> broken = new MyOptional<>(null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        //5,6
        GenericTwoTuple<String, Integer> t1 = new GenericTwoTuple<>("Age", 19);
        System.out.println(t1);

        GenericThreeTuple<String, Integer, Boolean> t2 = new GenericThreeTuple<>("User", 42, true);
        System.out.println(t2);


    }
}
