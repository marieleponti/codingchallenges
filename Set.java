public class Set {
    int x;
    int y;

    public Set(int num1, int num2){
        x = num1;
        y = num2;
    }

    public void setElements(){
        x = 0;
        y = 0;
    }
    public void setElements(int num1, int num2){
        x = num1;
        y = num2;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void swap(){
        x = y - x;
        y = y - x;
        x = y + x;
    }

    public void swapBits(){
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
    }
}