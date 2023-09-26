package constructorDemo;

public class ConstructorPractice {

    String name;
    int id;
    String location;
    boolean isMale;

    public ConstructorPractice(String name, int id, String location, boolean isMale){

        this.name= name;
        this.id=id;
        this.location=location;
        this.isMale=isMale;
       //name = this.name;


    }

    public ConstructorPractice(){   //Default parameterization

        System.out.println("Hi");


    }

    public static void main(String[] args) {

        ConstructorPractice obj = new ConstructorPractice("Ashraf", 101, "New York", true);
            System.out.println(obj.name+" "+obj.id+" "+obj.location+" "+obj.isMale);

        ConstructorPractice obj2 = new ConstructorPractice("Tanvir", 102, "New Jersey", true);
        System.out.println(obj2.name+" "+obj2.id+" "+obj2.location+" "+obj2.isMale);

        ConstructorPractice obj3 = new ConstructorPractice("Farzana", 103, "Texas", false);
        System.out.println(obj3.name+" "+obj3.id+" "+obj3.location+" "+obj3.isMale);

        ConstructorPractice obj4 = new ConstructorPractice("Nahida", 104, "California", false);
        System.out.println(obj4.name+" "+obj4.id+" "+obj4.location+" "+obj4.isMale);

    }









}
