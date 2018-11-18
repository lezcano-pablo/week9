package net.codejava.networking;

import java.io.IOException;

public class HttpDownloader {

	public static void main(String[] args) {
		String fileURL = "https://dev.mysql.com/get/Downloads/MySQL-8.0/mysql-8.0.13-winx64.zip";//this is the link to the download page
		String saveDir = "C:/Download"; //this is the folder where the downloaded file will be placed
		try {
			HttpDownloadUtility.downloadFile(fileURL, saveDir);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}