package com.shab.artificon.crawl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupExample {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("https://www.wikipedia.org").get();

		Elements titles = doc.getElementsByClass("other-project");

		for (Element title : titles) {

			System.out.println(title.text());

		}

	}

}