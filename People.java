public class People implements Comparable<People>{
    private String name;
    private int num;

    public People(){
        name = "";
        num = -1;
    }

    public People(String myName, int myNum){
        name = myName;
        num = myNum;
    }

    public int getNum(){
        return this.num;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(People o) {
        if (this.name.equals(o.name)) {
            return this.num - o.num;
        } else {
            return this.name.compareToIgnoreCase(o.name);
        }
    }
    @Override
    public String toString(){
        return name + " " + num;
    }
}

