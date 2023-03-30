
public class TachTenBaiHat {
	public static String tenBaiHatCoMp3 (String baiHat) {
		int vtCuoi=baiHat.lastIndexOf("/");
		String ten=baiHat.substring(vtCuoi+1);
		return ten;
	}
	public static String tenBaiHatKhongMp3 (String baiHat) {
		int vtCuoi=baiHat.lastIndexOf("/");
		int vtCoDauCham=baiHat.lastIndexOf(".");
		String ten=baiHat.substring(vtCuoi+1, vtCoDauCham);
		return ten;
	}
	public static void main(String[] args) {
		String baiHat="D:/music/nhactre/thucuoi.mp3";
		//
		String kq=tenBaiHatCoMp3(baiHat);
		System.out.println(kq);
		//
		String kq2=tenBaiHatKhongMp3(baiHat);
		System.out.println(kq2);
		
	}

}
/*

public class TachTenBaiHat {
	public static String tenBaiHatCoMp3(String baiHat) {
		int vtCuoi=baiHat.lastIndexOf("/");
		String ten=baiHat.substring(vtCuoi+1);
		return ten;
	}
	public static String tenBaiHatKhongCoMp3(String baiHat) {
		int vtCuoi=baiHat.lastIndexOf("/");
		int vtCuoiCuaDauCham=baiHat.lastIndexOf(".");
		String ten=baiHat.substring(vtCuoi+1, vtCuoiCuaDauCham);
		return ten;
	}
	public static void main(String[] args) {
		String baiHat="D:/music/nhactre/thucuoi.mp3";
		String kq1=tenBaiHatCoMp3(baiHat);
		System.out.println(kq1);
		String kq2=tenBaiHatCoMp3(baiHat);
		System.out.println(kq2);
	}
}
*/