@Service
public class ProductClient {

    @Value("${backend.url}")
    private String url;

    public List<Product> getProducts() {
        RestTemplate rest = new RestTemplate();
        return Arrays.asList(rest.getForObject(url, Product[].class));
    }
}