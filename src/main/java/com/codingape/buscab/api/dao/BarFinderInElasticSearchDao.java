package com.codingape.buscab.api.dao;

import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.Bar;
import com.codingape.buscab.api.utils.BuscaBUtils;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;

import java.util.Map;

public class BarFinderInElasticSearchDao implements IBarFinderDao {

	private Client client;

	public BarFinderInElasticSearchDao() {
//		client = new TransportClient()
//				.addTransportAddress(new InetSocketTransportAddress(
//						ResourceBundle.getBundle("application.properties")
//								.getString("elasticsearch.host.url"), Integer
//								.parseInt(ResourceBundle.getBundle(
//										"application.properties").getString(
//										"elasticsearch.host.port"))));
	//					"55v6pmjm:ywviwla5nbkpok83@yew-1188452.us-east-1.bonsai.io",443));
	}

	@Override
	public Bar getBarById(String id) throws UserNotFoundException {
		GetResponse response = client.prepareGet("bar", "bar", id).execute()
				.actionGet();
		Map <String, Object> barMap = response.getSource();
		if (barMap == null){
			throw new UserNotFoundException ();
		}
		Bar wantedBar = BuscaBUtils.getBarFromMap(barMap);
		return wantedBar;
	}

	@Override
	public void addBar(Bar bar) {
		IndexResponse response;
		IndexRequestBuilder requestBuilder = client.prepareIndex("bar", "bar", bar.getId());
		requestBuilder.setSource(BuscaBUtils.getMapFromBar(bar));
		response = requestBuilder.execute().actionGet();
		
	}

	@Override
	public void deleteBar(String id) {
		DeleteResponse response = client.prepareDelete("bar", "bar", id).execute().actionGet();
		
		
	}

}
