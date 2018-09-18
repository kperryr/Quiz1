package pkgQuiz1;

public class Main {
	public static void main() {
		BaseballStats stats = new BaseballStats();
		
		System.out.println("Player's Name: " + stats.getPlayerName());
		System.out.println("Batting Average: " + stats.battingAvg());
		System.out.println("On Base Percentage: " + stats.onBasePer());
		System.out.println("Slug percentage: " + stats.slugs());
		System.out.println("On Base plus Slugging Percentage: " + stats.onBasePlusSlug());
		System.out.println("Total Bases: " + stats.totalBases());

		
	}

}
