package tuan7.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserService  {

	private RestTemplate restTemplate = new RestTemplate();
    private String url = "http://localhost:8080/api/";
	

    public User register(User user) {
        return restTemplate.postForObject(url+"register",user,User.class);
    }
    public String login(User user) {
        return restTemplate.postForObject(url+"login",user,String.class);
    }
    



}
