package mobile.Service;

import mobile.model.Entity.Novel;
import mobile.model.Entity.Reading;
import mobile.model.Entity.User;

import java.util.List;


public interface ReadingService {
   void upsertReading(Reading reading);
   List<Reading> getReadings(User user);
   void deleteAllReadingByNovel(Novel novel);

}
