package models;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "eventLocation")
    private String eventLocation;

    @Column(name = "eventDate")
    private String eventDate;

    @Column(name = "eventDescription")
    private String eventDescription;

    public Events() {
    }

    public Events(long id, String eventName, String eventLocation, String eventDate, String eventDescription) {
        this.id = id;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}
