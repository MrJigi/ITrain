package iodigital.io_travelcoach.service;

import iodigital.io_travelcoach.model.Disruption;
import org.springframework.stereotype.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

@Service
public class ScrapeService
{

//    public List<Disruption> getDisruptions() throws IOException {
//        String url = "https://9292.nl/en/messages?p=1";
//        Document document = Jsoup.connect(url).get();
//
//        Elements disruptions = document.select(".message-item");
//
//        List<Disruption> disruptionList = new ArrayList<>();
//
//        for(Element disruption : disruptions) {
//            String title = disruption.select(".message-item__title").text();
//            String description = disruption.select(".message-item__description").text();
//            String date = disruption.select(".message-item__date").text();
//            Disruption disruptionObject = new Disruption(title, description,date);
//            disruptionList.add(disruptionObject);
//        }
//
//        // Create Disruption object
//
//
//
//        return disruptionList;
//    }


}
