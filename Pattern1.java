<<<<<<< HEAD
// public class Pattern1 {
//     public static void main(String[] args){
//         for(int i=0; i<=5; i++){
//             for(int j=1 ; j<=i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }
public class Pattern1 {
    public static void main(String[] args){
        for(int i=9 ; i>=1 ; i--){
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
            i-=1;
            for (int s = 0; s < (9 - i); s--) {
                System.out.print(" ");
            }
        }
    }
=======
// public class Pattern1 {
//     public static void main(String[] args){
//         for(int i=0; i<=5; i++){
//             for(int j=1 ; j<=i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }
public class Pattern1 {
    public static void main(String[] args){
        for(int i=9 ; i>=1 ; i--){
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
            i-=1;
            for (int s = 0; s < (9 - i); s--) {
                System.out.print(" ");
            }
        }
    }
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
}