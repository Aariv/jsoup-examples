
package com.shab.artificon.crawl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExtractLinks {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("https://www.journaldev.com").get();
		Element content = doc.getElementById("content");
		Elements links = content.getElementsByTag("a");
		for (Element link : links) {
			String linkHref = link.attr("href");
			String linkText = link.text();
			System.out.println("Text::" + linkText + ", URL::" + linkHref);
		}
	}

}
