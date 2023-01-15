public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        User user1 = new User("Marek", 25);
        User user2 = new User("Jarek", 30);
        User user3 = new User("Darek", 40);
        User user4 = new User("Basia", 26);
        User user5 = new User("Kasia", 17);

        User[] users = {user1, user2, user3, user4, user5};

        double sum = 0;
        for (int i = 0; i <= users.length - 1; i++) {
            sum += users[i].age;
        }

        double average = sum / users.length;
        System.out.println("Average age: " + average + "\n");
        System.out.println("Users below avg: ");

        for (int i = 0; i <= users.length - 1; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}
