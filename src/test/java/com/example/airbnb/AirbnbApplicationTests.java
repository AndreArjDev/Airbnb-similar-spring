package com.example.airbnb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.airbnb.model.Place;

@SpringBootTest
class AirbnbApplicationTests {

	@Test
	void contextLoads() {
		Place p = new Place("CASA", "PORTO ALEGRE", "NEVERLAND", "IGOR", "10293847");
		String type = "CASA";
		String city = "PORTO ALEGRE";
		String address = "NEVERLAND";
		String host = "IGOR";
		String contact = "10293847";
		assert(p.getType().equals(type));
		assert(p.getCity().equals(city));
		assert(p.getAddress().equals(address));
		assert(p.getHost().equals(host));
		assert(p.getContato().equals(contact));
	}
	
	@Test
	void test2() {
		Place p2 = new Place("LOGRADOURO", "MIAMI", "VOID", "AMERICAN", "56478903");
		String type = "LOGRADOURO";
		String city = "MIAMI";
		String address = "VOID";
		String host = "AMERICAN";
		String contact = "56478903";
		assert(p2.getType().equals(type));
		assert(p2.getCity().equals(city));
		assert(p2.getAddress().equals(address));
		assert(p2.getHost().equals(host));
		assert(p2.getContato().equals(contact));
	}

}
