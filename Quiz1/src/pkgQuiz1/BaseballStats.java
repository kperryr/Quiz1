/**
 * 
 */
/**
 * @author kpola
 *
 */
package pkgQuiz1;

import java.util.Scanner;

public class BaseballStats {
	private int PlayerName;
	private int AB;
	private int H;
	private int DB;
	private int TB;
	private int HR;
	private int R;
	private int BB;
	private int SB;
	private int HBP;
	private int SF;

	
		public int getPlayerName() {
		return PlayerName;
	}

		public BaseballStats() {
			Scanner input = new Scanner(System.in);
			System.out.println("Player's Name:");
			PlayerName=input.nextInt();
			
			System.out.println("Player's Hits:");
			H=input.nextInt();
			
			System.out.println("Player's At-Bat:");
			AB=input.nextInt();
			
			System.out.println("Player's Doubles:");
			DB=input.nextInt();
			
			System.out.println("Player's Triples:");
			TB=input.nextInt();
			
			System.out.println("Player's Home Runs:");
			HR=input.nextInt();
			
			System.out.println("Player's Runs:");
			R=input.nextInt();
			
			System.out.println("Player's Walks:");
			BB=input.nextInt();
			
			System.out.println("Player's Singles:");
			SB=input.nextInt();
			
			System.out.println("Players Hit-By-Pitch:");
			HBP=input.nextInt();
			
			System.out.println("Players Sacrifice Hits:");
			SF=input.nextInt();
			

	}

		public double battingAvg() {
			
			double batAvg= H/AB;
			return batAvg;
		}
		public double onBasePer() {
			
			double OBP= (H+BB+HBP)/(AB+BB+HBP+SF);
			return OBP;
		}
		public double slugs() {
			double SLG=(SB+2*DB+3*TB+4*HR)/AB;
			return SLG;
		}
		public double onBasePlusSlug() {
			double OPS=onBasePer()+slugs();
			return OPS;
		}
		public int totalBases() {
			int TB=(SB+2*DB+3*this.TB+4*HR);
			return TB;
		}

		
	}
	