package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// <Event(the type of thing we are storing)>, <Integer (The data type of the primary key of that class)>
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
