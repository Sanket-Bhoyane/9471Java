class Animal{
void makesound(){
System.out.println("making sound");
}}
class Dog{
void makesound(){
System.out.println("Barking");
}}
class Cat{
void makesound(){
System.out.println("Mewwo");
}}
class Overriding{
public static void main(String [] args){
Dog d=new Dog();
d.makesound();
Cat c=new Cat();
c.makesound();
Animal an=new Animal();
an.makesound();
}}