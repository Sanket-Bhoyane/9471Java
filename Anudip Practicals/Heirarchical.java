class Animal{
void eat(){
System.out.println("Eating");
}}
class Dog extends Animal{
void bark(){
System.out.println("bark");
}}
class Cat extends Animal{
void Meoww(){
System.out.println("Meoww");
}}
class Heirarchical{
public static void main(String args[]){
Cat c=new Cat();
c.eat();
c.Meoww();

}}