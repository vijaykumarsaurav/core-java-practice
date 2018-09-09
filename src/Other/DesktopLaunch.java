package Other;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DesktopLaunch {

	public static void main(String[] args) {

		 try {
		      URI uri = new URI("http://www.google.com");
		      Desktop desktop = null;
		      if (Desktop.isDesktopSupported()) {
		        desktop = Desktop.getDesktop();
		      }

		      if (desktop != null)
		        desktop.browse(uri);
		     // desktop.print(new File("../Core/src/Other/Array.java"));
		      desktop.edit(new File("../Core/src/Other/Array.java"));
		     // desktop.mail();
		     // desktop.mail(uri);
		 } catch (IOException ioe) {
		      ioe.printStackTrace();
		    } catch (URISyntaxException use) {
		      use.printStackTrace();
		    }
	}

}
