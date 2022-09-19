package pattern;

public class Palindrome {
    public static void main(String[] args) {

        int number = 5;
        for (int index = 1; index <= number; index++){
            for (int internalIndex = 1; internalIndex <= number - index; internalIndex++){
                System.out.print(" ");
            }
            for (int internalIndex = index; internalIndex >= 1; internalIndex--){
                System.out.print(internalIndex);
            }
            for (int internalIndex= 2; internalIndex <= index; internalIndex++){
                System.out.print(internalIndex);
            }
            System.out.println();
        }

    }
}
//output-:
//            1
//           212
//          32123
//         4321234
//        543212345
