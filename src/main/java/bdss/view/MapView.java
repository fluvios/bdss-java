package bdss.view;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.utils.MapUtils;
import de.fhpotsdam.unfolding.providers.OpenStreetMap;

public class MapView extends PApplet {

    // Serial ID is optional and added by Eclipse
    private static final long serialVersionUID = 1L;
    
    UnfoldingMap mainMap;
    private UnfoldingMap getRawMap() {
        UnfoldingMap openStreetBasicMap = new UnfoldingMap(this, 0, 0, 900, 600, new OpenStreetMap.OpenStreetMapProvider());
        openStreetBasicMap.zoomToLevel(2);
        openStreetBasicMap.setBackgroundColor(240);
        return openStreetBasicMap;
    }
     
    public void setup() {
    size(950, 600, OPENGL);
        mainMap = getRawMap();
        MapUtils.createDefaultEventDispatcher(this, mainMap);
    }
    public void draw() {
        background(240);
        resize(900,600);
        mainMap.draw();
    }
}