package Exercise_1_Singleton_Implementation;

class BasicSingleton {
    private static BasicSingleton instance;
    private  BasicSingleton() {
        System.out.println("Singleton Instance Created");
    }
    public static BasicSingleton getInstance() {
        if(instance==null){
            instance=new BasicSingleton();
        }
        return instance;
    }
}
class Single{
    public static void main(String[] args) {
        BasicSingleton s1=BasicSingleton.getInstance();
        BasicSingleton s2=BasicSingleton.getInstance();
        System.out.println(s1==s2);
    }
}
