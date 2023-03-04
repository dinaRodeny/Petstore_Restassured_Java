package Pojo;


import java.util.List;

public class petInfo
{

    private Integer id;
    private Category category;
    private String name;
    private List<String> photoUrls = null;
    private List<tags> tags = null;
    private String status;

    /**
     * No args constructor for use in serialization
     *
     */
    public petInfo() {
    }

    /**
     *
     * @param photoUrls
     * @param name
     * @param id
     * @param category
     * @param tags
     * @param status
     */
    public petInfo(Integer id, Category category, String name, List<String> photoUrls, List<tags> tags, String status) {
        super();
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls)
    {
        this.photoUrls = photoUrls;
    }

    public List<tags> getTags() {
        return tags;
    }

    public void setTags(List<tags> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
