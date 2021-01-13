package com.msarnowski.top10downloader;

import java.util.ArrayList;

public class ParseApplications {
    private static final String TAG = "ParseApplications";
    private ArrayList<FeedEntry> applications;

    public ParseApplications(ArrayList<FeedEntry> applications) {
        this.applications = new ArrayList<>();
    }
}
