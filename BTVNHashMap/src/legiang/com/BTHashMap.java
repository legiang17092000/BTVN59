package legiang.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class BTHashMap {

	public static void main(String[] args) {

		do {
			menu();
		}
		while(true);
		
	}

	private static void menu() {

		System.out.println("Mời bạn chọn chức năng: ");
		System.out.println("1. Thêm sách");
		System.out.println("2. Xuất toàn bộ sách");
		System.out.println("3. Sửa sách ");
		System.out.println("4. Xóa sách ");
		System.out.println("5. Tìm kiếm sách ");
		System.out.println("6.Thoát phần mềm ");
		int kq=new Scanner(System.in).nextInt();
		switch (kq) {
		case 1:		
			themSach();
			break;
		case 2:
			xuatToanBo();
			break;
		case 3:
			suaSach();
			break;
		case 4:
			xoaSach();
			break;
		case 5:
			timKiem();
			break;
		case 6:
			System.out.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}

	static HashMap<Integer,String> dsSach=new HashMap<Integer, String>();
	static Collection<String> dsTen= dsSach.values();
	static Collection<Integer> dsMa=dsSach.keySet();
	private static void timKiem() {
		
	}
	private static void xoaSach() {
		System.out.println("Bạn muốn xóa mã số mấy: ");
		int kq=new Scanner(System.in).nextInt();
		if(dsSach.containsKey(kq)==true)
			dsSach.remove(kq);
		else System.out.println("Ko tồn tại mã số đó");
	}
	private static void suaSach() {
		System.out.println("Bạn muốn sửa sách mã số mấy: ");
		int kq=new Scanner(System.in).nextInt();
		System.out.println("Đây là tên sách cũ: "+dsSach.get(kq));
		System.out.println("Tên sách bạn muốn sửa là: ");
		String kqMoi=new Scanner(System.in).nextLine();
		if(dsSach.containsKey(kq)==true)
		{
			dsSach.put(kq,kqMoi);
		}
	}
	private static void xuatToanBo() {		
		for(String s:dsTen)
			System.out.println(s);		
	}
	private static void themSach() {
		
		System.out.println("Mời bạn nhập mã sách: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Mời bạn nhập tên sách: ");
		String ten=new Scanner(System.in).nextLine();
		dsSach.put(ma,ten);		
	}

}
