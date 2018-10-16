package com.shab.artificon.crawl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupWindowsExample {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://support.office.com/en-us/article/download-and-install-or-reinstall-office-365-or-office-2019-on-a-pc-or-mac-4414eaaf-0478-48be-9c42-23adc4716658").get();
		Elements titles = doc.getElementsByClass("supTabControlTabContent");
		for (Element title : titles) {
			//System.out.println(title.text());
			Elements li = title.select("li");
			int stepsCount = 1;
			for (int i = 0; i <= 2; i++) {
				Element element = li.get(i);
				
				Elements paragraph = element.select("p");
				for (Element element2 : paragraph) {
					String step1 = element2.text();
					System.out.println("STEP "+ stepsCount + ": " + step1);
					stepsCount++;
					break;
				}
			}
			break;
		}
	}
}