package helper;

public class Endpoint {

    public static final String host_gorest = "https://gorest.co.in/public/v2/";
    public static final String GET_LIST_USERS = host_gorest + "users";
    public static final String CREATE_NEW_USERS = host_gorest + "users/?email=jayjay@gmail.com&name=Jayjay&gender=Male&status=Active";
    public static final String DELETE_USERS = host_gorest + "users";
    public static final String INVALID_ENDPOINT = host_gorest + "1";
    public static final String INVALID_PARAMETER = host_gorest + "users/abcdef";
}
