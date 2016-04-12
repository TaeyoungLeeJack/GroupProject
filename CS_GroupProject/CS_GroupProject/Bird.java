public class Bird extends Animal{
  
  
  private int wing;
  private int size;
  
  public Bird(Gender gender,boolean able, int age, String name, int wing,int size){
    super(gender, able, age, name);
    this.wing=wing;
    this.size=size;}
    
  public int getWing(){return this.wing;}
  public int getSize(){return this.size;}


public void intro(){
System.out.println("Hello. My name is "+ this.getName() + ". I believe I can fly!"); }
}