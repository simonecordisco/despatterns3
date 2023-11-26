public class User {

    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
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
