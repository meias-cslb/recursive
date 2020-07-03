package recursive;

import java.io.File;

public class Files {

	public static void main(String[] args) {
//		xamppフォルダ以下のファイル一覧を表示
		File folder = new File("C:\\xampp");
		displayFiles(folder);
	}

	public static void displayFiles(File file) {
//		フォルダの表示
		if(file.isDirectory()) {
//			フォルダ名の表示(ファイルのみの場合、elseへ飛ぶ)
			System.out.println("===" + file.getAbsolutePath() + "===");
			File[] children = file.listFiles();

//			フォルダ以下のファイル・フォルダ一覧を表示
			for(int i = 0; i < children.length; i++) {
				File child = children[i];
				displayFiles(child);
			}

//		ファイルの表示
		} else {
//			ファイル名の表示(全て)
//			System.out.println(file.getName());

//			ファイル名の表示(「.txt」が末尾につくもののみ)
			String fileName = file.getName();
			if(fileName.endsWith(".txt")) {
				System.out.println(fileName);
			}
		}

	}

}
