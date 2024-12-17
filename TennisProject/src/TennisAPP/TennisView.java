package TennisAPP;

import java.io.File;
import java.util.Scanner;
import com.github.lalyos.jfiglet.FigletFont;

public class TennisView {
	
	
public void mainMenu() {
		
		//파일 데이터 CRUD(아래의 행동)
		System.out.println("\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⡰⠊⠑⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠇⢈⠑⢂⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣀⡀⠀⠀⠀⠀⠀⠈⠑⠒⢒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⢾⢟⣋⢤⠀⠀⠀⠀⠀⠀⠀⠈⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠖⢐⠅⠑⠺⣧⡳⠕⠀⠀⠀⠀⠀⣀⡀⠐⠕⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠁⢋⠀⠡⠈⡢⠷⡂⡖⢔⢆⢞⠼⠑⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⡉⡲⣀⠁⠳⡚⠊⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠒⢄⢨⡪⣌⠳⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣦⣝⠦⣁⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢾⣿⣿⣿⢿⣿⣿⣿⣿⡿⡂⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠤⡲⡨⡮⠞⠉⠉⠀⠀⠈⠉⠉⠉⠉⠙⠱⡮⣣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠕ ⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⢀⢀⣠⣶⠇⠞⠊⠁⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠺⢵⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠢⠧⡖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡟⡕⢤⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠈⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ 	"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "");

		try {
			  
		    String asciiArt3 = FigletFont.convertOneLine(new File("./dat/speed.flf"), " Tennis");     
		    System.out.println(asciiArt3);
		    String asciiArt4 = FigletFont.convertOneLine(new File("./dat/speed.flf"), " Counter");     
		    System.out.println(asciiArt4);
			} catch (Exception e) {
				System.out.println("Ex70.main");
				e.printStackTrace();
			}
		System.out.println("\t🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎");
		System.out.println();
		System.out.println("\t\t   0.사용 설명서 \t\t ");
		System.out.println();
		System.out.println("\t\t   1.새 경기 시작\t\t  "); 
		System.out.println("\t\t   2.지난 경기 불러오기\t"); 
		System.out.println("\t\t   3.선수 정보\t\t    "); 
		System.out.println("\t\t   4.신규 선수 등록\t  "); 
		System.out.println("\t\t   5.종료\t\t\t   ");
		System.out.println();
		System.out.println("\t🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾🥎🎾");
		System.out.println();
		System.out.print("선택(번호): ");
		
	}

	public void subTitle(String title) {
		System.out.println();
		System.out.println(title);
		
	}
	
	public void pause() {
		
		System.out.println();
		System.out.println("계속 진행하려면 엔터를 입력하세요 !");
		
		Scanner scan = new Scanner(System.in);
		scan.hasNextLine();
		System.out.println();
		
	}
	
	public void backPause() {
		
		System.out.println();
		System.out.println("엔터를 누르면 처음으로 돌아갑니다.");
		
		Scanner scan = new Scanner(System.in);
		scan.hasNextLine();
		System.out.println();
		
	}

	
	
}
