package com.github.reflectoring.infiniboard.quartermaster.dashboard.domain;

import java.util.ArrayList;
import java.util.List;

import com.github.reflectoring.infiniboard.packrat.widget.WidgetConfig;

public class Dashboard {

    private int    id;
    private String name;
    private String description;

    private List<WidgetConfig> widgetConfigs;

    public Dashboard(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.widgetConfigs = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WidgetConfig> getWidgetConfigs() {
        return widgetConfigs;
    }

    public void setWidgetConfigs(List<WidgetConfig> widgetConfigs) {
        this.widgetConfigs = widgetConfigs;
    }
}
