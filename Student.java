package practice07_3_2;

public class Student{
    private String names;
    private int scores;

    public Student(String name, int score){
        this.names = name;
        this.scores = score;
    }

    public String name(){
        return names;
    }

    public int score(){
        return scores;
    }

}
