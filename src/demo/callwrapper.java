package demo;

import java.io.IOException;

public class callwrapper {

	public static void main(String[] args) throws IOException {
	 Wrappermethod wm = new Wrappermethod()	;
	 wm.LaunchApp("https://opensource-demo.orangehrmlive.com/");
	 wm.enteryById("txtUsername","Admin");
	 wm.enteryById("txtPassword","admin123");
	 wm.clickByXpath("//*[@id=\"btnLogin\"]");
	 wm.clickByLinktext("Leave");
	 wm.screenshot("D:\\EclipseOxygen2\\Others\\src\\demo\\Screenshot\\orange.png");
     wm.closeApp();  
	}

}
