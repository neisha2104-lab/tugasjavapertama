package tugasjavapertama.src;
import java.util.Scanner;
public class tugas_java_pertama {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        
        System.out.print("Masukkan nilai awal x: ");
        x = scanner.nextInt();
        System.out.print("Masukkan nilai awal y: ");
        y = scanner.nextInt();
       
        while (x < y) {
            System.out.println("Angka urut: " + x);
            x=x+2;
            
        }
        scanner.close();
    }
}
