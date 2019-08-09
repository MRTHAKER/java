class pass{
     public static void main(String[] args){
     Car ca=new Car("BMW");
     System.out.println(""+ca.brand);
     print(ca);
     System.out.println(""+ca.brand);
     }
    public static void print(Car ca){
    ca.brand="Maruti";
    System.out.println(ca.brand);}
   private static class Car{
   private String brand;
   public Car(String brand){
   this.brand=brand;
 }
 }}
