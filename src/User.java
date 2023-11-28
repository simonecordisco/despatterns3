public class User {
 private static User db;
    public static User getDb(){
        if(db == null){
            db = new User();
            db.name="Marco";
            db.age=23;
        }
        return db;
    }
    private String name;
    private int age;

    User() {
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

   public void setAge(int age) {
        this.age = age;
    }
public void informazioniAlVideo(){
    System.out.println("Il nome è : " + name + " e ha : " + age + " anni ");
}
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
