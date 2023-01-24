public class Program {

    public static void main(String[] args) {

        Person p1 = new Person("Sven", 37);
        Person p = new Person("Ilse", 35);
        Person p2 = new Person("Dieter", 20);

        Cat push = new Cat (p, "sphinx", "Пушок", 3);

        Dog tuz = new Dog (p2, "метис", "Тузик", 5 );

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(push);
        System.out.println(tuz);

        Cat cat = new Cat("Пушок");
        System.out.println("------------------------");
        System.out.println("*** Беседа хозяин-кот ***");

//       животное подает голос
        push.Say();
//        хозяин идет кормить питомца
        p.feed(cat.pet);
        Dog dog = new Dog("Тузик");
        System.out.println("------------------------");
        System.out.println("*** Беседа хозяин-пёс ***");
        tuz.Say();
        p2.feed1(dog.pet);


    }

}
