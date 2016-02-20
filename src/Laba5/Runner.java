package Laba5;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		CosoleInputReader input_data = new CosoleInputReader();
		Menu menu = new Menu();
		menu.showGreatMessage();
		menu.init();
		menu.router(input_data.readConsoleSubMenu());
	}
}
