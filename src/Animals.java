public class Animals

{
    int age; //возраст животного, тип данных – целые числа int
    int weight; //вес животного, тип данных – целые числа int
    int height; //высота животного, тип данных – целые числа int
    String color; //цвет животного, тип данных – текстовая строка String
    boolean isWool; //аттрибут наличия шерсти, тип данных – булева переменная, принимающая значения true или false

    void goToSleep() {
    }

    void startEating(){
    }

    void startRunning(){
    }

    public static void main(String[] args){
        Animals tiger = new Animals();
        System.out.println("Hello");
    }
}
