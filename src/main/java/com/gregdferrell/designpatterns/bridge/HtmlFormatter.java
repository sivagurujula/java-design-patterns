package com.gregdferrell.designpatterns.bridge;

import java.util.List;

/**
 * Created by Greg on 8/1/2017.
 */
public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>");
        sb.append(header);
        sb.append("</h1>");

        sb.append("<ul>");
        for (Detail detail : details) {
            sb.append("<li>");
            sb.append(detail.getLabel());
            sb.append(":");
            sb.append(detail.getValue());
            sb.append("/<li>");
        }
        sb.append("</ul>");

        return sb.toString();
    }
}
