
public class Pes implements Animals{

    private String name;
    private int age;
    public Pes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJmeno(){
        return this.name;
    }
    public void setJmeno(String newJmeno){
        this.name = newJmeno;
    }
}

