public class Walk extends Animals{
  
  public enum 
  
  private int leg;
  private int size;
  
  public Walk(Gender gender,boolean able, int age, String name, int leg, int size){
   super(gender, able, age, name);
   this.leg=leg;
   this.size=size;}
  public void intro(){
System.out.println("Hello. My name is "+ this.getName() + ". I have legs!!!"); }
}
