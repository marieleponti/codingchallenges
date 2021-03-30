package for_CTCI;
public class Track {
    RankNode root = null;
    public void track(int x){
        if (root == null){
            root = new RankNode(x);
        } else {
            root.insert(x);
        }
    }
}
