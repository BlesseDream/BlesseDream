public class Dog{
  private Animal Name;
  private int Age;
  public Dog(String N, int A){
    Name = new Animal(N);
    Age = A; 
  }
  public int convertToHumanAge() {
    return 13+(7*(Age-1));
  }
}