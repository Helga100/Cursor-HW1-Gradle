import lombok.Data;

public @Data
class Service {

    private String name;

    public String getStr() {
        return "Hello!";
    }
}
