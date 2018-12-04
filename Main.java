package com.homework.frequencyofrepeat;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File folder = new File("c:\\Users\\white\\eclipse-workspace\\prog.kiev.ua\\src\\com\\homework\\frequencyofrepeat\\text\\");
		
		File file = new File(folder, "SILOpenFont_license.txt");
		FileReader filereader = new FileReader();
		filereader.read(file);
	}

}
