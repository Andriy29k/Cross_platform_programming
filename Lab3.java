package org.example;

public class Lab3 {
    public static class Animal{
        private int age;
        public void eat(){
            System.out.println("Animal is eating");
        }

        public Animal(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void info(){
            System.out.println("Age: "+getAge());
        }
    }
    public static class Reptile extends Animal{
        private String sex;

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }

        public void sleep(){
            System.out.println("Animal is sleeping");
        }
        public Reptile(int age, String sex) {
            super(age);
            this.sex=sex;
        }
        @Override
        public void info(){
            System.out.println("Age: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static final class Snake extends Reptile{

        private String name;
        @Override
        public void eat() {
            System.out.println("Snake is eating");
        }

        @Override
        public void sleep() {
            System.out.println("Snake is sleeping");
        }

        public void move() {
            System.out.println("Snake is crowling");
        }

        public Snake(int age, String sex, String name) {
            super(age,sex);
            this.name=name;
        }
        @Override
        public void info(){
            System.out.println("Name: "+ name +"\nAge: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static final class Lizard extends Reptile{

        private String name;
        @Override
        public void sleep() {
            System.out.println("Lizard is sleeping");
        }

        @Override
        public void eat() {
            System.out.println("Lizard is eating");
        }
        public void move() {
            System.out.println("Lizard is walk");
        }

        public Lizard(int age,String sex, String name) {
            super(age,sex);
            this.name=name;
        }
        @Override
        public void info(){
            System.out.println("Name: "+ name +"\nAge: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static class Bird extends Animal{

        private String sex;
        public void sleep(){
            System.out.println("Animal is sleeping");
        }
        public Bird(int age, String sex) {
            super(age);
            this.sex=sex;

        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public void info(){
            System.out.println("Age: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static final class Parrot extends Bird{

        private String name;

        public Parrot(int age, String sex, String name) {
            super(age, sex);
            this.name=name;
        }

        @Override
        public void eat() {
            System.out.println("Parrot is eating");
        }

        @Override
        public void sleep() {
            System.out.println("Parrot is sleeping");
        }

        public void move() {
            System.out.println("Parrot is flying");
        }
        @Override
        public void info(){
            System.out.println("Name: "+ name +"\nAge: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static class Mammal extends Animal{
        String sex;

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }

        public void sleep(){
            System.out.println("Animal is sleeping");
        }

        public Mammal(int age, String sex) {
            super(age);
            this.sex=sex;
        }
        @Override
        public void info(){
            System.out.println("Age: "+getAge()+"\nSex: "+getSex());
        }
    }

    public static final class Horse extends Mammal{
        private String name;
        @Override
        public void sleep() {
            System.out.println("Horse is sleeping");
        }

        @Override
        public void eat() {
            System.out.println("Horse is eating");
        }

        public void move() {
            System.out.println("Horse is walk");
        }

        public Horse(int age,String sex, String name) {
            super(age,sex);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        @Override
        public void info(){
            System.out.println("Name: "+ name +"\nAge: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static final class Bat extends Mammal{
        private String name;
        @Override
        public void sleep() {
            System.out.println("Bat is sleeping");
        }

        @Override
        public void eat() {
            System.out.println("Bat is eating");
        }

        public void move() {
            System.out.println("Bat is flying");
        }

        public Bat(int age, String sex, String name) {
            super(age, sex);
            this.name=name;
        }
        @Override
        public void info(){
            System.out.println("Name: "+ name +"\nAge: "+getAge()+"\nSex: "+getSex());
        }
    }
    public static void main(String[] args) {

        Animal animal=new Animal(2);
        animal.eat();

        System.out.print("\n");

        Snake snake = new Snake(1,"Female","Midyanka");
        snake.info();
        snake.eat();
        snake.sleep();
        snake.move();

        System.out.print("\n");

        Lizard lizard = new Lizard(3,"Male","Triton");
        lizard.info();
        lizard.eat();
        lizard.move();
        lizard.sleep();
        System.out.print("\n");

        Parrot parrot = new Parrot(1,"Male","Kesha");
        parrot.info();
        parrot.move();
        parrot.eat();
        parrot.sleep();

        System.out.print("\n");

        Horse horse = new Horse(5,"Female","Mashka");
        horse.info();
        horse.move();
        horse.eat();
        horse.sleep();

        System.out.print("\n");

        Bat bat = new Bat(4,"Male","Nigth bat");
        bat.info();
        bat.sleep();
        bat.move();
        bat.eat();
    }
}