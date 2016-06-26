import java.util.Scanner;

public class LibraryApplication {
	private Library library;
	
	public void run()
	{
		library = new Library("SunmoonLibrary");
		
		String menu;
		Scanner scanner = new Scanner(System.in);
		
		outside: while(true)
		{
			showMenu();
			menu = scanner.nextLine();
			
			switch (menu) {
			case "0":
				System.out.println("プログラムを終了します!");
				break outside;
			case "1":
				registOneBorrower();
				break;
			case "2":
				registOneBook();
				break;
			case "3":
				displayBookOnLoan();
				break;
			case "4":
				displayBookForLoan();
				break;
			case "5":
				borrowBook();
				break;
			case "6":
				returnBook();
				break;
			default:
				System.out.println("正しいメニュキーを入力してください。");
				break;
			}
		}
	}

	private void returnBook() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void borrowBook() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void displayBookForLoan() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void displayBookOnLoan() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void registOneBook() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void registOneBorrower() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void showMenu() {
		System.out.println("");
		System.out.println("[0]終了");
		System.out.println("[1]利用者登録");
		System.out.println("[2]図書登録");
		System.out.println("[3]貸出中の図書表示");
		System.out.println("[4]貸出可能な図書表示");
		System.out.println("[5]図書の貸出");
		System.out.println("[6]図書の返却");
	}
}
