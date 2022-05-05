# JavaLabs

**Lab 5**
Write module tests for previous labs. Reach at least 80% test coverage.

**Lab 6**
Implement writing the list of objects, which contains ShopManager, in CSV-file. 

Implement 2 methods:
1) public String getHeaders(){...} - returns the string object that includes the attributes' names of a class, separated with coma.
2) public String toCSV(){...} - returns the string object that includes the values of attributes of a class, separated with coma.

Implementing of toCSV() method in derived classes has to call the method from the parent class too. Fields, declareted in parent class, must cobe converted in string object, separeated with coma, in parent class. Example:
class Crocodile{
  private String origin;
  public String getHeaders(){
    return "origin";
  }
}
class Aligator extends Crocodile{
  private int maxSpeed;
  public String getHeaders(){
    return super.getHeaders() + "," + "maxSpeed";
  }
} 

For implementing writing data in file i have to implement a class Writer(i.e. CrocodileWriter), which will include method public void writeToFile(List<Crocodile> crocodiles). This method must be called from tests. 
The code must be written according to the java code convention.
  
Besides, checkstyle and spotbugs plugins must be included in pom.xml and used to check the code for any bugs and mistakes.

to check the code quality run "mvn clean site"
