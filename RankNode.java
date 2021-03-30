package for_CTCI;

public class RankNode{
    public RankNode left;
    public RankNode right;
    public int left_size = 0;
    public int data;

    public RankNode(int x){
        data = x;
    }

    public void insert(int x){
        if (x <= data){
            if (left != null) left.insert(x);
            else left = new RankNode(x);
            left_size++;
        } else {
            if (right != null) right.insert(x);
            else right = new RankNode(x);
        }
    }

    public int getRank(int x){
        if (x == data) {
            return left_size;
        } else if (x < data){
            if (left == null) {
                return -1; // not in array
            } else return left.getRank(x);
        } else {
            if (right == null) return -1;
            else return left_size + 1 + right.getRank(x);
        }
    }
}
