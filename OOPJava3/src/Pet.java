public abstract class Pet {
    private String petName;
    private int age;
    private String breed;


    public void SetPetName (String petName){
        this.petName = petName;
    }

    public void SetAge (int age){
        this.age = age;
    }

    public void SetBreed (String breed){
        this.breed = breed;
    }

    public String GetPetName (){
        return petName;
    }

    public String GetBreed (){
        return breed;
    }

    public int GetAge (){
        return age;
    }

    public abstract void Say();


}
