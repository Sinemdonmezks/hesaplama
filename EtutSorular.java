import java.util.Scanner;

public class EtutSorular {

	public static void main(String[] args) {
			//
			Scanner scanner = new Scanner(System.in);
			int input = 0;

			do {
				System.out.println("==Hesap makinesi===\n");
				System.out.println("1- Topla");
				System.out.println("2- Çıkar");
				System.out.println("3- Çarp");
				System.out.println("4- Böl");
				System.out.println("5- Faktöriyel");
				System.out.println("6- Üs heseaplama");
				System.out.println("7- Asal Kontrolü");
				System.out.println("0- Çıkış");
				System.out.println("Bir işlem Seçiniz");
				input = scanner.nextInt();
				switch (input) {
				case 1:
					topla();
					break;
				case 2:
					cıkar();
					break;
				case 3:
					carp();
					break;
				case 4:
					bol();
					break;
					
				case 0:
					System.out.println("Güle Güle ...");
					break;

				default:
					break;
				}

			} while (input != 0);

		}

		private static void cıkar() {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			int sayı;
			int count = 0;
			int toplam = 0;
			do {

				System.out.println("Lütfen Bir sayı giriniz");
				sayı = scanner.nextInt();
				count++;
				scanner.nextLine();
				if (count == 1) {
					toplam = sayı;
				} else {
					toplam -= sayı;

				}
				System.out.println(
						"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

				input = scanner.nextLine();

			} while (!input.equals("="));
			System.out.println("toplam=" + toplam);
		}

		public static void topla() {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			int sayı;
			int toplam = 0;

			do {

				System.out.println("Lütfen Bir sayı giriniz");
				sayı = scanner.nextInt();
				scanner.nextLine();
				toplam += sayı;
				System.out.println(
						"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

				input = scanner.nextLine();
			} while (!input.equals("="));
			System.out.println("toplam=" + toplam);
		}
		
		public static void carp() {
			Scanner scanner=new Scanner(System.in);
			int carpım=1;
			String input="";
			int sayi;
			
			do {
				System.out.println("bir sayı girin..:");
				sayi=scanner.nextInt();
				scanner.nextLine();
				carpım*=sayi;
				
				
				System.out.println(	"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

				input= scanner.nextLine();
			
			}while(!input.equals("="));
					System.out.println("carpım="+carpım);
					System.out.println("----------------------------------");
			}
			
			public static void bol() {
				Scanner scanner=new Scanner(System.in);
				double sayi;
				double bolum=0;
				int sayac=0;
				String input="";
				
				
				do {
					System.out.println("bir sayı girin...:");
					sayi=scanner.nextInt();
					scanner.nextLine();
					sayac++;
					
					if(sayac==1) {
						bolum=sayi;
					}else {
						bolum=bolum/sayi;
						System.out.println(	"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

					input=scanner.nextLine();
					}
					
					
					
					
					
				} while (!input.equals("="));
				System.out.println("bölüm  =  "+ bolum);
				System.out.println("----------------------------------");

			}
			
			
		}


