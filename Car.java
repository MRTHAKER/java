class Car{
      private String name;
      private String engine;
      public static int numberOfCars;
      public Car(String name, String engine){
      this.name=name;
      this.engine=engine;
      numberOfCars++;}

public static void setNumberOfCars(int numberOfCars){
Car.numberOfCars=numberOfCars;}
         }
class abc{
      public static void main(String args[]){
               Car.setNumberOfCars(4);
               System.out.println(Car.numberOfCars);
               Car c1=new Car("jaguar","v8");
               Car c2=new Car("bugatti","w16");
               System.out.println(Car.numberOfCars);}
          }
