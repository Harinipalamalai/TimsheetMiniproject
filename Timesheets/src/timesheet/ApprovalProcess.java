package timesheet;

import java.sql.SQLException;
import java.util.List;

public interface ApprovalProcess {
    void processTimesheets(int employeeId, List<Timesheet> timesheets) throws SQLException;
}