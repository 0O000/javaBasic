package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class 위키백과 {
    public void crawl(int mont) {
        String url = "https://ko.wikipedia.org/wiki/2024%EB%85%84_" + mont + "%EC%9B%94";

        try {
            Document document = Jsoup.connect(url).get();

            Elements titleElement = document.select("span.mw-page-title-main");
            Elements dateElements = document.select("span.summary");
            Elements contentElements = document.select("td.description");

            System.out.println("=====================" + titleElement.text() + "=====================");
            System.out.println();

            for (int i = 0; i < dateElements.size(); i++) {
                String date = dateElements.get(i).text();
                String content = contentElements.size() > i ? contentElements.get(i).text() : "내용 없음"; // 내용이 없는 경우 처리

                if (!content.equals("")) {
                    System.out.println("-----------------------------------------");
                    System.out.printf("날짜: %s%n", date.substring(18));
                    System.out.println("내용: " + content);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}