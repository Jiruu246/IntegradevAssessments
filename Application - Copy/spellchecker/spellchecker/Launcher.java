package spellchecker;

import spellchecker.interfaces.ICheckable;
import spellchecker.models.*;
import spellchecker.interfaces.*;

public class Launcher {

	private ICheckable checkableText;
	private IViewInterface ui;
	private Database database = new Database();
	private TextFactory factory = new TextFactory();
	public Launcher(IViewInterface view){
		this.ui = view;
	}
	public void start() {

		String previousText = "";
		String currentText = "";

		// initialize the database
		database.run();

		// create the user interface (thread)
		ui.start();

		while(true) {
			currentText = ui.getTextInput();

			if(previousText == null || currentText == null) {
				continue;
			}

			// update if text has changed
			if(!currentText.equals(previousText)) {
				previousText = currentText;
				currentText = ui.getTextInput();
				
				//using a factory instead
				checkableText = factory.createText(currentText);

				boolean result = checkableText.check(database);
				ui.updateResultLabel(result);
			}
		}

  }
}
