package corchan.DAO;

import corchan.models.Thread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThreadDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ThreadDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Thread> showThreads() {
        return jdbcTemplate.query("SELECT * FROM threads", new ThreadMapper());
    }
}

    /*public Thread showPerson(int id){
        return jdbcTemplate.query("SELECT * FROM threads WHERE id = ?", new Object[]{id}, new ThreadMapper())
                .stream().findAny().orElse(null);
    }*/

    /*public void save(Thread thread) {
        jdbcTemplate.update("INSERT INTO people VALUES(DEFAULT, ?)", thread.getName());
    }

    public void update(int id, Thread updatedPerson)    {
        jdbcTemplate.update("UPDATE people SET name= ? where id =?", updatedPerson.getName(), updatedPerson.getId());
    }*/

    /*public void delete(int id){
        jdbcTemplate.update("DELETE FROM threads where id = ?", id);
    }
}*/

