import javax.sound.midi.Soundbank;
import java.security.SecureRandom;

public class Person {

    static int countID = 0;
    private String name;
    private int age;

    private int ID;
    public Cat Catt;
    public Dog Dogg;


    public Person (String name, int age ){
        this.name = name;
        this.age = age;
//        this.sex = sex;
        countID ++;
        this.ID = countID;
       this.Catt = new Cat (name);
       this.Dogg = new Dog (name);


//        this.Pet = new Pet(pet);

    }
//    public Person (String name, int age, Boolean sex ){
//        this (name, age, sex);
//    }

    @Override
    public String toString() {
        return "Имя - " + this.name + ", "+" возраст - " + this.age +", " +  " ID - " + this.ID + ".";
    }

    public int getAge(){
        return  age;
    }

    public void setAge (int age){
        this.age = age;

    }

//    public Pet getPetName (){
//        return petName;
//    }
//    public void setPetName (Pet petName){
//        this.petName = petName;
//    }
//    }
    public void feed(String pett){
        this.Catt.pet = pett;
        System.out.println("Идем, " + pett + ", " + "накормлю тебя!");

    }
    public void feed1(String peti){
        this.Dogg.pet = peti;
        System.out.println("Идем, " + peti + ", " + "накормлю тебя!");

    }
}
