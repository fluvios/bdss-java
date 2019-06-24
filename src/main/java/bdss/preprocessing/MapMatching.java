package bdss.preprocessing;

import com.bmwcarit.barefoot.matcher.Matcher;
import com.bmwcarit.barefoot.matcher.KState;
import com.bmwcarit.barefoot.matcher.MatcherCandidate;
import com.bmwcarit.barefoot.matcher.MatcherSample;
import com.bmwcarit.barefoot.matcher.MatcherTransition;
import com.bmwcarit.barefoot.road.PostGISReader;
import com.bmwcarit.barefoot.roadmap.Road;
import com.bmwcarit.barefoot.roadmap.RoadMap;
import com.bmwcarit.barefoot.roadmap.RoadPoint;
import com.bmwcarit.barefoot.roadmap.Route;
import com.bmwcarit.barefoot.roadmap.TimePriority;
import com.bmwcarit.barefoot.spatial.Geography;
import com.bmwcarit.barefoot.topology.Dijkstra;

import com.esri.core.geometry.Point;

public class MapMatching {
	// Load and construct road map

	RoadMap map = RoadMap.Load(new PostGISReader(...));
	map.construct();

	// Instantiate matcher and state data structure
	Matcher matcher = new Matcher(map, new Dijkstra<Road, RoadPoint>(),
	new TimePriority(), new Geography());
	KState<MatcherCandidate, MatcherTransition, MatcherSample> state =
	new KState<MatcherCandidate, MatcherTransition, MatcherSample>();

	// Input as sample batch (offline) or sample stream (online)
	List<MatcherSample> samples = new LinkedList<MatcherSample>();

	// Iterative map matching of sample batch (offline) or sample stream (online)
	for (MatcherSample sample : samples) {
	Set<MatcherCandidate> vector = matcher.execute(state.vector(), state.sample(),
	sample);

	state.update(vector, sample);

	// Online map matching result
	MatcherCandidate estimate = state.estimate(); // most likely position estimate
	long id = estimate.point().edge().id(); // road id
	Point position = estimate.point().geometry(); // position
	Route route = estimate.transition().route(); // route to position
	}
}