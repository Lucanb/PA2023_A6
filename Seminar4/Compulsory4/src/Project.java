public class Project implements Comparable<Project>{
    private String name;
    public Project(String s) {
        name=s;
    }
    public void setName(String name)
    {
       this.name=name;
    }
    public String returnName(){
          return name;
    }

    @Override
    public int compareTo(Project other) {
        return 0;
    }

    @Override
    public int compareTo(Student obj) {
        return 0;
    }
}
