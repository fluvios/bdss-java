package bdss.model;

import java.util.ArrayList;
import java.util.List;

public class Trajectory {
	private String TRIP_ID;
	private char CALL_TYPE;
	private int ORIGIN_CALL;
	private int ORIGIN_STAND;
	private int TAXI_ID;
	private int TIMESTAMP; // Unix Timestamp
	private char DAY_TYPE;
	private boolean MISSING_DATA;
	private List<Coordinate> POLYLINE = new ArrayList<Coordinate>();
	
	
	public Trajectory(String tRIP_ID, int tAXI_ID, int tIMESTAMP, char dAY_TYPE, boolean mISSING_DATA,
			List<Coordinate> pOLYLINE) {
		super();
		TRIP_ID = tRIP_ID;
		TAXI_ID = tAXI_ID;
		TIMESTAMP = tIMESTAMP;
		DAY_TYPE = dAY_TYPE;
		MISSING_DATA = mISSING_DATA;
		POLYLINE = pOLYLINE;
	}



	public class Coordinate {
		float latitude;
		float longitude;
		
		public Coordinate(float latitude, float longitude) {
			super();
			this.latitude = latitude;
			this.longitude = longitude;
		}
	}
}
