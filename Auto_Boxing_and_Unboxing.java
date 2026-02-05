//-- Auto Boxing and Unboxing --//

class Auto_Boxing_and_Unboxing {
    public static void main(String args[]) {
        int num = 2;
        Integer num1 = num; // Auto-boxing
        System.out.println("Auto-boxing: " + num1); // Output: 2

        int num2 = num1; // Auto-unboxing
        System.out.println("Auto-unboxing: " + num2); // Output: 2
        
        String str = "11";
        int num3 = Integer.parseInt(str); // Converting String to int
        System.out.println("String to int: " + num3); // Output: 11
    }
}
