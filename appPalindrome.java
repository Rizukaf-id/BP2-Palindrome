package palindrome;
import java.util.Scanner;
public class appPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        cStack tumpuk = new cStack();
        int pilih = 0;
        do {
            System.out.println("\nAPLIKASI PALINDROME");
            System.out.println("Tekan 1 untuk memasukkan teks\nTekan 0 untuk keluar");
            System.out.print("input > ");
            pilih = scan.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan Kata > ");
                    String input = scan.next();

                    for (int i = 0; i < input.length(); i++) {
                        char cr = input.charAt(i);
                        cItem temp = new cItem(cr);
                        tumpuk.push(temp);
                    }
                    
                    String atas = tumpuk.cekatas();
                    String bawah = tumpuk.cekbawah();
                    
                    if (atas.equalsIgnoreCase(bawah)) {
                        System.out.print("Menghasilkan ");
                        tumpuk.print();
                        System.out.println("-> Merupakan PALINDROME");
                    }else{
                        System.out.print("Menghasilkan ");
                        tumpuk.print();
                        System.out.println("-> Bukan PALINDROME");
                    }
                    
                    for (int i = 0; i < atas.length(); i++) {
                        tumpuk.pop();
                    }
                    break;
                case 0:
                    System.out.println("PROGRAM STOPPED");
                    break;
            }
        } while (pilih != 0);
    }
}
