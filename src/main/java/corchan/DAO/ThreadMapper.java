package corchan.DAO;

import corchan.models.Thread;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ThreadMapper implements RowMapper<Thread> {
    @Override
    public Thread mapRow(ResultSet resultSet, int i) throws SQLException {
        Thread thread = new Thread();
        thread.setId(resultSet.getInt("id"));
        thread.setText(resultSet.getString("thread_text"));
        return thread;
    }
}
