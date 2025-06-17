public class rectangle {

// ****
// ****
// ****
// ****
    public static void printRect(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

// *
// **
// ***
// ****
    public static void printTriangle(int n){
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

// 1
// 12
// 123
// 1234
    public static void printCols(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

// 1
// 22
// 333
// 4444
    public static void printRows(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

// ****
// ***
// **
// *
    public static void printRevTr(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

// 1234
// 123
// 12
// 1
    public static void printRevCols(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    *
//   ***
//  *****
// *******
public static void printPyramid(int n){
    for(int i=0; i<n; i++){
        // space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        
        // star
        for(int j=0; j<2*i+1; j++){
            System.out.print("*");
        }


        // space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}


// *******
//  *****
//   ***
//    *
public static void printRevPyramid(int n){
    for(int i=0; i<n; i++){
        // space
        for(int j=0; j<=i; j++){
            System.out.print(" ");
        }
        
        // star
        for(int j=0; j<2*(n-i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}



//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
public static void printKite(int n){
    for(int i=0; i<n; i++){
        // space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        
        // star
        for(int j=0; j<2*i+1; j++){
            System.out.print("*");
        }


        // space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=n-2; i>=0; i--){
        // space
        for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        
        // star
        for(int j=0; j<2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        printRect(5);
        System.out.println();
        printTriangle(5);
        System.out.println();
        printCols(5);
        System.out.println();
        printRows(5);
        System.out.println();
        printRevTr(5);
        System.out.println();
        printRevCols(5);
        System.out.println();
        printPyramid(5);
        System.out.println();
        printRevPyramid(5);
        System.out.println();
        printKite(5);
    }
}
