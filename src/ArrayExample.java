import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom(){
        Random rd=new Random();
        int array[]=new int[100];
        for(int i=0;i<100;i++){
            array[i]=rd.nextInt(100);
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        int array[]=arrayExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chỉ số");
        int x= scanner.nextInt();
        try{
            System.out.println("Phần tử đó là: "+ array[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số không nằm trong mảng");
        }
    }
}
