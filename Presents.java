import java.util.*; 
public class Presents{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for(int i = 0; i < n ; i++){
            int curr = sc.nextInt(); 
            arr[curr-1] = i+1;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}