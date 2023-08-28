public class Main {
    public static void main(String[] args) {
//    HandleSimpleTryCatch();
//    HandleTryCatchAnaniadou();
//    HandleMultiCatch();

    }

    public static void HandleSimpleTryCatch(){
        int [] nums = new int [4];

        try{
            System.out.println("Before expection is generete");
            nums [7] = 10;
            System.out.println("this won't be  displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("index out-of-bounds");
        }
        System.out.println("After catch statement");
    }

    public static void HandleTryCatchAnaniadou(){
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denum = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " + numer[i] + " is " + numer[i] / denum[i]);
                }
                catch (ArithmeticException exc) {
                    System.out.println("some exception occurred");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
             System.out.println("No matching element found");
        }
    }
    public static void HandleMultiCatch(){
        int a=88, b=0;
        int result;
        char[] chars = {'A', 'B', 'C'};

        for (int i = 0; i<2;i++){
            try {
                if (i==0)
                    result = a/b;
                else
                    chars[5] = 'X';
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }
        System.out.println("After multi-catch");
    }
}