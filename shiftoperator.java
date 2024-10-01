public class shiftoperator {
    public static void main(String[] args) {
        int a=8; // 8 in binary is 1000
        int b=-2;
        // left shift operator <<
        System.out.println("Left shift (a<<2):"+(a<<2));
        // Right shift operator>>
        System.out.println("Right shift (a>>2):"+(a>>2)); // 8>>2=2(binary 1000 becomes 10)    }
        // right shift unsigned >>>
        System.out.println("Unsigned Right shift (b>>>2:)"+(b>>>2));
        

}
}