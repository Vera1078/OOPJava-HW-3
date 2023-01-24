public class Dog extends  Pet{
    public Person master;
    public String pet;

    public Dog (String petName){
        this.pet = petName;
        }

    public Dog (Person master, String breed, String petName, int age){
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

    public void Say(){
        System.out.println("-Гав-гав!");
    }

    public String toString() {
        return("Хозяин собаки: " + this.master + "; " + "\n" + "порода собаки: " + GetBreed() + ", " + " кличка: " + GetPetName() + ", " + "возраст питомца: " + GetAge() + ".");
    }


}