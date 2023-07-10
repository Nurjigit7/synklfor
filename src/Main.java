import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// int i =0;
// while (i<10){
//     System.out.println("java");
//     i++;}
//     for(int i  =0; i<4; i++){
//         System.out.println("java");
//     }

        Scanner scanner = new Scanner(System.in);


  for (int a =1;a<=10; a++){
      for (int i = 1;i <=10 ; i++) {
          int v = a * i;
          System.out.print(i + "*" + a + "=" + v + "  ");
          System.out.printf("%d*%d=%d ", i, a, a * i);

          int b = (int) Math.pow(2, a);
          int b1 = (int) Math.pow(2, a);

          System.out.printf("%d ^ %d = %d\n", 2, a, b);

      }}



//        Scanner scanner =new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b= scanner.nextInt();
//        for(int i =a; i<b;i++){
//        int summa =0;
//           if (i%2==1) {
//               summa += i;
//
//               System.out.println(summa);
//           }}




}}