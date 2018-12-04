package com.homework.frequencyofrepeat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FileReader {
	private Map<Character,Integer> freq = new TreeMap<>();

	public FileReader() {
		super();
	}

	public FileReader(Map<Character, Integer> freq) {
		super();
		this.freq = freq;
	}

	public void read (File file) {
		try {
			InputStream in = new FileInputStream(file);
			Reader reader = new InputStreamReader(in);
			int r;
			while((r=reader.read()) != -1) {
				char ch = (char) r;
				if(Character.isLetter(ch)) {
					freq.merge(ch, 1, (a,b) -> (a + b));
				}
			}
			freq.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);
			reader.close();
		} catch (IOException e) {
			
		}
	}
}
