public class TrianglePattern {
    public static void main(String[] args) {
        print(4, 0);
        normalTriangle(4,0);
    }

    static void print(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            print(r, c + 1);
        } else {
            System.out.println();
            print(r - 1, 0);
        }
    }

    static void normalTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            normalTriangle(r, c + 1);
            System.out.print("* ");
        } else {
            normalTriangle(r - 1, 0);
            System.out.println();
        }
    }
}
