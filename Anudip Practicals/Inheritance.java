class Animal{
void eat(){
System.out.println("Eating");
}}
class Dog extends Animal{
void bark(){
System.out.println("bark");
}}
class Babydog extends Dog{
void Whipping(){
System.out.println("Whipping");
}}
class Inheritance{
public static void main(String args[]){
Babydog d=new Babydog();
d.eat();
d.bark();
d.Whipping();

}}