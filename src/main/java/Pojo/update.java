package Pojo;

public class update {
    private Integer ID;
    private String status;

    /**
     * No args constructor for use in serialization
     *
     */
    public update()
    {

    }

    /**
     *
     * @param ID
     * @param status
     */
    public update(Integer ID, String status) {
        super();
        this.ID = ID;
        this.status = status;

    }

    public Integer ID() {
        return ID;
    }

    public void setCode(Integer ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setMessage(String status) {
        this.status = status;
    }
}
