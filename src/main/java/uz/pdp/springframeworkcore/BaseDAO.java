package uz.pdp.springframeworkcore;

import lombok.ToString;

@ToString
public class BaseDAO {
    private final String url;
    private final String user;
    private final String password;
    private final String database;
    private final String schema;
    private final String drive;

    public BaseDAO(String url, String user, String password, String database, String schema, String drive) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.database = database;
        this.schema = schema;
        this.drive = drive;
    }
}
