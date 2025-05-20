import java.util.*;

public class DiagonalAddingMatrixReplacingtheValues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix values: ");
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[][] result = new int[3][3];
        for(int i=0;i<3;i++){
            result[i]=a[i].clone();
        }
        //process for primary diagonal
        for(int i=0;i<3;i++){
            int j=i;
            int sum=0;

            for(int x=-1;x<=1;x++){
                for(int y=-1;y<=1;y++){
                    int ix = i+x;
                    int jy = j+y;
                    if((x!=0 || y!=0) && ix>=0 && ix <3 && jy>=0 && jy <3){
                        sum += a[ix][jy];
                    }
                }
            }
            result[i][j]=sum;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
