# JavaLabs

**Topic for all labs in this repository:**

Musical shop. Implement hierarchy of musical instruments in music shop. Implement the search of instruments by type (wind, percussion, etc). Implement the serach of instruments for some music band (guitar, drums, etc). Implement the possibility of sorting found instruments by 2 different parameters (on choice), implemented as 2 separate methods. Sorting implementation must include sorting in classic and reversed order.

**Lab 2** Implement class hierarchy (without any sorting or using data structures). Make objects of created classes in main method of class Main.java.

**Lab 3** Create class - Manager, which will include particular logic: f.e. sorting instruments by price and by weight. For sorting embedded ways of sorting in Java must be used. Sorting must be implemented in separate method. Code can use Enum type if needed.

**Lab 4** Transform project with code of 2'nd-3'rd labs to be able to perform it with maven. To perform the project, run "mvn clean package". You can generate pom.xml using maven command prompt run: mvn archetype:generate -DgroupId=ua.lviv.iot -DartifactId=work -Dversion=1.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false

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

**Lab 7**
RegEx usage in Java: delete all words from the text beginning with a consonant. Text and length of the words you want to delete must be given as parameters to the text editing method.

 
