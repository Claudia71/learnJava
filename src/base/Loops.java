package base;

public class Loops {

    public Loops(){
        System.out.println("Loops constructor");
    }

public  void printSimpleArray(){


    int[] integerArray = new int [4];
    integerArray[0]=0;
    integerArray[1]=1;
    integerArray[2]=2;
    integerArray[3]=3;

    for(int i=0;i<integerArray.length;i++){
        System.out.println(integerArray[i]);
    }
}
public static String message(){
        return "Loops message";
}

}