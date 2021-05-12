package designpatterns;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Connection.Builder builder = new Connection.Builder();
        Connection connection = builder.userName("linku").passWord("thus").url("http://dsda").build();
        System.out.println(connection);
    }
}

class Connection {
    private final String username;
    private final String password;
    private final String url;

    private Connection (Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.url = builder.url;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public static class Builder {
        public String username;
        public String password;
        public String url;
        public Builder userName(String username) {
            this.username = username;
            return this;
        }
        public Builder passWord(String password) {
            this.password = password;
            return this;
        }
        public Builder url(String url) {
            this.url = url;
            return this;
        }
        public Connection build () {
            return new Connection(this);
        }
    }
}