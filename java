import java.util.*;  
public class Main  
{  
public static void main(String[] args){  
 Scanner sc=new Scanner(System.in); 
int n = sc.nextInt(); // for taking size of an array

int[] array = new int[n];   // for taking array input

for(int i=0; i<n; i++){    
array[i]=sc.nextInt();  
}   
for (int i=0; i<n; i++){  
System.out.print(array[i]+" ");  
}  
System.out.println();

//reverse an array
for(int i=array.length-1;i>=0;i--){
    System.out.print(array[i]+" ");
}
}}








