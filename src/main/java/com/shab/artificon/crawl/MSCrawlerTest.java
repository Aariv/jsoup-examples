/**
 * 
 */
package com.shab.artificon.crawl;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author zentere
 *
 */
public class MSCrawlerTest {

	public static void main(String[] args) {
	    Document doc;
	    String url = "https://support.office.com/en-us/article/download-and-install-or-reinstall-office-365-or-office-2019-on-a-pc-or-mac-4414eaaf-0478-48be-9c42-23adc4716658";
	    try {
	        doc = Jsoup.connect(url).get();
	        
	        String title = doc.title();
	        System.out.println("Title: " + title);
	       // doc.getElementsByTag("")
	        Elements titles = doc.select("InstallSteps-supTabControlContent-1");
	        for (Element element : titles) {
				System.out.println(element);
				Elements header = element.select("h1");
				System.out.println(header);
			}
//	        Elements ocpSection = doc.select("section[ocpSection]");
//	        for (Element element : ocpSection) {
//				System.out.println(element);
//				Elements header = element.select("h1");
//				System.out.println(header);
//			}
//	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
