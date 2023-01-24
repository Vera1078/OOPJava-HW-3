import javax.sound.midi.Soundbank;

public class Cat extends  Pet{
       public Person master;
       public String pet;

       public Cat (String petName){
           this.pet = petName;
       }



    public Cat (Person master, String breed, String petName, int age){
        this.master = master;
        SetBreed(breed);
        SetPetName(petName);
        SetAge(age);
    }


    public Person getMaster() {
        return master;
    }
    public void setMaster (Person master){
        this.master = master;
    }
//    public String getBreed(){
//        return  breed;
//    }
//
//    public void setBreed (String breed){
//        this.breed = breed;
//    }
//    public String getName(){
//        return  name;
//    }
//    public void setName(String name){
////        this.name = name;
//    }

    public void Say(){
        System.out.println("-Мяяяяяу");
    }

    public String toString() {
        return("Хозяин кошки: " + this.master + "; " + "\n" + "порода кошки: " + GetBreed() + ", " + " кличка: " + GetPetName() + ", " + "возраст питомца: " + GetAge() + ".");
    }

}
