package atm.rupeek.tests;

import atm.rupeek.pages.HomePageWomen;

public class PrintDressNameAndPriceUnder28Dollars {

	public static HomePageWomen hp = new HomePageWomen();
	public static void main(String[] args) {
		try {
			hp.homePageWomen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}