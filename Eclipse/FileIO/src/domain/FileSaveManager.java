package domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaveManager {
	private static File filename;
	private static FileWriter fw;

	public static void saveOverWrite(String path, Object data) {
		prepareWriter(path, data, false);
	}
	
	public static void saveAppend(String path, Object data) {
		prepareWriter(path, data, true);
	}
	
	private static void prepareWriter(String path, Object data, Boolean append) {
		try(FileWriter fw = new FileWriter(path, append)) {
			fw.write(data.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		saveOverWrite("text.txt", "Bunch o texts");
	}

}
