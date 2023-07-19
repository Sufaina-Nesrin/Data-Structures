public class Recursion {
    
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.recursion(5);
    }
    
    public void recursion(int n) {
        if (n <= 1) {
            return;
        } else {
            recursion(n - 1);
            System.out.println(n);
            recursion(n - 1);
        }
    }
}

