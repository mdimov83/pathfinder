package dimov.pathfinder.model.entity;

import dimov.pathfinder.model.enums.LevelUserEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity{

    private String description;

    private String gpxCoordinates;

    private LevelUserEnum levelEnum;

    private String name;

    private String videoUrl;

    private User author;

    private Set<Category> categories;


    public Route() {
    }
    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }
    @Enumerated(EnumType.STRING)
    public LevelUserEnum getLevelEnum() {
        return levelEnum;
    }

    public void setLevelEnum(LevelUserEnum levelEnum) {
        this.levelEnum = levelEnum;
    }
    @Column(name = "name", nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    @ManyToOne
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
    @ManyToMany
    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
