package seleniumconcepts;

public class LoginPage {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		br.init_driver("Chrome");
		br.launchUrl("https://WWW.Google.com");
		String title = br.getPageTitle();
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}else {
			System.out.println("in correct - title");
		}
		//br.close();
		br.quitBrowser();
	}

}
