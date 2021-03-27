
public class bitManipulation {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public int reverseBits(int n) {
        int times = 32;
        List<Integer> l = new ArrayList<>();
        while (times > 0) {
            int t = n & 1;
            l.add(t);
            n = n >> 1;
            times--;
        }

        int res = 0;

        for (int i = 0; i < l.size(); i++) {
            res = res << 1;
            res = res | l.get(i);
        }
        return res;
    }
}
