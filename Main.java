import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
	
	int saat = scan.nextInt();
	int dakika =scan.nextInt();
	int saniye =scan.nextInt();
	
	System.out.println((saat*3600) + (dakika*60) + saniye + " saniye");

  }
}