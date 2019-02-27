package co.ConsumeApiLab.Consume_Lab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
	private RestTemplate restTemplate = new RestTemplate();

	public List<Tiny> getTinyList() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		BaseResponse response = restTemplate.getForObject(url, BaseResponse.class);
		return response.getTiny();
	}

	public List<Complete> getCompleteList() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		BaseResponse response = restTemplate.getForObject(url, BaseResponse.class);
		return response.getComplete();
	}

}
