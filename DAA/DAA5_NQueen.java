import java.util.*;
public class DAA5_NQueen {
    public static void nqueen(char bord[][],int row){

        //base case
        if(row==bord.length){
            printbord(bord);
            count++;
            return;
        }


        for(int j=0;j<bord.length;j++){
            if(issafe(bord, row, j)){
                bord[row][j]='Q';
                nqueen(bord, row+1);
                bord[row][j]='x';
            }
            
        }
    }
    

    public static void printbord(char bord[][]){
        System.out.println("-----chess bord-----");
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord.length;j++){
                System.out.print(bord[i][j]+" ");
            }
            System.out.println("");
        }
    }


    public static boolean issafe(char bord[][],int row, int col){
        for(int i=row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1 ,j=col-1; i>=0 && j>=0;i--,j--){
            if(bord[row][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1 ,j=col+1 ; i>=0 && j<bord.length;i--,j++){
            if(bord[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static int count=0;
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n=sc.nextInt();

        char bord[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bord[i][j]='x';
            }
        }

        nqueen(bord,0);
        System.out.println("Number of the solution :" + count);
    }
}
