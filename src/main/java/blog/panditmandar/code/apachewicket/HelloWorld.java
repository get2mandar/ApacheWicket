package blog.panditmandar.code.apachewicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

/**
 * @author MandarPandit
 */
public class HelloWorld extends WebPage {
	private static final long serialVersionUID = 1508418816271059717L;

	public HelloWorld() {
		add(new Label("message", "Hello World!"));
	}
}