package Complete_reference_java_11.Part_1.Chapter_9_Interfaces.StaicMethods;

public interface MyInterface {
    int getNumber();

    default  String getString(){
        return "The default object with type String!";
    }
    static int getDefaultNumber(){
        return  0;
    }
}
