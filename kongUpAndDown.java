package codetest.com.greedy.minigames;


import java.util.Scanner;

public class kongUpAndDown {
	static public int gameNum = 0;	
	/**
	 * 보너스 미니게임 1. 콩 갯수 맞추기
	 * 1~10 사이의 랜덤한 콩의 갯수가 결정된다.
	 * 입력값을 받아, 해당 입력값이 콩의 갯수와 일치하면 추가 포인트와 골드 획득!
	 * 총 3번의 기회가 주어지며, 기회를 모두 소모하여도 맞추지 못하면
	 * 실패하게 된다.			
	 * 
	 */
	public void kongUpAndDownMethod() {
		
		
		Scanner sc = new Scanner(System.in);
		
			
		int cnt = 3;							// 카운트 : cnt 변수명
				
		System.out.println("----------농부의 콩 맞추기 게임을 시작합니다.---------");
		System.out.println("설명 : " + "농부가 가지고 있는 콩의 갯수를" + "맞춰라!" );
		int num = (int)(Math.random() * 10) + 1;

		while(cnt > 0) {
			
			System.out.println("1~10의 숫자를 입력해주세요 : ");
			int clr = sc.nextInt();
			
			if(clr <= 0 || clr > 10) {
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(clr > num) {
				System.out.println(" 농부의 콩 갯수가 더 작습니다.");
			}else if(clr < num) {
				System.out.println(" 농부의 콩 갯수가 더 많습니다.");
			}else if (clr == num){
				System.out.println("성공! 수확 포인트와 골드를 추가로 획득합니다.");
//						money += 300;
//						point += 300;
				gameNum = 1;
				break;	
			}
			cnt--;
			if(cnt == 0) {
				System.out.println("3회 초과하였습니다. 잘가~!");
			}
			
		}
	}
	public int getGameNum() {
		return gameNum;
	}
	public static void setGameNum(int gameNum) {
		kongUpAndDown.gameNum = gameNum;
	}
	
	

}


