//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le
// informazioni e poi si stamperanno a video


public class Main {
    private static User db;
    public static User getDb(){
        if(db == null){
            db = new User("Mario",26);
            System.out.println(db);
        }
        return db;
    }
    public static void main(String[] args) {
        User user2 = new User("Franco",45);
        user2.informazioniAlVideo();
        user2.setName("Luigi");
        user2.setAge(33);
        user2.informazioniAlVideo();

     User localDB = getDb();
    }
}