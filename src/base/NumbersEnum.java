package base;

public enum NumbersEnum {

    first(1);

    //second(2);

    //third(3);

    int value;

    NumbersEnum(int value){
        this.value = value;
    }

    public static void main(String[] args) {

        NumbersEnum[] enumValues = NumbersEnum.values();

        for (int i =0; i <enumValues.length; i++){
            NumbersEnum currentElement = enumValues[i];

            System.out.println(currentElement);

            System.out.println("current element type");
        }
        //System.out.println(values);
        System.out.println((first.name()));

    }
    }

