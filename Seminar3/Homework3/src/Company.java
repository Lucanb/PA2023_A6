public class Company implements Node, Comparable<Company> {
    private String name;

    public Company(String name) {
        this.name = name;
    }
 @Override
    public int compareTo(Company obj)
 {
      return this.name.compareTo(obj.name);
 }
 @Override
    public String getName(){
        return name;
 }

    @Override
    public int compareTo(Person other) {
        return 0;
    }
}
