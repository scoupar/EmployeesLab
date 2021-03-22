import org.junit.Before;
import staff.techstaff.DatabaseAdmin;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Steve", "AB123456B", 28000.00);
    }
}
