package spring_to_remember.lesson_06.init_destroy;

import spring_to_remember.lesson_04.models.Pet;

public class Person {
    private String name;
    private String surName;
    private int age;

    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hallo my Pet!");
        pet.say();
    }

    public void init() {
        // open resources
        System.out.println("Person bean is going through init");
    }


    public void destroy() {
        // close resources
        System.out.println("Person bean will bew destroy now");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
